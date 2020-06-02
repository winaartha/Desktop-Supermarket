package supermarket;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    String jabatan;
    int id_user;
    
    private void kosongkan_form(){
        txtUsername.setEditable(true);
        txtUsername.setText(null);
        txtPassword.setEditable(true);
        txtPassword.setText(null);
    }
    
    public Login() {
        initComponents();
        //koneksi database
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(922, 534));

        bg3.setBackground(new java.awt.Color(54, 33, 89));
        bg3.setPreferredSize(new java.awt.Dimension(922, 534));
        bg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1173, 101, 220, 192));

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(51, 51, 51));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        bg3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 315, 37));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bg3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 315, 36));
        bg3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 410, -1, -1));
        bg3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 361, -1, -1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        bg3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 86, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_male_user_200px_1.png"))); // NOI18N
        bg3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_customer_40px.png"))); // NOI18N
        bg3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_password_40px.png"))); // NOI18N
        bg3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg3, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            sql = "SELECT * FROM akun WHERE username='"+txtUsername.getText()+"' AND password='"+txtPassword.getText()+"'";
            rs = stat.executeQuery(sql);

            if(rs.next()){
                if((txtUsername.getText().equals(rs.getString("username"))) && txtPassword.getText().equals(rs.getString("password"))){
                    jabatan = rs.getString("jabatan");
                    id_user = rs.getInt("idAkun");
                    this.setVisible(false);
                    switch(jabatan){
                        case "Manager":
                            new Manager(id_user).setVisible(true);
                            break;
                        case "Karyawan":
                            new Karyawan(id_user).setVisible(true);
                            break;
                        case "Kasir":
                            new Kasir(id_user).setVisible(true);
                            break;
                    }             
                }else{
                    JOptionPane.showMessageDialog(null, "Username atau password salah");
                    kosongkan_form();
                }
            }
        }catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg3;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
