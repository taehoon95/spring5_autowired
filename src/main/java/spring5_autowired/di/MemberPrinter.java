package spring5_autowired.di;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	
	private DateTimeFormatter dateTimeFormatter;
	
	
	public MemberPrinter() {
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	}

	public void print(Member member) {
		if(dateTimeFormatter == null) {
			System.out.printf("회원정보: 아이디 = %s, 이메일 = %s, 이름 =  %s, 등록일 =  %tF %n",
					member.getId(),
					member.getEmail(),
					member.getName(),
					member.getRegisterDateTime());	
		}else {
			System.out.printf("회원정보: 아이디 = %s, 이메일 = %s, 이름 =  %s, 등록일 =  %s %n",
					member.getId(),
					member.getEmail(),
					member.getName(),
					dateTimeFormatter.format(member.getRegisterDateTime()));	
		}
		
	}
	
//	@Autowired /* (required = false) */
//	public void setDateTimeFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
	
	
	@Autowired
	public void setDateTimeFormatter(Optional<DateTimeFormatter> formatterOpt) {
		if(formatterOpt.isPresent()) {
			this.dateTimeFormatter = formatterOpt.get();
		}
	}
	
//	@Autowired
//	public void setDateTimeFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
}
