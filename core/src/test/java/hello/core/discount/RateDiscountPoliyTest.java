package hello.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPoliyTest {

	
		RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
		
		@Test
		@DisplayName("VIP는 10% 할인이 적용 됩니다.")
		
		void vip_o() {
			//given
			Member member = new Member(1L, "Member VIP", Grade.VIP);
			//when
			int discount = discountPolicy.discount(member, 20000);
			//then
			Assertions.assertThat(discount).isEqualTo(2000);
		}
		
		@Test
		@DisplayName("VIP가 아니면 할인이 적용 안됩니다.")
		
		void vip_x() {
			//given
			Member member = new Member(1L, "Member BASIC", Grade.BASIC);
			//when
			int discount = discountPolicy.discount(member, 20000);
			//then
			Assertions.assertThat(discount).isEqualTo(0);
		}

	

}
