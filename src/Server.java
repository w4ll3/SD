import java.rmi.Naming;

public class Server {
    public Server() {
        try {
            EncoderInterface e = new Encoder();
            Naming.rebind("//127.0.0.1:1099/DecToBin", e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
