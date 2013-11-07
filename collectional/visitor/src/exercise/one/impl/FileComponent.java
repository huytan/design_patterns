package exercise.one.impl;

import exercise.one.Component;
import exercise.one.CompositeException;
import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class FileComponent extends FileSystemComponent {
	private long size;

	public FileComponent(String name, long size) {
		super(name);
		this.size = size;
	}

	public FileComponent() {
	}

	@Override
	public long accept(VisitorInterface v) {
		return v.visitFile(this);
	}

	@Override
	public long getComponetSize() throws CompositeException {
	
		return size;
	}
}
