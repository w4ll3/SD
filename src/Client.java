import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            EncoderInterface e = (EncoderInterface) Naming.lookup("//127.0.0.1:1099/DecToBin");
            System.out.println(e.DecToBin(256));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
