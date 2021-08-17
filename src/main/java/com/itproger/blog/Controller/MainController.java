package com.itproger.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "main page");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "Hello my name Sasha, I'm author of this page ");
        return "about";
    }



}
