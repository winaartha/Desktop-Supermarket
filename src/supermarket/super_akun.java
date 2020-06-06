package supermarket;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class super_akun {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    int idAkun;
    String nama,noTelp,email,jabatan,tglMasuk,username,password;

    public super_akun(int id){
        this.idAkun=id;
        try{
            sql="SELECT * From akun INNER JOIN jabatan USING (idJabatan) Where idAkun='"+this.idAkun+"'";
            rs=stat.executeQuery(sql);
            rs.next();

            this.nama=rs.getString("nama");
            this.noTelp=rs.getString("noTelp");
            this.email=rs.getString("email");
            this.jabatan=rs.getString("namaJabatan");
            this.tglMasuk=rs.getString("tglMasuk");
            this.username=rs.getString("username");
            this.password=rs.getString("password");

        }catch(Exception e){
            System.out.print(e);
        }
    }

    public super_akun() {
        this.nama="";
        this.noTelp="";
        this.email="";
        this.jabatan="";
        this.tglMasuk="";
        this.username="";
        this.password="";
    }

    public void editProfile(String nama,String noTelp,String email){
        this.nama=nama;
        this.noTelp=noTelp;
        this.email=email;

        try{
            sql="UPDATE akun SET nama='"+this.nama+"',noTelp='"+this.noTelp+"',email='"+this.email+"',foto=NULL WHERE idAkun='"+this.idAkun+"'";
            stat.executeUpdate(sql);

            String aktivitas="Kasir id "+idAkun+" mengupdate profile";
            sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
            stat.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
        }catch(Exception e){
            System.out.print(e);
        }
    }
}

