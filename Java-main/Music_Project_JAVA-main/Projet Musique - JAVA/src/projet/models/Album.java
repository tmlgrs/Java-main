package projet.models;

import java.time.LocalDate;

public class Album  {
    private String nom;
    private String artiste;
    private LocalDate dateDeSortie;
    private String genre;
    private int nombreDeVentes;
    private String certification;

    public Album(String nom, String artiste, LocalDate dateDeSortie, String genre, int nombreDeVentes, String certification) {
        this.nom = nom;
        this.artiste = artiste;
        this.dateDeSortie = dateDeSortie;
        this.genre = genre;
        this.nombreDeVentes = nombreDeVentes;
        this.certification = certification;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getartiste() {
        return artiste;
    }

    public void setartiste(String artiste) {
        this.artiste = artiste;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNombreDeVentes() {
        return nombreDeVentes;
    }

    public void setNombreDeVentes(int nombreDeVentes) {
        this.nombreDeVentes = nombreDeVentes;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
