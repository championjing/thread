package thread.t222;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}
}
