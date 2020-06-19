package com.xuanke.controller;

import com.xuanke.entity.Admin;
import com.xuanke.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
   @Autowired
    AdminService adminService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",100);
        return mav;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Admin> getAll () {
        return adminService.getAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody
    public String validate(String username,String password){
        boolean b=adminService.validateAdmin(username, password);
        if(b){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
