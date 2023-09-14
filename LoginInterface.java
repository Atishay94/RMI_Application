import java.rmi.Remote;
import java.rmi.RemoteException;

interface LoginInterface extends Remote
{
public boolean check(String userId, String password)throws RemoteException;    
}
