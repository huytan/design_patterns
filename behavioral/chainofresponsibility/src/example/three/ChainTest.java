package example.three;

import javax.swing.text.MaskFormatter;

import org.junit.*;

import static org.junit.Assert.*;

public class ChainTest {
	private Manager manager;
	private VicePresident vp;
	private CEO ceo;
	private ExpenseReport report;

	private static final int SMALL_AMOUNT = 100;
	private static final int VP_AMOUNT = 7000;
	private static final int CEO_AMOUNT = 207000;

	@Before
	public void amountPreconditions() {
		assertTrue(SMALL_AMOUNT <= manager.getDollarLimit());
		assertTrue(manager.getDollarLimit() < VP_AMOUNT && VP_AMOUNT <= vp.getDollarLimit());
		assertTrue(vp.getDollarLimit() < CEO_AMOUNT);
	}

	@Before
	public void createReport() {
		report = new ExpenseReport();
	}
	
	@Before
	public void createDefaultChain(){
		manager = new Manager("Joe", false);
		vp = new VicePresident("Jan");
		ceo = new CEO("Zeus");
		
		manager.setNextApprover(vp);
		vp.setNextApprover(ceo);
	}
	
	@Test
	public void approvedByManager(){
		report.setTotalDollarAmount(SMALL_AMOUNT);
		manager.handle(report);
		assertApprovedBy(manager);
	}
	
   @Test
   public void approvedByVPWhenOverManagerLimit() {
      report.setTotalDollarAmount(VP_AMOUNT);
      manager.handle(report);
      assertApprovedBy(vp);
   }
   
   @Test
   public void approvedByCEOWhenOverVPLimit() {
      report.setTotalDollarAmount(CEO_AMOUNT);
      manager.handle(report);
      assertApprovedBy(ceo);
   }
   
   @Test
   public void approvedIntlByIntlManager() {
      report.setTotalDollarAmount(SMALL_AMOUNT);
      report.setIsInternationalTravel(true);
      manager.setCanApproveInternational(true);
      manager.handle(report);
      assertApprovedBy(manager);
   }

   @Test
   public void approvedIntlByVPWhenManagerNotIntl() {
      report.setTotalDollarAmount(SMALL_AMOUNT);
      report.setIsInternationalTravel(true);
      assertFalse(manager.canApproveInternational());
      manager.handle(report);
      assertApprovedBy(vp);
   }
   
   @Test
   public void approvedByVPWhenManagerOutOfOffice() {
      report.setTotalDollarAmount(SMALL_AMOUNT);
      manager.setOutOfOffice(true);
      manager.handle(report);
      assertApprovedBy(vp);
   }
   
   @Test
   public void rejectedWhenCEOOutOfOffice() {
      report.setTotalDollarAmount(CEO_AMOUNT);
      ceo.setOutOfOffice(true);
      manager.handle(report);
      assertSame(State.rejected, report.state());
   }

   @Test
   public void approvedByPeerWhenManagerOutOfOffice() {
      report.setTotalDollarAmount(SMALL_AMOUNT);
      Manager peer = new Manager("Jim", false);
      peer.setNextApprover(vp);
      manager.setOutOfOffice(true);
      manager.setNextApprover(peer);

      manager.handle(report);
      assertApprovedBy(peer);
   }
	
	private void assertApprovedBy(Approver approver) {
      assertSame(State.approved, report.state());
      assertSame(approver, report.getHandler());
   }
	
}
