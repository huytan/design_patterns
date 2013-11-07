package exercise.one;

import exercise.one.impl.DirComponent;
import exercise.one.impl.FileComponent;
import exercise.one.impl.CaculateSizeVisitor;

public class Test {

	/**
	 * http://c2.com/cgi/wiki?HierarchicalVisitorPattern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystemComponent mainFolder = new DirComponent("Year2000");
		FileSystemComponent subFolder1 = new DirComponent("Jan");
		FileSystemComponent subFolder2 = new DirComponent("Feb");
		FileSystemComponent subFolder3 = new DirComponent("Mar");
		FileSystemComponent folder1File1 = new FileComponent(
				"Jan1DataFile.txt", 1000);
		FileSystemComponent folder1File2 = new FileComponent(
				"Jan2DataFile.txt", 2000);

		FileSystemComponent folder2File1 = new FileComponent(
				"Feb1DataFile.txt", 3000);
		FileSystemComponent folder2File2 = new FileComponent(
				"Feb2DataFile.txt", 4000);

		FileSystemComponent folder3File1 = new FileComponent(
				"Mar1DataFile.txt", 5000);
		FileSystemComponent folder3File2 = new FileComponent(
				"Mar2DataFile.txt", 5000);

		try {
			mainFolder.addComponent(subFolder1);
			mainFolder.addComponent(subFolder2);
			mainFolder.addComponent(subFolder3);
			subFolder1.addComponent(folder1File1);
			subFolder1.addComponent(folder1File2);
			subFolder2.addComponent(folder2File1);
			subFolder2.addComponent(folder2File2);
			subFolder3.addComponent(folder3File1);
			subFolder3.addComponent(folder3File2);
		} catch (CompositeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		VisitorInterface v = new CaculateSizeVisitor();
		System.out.println("mainFolder Size= " + mainFolder.accept(v) + "kb");
		System.out.println("subFolder1 Size= " + subFolder1.accept(v) + "kb");
		System.out.println("subFolder2 Size= " + subFolder2.accept(v) + "kb");
		System.out.println("subFolder3 Size= " + subFolder3.accept(v) + "kb");
	}
}
