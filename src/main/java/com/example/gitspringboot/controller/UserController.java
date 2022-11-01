package com.example.gitspringboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/getInformation")
    public String getInformation() {
        return "最后一次提交？";
    }

}
