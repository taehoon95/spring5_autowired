package spring5_autowired.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired.di.ChangePasswordService;
import spring5_autowired.di.MemberDao;
import spring5_autowired.di.MemberInfoPrinter;
import spring5_autowired.di.MemberListPrinter;
import spring5_autowired.di.MemberPrinter;
import spring5_autowired.di.MemberPrn1;
import spring5_autowired.di.MemberPrn2;
import spring5_autowired.di.MemberRegisterService;
import spring5_autowired.di.VersionPrinter;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
//		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
	
	@Bean
	public MemberInfoPrinter memberInfoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemDao(memberDao());
//		infoPrinter.setPrinter(memberPrinter());
				
		return infoPrinter;
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	@Qualifier("printer1")
	public MemberPrinter memberPrinter1() {
		return new MemberPrn1();
	}
	
	@Bean
	@Qualifier("printer2")
	public MemberPrinter memberPrinter2() {
		return new MemberPrn2();
	}

	@Bean
	public MemberListPrinter memberListPrinter() {
		return new MemberListPrinter();
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	
}
