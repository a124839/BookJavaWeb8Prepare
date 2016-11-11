package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/**
 * @author k570
 * prepare拦截器
 * action类要实现preparable接口
 *
 */
public class Prepare extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("当prepare（）方法被invoked时"+message);
	}

	@Override
	public String execute() throws Exception {
		System.out.println("当execute（）方法被invoked的时候"+message);
		return SUCCESS;
	}
	
	
	
}
