
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





public class praktikant {
    
    
   
    
    public void display (JTable table)
{
    
    
       
        Connection con = MyConnection.conectionDB();

            PreparedStatement ps;
            DefaultTableModel dt = new DefaultTableModel();
            
             dt.addColumn("identifikationsnummer");
             dt.addColumn("Vorname");
             dt.addColumn("Nachname");
             dt.addColumn("Geburtsdatum");
             dt.addColumn("Servic");
             dt.addColumn("Dauer ");
             dt.addColumn("Geschelcht");
             table.setModel(dt);


           
        try { 
            
            ps =con.prepareStatement (" SELECT * FROM student ");
           
            ResultSet rs =ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            Object[] row;
            while(rs.next()){
           
            row = new Object[7];
            row[0] =rs.getInt("Id");
            row[1] =rs.getString("Vorname");
            row[2] =rs.getString("Nachname");
            row[3] =rs.getDate("Gebursdatum");
            row[4] =rs.getString("Service");
            row[5] =rs.getString("Dauer");
            row[6] =rs.getString("Geschlecht");
            
            
            
            model.addRow(row);
            table.setModel(model);
            System.out.println(model);
            } 
        } catch (Exception e) {
           System.out.println( e);
        }
}
   

     
       
      public void suchen(JTable table, String ID)
{
    
    
       
        Connection con = MyConnection.conectionDB();

            PreparedStatement ps;
            DefaultTableModel dt = new DefaultTableModel();
            
             dt.addColumn("identifikationsnummer");
             dt.addColumn("Vorname");
             dt.addColumn("Nachname");
             dt.addColumn("Geburtsdatum");
             dt.addColumn("Servic");
             dt.addColumn("Dauer ");
             dt.addColumn("Geschelcht");
             table.setModel(dt);


           
        try { 
            
             ps =con.prepareStatement (" SELECT * FROM student  WHERE Id LIKE "+ ID +" ");
           
           
            ResultSet rs =ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            Object[] row;
            while(rs.next()){
           
            row = new Object[7];
            row[0] =rs.getInt("Id");
            row[1] =rs.getString("Vorname");
            row[2] =rs.getString("Nachname");
            row[3] =rs.getDate("Gebursdatum");
            row[4] =rs.getString("Service");
            row[5] =rs.getString("Dauer");
            row[6] =rs.getString("Geschlecht");
            
            
            
            model.addRow(row);
            table.setModel(model);
            System.out.println(model);
            } 
        } catch (Exception e) {
           System.out.println( e);
        }
}
      
      
       public void update( int ID ,String vorname,String nachname,String datum,String service,String dauer,String gesch)
       
{
    
    
        Connection con = MyConnection.conectionDB();

            PreparedStatement ps;

            try {
                ps =con.prepareStatement (" UPDATE student SET Vorname =? ,Nachname = ?,Gebursdatum =? ,Service = ?,Dauer = ?,Geschlecht = ? WHERE Id = ? ");
                ps.setString(1,vorname );
                ps.setString(2,nachname );
                ps.setString(3,datum );
                
                ps.setString(4,service );
                
                ps.setString(5,dauer );
                ps.setString(6,gesch );
                ps.setInt(7,ID );
               
 
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"Die Information verandert  werde ");
                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
      
        
}
         public void Inser( int ID ,String vorname,String nachname,String datum,String service,String dauer,String gesch)
         {
              Connection con = MyConnection.conectionDB();

            PreparedStatement ps;

            try {
                ps =con.prepareStatement (" INSERT INTO student(Id,Vorname,Nachname,Gebursdatum,Service,Dauer,Geschlecht)VALUES (?,?,?,?,?,?,?)");
                ps.setInt(1,ID );
                ps.setString(2,vorname );
                ps.setString(3,nachname );
                
                ps.setString(4,datum );
               
                ps.setString(5,service );
                ps.setString(6,dauer );
                ps.setString(7,gesch );
 
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"New praktikant eingefugt werde ");
                  
                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
         }
          public void delete( int ID )
         {
              Connection con = MyConnection.conectionDB();

            PreparedStatement ps;

            try {
                ps =con.prepareStatement (" DELETE from student WHERE Id = ? ");
                ps.setInt(1,ID );
                
 
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"Die Praktikant  gelöscht werde ");
                  
                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
         }
      
}
