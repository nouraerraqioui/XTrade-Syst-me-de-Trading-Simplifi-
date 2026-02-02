import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();

        int choix;

        do {
            System.out.println("\n===== MENU MARKET =====");
            System.out.println("1. Ajouter un Asset");
            System.out.println("2. Afficher les Assets");
            System.out.println("3. Ajouter un Trader");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = Market.input.nextInt();

            switch (choix) {
                case 1:
                    market.ajouterAsset();
                    break;

                case 2:
                    market.afficherAssets();
                    break;

                case 3:
                    market.ajouterTrader();
                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);


    }
}
