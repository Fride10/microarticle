package com.ejournal.microarticle.controller;

import com.ejournal.microarticle.entity.Article;
import com.ejournal.microarticle.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {

        this.articleService = articleService;
    }


    @GetMapping("/articles")
    public List<Article> getArticles(){
        return (List<Article>) articleService.findAll();
    }

    @PostMapping("/articles")
    public String addArticle(@RequestBody Article article){

        articleService.save(article);

        return "Enregistrement effectué!!";

    }
    //Afficher un article via son id
    @GetMapping("/articles/{id}")
    public Article afficherUnArticle(@PathVariable long id){
        return articleService.findById(id);
    }

    @DeleteMapping("/articles/{id}")
    public String deleteArticle(@PathVariable long id){
        articleService.delete(id);
        return "Suppression effectuée";
    }

    @PutMapping("/articles")
    public String updateArticle(@RequestBody Article article){
        articleService.update(article);
        return "Mise à jour effectuée";
    }

    @PutMapping("/articles/{id}")
    public String majArticle(@PathVariable long id, @RequestBody Article article){
        articleService.maj(id, article);
        return "Mise à jour effectuée";
    }

}
