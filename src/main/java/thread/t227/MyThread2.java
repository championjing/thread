package thread.t227;

/**
* <p>Title: MyThread1</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class MyThread2 extends Thread {
	private MyOneList list;
	public MyThread2(MyOneList list) {
		this.list = list;
	}
	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "B");
	}	
}
