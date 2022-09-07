package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// http://localhost:8080/greeting?name=


import java.util.Map;

@Controller
public class webProject {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Can't find name!") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

}