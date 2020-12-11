package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
   MemberService memberService;
   MemoryMemberRepository memberRepository;


   @BeforeEach
   public void beforeEach() {
       memberRepository = new MemoryMemberRepository();
       memberService = new MemberService(memberRepository);
   }

    @Test
    void join() {
        //given
        Member member =new Member();
        member.setName("Hello");
        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberRepository.findById(saveId).get();
//        System.out.println("findMember.getName() = " + findMember.getName());
//        System.out.println(member.getName());

        assertThat(findMember.getName()).isEqualTo(member.getName());
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}