public class OrdiPort extends Materiel{
    String souris;

    public OrdiPort(String souris) {
        this.souris = souris;
    }

    public OrdiPort(String noS, String souris) {
        super(noS);
        this.souris = souris;
    }

    public String getSouris() {
        return souris;
    }

    public void setSouris(String souris) {
        this.souris = souris;
    }

    @Override
    public String toString() {
        return "OrdiPort [souris=" + souris + "]";
    }
}
