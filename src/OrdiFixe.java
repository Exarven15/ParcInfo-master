public class OrdiFixe extends Materiel{
    public OrdiFixe(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }

    public OrdiFixe(String noS, String carteGraphique) {
        super(noS);
        this.carteGraphique = carteGraphique;
    }

    @Override
    public String toString() {
        return "OrdiFixe [carteGraphique=" + carteGraphique + "]";
    }

    String carteGraphique;

    public String getCarteGraphique() {
        return carteGraphique;
    }

    public void setCarteGraphique(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }
    
}
