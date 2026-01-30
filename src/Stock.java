public class Stock extends Asset {

    public Stock(int code, String nom, double prixUnitaire, String type, int quantite) {
        super(code, nom, prixUnitaire, type, quantite);
    }
    @Override
    public double calculvalue(){
        return getPrixUnitaire()*getQuantites();
    }
}
