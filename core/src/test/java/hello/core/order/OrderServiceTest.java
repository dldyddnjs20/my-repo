package hello.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class OrderServiceTest {
	
	MemberService memberService;
	OrderService orderService;
	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}
	
	@Test
	void createOrder() {
		long memberId = 1L;
		Member member = new Member(memberId, "yongwon2", Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.CreateOrder(memberId, "온풍기", 10000);
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}

}
