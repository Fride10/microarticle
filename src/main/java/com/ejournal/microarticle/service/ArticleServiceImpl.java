package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.Article;
import com.ejournal.microarticle.entity.Auteur;
import com.ejournal.microarticle.repository.ArticleRepository;
import com.ejournal.microarticle.repository.AuteurRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;
    private AuteurRepository auteurRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository, AuteurRepository auteurRepository) {
        this.articleRepository = articleRepository;
        this.auteurRepository = auteurRepository;
    }

    @Override
    public List<Article> findAll() {

        return articleRepository.findAll();
    }

    @Override
    public Article findById(long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void delete(long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public Article update(Article article) {
        Optional<Article> art = articleRepository.findById(article.getId());

        if(art.isPresent()){
            Article article1 = art.get();

            Optional<Auteur> aut = auteurRepository.findById(art.get().getAuteur().getIdAuteur());
            if(aut.isPresent()){
                Auteur auteur1 = aut.get();
                if (!auteur1.getNomAuteur().contentEquals(article.getAuteur().getNomAuteur())){
                    auteur1.setNomAuteur(article.getAuteur().getAdresseAuteur());
                }
                if (!auteur1.getAdresseAuteur().contentEquals(article.getAuteur().getAdresseAuteur())){
                    auteur1.setAdresseAuteur(article.getAuteur().getAdresseAuteur());
                }
                if (!auteur1.getDateNaissance().equals(article.getAuteur().getDateNaissance())){
                    auteur1.setDateNaissance(article.getAuteur().getDateNaissance());
                }
                if (!auteur1.getEmail().contentEquals(article.getAuteur().getEmail())){
                    auteur1.setEmail(article.getAuteur().getEmail());
                }
                if (!auteur1.getTelephone().contentEquals(article.getAuteur().getTelephone())){
                    auteur1.setTelephone(article.getAuteur().getTelephone());
                }
            }
            if(!article1.getContenuArticle().contentEquals(article.getContenuArticle())){
                article1.setContenuArticle(article.getContenuArticle());
            }
            if(!article1.getTitreArticle().contentEquals(article.getTitreArticle())){
                article1.setTitreArticle(article.getTitreArticle());
            }
            if(!article1.getDatePublication().equals(article.getDatePublication())){
               article1.setDatePublication(article.getDatePublication());
            }
            articleRepository.save(article1);
        }
        return null;
    }

    @Override
    public Article maj(long id, Article article) {
        Optional<Article> art = articleRepository.findById(id);

        if(art.isPresent()){
            Article article1 = art.get();

            Optional<Auteur> aut = auteurRepository.findById(art.get().getAuteur().getIdAuteur());
            if(aut.isPresent()){
                Auteur auteur1 = aut.get();
                if (!auteur1.getNomAuteur().contentEquals(article.getAuteur().getNomAuteur())){
                    auteur1.setNomAuteur(article.getAuteur().getAdresseAuteur());
                }
                if (!auteur1.getAdresseAuteur().contentEquals(article.getAuteur().getAdresseAuteur())){
                    auteur1.setAdresseAuteur(article.getAuteur().getAdresseAuteur());
                }
                if (!auteur1.getDateNaissance().equals(article.getAuteur().getDateNaissance())){
                    auteur1.setDateNaissance(article.getAuteur().getDateNaissance());
                }
                if (!auteur1.getEmail().contentEquals(article.getAuteur().getEmail())){
                    auteur1.setEmail(article.getAuteur().getEmail());
                }
                if (!auteur1.getTelephone().contentEquals(article.getAuteur().getTelephone())){
                    auteur1.setTelephone(article.getAuteur().getTelephone());
                }
            }
            if(!article1.getContenuArticle().contentEquals(article.getContenuArticle())){
                article1.setContenuArticle(article.getContenuArticle());
            }
            if(!article1.getTitreArticle().contentEquals(article.getTitreArticle())){
                article1.setTitreArticle(article.getTitreArticle());
            }
            if(!article1.getDatePublication().equals(article.getDatePublication())){
                article1.setDatePublication(article.getDatePublication());
            }
            articleRepository.save(article1);
        }
        return null;
    }
}
