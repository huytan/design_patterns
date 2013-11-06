package exercise.one.impl;

import java.util.Enumeration;
import java.util.Vector;

import exercise.one.Component;
import exercise.one.CompositeException;
import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class DirComponent extends FileSystemComponent implements Component {
	Vector dirContents = new Vector();

	public DirComponent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// @Override
	// public long getComponetSize() {
	// long sizeOfAllFiles = 0;
	// Enumeration e = dirContents.elements();
	//
	// while (e.hasMoreElements()) {
	// FileSystemComponent component = (FileSystemComponent) e
	// .nextElement();
	// sizeOfAllFiles = sizeOfAllFiles + (component.getComponetSize());
	// }
	// return sizeOfAllFiles;
	// }

	public void addComponent(FileSystemComponent fc) throws CompositeException {
		dirContents.add(fc);
	}

	public FileSystemComponent getComponent(int location)
			throws CompositeException {
		return (FileSystemComponent) dirContents.elementAt(location);
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}

}
