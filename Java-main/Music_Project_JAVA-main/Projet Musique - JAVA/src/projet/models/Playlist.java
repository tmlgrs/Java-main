package projet.models;

import java.time.LocalTime;

public class Playlist  {

    private String nom;
    //private String titres;
    // private String artistes;
    private int nombreAbonnes;
    private int nombreDeTitres;
    private LocalTime duree;

    public Playlist(String nom, int nombreAbonnes, int nombreDeTitres, LocalTime duree) {
        this.nom = nom;
        this.nombreAbonnes = nombreAbonnes;
        this.nombreDeTitres = nombreDeTitres;
        this.duree = duree;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreAbonnes() {
        return nombreAbonnes;
    }

    public void setNombreAbonnes(int nombreAbonnes) {
        this.nombreAbonnes = nombreAbonnes;
    }

    public int getNombreDeTitres() {
        return nombreDeTitres;
    }

    public void setNombreDeTitres(int nombreDeTitres) {
        this.nombreDeTitres = nombreDeTitres;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }
}
