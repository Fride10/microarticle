package com.ejournal.microarticle.web.dao;

import com.ejournal.microarticle.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ArticleDao {
    List<Article> findAll();
    Article findById(int id);
    Article save(Article article);
}
