package net.judgelan.radio365.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "antennas")
public class antennaController  {

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

    @GetMapping
    @ResponseBody
    public String antennaPage(Model model){
        String vulgar = "testies123";
        model.addAttribute("test", vulgar);
        return "html/antenna/index";
    }


}
