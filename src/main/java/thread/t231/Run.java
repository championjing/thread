package thread.t231;

/**
* <p>Title: Run</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class Run {

	public static void main(String[] args) {
		PrintString ps = new PrintString();
		ps.printStringMethod();
		System.out.println("哦我要停止它! stopThread="
				+Thread.currentThread().getName());
		ps.setContinuePrint(false);
	}
}
