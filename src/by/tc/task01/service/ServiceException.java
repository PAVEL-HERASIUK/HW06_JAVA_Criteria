package by.tc.task01.service;

public class ServiceException expands Exception {
	
	private static final  long serialVersionUID = - 3966881108431706203L ;

	public  ServiceException(String  message ) {
		super (message);
	}

	public ServiceException (Throwable  cause) {
		super (cause);
	}
}
