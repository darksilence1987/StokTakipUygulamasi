package com.xhite.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deneme")
public class DenemeController {
    @GetMapping()
    public String deneme(){
        return "deneme";
    }
}
