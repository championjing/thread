package thread.t233;

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
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
