package com.yiyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project:yiyi
 * User: xiaohui
 * Date: 2016/7/1
 * Time: 11:46
 * email:a6551142@163.com
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("test")
    public String getTest(){
       return "index";
    }
}
