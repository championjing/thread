package thread.t214;

/**
* <p>Title: MyObject</p>  
* <p>Description: 为证明线程锁的是对象 </p>  
* @author champion  
* @date 2018/06/11
*/
public class MyObject {
	
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName= " + Thread.currentThread().getName() );
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void methodB() {
		try {
			System.out.println("begin methodB threadName= " + Thread.currentThread().getName() );
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
