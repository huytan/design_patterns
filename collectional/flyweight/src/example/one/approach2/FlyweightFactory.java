package example.one.approach2;

import java.util.HashMap;

//singleton Flyweight Factory
public class FlyweightFactory {
	private HashMap lstFlyweight;
	private static FlyweightFactory factory = new FlyweightFactory();

	private FlyweightFactory() {
		lstFlyweight = new HashMap();
	}

	public synchronized FlyweightIntr getFlyweight(String divisionName) {
		if (lstFlyweight.get(divisionName) == null) {
			FlyweightIntr fw = new Flyweight(divisionName);
			lstFlyweight.put(divisionName, fw);
			return fw;
		} else {
			return (FlyweightIntr) lstFlyweight.get(divisionName);
		}
	}

	public static FlyweightFactory getInstance() {
		return factory;
	}

	// inner Flyweight class
	private class Flyweight implements FlyweightIntr {
		private String company;
		private String address;
		private String city;
		private String state;
		private String zip;

		private void setValues(String cmp, String addr, String cty, String st,
				String zp) {
			company = cmp;
			address = addr;
			city = cty;
			state = st;
			zip = zp;
		}

		private Flyweight(String division) {
			// values are hard coded
			// for simplicity

			if (division.equals("North")) {
				setValues("CMP", "addr1", "city1", "st1", "1000");
			}
			if (division.equals("South")) {
				setValues("CMP", "addr2", "city2", "st2", "2000");
			}
			if (division.equals("East")) {
				setValues("CMP", "addr3", "city3", "st3", "3000");
			}
			if (division.equals("West")) {
				setValues("CMP", "addr4", "city4", "st4", "4000");
			}
		}

		@Override
		public String getCompany() {
			// TODO Auto-generated method stub
			return company;
		}

		@Override
		public String getAddress() {
			// TODO Auto-generated method stub
			return address;
		}

		@Override
		public String getCity() {
			// TODO Auto-generated method stub
			return city;
		}

		@Override
		public String getState() {
			// TODO Auto-generated method stub
			return state;
		}

		@Override
		public String getZip() {
			// TODO Auto-generated method stub
			return zip;
		}

		@Override
		public void print(String name, String title) {
			System.out.println(name);
			System.out.println(title);
			System.out.println(getAddress() + "-" + getCity() + "-"
					+ getState() + "-" + getZip());
			System.out.println("-----------------------------------");
		}
	}// end of Flyweight
}// end of FlyweightFactory
