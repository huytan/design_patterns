package exercise.one;

public class Job {
	private String jobTitle;
	private String minQuanlification;// minimum qualifications
	FlyweightIntr objFW;

	public Job(String jobTitle, String minQuanlification, FlyweightIntr objFW) {
		super();
		this.jobTitle = jobTitle;
		this.minQuanlification = minQuanlification;
		this.objFW = objFW;
	}

	public void print() {
		System.out.println(jobTitle);
		System.out.println(minQuanlification);
		System.out.println(objFW.getInMedical() + "-" + objFW.getInDental()
				+ "-" + objFW.getVisionCare() + "-" + objFW.getK401() + "-"
				+ objFW.getMinHourOfWork() + "-" + objFW.getPaidVacation()
				+ "-" + objFW.getEmpName() + "-" + objFW.getEmpAddress());
		System.out.println("-----------------------------------");
	}
	// private String inMedical;// medical insurance
	// private String inDental;// dental insurance
	// private String visionCare;
	// private String K401;// 401k là tên gọi của quỹ hưu trí tư nhân
	// private String minHourOfWork;// minimum number of hours of work
	// private String paidVacation;
	// private String empName;
	// private String empAddress;

}