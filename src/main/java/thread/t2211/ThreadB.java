package thread.t2211;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class ThreadB extends Thread {

	private Service service;
	public ThreadB(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
	
}
