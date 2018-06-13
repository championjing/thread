package thread.t2211;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class ThreadA extends Thread {

	private Service service;
	public ThreadA(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
	
}
