package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value ="/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping(value="/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member.getName() = " + member.getName());
        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping(value = "/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
    @GetMapping(value = "/members/find")
    public String findForm(){
        return "/members/find";
    }

    @RequestMapping(value = "/members/find")
    @ResponseBody
    public String findform(FindForm form){
        Long index = form.getId();
        System.out.println("form.getId = " + form.getId());
        String name = memberService.findOne(index).get().getName();
        System.out.println("name = " + name);
        return name+"있습니다.";
    }

}
