package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class MemberApp {

	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService= appConfig.memberService();
		Member member =  new Member(1L, "이용원005", Grade.VIP);
		
		memberService.join(member);
		
		Member findMember = memberService.findMember(1L);
		
		System.out.println("New Member: "+member.getName());
		System.out.println("Find Member: "+findMember.getName());

	}

}
