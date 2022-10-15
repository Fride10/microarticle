package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.Article;
import com.ejournal.microarticle.entity.Auteur;
import com.ejournal.microarticle.repository.ArticleRepository;
import com.ejournal.microarticle.repository.AuteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurServiceImpl implements AuteurService {

    private ArticleRepository articleRepository;
    private AuteurRepository auteurRepository;

    public AuteurServiceImpl(ArticleRepository articleRepository, AuteurRepository auteurRepository) {
        this.articleRepository = articleRepository;
        this.auteurRepository = auteurRepository;
    }

    @Override
    public List<Auteur> findAll() {

        return auteurRepository.findAll();
    }

    @Override
    public Auteur findById(long id) {
        return auteurRepository.findById(id).get();
    }

    @Override
    public Auteur save(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public void delete(long id) {
        auteurRepository.deleteById(id);
    }

    @Override
    public Auteur update(Auteur auteur) {
        Optional<Auteur> aut = auteurRepository.findById(auteur.getIdAuteur());

        if(aut.isPresent()){
            Auteur auteur1 = aut.get();

            if (!auteur1.getNomAuteur().contentEquals(auteur.getNomAuteur())){
                auteur1.setNomAuteur(auteur.getAdresseAuteur());
            }
            if (!auteur1.getAdresseAuteur().contentEquals(auteur.getAdresseAuteur())){
                auteur1.setAdresseAuteur(auteur.getAdresseAuteur());
            }
            if (!auteur1.getDateNaissance().equals(auteur.getDateNaissance())){
                auteur1.setDateNaissance(auteur.getDateNaissance());
            }
            if (!auteur1.getEmail().contentEquals(auteur.getEmail())){
                auteur1.setEmail(auteur.getEmail());
            }
            if (!auteur1.getTelephone().contentEquals(auteur.getTelephone())){
                auteur1.setTelephone(auteur.getTelephone());
            }

            auteurRepository.save(auteur1);
        }
        
        return null;
    }

    @Override
    public Auteur maj(long id, Auteur auteur) {
        Optional<Auteur> aut = auteurRepository.findById(id);

        if(aut.isPresent()){
            Auteur auteur1 = aut.get();

            if (!auteur1.getNomAuteur().contentEquals(auteur.getNomAuteur())){
                auteur1.setNomAuteur(auteur.getAdresseAuteur());
            }
            if (!auteur1.getAdresseAuteur().contentEquals(auteur.getAdresseAuteur())){
                auteur1.setAdresseAuteur(auteur.getAdresseAuteur());
            }
            if (!auteur1.getDateNaissance().equals(auteur.getDateNaissance())){
                auteur1.setDateNaissance(auteur.getDateNaissance());
            }
            if (!auteur1.getEmail().contentEquals(auteur.getEmail())){
                auteur1.setEmail(auteur.getEmail());
            }
            if (!auteur1.getTelephone().contentEquals(auteur.getTelephone())){
                auteur1.setTelephone(auteur.getTelephone());
            }
            auteurRepository.save(auteur1);
        }
        return null;
    }
}
