package exercise.one.impl;

import java.util.Enumeration;

import exercise.one.Component;
import exercise.one.CompositeException;
import exercise.one.FileSystemComponent;
import exercise.one.VisitorInterface;

public class CaculateSizeVisitor implements VisitorInterface {

	@Override
	public long visitDir(DirComponent c) {
		try {
			return c.getComponetSize();
		} catch (CompositeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long visitFile(FileComponent c) {
		try {
			return c.getComponetSize();
		} catch (CompositeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
