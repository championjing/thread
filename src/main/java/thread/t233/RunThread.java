package thread.t233;

/**
* <p>Title: RunThread</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class RunThread extends Thread {

	volatile private boolean isRunning = true;
	
	public boolean isRunning() {
		return isRunning;
	}
	
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		super.run();
		System.out.println(" 进入run了 ");
		while(isRunning) {
			
		}
		System.out.println("线程呗停止了");
	}
	
	
}
