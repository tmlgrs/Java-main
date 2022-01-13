package projet.models;

public class Podcast extends Plateforme {

    private String nom;
    private String hosts;
    private int nombreEpisodes;

    public Podcast(String nom, String hosts, int nombreEpisodes) {
        this.nom = nom;
        this.hosts = hosts;
        this.nombreEpisodes = nombreEpisodes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public int getNombreEpisodes() {
        return nombreEpisodes;
    }

    public void setNombreEpisodes(int nombreEpisodes) {
        this.nombreEpisodes = nombreEpisodes;
    }


}
