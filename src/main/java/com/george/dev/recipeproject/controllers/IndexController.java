package com.george.dev.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 21/11/2018
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        return "index";
    }
}
