package com.project.bbr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/bbr")
    public void index() {
        System.out.println("index");
    }
}
