import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EncoderInterface extends Remote {
    public String DecToBin(int number) throws RemoteException;

}
