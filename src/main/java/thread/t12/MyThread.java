package thread.t12;

/**
* <p>Title: MyThread</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class MyThread extends Thread {
	
	private long i=0;
	public long getI(){
		return i;
	}
	public void setI(long i) {
		this.i = i;
	}
	@Override
	public void run() {
		while(true) {
			i++;
		}
	}
	
}
