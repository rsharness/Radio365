package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "process")
public class process {

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

    //  HOME

    @GetMapping("home")
    public String helloPage() {
        String result = "index" ;
        return result;
    }
    @GetMapping("one")
    @ResponseBody
    public String thingy1() {
//        String message1 = System.out.println("This is a message");
        return null;
    }

    @GetMapping("two")
    @ResponseBody
    public String thingy2() {
//        String message2 = System.out.println("This is als o a message");
        return null;
    }
    //
    // Responds to get and post requests at /hello?coder=LaunchCoder
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }
}
