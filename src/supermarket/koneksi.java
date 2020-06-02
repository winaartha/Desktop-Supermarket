package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/supermarket","root","");
            stm = con.createStatement();
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal\n\n"+e.getMessage());
        }
    }
}
