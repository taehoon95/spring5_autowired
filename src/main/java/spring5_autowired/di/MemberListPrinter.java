package spring5_autowired.di;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberListPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter() {}

	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	public void setPrinter(MemberPrinter memberPrinter) {//AppCtx에서 매서드 이름과 setPrinter에서 매개변수 이름과 같아야 한다.
		this.printer = memberPrinter;
	}
	
}
