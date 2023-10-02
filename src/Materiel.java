public class Materiel {
    protected String Nserie;

    public Materiel() {
        this.Nserie = new String();
    }
    public String getNserie() {
        return this.Nserie;
    }
    public void setNserie(String nserie) {
        this.Nserie = nserie;
    }
    public Materiel(String noS) {
        this.Nserie = new String(noS);
    }
    @Override
    public String toString() {
        return "Materiel [Nserie= " + Nserie + " ]";
    }
}
