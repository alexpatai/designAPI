package com.patai.designapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignAPIController {

    @GetMapping("/")
    public String index(){
        return "Design API application running.";
    }

    @GetMapping("/api/complementary/color={color}")
    public String getCompColor(@PathVariable String color){
        ComplementaryColor colorObject = new ComplementaryColor();
        return colorObject.getComplementaryColor(color);

    }
}
