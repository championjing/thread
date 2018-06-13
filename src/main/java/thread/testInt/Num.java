package thread.testInt;

/**
* <p>Title: Num</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/11
*/
public class Num {

	private Integer a = 0;

	private String str = "";
	
	public int getA() {
		synchronized(a){
			
		}
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
