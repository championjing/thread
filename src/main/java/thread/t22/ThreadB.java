package thread.t22;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;
	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}
	
}
