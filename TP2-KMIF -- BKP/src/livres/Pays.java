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

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
