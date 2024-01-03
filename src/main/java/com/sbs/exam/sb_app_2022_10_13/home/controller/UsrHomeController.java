package com.sbs.exam.sb_app_2022_10_13.home.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {


  private int count;

  public UsrHomeController(){
     count=0;
  }


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

  @RequestMapping("/user/home/getCount")
  @ResponseBody
  public int getCount(){
    return count;
  }


  @RequestMapping("/user/home/doSetCount")
  @ResponseBody
  public String doSetCount(int count){
    this.count=count;
    return "count  값이 : "+count+"로 초기화 되었습니다.";
  }


}
