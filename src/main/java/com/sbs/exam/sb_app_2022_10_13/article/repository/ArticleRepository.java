package com.sbs.exam.sb_app_2022_10_13.article.repository;

import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleRepository {


  public List<Article> makeTestData(int articleListId, List<Article> articleList) {
    for(int i=1; i<10; i++){
      articleListId =i;
      String title=" 제목"+i;
      String content="내용"+i;
      Article article=new Article(articleListId, title,content);
      articleList.add(article);
    }
    return  articleList;
  }


}
