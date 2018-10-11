package com.wangx.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index")
        public String hello(Model model){
        model.addAttribute("name", "小张");
        System.out.println(model);
        return "index";

    }
}
