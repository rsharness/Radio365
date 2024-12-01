package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestMapping
public class radio {

    public String myName = "myName";

    public String yourName  = "yourName";

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello, Guy";
    }

    @GetMapping("form")
    @ResponseBody
    public String hello(Model model){
        model.addAttribute();
        return "form";
    }


}
