package com.ejournal.microarticle.entity;


import javax.persistence.*;

import java.util.Date;
import java.util.Objects;


@Entity

public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titreArticle;

    private String contenuArticle;
    private Date datePublication;

    @ManyToOne(optional = false)
    @JoinColumn(name = "auteur_id", nullable = false, referencedColumnName = "idAuteur")
    private Auteur auteur;


    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
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

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return getId() == article.getId() &&
                getTitreArticle().equals(article.getTitreArticle()) &&
                getAuteur().equals(article.getAuteur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitreArticle(), getAuteur());
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", titreArticle='" + titreArticle + '\'' +
                ", contenuArticle='" + contenuArticle + '\'' +
                ", datePublication=" + datePublication +
                '}';
    }
}
