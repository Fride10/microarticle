package com.ejournal.microarticle.web.controller;

import com.ejournal.microarticle.model.Article;
import com.ejournal.microarticle.web.dao.ArticleDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ArticleController {

    private final ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao){
        this.articleDao = articleDao;
    }


    @GetMapping("/Articles")
    public List<Article> listeArticles(){
        return articleDao.findAll();
    }


    //Afficher un article via son id
    @GetMapping("/Articles/{id}")
    public Article afficherUnArticle(@PathVariable int id){
        return articleDao.findById(id);
    }

}
