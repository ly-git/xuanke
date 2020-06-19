package com.xuanke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Controller
public class CountController {

    @RequestMapping(value = "/bar",method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String,Object>> getBarData(){
        List<Map<String,Object>> data=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        map.put("name","三个月前");
        map.put("value","200");
        data.add(map);
        map=new HashMap<String,Object>();
        map.put("name","两个月前");
        map.put("value","500");
        data.add(map);
        map=new HashMap<String,Object>();
        map.put("name","一个月前");
        map.put("value","700");
        data.add(map);
        map=new HashMap<String,Object>();
        map.put("name","预测");
        map.put("value","800");
        data.add(map);
        return data;
    }
}
