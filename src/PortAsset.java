
public class PortAsset {
    private static Asset asset;
    private static int quantite;
    public PortAsset(Asset asset, int quantite) {
        this.asset = asset;
        this.quantite = quantite;
    }
    public static Asset getAsset() {
        return asset;
    }
    public static int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
