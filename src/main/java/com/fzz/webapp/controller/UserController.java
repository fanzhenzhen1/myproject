package com.fzz.webapp.controller;

import com.fzz.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserManager userManager;

    @RequestMapping("/users*")
    public String execute(ModelMap model) {
        model.addAttribute("userList", userManager.getUsers());
        return "userList";
    }
}
