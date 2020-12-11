package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 인터넷 URL을 통해서 주소 해석할때 @Controller 안에 있는 내용을 제일 먼저 확인
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
