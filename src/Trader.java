public class Trader extends Pesrson {
   private double SoldeInit;

    public Trader(int id, String nom ,double soldeInit) {
        super( id, nom);

        SoldeInit = soldeInit;
    }

    public void setSoldeInit(double soldeInit) {
        SoldeInit = soldeInit;
    }


}
