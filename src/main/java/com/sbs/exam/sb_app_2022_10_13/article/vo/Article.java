package com.sbs.exam.sb_app_2022_10_13.article.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Article {

  public int id;
  public String title;
  public String body;
}
