package exercise.one.impl;

import java.util.ArrayList;
import java.util.List;

import exercise.one.CompositeException;
import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class DirComponent extends FileSystemComponent {
	FileComponent a = new FileComponent();
	List dirContents = new ArrayList();

	public DirComponent(String name) {
		super(name);
	}

	public void addComponent(FileSystemComponent fc) throws CompositeException {
		dirContents.add(fc);
	}

	public FileSystemComponent getComponent(int location)
			throws CompositeException {
		return (FileSystemComponent) dirContents.get(location);
	}

	@Override
	public long accept(VisitorInterface v) {
		return v.visitDir(this);
	}

	@Override
	public long getComponetSize() throws CompositeException {
		long sizeOfAllFiles = 0;
		for (int i = 0; i < dirContents.size(); i++) {
			FileSystemComponent e = (FileSystemComponent) dirContents.get(i);
			try {
				sizeOfAllFiles += e.getComponetSize();
			} catch (CompositeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return sizeOfAllFiles;
	}
}
