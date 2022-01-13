package projet.models;


import java.time.LocalDate;

public class Beatmaker {
    private String prenom;
    private String nom;
    private String pseudo;
    private LocalDate dateDeNaissance;

    public Beatmaker(String prenom, String nom, String pseudo, LocalDate dateDeNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.pseudo = pseudo;
        this.dateDeNaissance = dateDeNaissance;
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

    public LocalDate getdateDeNaissance() {
        return dateDeNaissance;
    }

    public void setdateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}
