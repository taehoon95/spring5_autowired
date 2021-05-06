package spring5_autowired.di;

public class MemberPrn1 extends MemberPrinter {

	@Override
	public void print(Member member) {
		System.out.printf("회원정보: 아이디 = %s, 이메일 = %s",
				member.getId(),
				member.getEmail());
	}
	
}
