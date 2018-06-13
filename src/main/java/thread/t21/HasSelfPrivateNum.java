package thread.t21;

/**
 * <p>
 * Title: HasSelfPrivateNum
 * </p>
 *  
 * <p>
 * Description:
 * </p>
 *  线程安全的示例
 * 
 * @author champion  
 * @date 2018/06/11
 */
public class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
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
