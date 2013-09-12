package example.one;

public class CompositeDemo {
	public static final String SEPARATOR = ", ";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemComponent mainFolder = new DirComponent("Year2000");
		FileSystemComponent subFolder1 = new DirComponent("Jan");
		FileSystemComponent subFolder2 = new DirComponent("Feb");
		FileSystemComponent folder1File1 = new FileComponent(
				"Jan1DataFile.txt", 1000);
		FileSystemComponent folder1File2 = new FileComponent(
				"Jan2DataFile.txt", 2000);
		FileSystemComponent folder2File1 = new FileComponent(
				"Feb1DataFile.txt", 3000);
		FileSystemComponent folder2File2 = new FileComponent(
				"Feb2DataFile.txt", 4000);

		try {
			mainFolder.addComponent(subFolder1);
			mainFolder.addComponent(subFolder2);
			subFolder1.addComponent(folder1File1);
			subFolder1.addComponent(folder1File2);
			subFolder2.addComponent(folder2File1);
			subFolder2.addComponent(folder2File2);
		} catch (CompositeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// client refers to both composite &
		// individual components in a uniform manner
		System.out.println("Main Folder Size= " + mainFolder.getComponetSize()
				+ "kb");
		System.out.println("Sub Folder1 Size= " + subFolder1.getComponetSize()
				+ "kb");
		System.out.println("File1 in Folder1 Size= "
				+ folder1File1.getComponetSize() + "kb");

		System.out.println();

		System.out.println("Sub Folder2 Size= " + subFolder2.getComponetSize()
				+ "kb");
		System.out.println("File2 in Folder2 Size= "
				+ folder2File2.getComponetSize() + "kb");

	}
}
