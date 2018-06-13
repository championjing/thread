package thread.t235;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/13
*/
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddCountThread countService = new AddCountThread();
		Thread t1 = new Thread(countService);
		t1.start();
		Thread t2 = new Thread(countService);
		t2.start();
		Thread t3 = new Thread(countService);
		t3.start();
		Thread t4 = new Thread(countService);
		t4.start();
		Thread t5 = new Thread(countService);
		t5.start();
	}

}
