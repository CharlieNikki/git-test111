package com.example.gitspringboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/getInformation")
    public String getInformation() {
        return "getInformation()涛涛纯纯fw！！！！";
    }

}
