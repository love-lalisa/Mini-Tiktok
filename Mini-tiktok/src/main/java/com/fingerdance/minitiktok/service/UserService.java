package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.pojo.Response;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {
    public Response register(String username, String password) throws Exception;

    public Response login(String username, String password) throws Exception;
}
