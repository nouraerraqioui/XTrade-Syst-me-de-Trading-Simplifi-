
public class CryptoCurrency extends Asset {

    public CryptoCurrency(int code, String nom, double prixUnitaire, String type, int quantite) {
        super(code, nom, prixUnitaire, type, quantite);
    }
    @Override
public double calculvalue() {
        return getPrixUnitaire()*getQuantites();
    }

}
