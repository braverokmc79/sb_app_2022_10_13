package com.sbs.exam.sb_app_2022_10_13.article.controller;


import com.sbs.exam.sb_app_2022_10_13.article.service.ArticleService;
import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsrArticleController {

  private ArticleService articleService;

  private  List<Article>  articleList;

  private  int articleListId;


  public UsrArticleController(ArticleService articleService ){
    this.articleService =articleService;
    this.articleListId=0;
    this.articleList=new ArrayList<>();
    articleService.makeTestData(articleListId, articleList);
  }


  @RequestMapping("/user/article/doAdd")
  @ResponseBody
  public Article doAdd(String title, String body){
    articleListId +=1;
    Article article =new Article(articleListId, title , body);
    articleList.add(article);
    return  article;
  }



  @RequestMapping("/user/article/articles")
  @ResponseBody
  public List<Article> articles(){
    return  articleService.makeTestData(articleListId, articleList);
  }


}
