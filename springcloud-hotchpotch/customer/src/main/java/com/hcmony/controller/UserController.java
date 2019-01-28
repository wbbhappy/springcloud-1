package com.hcmony.controller;

import com.hcmony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseData findAll() throws Exception {
        List<User> list = userService.findAll();
        return new ResponseData(CodeIdEnum.Success, list);
    }*/
}
