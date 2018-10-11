package com.wangx.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index")
        public String hello(Map<String,Object> map){
            //传递数据到freemaker模板中
            map.put("name", "[Angel -- 守护天使]");
            return "index";

    }
}
