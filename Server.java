
import javax.swing.JOptionPane;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[]args)throws Exception
    {
        
      Registry reg=LocateRegistry.createRegistry(2001);
      JOptionPane.showMessageDialog(null,"Server is Ready");
      CheckLogin checkLogin=new CheckLogin();
      reg.bind("AUTH",checkLogin);
    }
}
