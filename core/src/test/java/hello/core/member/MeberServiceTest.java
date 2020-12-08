package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;

public class MeberServiceTest {
	MemberService memberService;
	@BeforeEach
	public void beforEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}
			
	@Test
	void join() {
		// given : 이렇게 주어진다.
		Member member = new Member(1L, "이용원005", Grade.VIP);
		// when : 위가 같이 주어졌을때
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		
		// then : 그렇다면
		Assertions.assertThat(member).isEqualTo(findMember);
	}

}
