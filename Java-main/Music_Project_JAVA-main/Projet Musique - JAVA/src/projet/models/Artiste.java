package projet.models;

import java.sql.Date;
import java.time.LocalDate;

public class Artiste  {
    private String prenom;
    private String nom;
    private String pseudo;
    private LocalDate dateDeNaissance;

    public Artiste(String prenom, String nom, String pseudo, LocalDate dateDeNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.pseudo = pseudo;
        this.dateDeNaissance = dateDeNaissance;
        //this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public LocalDate getDateDeNaissance() { return dateDeNaissance;}

    public void setDateDeNaissance(LocalDate dateDeNaissance) { this.dateDeNaissance = dateDeNaissance;  }

    //    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


}
