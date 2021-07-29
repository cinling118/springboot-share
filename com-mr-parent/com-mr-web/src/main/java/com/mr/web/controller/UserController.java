package com.mr.web.controller;

import com.mr.entity.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public  String   queryUser(ModelMap map){
        List<User> list= userService.queryService();
        map.put("list",list);
        return "user/list";
    }
}

