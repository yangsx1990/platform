package com.erp.controller;

import com.erp.contants.ResponseMessage;
import com.erp.model.User;
import com.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/***
 * 用户controller
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String getUser(Model model){
        model.addAttribute("userList",userService.getList());
        return "list";
    }


    @RequestMapping("")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/mainUrl")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "/left", method = RequestMethod.GET)
    public ModelAndView left() {
        // 菜单处理
        ModelAndView view = new ModelAndView("/pages/left");
        return view;
    }

    @RequestMapping(value = "/top", method = RequestMethod.GET)
    public ModelAndView top(Model model) {
        // 菜单处理
        ModelAndView view = new ModelAndView("/pages/top");
        return view;
    }

    @RequestMapping(value = "/right", method = RequestMethod.GET)
    public ModelAndView main(Model model) {
        // 菜单处理
        ModelAndView view = new ModelAndView("/pages/index");
        return view;
    }


}
