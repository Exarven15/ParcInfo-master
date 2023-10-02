public class Switch extends Materiel {
    public Switch(int port) {
        this.port = port;
    }
    public Switch(String noS, int port) {
        super(noS);
        this.port = port;
    }

    @Override
    public String toString() {
        return "Switch [port= " + port + "]";
    }
    int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
