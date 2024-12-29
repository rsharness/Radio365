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
// #######################  FRONTPAGE   #######################
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("titulo", "Radio365");
        model.addAttribute("headLine", "Radio365");
        model.addAttribute("infoPane", "Your Radio Companion");
        model.addAttribute("copyRight", "Code By X0dEX");
        String html = "index";
        return html;
    }
//  #######################  Form   #######################
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


//  #######################   List in Body    #######################
    /**
     * @param model
     * @return results list**/
        @RequestMapping( value = "list", method = {RequestMethod.GET, RequestMethod.POST})
        public String namesList(Model model){
            String wordle = "What it be like home slice team champs dude";
            List<String> listData = new ArrayList<>();
                listData.add("option0");
                listData.add("option1");
                listData.add("option2");
                listData.add("option3");
                listData.add("option4");
                listData.add("option5");
                listData.add("option6");
                listData.add("option7");
                listData.add("option8");
                listData.add("option9");
                listData.add("_______");
                model.addAttribute("onAir", "resources/static/images/icons/onAirBlackBG.png");
                model.addAttribute("names", listData );
                model.addAttribute("headline", "Page 3 - List");
                model.addAttribute("article1", wordle);
            return "html/list";

        }

}
