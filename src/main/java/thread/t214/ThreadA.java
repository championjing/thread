package thread.t214;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class ThreadA extends Thread {

	private MyObject object;
	
	public ThreadA(MyObject object) {
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}
	
}
