package com.fingerdance.minitiktok.controller;

import com.fingerdance.minitiktok.pojo.Response;
import com.fingerdance.minitiktok.service.UserService;
import com.fingerdance.minitiktok.service.UserServiceImpl;
import com.fingerdance.minitiktok.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/douyin/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = PUT)
    public Response register(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.register(username, password);
    }


}
