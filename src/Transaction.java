import java.util.Date;

public class Transaction {
    private String type;
    private int quantite;
    private double prix;
    private Date Date;

    public Transaction(String type, int quantite, double prix, Date Date) {
        this.type = type;
        this.quantite = quantite;
        this.prix = prix;
        this.Date = Date;
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

    public Date getDate() {
        return Date;
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

    public void setDate(Date Date) {
        this.Date = Date;
    }
}