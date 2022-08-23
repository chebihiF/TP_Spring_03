package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @PostMapping
    public String addInfo(){
        return "test";
    }

    @GetMapping("/display")
    public String display() {

        return "display";
    }

    @GetMapping("/show")
    public String show() {

        return "show";
    }
}
