package spring5_autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired.di.MemberDao;
import spring5_autowired.di.MemberPrinter;

@Configuration
public class Appconf1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
