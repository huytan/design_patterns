package exercise.one;

import exercise.one.impl.DirComponent;
import exercise.one.impl.FileComponent;

public interface VisitorInterface {
	long visitDir(DirComponent c);

	long visitFile(FileComponent c);
}
