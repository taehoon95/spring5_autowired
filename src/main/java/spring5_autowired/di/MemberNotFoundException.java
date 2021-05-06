package spring5_autowired.di;

@SuppressWarnings("serial")
public class MemberNotFoundException extends RuntimeException{

	public MemberNotFoundException() {
	}

	public MemberNotFoundException(String message) {
		super(message);
	}

	
}
