
import javax.swing.JOptionPane;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client {
    public static void main(String[] args) throws Exception
    {
        {
            String serverName=JOptionPane.showInputDialog("Enter Server Name");
            Integer portNo=Integer.parseInt(JOptionPane.showInputDialog("Enter Server Name"));
            String  uniqueId=JOptionPane.showInputDialog("Enter Unique Id");
            String  userId=JOptionPane.showInputDialog("Enter User Id");
            String password=JOptionPane.showInputDialog("Enter Password");
            Registry reg=LocateRegistry.getRegistry(serverName,portNo);
            LoginInterface li=(LoginInterface)reg.lookup(uniqueId);
            boolean result=li.check(userId,password);
            if(result)
            {
                JOptionPane.showInputDialog(null,"HELLO");
            }
             else
            {
                System.exit(0);
            }
        }
    }
}
