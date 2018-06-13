package thread.t12;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Run {

	public static void main(String[] args) {
		System.out.println("start");
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(5000);
			//A 段
			thread.suspend();
			System.out.println("A= "+ System.currentTimeMillis() +  " i=" + thread.getI());
			//B 段
			thread.resume();
			Thread.sleep(5000);
			//C 段
			thread.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
