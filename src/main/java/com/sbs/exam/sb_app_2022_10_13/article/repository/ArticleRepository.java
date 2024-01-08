package com.sbs.exam.sb_app_2022_10_13.article.repository;


import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleRepository {


  public Article writeArticle(Article article);


  @Select("select * from article where id = #{id}")
  public Article getArticle(int id);

   public void deleteArticle(int id);


   public List<Article> getArticles();


  public void modifyArticle(Article article);



}
