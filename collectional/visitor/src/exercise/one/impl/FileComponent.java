package exercise.one.impl;

import exercise.one.Component;
import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class FileComponent extends FileSystemComponent implements Component {
	private long size;

	public FileComponent(String name, long size) {
		super(name);
		this.size = size;
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);

	}

	public long getSize() {
		return size;
	}

}
