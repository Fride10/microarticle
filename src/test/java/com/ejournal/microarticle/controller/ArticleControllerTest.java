package com.ejournal.microarticle.controller;

import com.ejournal.microarticle.entity.Article;
import com.ejournal.microarticle.entity.Auteur;
import com.ejournal.microarticle.service.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ArticleController.class)
//@AutoConfigureMockMvc
//@SpringBootTest
class ArticleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ArticleService articleService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void getArticles() {
    }

    @Test
    void addArticle() throws Exception{
        Auteur auteur = new Auteur();
        auteur.setIdAuteur(1l);
        auteur.setTelephone("690783250");
        auteur.setEmail("a@a.com");
        auteur.setDateNaissance(new Date());
        auteur.setNomAuteur("Steve");
        auteur.setAdresseAuteur("PKF");
        Article article = new Article();
        article.setId(1l);
        article.setDatePublication(new Date());
        article.setTitreArticle("Tuenkam");
        article.setContenuArticle("Tuenkam est têtu");
        article.setAuteur(auteur);

        mockMvc.perform(post("/articles").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(article)))
                .andExpect(status().isOk())
                .andDo(print());


    }

    @Test
    void afficherUnArticle() {
    }

    @Test
    void deleteArticle() {
    }

    @Test
    void updateArticle() {
    }

    @Test
    void majArticle() {
    }
}