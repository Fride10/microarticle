package com.ejournal.microarticle.model;

import java.util.Date;

public class Article {
    private int id;
    private String nomArticle;
    private String contenuArticle;
    private Date datePublication;
    private String nomAuteur;

    public Article() {
    }

    public Article(int id, String nomArticle, String contenuArticle, Date datePublication, String nomAuteur) {
        this.id = id;
        this.nomArticle = nomArticle;
        this.contenuArticle = contenuArticle;
        this.datePublication = datePublication;
        this.nomAuteur = nomAuteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getContenuArticle() {
        return contenuArticle;
    }

    public void setContenuArticle(String contenuArticle) {
        this.contenuArticle = contenuArticle;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", Article='" + nomArticle + '\'' +
                ", Contenu='" + contenuArticle + '\'' +
                ", Date de Publication=" + datePublication +
                ", Auteur='" + nomAuteur + '\'' +
                '}';
    }
}
