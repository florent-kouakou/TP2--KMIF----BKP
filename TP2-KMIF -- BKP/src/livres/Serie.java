package livres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Serie {
    private String nom;

    List<String> livres = new ArrayList<>();



    public Serie(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }


    public void ajouterLivre(String livre) {
        livres.add(livre);
    }


    public void supprimerLivre(String livre) {
        livres.remove(livre);
    }


    public void afficherLivres() {
        System.out.println("Série : " + nom);
        for (String livre : livres) {
            System.out.println("- " + livre);
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nom='" + nom + '\'' +
                ", livres=" + livres +
                '}';
    }
}

