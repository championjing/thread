package thread.t224;

/**
* <p>Title: Task</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Task {

	public void doLongTimeTask() {
		for(int i=0; i<100 ;i++) {
			System.out.println("no synchronized threadName=" 
		+ Thread.currentThread().getName() + "");
		}
	}
}
