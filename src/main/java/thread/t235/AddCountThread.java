package thread.t235;

import java.util.concurrent.atomic.AtomicInteger;

/**
* <p>Title: AddCountThread</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/13
*/
public class AddCountThread extends Thread {

	private AtomicInteger count = new AtomicInteger(0);

	@Override
	public void run() {
		for(int i=0; i<1000 ; i++ ){
			System.out.println(count.incrementAndGet());
		}
	}
	
}
