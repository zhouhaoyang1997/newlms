/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.henu.rjxy.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author liubingxu
 */
@Controller
@RequestMapping("/")
public class IndexController {//主页映射
    @RequestMapping("index")
    public String index1(){
        return "index";
    }
    @RequestMapping("reg/index1")//重定向到主页
    public String index2(){
        return  "redirect:/index ";
    }
}
