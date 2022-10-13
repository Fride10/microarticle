package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
    Article findById(long id);
    Article save(Article article);
    void delete(long id);
    Article update(Article article);
    Article maj(long id, Article article);
}
