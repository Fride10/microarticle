package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.Article;
import com.ejournal.microarticle.entity.Auteur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleServiceImplTest {

    @Autowired
    private ArticleService articleService;

    @BeforeEach
    void setUp() {
        System.out.println("Début de test");
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {

        Article article = new Article();
        Auteur auteur = new Auteur();
        auteur.setIdAuteur(1l);
        auteur.setTelephone("690783250");
        auteur.setEmail("a@a.com");
        auteur.setDateNaissance(new Date());
        auteur.setNomAuteur("Steve");
        auteur.setAdresseAuteur("PKF");
        article.setId(1l);
        article.setDatePublication(new Date());
        article.setTitreArticle("Tuenkam");
        article.setContenuArticle("Tuenkam est têtu");
        article.setAuteur(auteur);

        Article art = articleService.save(article);
        assertEquals(art.getId(),article.getId());
        assertEquals(art.getTitreArticle(), article.getTitreArticle());
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void maj() {
    }
}