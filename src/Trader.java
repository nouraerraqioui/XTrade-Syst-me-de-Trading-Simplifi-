import java.util.ArrayList;
import java.util.List;

public class Trader extends Person {
    private double SoldInt;
    private Portfolio portfolio;
    private List<Transaction> transactions= new ArrayList<Transaction>();

    public Trader(int id, String nom, double soldInt) {
        super(id, nom);
        this.SoldInt = soldInt;
        this.portfolio = new Portfolio();

    }

    public double getSoldInt() {
        return SoldInt;
    }

    public void setSoldInt(double soldInt) {
        SoldInt = soldInt;
    }
    public double acheterAsset(Asset asset){
        double value = asset.getPrixUnitaire()* asset.getQuantites();
        value += SoldInt;
        return value;
    }

    public double vendreAsset(Asset asset){
        double value = asset.getPrixUnitaire()* asset.getQuantites();
        value -= SoldInt;
        return value;
    }
    public void creePortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }




}
