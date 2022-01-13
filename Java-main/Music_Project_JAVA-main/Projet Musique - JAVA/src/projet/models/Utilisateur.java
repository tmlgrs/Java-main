package projet.models;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String nombreabonnements;
    private int nombreAbonnes;

    public Utilisateur(String nom, String prenom, String nombreabonnements, int nombreAbonnes) {
        this.nom = nom;
        this.prenom = prenom;
        this.nombreabonnements = nombreabonnements;
        this.nombreAbonnes = nombreAbonnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String nombregetAbonnements() {
        return nombreabonnements;
    }

    public void nombresetAbonnements(String nombreabonnements) {
        this.nombreabonnements = nombreabonnements;
    }

    public int getNombreAbonnes() {
        return nombreAbonnes;
    }

    public void setNombreAbonnés(int nombreAbonnés) {
        this.nombreAbonnes = nombreAbonnes;
    }



}
