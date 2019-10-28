package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/user"})
public class LoginController {
//    @Autowired
//    private UserService userService;

    @RequestMapping("/loginhtml")
    public String loginhtml(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginload(User user){
        String name = "test";
        String psw = "demo";
        Integer group = 1;
        if (user.getUsername().equals("test") && user.getPassword().equals("demo") && user.getGroup().equals(1)){
            return "index";
        }else {
            return "loginError";
        }
    }
}
