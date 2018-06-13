package thread.t215;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PublicVar pvr = new PublicVar();
			ThreadA thread = new ThreadA(pvr);
			thread.start();
			Thread.sleep(200);
			pvr.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
