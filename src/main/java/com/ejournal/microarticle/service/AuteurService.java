package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.Auteur;

import java.util.List;

public interface AuteurService {
    List<Auteur> findAll();
    Auteur findById(long id);
    Auteur save(Auteur auteur);
    void delete(long id);
    Auteur update(Auteur auteur);
    Auteur maj(long id, Auteur auteur);
}
