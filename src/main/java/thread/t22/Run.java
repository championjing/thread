package thread.t22;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA athread = new ThreadA(numRef);
		athread.start();
		System.out.println("b--------");
		ThreadB bthread = new ThreadB(numRef);
		bthread.start();
	}
}
