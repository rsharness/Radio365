package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class radio {
// #######################  FRONTPAGE   #######################
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("titulo", "Radio365");
        model.addAttribute("headLine", "Radio365");
        model.addAttribute("infoPane", "Your Radio Companion");
        model.addAttribute("copyRight", "Code By C0dEX");
        String html = "index";
        return html;
    }
//  #######################  Form   #######################
        @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
            public String hello(Model model) {
            return "html/form";
    }


//  #######################   List in Body    #######################
        @GetMapping("list")

        public String namesList(Model model){
            List<String> listData = new ArrayList<>();
                listData.add("Me");
                listData.add("you");
                listData.add("he");
                listData.add("she");
                listData.add("it");
                listData.add("we");
                listData.add("they");

                model.addAttribute("names", listData );

            return "html/list";

        }

}
