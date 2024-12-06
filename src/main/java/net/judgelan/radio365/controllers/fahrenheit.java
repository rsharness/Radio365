package net.judgelan.radio365.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class fahrenheit extends Exception{

    // This will be the start of the weather/noaa api calls for information
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "gauge")
    @ResponseBody
    public class Temperature {

        private double fahrenheit;

        public double getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(double aFahrenheit) {

            double absoluteZeroFahrenheit = -459.67;

            if (aFahrenheit < absoluteZeroFahrenheit) {
                System.out.println("Value is below absolute zero");
            }

            fahrenheit = aFahrenheit;
        }
    }
}
