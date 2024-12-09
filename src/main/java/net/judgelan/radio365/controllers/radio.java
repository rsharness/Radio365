package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class radio {
    // FRONTPAGE
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("headLine", "Test Title");
        model.addAttribute("infoPane", "This Page is a test");
        String html = "index";
        return html;
    }

        //  FORM
        @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
            public String hello(Model model) {
            return "html/form";
    }



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

            return "html/listDataPage";

        }

}
