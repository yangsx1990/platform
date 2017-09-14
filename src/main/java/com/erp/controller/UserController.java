package com.erp.controller;

import com.erp.model.User;
import com.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * 用户controller
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String getUser(Model model){
        model.addAttribute("userList",userService.getList());
        return "list";
    }
}
