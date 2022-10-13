package com.ejournal.microarticle.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Commentaire {

    @Id
    private int idCommentaire;

    @Column(nullable = false)
    private String pseudoCommentateur;

    @Column(nullable = false)
    private String contenuComm;
    private Date dateCommentaire;



    @ManyToOne(optional = false)
    @JoinColumn(name = "article_id", nullable = false, referencedColumnName = "id")
    private Article article;

    public Commentaire() {

    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getPseudoCommentateur() {
        return pseudoCommentateur;
    }

    public void setPseudoCommentateur(String pseudoCommentateur) {
        this.pseudoCommentateur = pseudoCommentateur;
    }

    public String getContenuComm() {
        return contenuComm;
    }

    public void setContenuComm(String contenuComm) {
        this.contenuComm = contenuComm;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "idCommentaire=" + idCommentaire +
                ", pseudoCommentateur='" + pseudoCommentateur + '\'' +
                ", contenuComm='" + contenuComm + '\'' +
                ", dateCommentaire=" + dateCommentaire +
                '}';
    }
}

