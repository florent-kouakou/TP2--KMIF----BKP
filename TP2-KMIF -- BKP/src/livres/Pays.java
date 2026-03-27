package livres;

public class Pays {


    private String nom;
    private String codePays;


    public Pays(String codePays, String nom) {
        validerCodePays(codePays);
        this.nom = nom;
    }


    public void validerCodePays (String mdre) {
        if (mdre.matches("^[A-Z]{3}")){
            this.codePays=mdre;
        } else {
            System.out.println("Code de pays invalide: le code doit commencer par trois MAJs");
        }
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        validerCodePays(codePays);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
