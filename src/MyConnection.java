
import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.event.*;
import java.awt.*;
public class MyConnection {
    public static Connection conectionDB()
    {
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
           /**/ 
        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        }
          
        
         return con;        
    }
    public void login( String name,String pass)
     {
          Connection con = MyConnection.conectionDB();
        
        PreparedStatement ps;
        try {
            ps =con.prepareStatement(" SELECT * FROM login WHERE username=? AND passwort=? ");
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet rs =ps.executeQuery();
            
            
            if(rs.next())
            {
                
                prinform pf =new prinform();
                pf.setVisible(true);
                pf.pack();
                pf.setLocationRelativeTo(null);
               
            }else
            {
                  JOptionPane.showMessageDialog(null,"falsche Benutzername oder Passwort  ");
                
        
                  
                  
            }
            
            
        } catch (SQLException ex) {
           
           System.out.println( ex.getMessage());
        }
         
     }
    void close()
    {
        WindowEvent winClosingEvent =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}