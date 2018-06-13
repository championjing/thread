package thread.t2212;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DealThread t1 = new DealThread();
			t1.setFlag("a");
			Thread thead1 = new Thread(t1);
			thead1.start();
			Thread.sleep(100);
			t1.setFlag("b");
			Thread thread2 = new Thread(t1);
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
