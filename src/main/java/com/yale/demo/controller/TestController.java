package com.yale.demo.controller;

import com.yale.demo.entity.User;
import com.yale.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

/**
 * @author yale
 */
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    @ResponseBody
    @Cacheable(cacheNames = {"user"})
    public User queryUser(Long id){
        System.out.println("111");
        return userService.selectUserById(id);
    }

    @RequestMapping("/home")
    public String login(Model model){
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "client/index";
    }
}
