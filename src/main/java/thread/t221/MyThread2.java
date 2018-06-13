package thread.t221;

import org.omg.Messaging.SyncScopeHelper;

/**
* <p>Title: MyThread1</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class MyThread2 extends Thread {

	private Task task;
	public MyThread2 (Task task) {
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();		
	}
	
}
