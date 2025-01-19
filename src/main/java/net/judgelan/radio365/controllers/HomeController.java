package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RSHarness
 * @version 0.1a
 **/

@Controller
@RequestMapping(value = "/")
public class homeController {

    // #######################    FRONTPAGE     #######################
    @GetMapping
    public String homePage(Model model) {


        String welcomeMessage = "Welcome to Radio365";

        model.addAttribute("titulo", "Radio365 - Radio Companion");
        model.addAttribute("headLine", "Radio365");
        model.addAttribute("infoPane", "Your Radio Companion all year 'round");
        model.addAttribute("copyRight", "Code By C0deFluence");
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "index";
    }
}
