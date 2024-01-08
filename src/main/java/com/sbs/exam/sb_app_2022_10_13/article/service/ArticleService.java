package com.sbs.exam.sb_app_2022_10_13.article.service;

import com.sbs.exam.sb_app_2022_10_13.article.repository.ArticleRepository;
import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final   ArticleRepository articleRepository;


    public List<Article> makeTestData(int articleListId, List<Article> articleList){
      return   null;
    }


  public Article getAritcle(int id) {
    return  articleRepository.getArticle(id);
  }

}
