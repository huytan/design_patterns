package exercise.one.impl;

import java.util.Enumeration;

import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class ComponentVisitor implements VisitorInterface {

	@Override
	public long visit(DirComponent c) {
		long sizeOfAllFiles = 0;
		Enumeration e = c.dirContents.elements();

		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();

		}
		// while (e.hasMoreElements()) {
		// FileSystemComponent component = (FileSystemComponent) e
		// .nextElement();
		// sizeOfAllFiles = sizeOfAllFiles + (component.getComponetSize());
		// }
		return sizeOfAllFiles;
	}

	@Override
	public long visit(FileComponent c) {
		// TODO Auto-generated method stub
		return c.getSize();
	}

}
