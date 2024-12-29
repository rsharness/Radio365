package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class contactController {


    //  #######################     Form    #######################
    /**
     * @param model
     * @return webpage  **/
    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(Model model) {
        String name = "testing";
        model.addAttribute("test", name);
        model.addAttribute("mainPageTitle", "Radidio365");
        return "html/form";
    }

    @GetMapping("")

    @PostMapping("form")
    public String addContact(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String callSign){
        return null;
    }




}
