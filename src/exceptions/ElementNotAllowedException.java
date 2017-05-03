package exceptions;

public class ElementNotAllowedException extends RuntimeException {

	public ElementNotAllowedException(String msg) {

		super("[Mi Super mensaje] " + msg);

	}
}
