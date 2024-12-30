package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class contactController extends homeController {


    List<String> contactDetails = new ArrayList<>();

/*
     , @RequestParam String List<contactDetails>
*/


    //  #######################     Form    #######################
    /*
    @GetMapping("")*/

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String addContact(Model model, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String callSign){
        String name = firstName + " " + lastName;

        model.addAttribute("contactName", name);
        model.addAttribute("CallSign", callSign);

        return "html/list";
    }

    /**
     * @param model;
     * @return "<host>/form";
     *
     **/
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String hello(Model model) {
        String name = "testing";
        model.addAttribute("test", name);
        model.addAttribute("mainPageTitle", "Radidio365");
        return "html/form";
    }

}
