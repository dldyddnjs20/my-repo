package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        String str = "요즘 잉어빵  제철!!!";
        model.addAttribute("temp",str);
        return "hello";
    }
}
