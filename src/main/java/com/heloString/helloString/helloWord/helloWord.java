package com.heloString.helloString.helloWord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloWord {
    @GetMapping("/hi")
    public String helloWord(Model model) {

        return "helloWord";
    }
}
