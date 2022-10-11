package com.ejournal.microarticle.web.dao;

import com.ejournal.microarticle.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ArticleDaoImpl implements ArticleDao {
    public static  List<Article> articles = new ArrayList<>();

    static {
        articles.add(new Article(1,"A","B",new Date(2022-10-10), "F"));
        articles.add(new Article(2,"C","D",new Date(2022-10-10), "J"));
        articles.add(new Article(3,"G","H",new Date(2022-10-10), "E"));
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public Article findById(int id) {

        for (Article article : articles){
            if (article.getId()==id){
                return article;
            }
        }
        return null;
    }

    @Override
    public Article save(Article article) {
        articles.add(article);
        return article;
    }
}
