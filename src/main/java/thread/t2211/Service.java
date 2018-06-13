package thread.t2211;

/**
* <p>Title: Service</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class Service {

	Object o1 = new Object();
	Object o2 = new Object();
	
	
	public void methodA(){
		synchronized (o1){			
			System.out.println("methodA begin");
			boolean isContinueRun = true;
			while (isContinueRun) {
				
			}
			System.out.println("methodA end");
		}
	}
	public void methodB() {
		synchronized (o2) {			
			System.out.println("methodB begin");
			System.out.println("methodB end");
		}
	}
}
