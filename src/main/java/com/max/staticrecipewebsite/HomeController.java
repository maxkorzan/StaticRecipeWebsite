package com.max.staticrecipewebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "main";
    }

    @RequestMapping("/recipebook")
    public String recipebook(){
        return "recipebook";
    }

    @RequestMapping("/garlicbread")
    public String garlicbread(){
        return "garlicbread";
    }

    @RequestMapping("/pizza")
    public String pizza(){
        return "pizza";
    }

    @RequestMapping("/guacamole")
    public String guacamole(){
        return "guacamole";
    }

    @RequestMapping("/listrecipes")
    public String listrecipes(){
        return "listrecipes";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/bootstrapdisplay")
    public String bootstrapdisplay(){
        return "bootstrapdisplay";
    }




}
