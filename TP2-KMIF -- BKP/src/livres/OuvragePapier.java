package livres;

public class OuvragePapier extends Ouvrage{
    public int nombreDePages;
    public OuvragePapier(String titre, Auteur auteur) {
        super(titre, auteur);
    }

    public int getNombreDePages() {
        return nombreDePages;
    }
}
