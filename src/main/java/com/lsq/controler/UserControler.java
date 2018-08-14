package com.lsq.controler;

import com.lsq.dao.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControler {

    @RequestMapping("/getuser")
    public User getUser(){
        User user = new User("lsq",17,"jiangxitaihe");
        return user;
    }
}
