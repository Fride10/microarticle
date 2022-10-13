package com.ejournal.microarticle.entity;




import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Auteur {

    @Id
    private long idAuteur;

    private String nomAuteur;
    private String adresseAuteur;
    private Date dateNaissance;
    private String telephone;
    private String email;

    public Auteur() {
    }

    public long getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(long idAuteur) {
        this.idAuteur = idAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getAdresseAuteur() {
        return adresseAuteur;
    }

    public void setAdresseAuteur(String adresseAuteur) {
        this.adresseAuteur = adresseAuteur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auteur)) return false;
        Auteur auteur = (Auteur) o;
        return getIdAuteur() == auteur.getIdAuteur() &&
                getNomAuteur().equals(auteur.getNomAuteur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdAuteur(), getNomAuteur());
    }

    @Override
    public String toString() {
        return "{" +
                "idAuteur=" + idAuteur +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", adresseAuteur='" + adresseAuteur + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
