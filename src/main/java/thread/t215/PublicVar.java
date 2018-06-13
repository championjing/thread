package thread.t215;

/**
* <p>Title: PublicVar</p>  
* <p>Description: 脏读示例</p>  
* @author champion  
* @date 2018/06/11
*/
public class PublicVar {

	public String username = "A";
	public String password = "AA";
	
	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = "+
			Thread.currentThread().getName() + " username = " +
					username + " password=" + password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized public void getValue() {
		System.out.println("setValue method thread name = "+
				Thread.currentThread().getName() + " username = " +
						username + " password=" + password);
	}
}
