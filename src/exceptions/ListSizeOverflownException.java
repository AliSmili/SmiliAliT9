package exceptions;

public class ListSizeOverflownException extends RuntimeException {
	public ListSizeOverflownException(String msg) {

		super("[Mi Super mensaje] " + msg);

	}
}
