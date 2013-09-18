package exercise.one;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap lstFlyweight;
	private static FlyweightFactory factory = new FlyweightFactory();

	private FlyweightFactory() {
		lstFlyweight = new HashMap();
	}

	public static FlyweightFactory getInstance() {
		return factory;
	}

	public synchronized FlyweightIntr getFlyweight(String numberOfVacancies) {
		if (lstFlyweight.get(numberOfVacancies) == null) {
			FlyweightIntr fw = new Flyweight(numberOfVacancies);
			lstFlyweight.put(numberOfVacancies, fw);
			return fw;
		} else {
			return (FlyweightIntr) lstFlyweight.get(numberOfVacancies);
		}
	}

	// inner Flyweight class
	private class Flyweight implements FlyweightIntr {
		private String inMedical;// medical insurance
		private String inDental;// dental insurance
		private String visionCare;
		private String K401;// 401k là tên gọi của quỹ hưu trí tư nhân
		private String minHourOfWork;// minimum number of hours of work
		private String paidVacation;
		private String empName;
		private String empAddress;

		private void setValues(String cmp, String addr, String cty, String st,
				String zp) {

		}

		private Flyweight(String division) {
			// values are hard coded
			// for simplicity

			if (division.equals("SMALL")) {
				setValues("CMP", "addr1", "city1", "st1", "1000");
			}
			if (division.equals("LARGE")) {
				setValues("CMP", "addr2", "city2", "st2", "2000");
			}

		}

		@Override
		public String getInMedical() {
			return inMedical;
		}

		@Override
		public String getInDental() {
			return inDental;
		}

		@Override
		public String getVisionCare() {
			return visionCare;
		}

		@Override
		public String getK401() {
			return K401;
		}

		@Override
		public String getMinHourOfWork() {
			return minHourOfWork;
		}

		@Override
		public String getPaidVacation() {
			return paidVacation;
		}

		@Override
		public String getEmpName() {
			return empName;
		}

		@Override
		public String getEmpAddress() {
			return empAddress;
		}

	}// end of Flyweight
}
