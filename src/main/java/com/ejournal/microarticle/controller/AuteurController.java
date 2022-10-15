package com.ejournal.microarticle.controller;

import com.ejournal.microarticle.entity.Auteur;
import com.ejournal.microarticle.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuteurController {

    @Autowired
    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {

        this.auteurService = auteurService;
    }


    @GetMapping("/auteurs")
    public List<Auteur> getAuteurs(){
        return auteurService.findAll();
    }

    @PostMapping("/auteur")
    public String addAuteur(@RequestBody Auteur auteur){

        auteurService.save(auteur);

        return "Enregistrement effectué!!";

    }
    //Afficher un article via son id
    @GetMapping("/auteur/{id}")
    public Auteur afficherUnAuteur(@PathVariable long id){
        return auteurService.findById(id);
    }

    @DeleteMapping("/auteur/{id}")
    public String deleteAuteur(@PathVariable long id){
        auteurService.delete(id);
        return "Suppression effectuée";
    }

    @PutMapping("/auteur")
    public String updateAuteur(@RequestBody Auteur auteur){
        auteurService.update(auteur);
        return "Mise à jour effectuée";
    }

    @PutMapping("/auteur/{id}")
    public String majAuteur(@PathVariable long id, @RequestBody Auteur auteur){
        auteurService.maj(id, auteur);
        return "Mise à jour effectuée";
    }

}
