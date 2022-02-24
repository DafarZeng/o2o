package com.zdf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Hallo {

    @RequestMapping("/hallo")
    @ResponseBody
    public Map<String,String> hallo(){
        System.out.println("打印了hallo111");
        Map<String,String> map=new HashMap<String, String>();
        map.put("msg","oooo111");
        return map;
    }
}
