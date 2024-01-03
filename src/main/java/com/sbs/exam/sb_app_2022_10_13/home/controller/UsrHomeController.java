package com.sbs.exam.sb_app_2022_10_13.home.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {

  @RequestMapping("/user/home/main")
  @ResponseBody
  public String showMain(){
    return "안녕하세요";
  }


  @RequestMapping("/user/home/show1")
  @ResponseBody
  public String show1(){
    return "안녕하세요1";
  }


}
