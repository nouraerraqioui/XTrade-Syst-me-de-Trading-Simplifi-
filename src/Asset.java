public abstract class Asset {
    private int code;
    private String nom;
    private double  prixUnitaire;
    private String type;
    private int quantite;

//constructor getters/setters
    public Asset(int code, String nom, double prixUnitaire, String type, int quantite) {
        this.code = code;
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.type = type;
        this.quantite = quantite;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getQuantites() { return quantite;}
    public void setQuantites(int quantites) { this.quantite = quantite;}

    // methodes gettype & calculvalue
    public abstract String getType();
    public double calculvalue() {
        return getPrixUnitaire()*getQuantites();
    }
}
