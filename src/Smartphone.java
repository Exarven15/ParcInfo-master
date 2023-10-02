public class Smartphone extends Materiel {
    @Override
    public String toString() {
        return "Smartphone [bluetooht= " + bluetooht + "]";
    }

    String bluetooht;

    public Smartphone(String bluetooht) {
        this.bluetooht = bluetooht;
    }

    public Smartphone(String noS, String bluetooht) {
        super(noS);
        this.bluetooht = bluetooht;
    }

    public String getBluetooht() {
        return bluetooht;
    }

    public void setBluetooht(String bluetooht) {
        this.bluetooht = bluetooht;
    }
}
