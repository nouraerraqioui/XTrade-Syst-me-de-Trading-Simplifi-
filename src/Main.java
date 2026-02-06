import java.util.Scanner;

public  class Main {
    private static Scanner input = new Scanner(System.in);
    static Market market = new Market();

    public static int admin() {
        int choix = 0;
        do {
                System.out.println("=========Mode Admin ========== \n" +
                        "| 1 - Ajouter un Trader                   |\n" +
                        "| 2 - Ajouter un Asset                    |\n" +
                        "| 3 - Mettre à jour les prix              |\n" +
                        "| 4 - Filtrer buy//sell                   |\n" +
                        "| 5 - Quitte                              |\n" +
                        "|_________________________________________|");
                System.out.println("choisi--->");
                choix = input.nextInt();
                switch (choix) {
                    case 1:
                        market.addTrader();
                        break;
                    case 2:
                        market.addAsset();
                        break;
                    case 3:
                        market.filtrerParType();
                        break;
                }
        } while (choix != 5);
        return choix;
    }



    public  static int trader () {
        int choix = 0;
        do {
                System.out.println("===== Mode Trader =====");
                System.out.println("1. Acheter un Asset");
                System.out.println("2. Vendre un Asset");
                System.out.println("3. Afficher Portfolio d'un Trader");
                System.out.println("4. Afficher Transactions");
                System.out.println("5. Afficher tous les Assets");
                System.out.println("6. Quitter");
                System.out.print("Votre choix: ");
                System.out.println("choisi--->");
                choix = input.nextInt();

                switch (choix) {
                    case 1: market.acheterAsset();break;

                    case 2: market.vendreAsset();break;

                    case 3: market.afficherAssets();break;

                    case 4: market.afficherTransactions();break;
                    case 6: System.out.println("Au revoir 👋");break;

                    default:
                        System.out.println("Choix invalide");
            }
        } while (choix != 6);

        return choix;
    }


    public static void main(String[] args) {
        int choix = 0;
        do {

            System.out.println("|_________| MENU PRINCIPALE |_________|\n" +
                    "| 1 - Admin mode             |\n" +
                    "| 2 - Client mode            |\n" +
                    "| 3 - Quitter                 |\n" +
                    "|____________________________|");
            System.out.println("choisi--->");
            choix = input.nextInt();
            switch (choix) {
                case 1:
                    admin();
                    break;
                case 2:
                    trader();
                    break;
                case 3:
                    System.out.println("quittez programme");
                    break;
            }

        }while (choix != 3) ;

    }
}





