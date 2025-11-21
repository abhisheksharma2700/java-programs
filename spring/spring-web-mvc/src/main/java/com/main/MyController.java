package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/helloPage")
    public ModelAndView openHelloPage(){
        System.out.println("openHelloPage() method executed");
        ModelAndView mav= new ModelAndView();
        mav.setViewName("hello");
        return mav;

    }
    @GetMapping("/aboutUs")
    public String openAboutUs(){
        System.out.println("openAboutUs() method executed");
        return "aboutUs";
    }
}
