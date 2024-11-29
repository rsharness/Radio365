package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class radio {


    public String myName = "myName";

    public String yourName  = "yourName";

@GetMapping
@ResponseBody
    public String hello(){
        return "Hello" + yourName;
    }


}
