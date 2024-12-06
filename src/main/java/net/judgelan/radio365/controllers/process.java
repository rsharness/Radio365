package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class process {

    @GetMapping("one")
    @ResponseBody
    public String thingy1() {
        String message1 = System.out.println("This is a message");
        return message1;
    }

    @GetMapping("two")
    @ResponseBody
    public String thingy2() {
        String message2 = System.out.println("This is also a message");
        return message2;
    }
}
