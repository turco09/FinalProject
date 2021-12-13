package com.web.amrap.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorIndex {
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
