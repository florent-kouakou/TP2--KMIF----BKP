package livres;

public class OuvrageVideo extends Ouvrage{
    public int dureeMin;
    public int taille;
    public OuvrageVideo(String titre, Auteur auteur, int dureeMin, int taille) {
        super(titre, auteur);
        this.dureeMin=dureeMin;
        this.taille=taille;
    }
}
