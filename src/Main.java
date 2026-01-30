import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner mode = new Scanner(System.in);



        int choix = 0;

         do{
             System.out.println("|_________| Market |_________|\n" +
                 "| 1 - ajouter asset             |\n" +
                 "| 2 - ajouter Trader           |\n" +
                 "| 3 - Quitter                   |\n" +
                 "|____________________________|");
             System.out.println("Entrer votre choix: ");
             choix = mode.nextInt();
             Market market= new Market();
                 switch (choix) {
                     case 1:
                         market.addAsset();
                         break;
                     case 2:
                         market.addTrader();
                         break;
                     case 3:
                         System.out.println("Quittez");
                         break;
                 }


        }while(choix != 3);

  }


}