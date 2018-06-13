package thread.t222;

/**
* <p>Title: ObjectService</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class ObjectService {

	public void serviceMethod(){
		try {
			synchronized (this) {
				System.out.println("begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end time=" + System.currentTimeMillis());
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
