package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 @author RSHarness
 @version 0.1a
 **/

@Controller
public class homeController {
// #######################    FRONTPAGE     #######################
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("titulo", "Radio365");
        model.addAttribute("headLine", "Radio365");
        model.addAttribute("infoPane", "Your Radio Companion");
        model.addAttribute("copyRight", "Code By X0dEX");
        String html = "index";
        return html;
    }


    @GetMapping
      public String navList(Model model){
        String homepage = "Home";
        String antenna = "Antenna Info";
        String contacts = "Contacts/QSOs";

        model.addAttribute("trailerHouse", homepage);
        model.addAttribute("satellite", antenna);
        model.addAttribute("qso", contacts);

        return "fragments/header";
    }



}
