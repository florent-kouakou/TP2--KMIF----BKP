package livres;

public class OuvrageAudio extends Ouvrage{
    public String Format;
    public int dureeMin;
    public OuvrageAudio(String titre, Auteur auteur, int dureeMin, String Format) {
        super(titre, auteur);
        this.dureeMin=dureeMin;
        this.Format=Format;
    }
}
