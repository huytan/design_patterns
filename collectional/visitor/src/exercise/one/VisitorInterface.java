package exercise.one;

import exercise.one.impl.DirComponent;
import exercise.one.impl.FileComponent;

public interface VisitorInterface {
	long visit(DirComponent c);

	long visit(FileComponent c);
}
