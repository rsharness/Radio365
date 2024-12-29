package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class antennasController {

    /**@return "Element Length";
     * @param frequency;
     * @param speed;
     * @param velocityFactor;
     * **/


    public String dipoleCalc(int frequency, int speed,  int velocityFactor, Model model) {
        int calcAResult = (frequency * speed)*velocityFactor;
        
        model.addAttribute("result", calcAResult);
        return "html/antenna";
     }

    @GetMapping("antennas")
    @ResponseBody
    public String antennaPage(Model model){

        return "elementResult";

    }

}
