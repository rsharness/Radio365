package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class eventsController {

    public List<String> events = new ArrayList<>();

    public String gibb = "waszzahoozits";



    @GetMapping
    public String mainEvents(Model model){
        events.add("entry 1");
        events.add("entry 2");
        events.add("entry 3");
        events.add("entry 4");
        events.add("entry 5");
        model.addAttribute("notePass", gibb);
        model.addAttribute("passingTime", "WAS SUPPOSED TO BE AN IMG");
        model.addAttribute("event", events);
        return "/events/index.html";
    }
}
