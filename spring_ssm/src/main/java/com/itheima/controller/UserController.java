package com.itheima.controller;


import com.itheima.entity.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<User> list = userService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("list");
        mav.addObject("ListUser",list);
        return mav;
    }

}
