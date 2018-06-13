package thread.t215;

/**
* <p>Title: ThreadA</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class ThreadA extends Thread {

	private PublicVar publicVar;
	
	public ThreadA(PublicVar publicVar) {
		this.publicVar = publicVar;
	}

	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "Bb");
	}
	
}
