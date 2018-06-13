package thread.t227;

import java.util.ArrayList;
import java.util.List;

/**
* <p>Title: MyOneList</p>  
* <p>Description: </p>  
* @author champion  
* @date 2018/06/12
*/
public class MyOneList {
	private List list = new ArrayList();
	
	synchronized public void add(String data) {
		list.add(data);
	}
	
	synchronized public int getSize() {
		return list.size();
	}
}
