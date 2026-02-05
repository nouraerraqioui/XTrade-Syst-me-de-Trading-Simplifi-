import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    private List<Asset> assets = new ArrayList<>();
    private List<Trader> traders = new ArrayList<>();
    private Portfolio portfolio ;
    List<Transaction> transactions = new ArrayList<>();
     static Scanner input = new Scanner(System.in);


    public void addAsset(){
        System.out.println("====Ajouter Asset========");
        System.out.println("entrer Le code");
        int code = input.nextInt();
       input.nextLine();
        System.out.println("Entrez le Nom d'asset :");
        String  nom =input.nextLine();
        System.out.println("Entrer prix d'asset :");
        double  prixUnitaire =input.nextDouble();
        input.nextLine();
        System.out.println("Entrer type d'asset (S = (STOCK) / C = (CRYPTO) :");
        String  type =input.nextLine();
        System.out.println("Entrer quantite :");
        int quantite =input.nextInt();
        if(type.equals("S")){
         Asset   asset = new Stock(code,nom,prixUnitaire,type,quantite);
            assets.add(asset);
        }
        else if(type.equals("C")){
            Asset   asset = new CryptoCurrency(code,nom,prixUnitaire,type,quantite);
            assets.add(asset);
        }
        else{
            System.out.println("Erreur !!!");
        }
    }
    public void afficherAssets(){
        System.out.println("===== LISTE DES ASSETS =====");

        if (assets.isEmpty()) {
            System.out.println("Aucun asset disponible");
            return;
        }

        for (Asset a : assets) {
            System.out.println(
                    "Code : " + a.getCode() +
                            " | Nom : " + a.getNom() +
                            " | Prix : " + a.getPrixUnitaire() +
                            " | Quantité : " + a.getQuantites()
            );

        }}
    public void addTrader(){
        System.out.println("====Ajouter Trader ========");
        System.out.println("entrer L'ID");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Entrez le Nom du trader :");
        String  nom =input.nextLine();
        System.out.println("Entrer solde initiale ");
        double  soldeInt =input.nextDouble();
        Trader trader=new Trader(id,nom,soldeInt);
        traders.add(trader);
        System.out.println("Trader ajouter ");
        for (Trader a : traders) {
            System.out.println(a.getNom());
        }
    }
    public void afficherTraders(){
        if (traders.isEmpty()){
            System.out.println("Aucun trader disponible");
            return;
        }
        System.out.println("===== LISTE DES TRADERS =====");
        for (Trader a : traders) {
            System.out.println(a.getNom());
        }
    }


    public void acheterAsset() {

        System.out.println("===== ACHETER ASSET =====");

        // Afficher traders existants
        System.out.println("Liste traders :");
        for (Trader t : traders) {
            System.out.println("ID = " + t.getId() + " | Nom = " + t.getNom());
        }

        Trader trader = null;

        System.out.print("ID Trader : ");
        int idTrader = input.nextInt();

        for (Trader t : traders) {
            if (t.getId() == idTrader) {
                trader = t;
                break;
            }
        }

        if (trader == null) {
            System.out.println("Trader introuvable !");
            return;
        }

        System.out.print("Code Asset : ");
        int codeAsset = input.nextInt();

        Asset asset = null;
        for (Asset a : assets) {
            if (a.getCode() == codeAsset) {
                asset = a;
                break;
            }
        }

        if (asset == null) {
            System.out.println("Asset introuvable !");
            return;
        }

        System.out.print("Quantité à acheter : ");
        int qte = input.nextInt();

        double total = asset.getPrixUnitaire() * qte;

        if (qte > asset.getQuantites()) {
            System.out.println("Quantité insuffisante !");
            return;
        }

        if (trader.getSoldeInit() < total) {
            System.out.println("Solde insuffisant !");
            return;
        }

        asset.setQuantites(asset.getQuantites() - qte);
        trader.setSoldeInit(trader.getSoldeInit() - total);
         transactions.add(new Transaction("achat",asset,qte,total));
         for(Transaction a : transactions){
             System.out.println("Type d'operation : "+a.getType() + "quantite : " +qte+"prix : "+total );
         }

        System.out.println("Achat réussi !");
    }
    public void afficherTransactions(){

        for(Transaction a : transactions){
            System.out.println("Type d'operation : "+a.getType() + "quantite : " +a.getQuantite()+"prix : "+a.getPrix() );
        }
    }
    public void filtrer(){

        List<Transaction> transactions1 = transactions;transactions1.stream().filter(t->t.getType().equals("achat")).toList()
        .forEach(System.out::println);
    }

    public  void vendreAsset() {
        System.out.println("===== vendre asset =====");

        System.out.print("ID Trader : ");
        int idTrader = Market.input.nextInt();
        Trader trader = null;
        for (Trader t : traders) {
            if (t.getId() == idTrader) {
                trader = t;
                return;
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
                System.out.print("Quantité à vendre : ");
                int qte = Market.input.nextInt();

                double total = asset.getPrixUnitaire() * qte;

                if ( asset.getQuantites()<qte ) {
                    System.out.println("Quantité insuffisante  !");
                } else {
                    asset.setQuantites(asset.getQuantites() - qte);
                    trader.setSoldeInit(trader.getSoldeInit() + total);

                    System.out.println("Vendre réussi !");
                    transactions.add(new Transaction("vendre",asset,qte,total));
                    for(Transaction a : transactions){
                    System.out.println("Type d'operation : "+a.getType() + " quantite : " +qte+"prix : "+total );
                }}
            }
        }}
}







