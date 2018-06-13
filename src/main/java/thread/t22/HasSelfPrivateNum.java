package thread.t22;

/**
 * <p>
 * Title: HasSelfPrivateNum
 * </p>
 *  
 * <p>
 * Description:
 * </p>
 *  操作同一对象示例，可能产生非线程安全问题
 * 
 * @author champion  
 * @date 2018/06/11
 */
public class HasSelfPrivateNum {

	private int num = 0;
	
	
	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num= " + num );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
