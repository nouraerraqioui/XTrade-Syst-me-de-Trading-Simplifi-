
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    List<PortAsset> portAssets = new ArrayList<>();
    public void addAsset(Asset asset, int quantite) {

        for (PortAsset port : portAssets) {
            if (port.getAsset() == asset) {
                port.setQuantite(port.getQuantite() + quantite);
                return;
            }
        }


        portAssets.add(new PortAsset(asset, quantite));

    }

    public void Afficherportfolio() {

        System.out.println("Portfolio est : ");

        for (PortAsset port : portAssets) {
            System.out.println(
                    "Asset : " + port.getAsset().getNom()
                            + " | Quantité : " + port.getQuantite()
            );
        }
    }
}



