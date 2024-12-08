package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class radio {
    // FRONTPAGE
    @GetMapping("/")
    public String homePage(){
        String html = "index";
        return html;
    }

    //  FORM
    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String formFirstName, @RequestParam String formLastName, Model model) {
        String inputFormFirstname = "firstName";
        String inputFormLastName = "lastName";
        model.addAttribute("firstName", inputFormLastName);
        model.addAttribute("lastName", inputFormLastName);

        return "html/form";
    }

        @GetMapping("form")
        @ResponseBody
            public String howdy(){
                String hola = "dklfajslkdfjalksdjf";
                return hola;
        }


}
