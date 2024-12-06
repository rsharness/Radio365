package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("practice")
public class radio {

    public String myName = "myName";

    public String yourName  = "yourName";

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello, Guy";
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
    @GetMapping("hello/{path}")
    @ResponseBody
    public String pathName(@PathVariable String path){
        return "you are at " + path;
    }

//
    @GetMapping("form")
    public String hello(Model model) {
        model.addAttribute("firstName", formFirstName);
        model.addAttribute("lastName", formLastName);

//        return "Hello, " + myName + " & " + yourName;
        return "html/form";
    }
    // Responds to get and post requests at /hello?coder=LaunchCoder
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }

    @GetMapping("home")
    public String helloPage() {
        String result = "index" ;
        return result;
    }
}
