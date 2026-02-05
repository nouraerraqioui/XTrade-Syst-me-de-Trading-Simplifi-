import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Trader extends Person {
    private double SoldeInit;
    private List<Trader> traders = new ArrayList<>();
    private List<Asset> assets = new ArrayList<>();

    public Trader(int id, String nom ,double soldeInit) {
        super( id, nom);

        SoldeInit = soldeInit;
    }
    public double getSoldeInit() {
        return SoldeInit;
    }

    public List<Trader> getTraders() {
        return traders;
    }

    public List<Asset> getAssets() {
        return assets;}


    public void setSoldeInit(double soldeInit) {
        SoldeInit = soldeInit;
    }


    }






