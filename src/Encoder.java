import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Encoder extends UnicastRemoteObject implements EncoderInterface {

    public Encoder() throws RemoteException {
        super();
    }

    public String DecToBin(int number) {
        return Integer.toBinaryString(number);
    }
}
