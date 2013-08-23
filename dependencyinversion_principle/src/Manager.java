public class Manager {
	IWorker m_worker;

	public void setWorker(IWorker w) {
		m_worker = w;
	}
	public void manage(){
		m_worker.work();
	}
}
