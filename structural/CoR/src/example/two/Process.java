package example.two;

public abstract class Process {
	private Process _nextProcess;

	protected abstract void RunNext();

	public void Run() {
		RunNext();
		if (_nextProcess != null) {
			_nextProcess.Run();
		}
	}

	public void SetNextProcess(Process process) {
		_nextProcess = process;
	}
}
