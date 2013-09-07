import javax.swing.JPanel;

public abstract class UIBuilder {
	protected JPanel searchUI;

	// add necessary UI controls and initalize them
	public abstract void addUIControls();

	public abstract void initialize();

	// return the SELECT SQL commmad for the specified criteria
	public abstract String getSQL();

	// common to all concrete builders
	// returns the fully constructed search UI
	public JPanel getSearchUI() {
		return searchUI;
	}
}
