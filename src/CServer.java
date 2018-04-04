import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CServer {
    public CServer() {
        try {
            EncoderInterface e = new Encoder();
            Naming.rebind("//127.0.0.1:1099/DecToBin1", e);
            System.out.println(e.DecToBin(256));
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CServer();
    }

}
