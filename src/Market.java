import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;
public  class Market {
    private List<Asset> assets = new ArrayList<>();
    private List<Trader> traders = new ArrayList<>();

    static Scanner input = new Scanner(System.in);
    public void ajouterAsset(){
        System.out.println("====Ajouter Asset========");
        System.out.println("entrer Le code");
        int code = input.nextInt();
        input.nextLine();
        System.out.println("Entrez le Nom d'asset :");
        String nom =input.nextLine();
        System.out.println("Entrer prix d'asset :");
        double prixUnitaire =input.nextDouble();
        input.nextLine();
        System.out.println("Entrer type d'asset (S = (STOCK) / C = (CRYPTO) :");
        String type =input.nextLine(); System.out.println("Entrer quantite :");
        int quantite =input.nextInt();
           if(type.equals("S")){
            Asset asset = new Stock(code,nom,prixUnitaire,type,quantite);
            assets.add(asset); }
            else if(type.equals("C")){
                Asset asset = new Crypto(code,nom,prixUnitaire,type,quantite);
            assets.add(asset); }
            else{ System.out.println("Erreur !!!"); }
} public void afficherAssets() {
        for (Asset asset : assets) {
            System.out.println(asset);
        }}
        public void ajouterTrader () {
            System.out.println("====Ajouter Trader ========");
            System.out.println("entrer L'ID");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Entrez le Nom du trader :");
            String nom = input.nextLine();
            System.out.println("Entrer solde initiale ");
            double soldeInt = input.nextDouble();
            Trader trader = new Trader(id, nom, soldeInt);
            traders.add(trader);
        }
    }


