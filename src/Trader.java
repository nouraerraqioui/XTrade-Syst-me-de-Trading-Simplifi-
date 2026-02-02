import java.util.ArrayList;
import java.util.List;

public class Trader extends Pesrson {
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

    public void acheterAsset() {
        System.out.println("===== ACHETER ASSET =====");

        System.out.print("ID Trader : ");
        int idTrader = Market.input.nextInt();
        Trader trader = null;
        for (Trader t : traders) {
            if (t.getId() == idTrader) {
                trader = t;
            }
           else if (trader == null) {
                System.out.println("Trader introuvable !");

            }

            System.out.print("Code Asset : ");
            int codeAsset = Market.input.nextInt();

            Asset asset = null;
            for (Asset a : assets) {
                if (a.getCode() == codeAsset) {
                    asset = a;

                }
            }

            if (asset == null) {
                System.out.println("Asset introuvable !");

            }

            else {
                System.out.print("Quantité à acheter : ");
                int qte = Market.input.nextInt();

                double total = asset.getPrixUnitaire() * qte;

                if (qte > asset.getQuantite()) {
                    System.out.println("Quantité insuffisante dans le market !");
                } else if (trader.getSoldeInit() < total) {
                    System.out.println("Solde insuffisant !");
                } else {
                    asset.setQuantite(asset.getQuantite() - qte);
                    trader.setSoldeInit(trader.getSoldeInit() - total);

                    System.out.println("Achat réussi !");
                    System.out.println("Total payé : " + total);
                }
            }
        }


    }}

