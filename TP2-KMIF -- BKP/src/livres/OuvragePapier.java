package livres;

public class OuvragePapier extends Ouvrage{
    public int NbPages;
    public OuvragePapier(String titre, Auteur auteur, int NbPages) {
        super(titre, auteur);
        this.NbPages=NbPages;
    }
}
