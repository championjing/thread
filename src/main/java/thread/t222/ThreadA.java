package thread.t222;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class ThreadA extends Thread {

	private ObjectService service;
	public ThreadA(ObjectService service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
