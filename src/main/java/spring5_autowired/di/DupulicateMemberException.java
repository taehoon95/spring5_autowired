package spring5_autowired.di;

@SuppressWarnings("serial")
public class DupulicateMemberException extends RuntimeException{

	public DupulicateMemberException(String message) {
		super(message);
	}
}
