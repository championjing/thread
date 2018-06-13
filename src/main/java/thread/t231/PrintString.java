package thread.t231;

/**
* <p>Title: PrintString</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class PrintString {

	private boolean isContinuePrint = true;
	public boolean isContinuePrint(){
		return isContinuePrint;
	}
	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	public void printStringMethod(){
		try {
			while(isContinuePrint) {
				System.out.println("run printStringMethod threadName="
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
