package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/**
 * @author k570
 * prepare������
 * action��Ҫʵ��preparable�ӿ�
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
		System.out.println("��prepare����������invokedʱ"+message);
	}

	@Override
	public String execute() throws Exception {
		System.out.println("��execute����������invoked��ʱ��"+message);
		return SUCCESS;
	}
	
	
	
}
