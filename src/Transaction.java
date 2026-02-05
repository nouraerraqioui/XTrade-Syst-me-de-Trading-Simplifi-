import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private Asset asset;

    private int quantite;
    private double prix;
    private LocalDate Date;

    public Transaction(String type,Asset asset ,int quantite, double prix) {
        this.type = type;
        this.asset = asset;
        this.quantite = quantite;
        this.prix = prix;
        this.Date = LocalDate.now();

    }

    public String getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", asset=" + asset +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", Date=" + Date +
                '}';
    }
}