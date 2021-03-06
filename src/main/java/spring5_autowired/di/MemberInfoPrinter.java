package spring5_autowired.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {

	
	private MemberDao memDao;
	
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException("데이터 없음");
		}
		printer.print(member);
		System.out.println();
	}
	
	@Autowired
	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}
	
	@Autowired
	@Qualifier("printer1")
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
}
