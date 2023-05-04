package eje2;

public class RegistroException extends RuntimeException {

	public RegistroException(Exception e, String msg) {
		super(msg, e);
	}

	public RegistroException(String msg) {
		super(msg);
	}

}
