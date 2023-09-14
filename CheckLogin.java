import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin extends UnicastRemoteObject implements LoginInterface
{
     public CheckLogin() throws Exception 
    {
    }
    @Override 
    public boolean check(String userId, String password)throws RemoteException
    
    {
        if(userId.equals("root")&& password.equals("root"))
            return true;
        else
            return false;
    }
}
