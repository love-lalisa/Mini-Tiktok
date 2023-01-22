package com.fingerdance.minitiktok.controller;

import com.fingerdance.minitiktok.pojo.Response;
import com.fingerdance.minitiktok.service.UserServiceImpl;
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
    UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/register", method = POST)
    public Response register(@RequestParam String username, @RequestParam String password) {

        return new Response();
    }


}
