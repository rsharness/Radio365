package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class radio {

    public String myName = "myName";

    public String yourName  = "yourName";


    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello, Guy";
    }

    @GetMapping("form")
//    @ResponseBody
    public String hello(Model model) {
        model.addAttribute("firstName", myName);
        model.addAttribute("lastName", yourName);

//        return "Hello, " + myName + " & " + yourName;
        return "html/form";
    }
//
    @GetMapping("hi")
    @ResponseBody
    public String hello(){
        return "Hello " + yourName;
    }

    @GetMapping("hello")
    @ResponseBody
    public String helloThere(@RequestParam String name){
        return "Hello " + name;
    }
//
    @GetMapping("bye")
    @ResponseBody
    public String bye(){
        return "aufwiedersehen " + yourName;
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String latez(@RequestParam String name){
        return "latez, bruh " + name;
    }
//



}
