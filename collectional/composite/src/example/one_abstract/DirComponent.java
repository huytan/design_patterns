package example.one_abstract;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DirComponent extends FileSystemComponent {
	Vector dirContents = new Vector();

	// individual file/sub folders collection
	public DirComponent(String cName) {
		super(cName);
		// TODO Auto-generated constructor stub
	}

	public long getComponetSize() {
		// TODO Auto-generated method stub
		long sizeOfAllFiles = 0;
		Enumeration e = dirContents.elements();
		
		while (e.hasMoreElements()) {
			FileSystemComponent component = (FileSystemComponent) e
					.nextElement();
			sizeOfAllFiles = sizeOfAllFiles + (component.getComponetSize());

		}
		return sizeOfAllFiles;
	}

	public void addComponent(FileSystemComponent fc) throws CompositeException {
		dirContents.add(fc);
	}

	public FileSystemComponent getComponent(int location)
			throws CompositeException {
		return (FileSystemComponent) dirContents.elementAt(location);
	}
}
