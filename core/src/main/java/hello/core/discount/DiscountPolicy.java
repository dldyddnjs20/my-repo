package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
	// @ return한다. 할인 대상 금액을
	int discount(Member member, int price);

}
