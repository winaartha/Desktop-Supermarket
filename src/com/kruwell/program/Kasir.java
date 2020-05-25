package com.kruwell.program;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Kasir extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
        
    public static int idAkun;
    String layoutActive;
    public int baris, kolom;
    
    public Kasir(int id){
        idAkun=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        initComponents();
                     
        setColor(btn_transaksi);
        switchPanels(Layout_transaksi);
        addListener();
        txt_Tittle.setText("Transaksi");
    }
    
    public Kasir() {
        initComponents();
    }
    
    public class setTittle{
        public void ubah(){
            txt_Tittle.setText("");
        }
    }
    setTittle x;
    
    public class tittleTransaksi extends setTittle{
        public void ubah(){
            txt_Tittle.setText("Transaksi");
        }
    }
    
    public class tittleRiwayat extends setTittle{
        public void ubah(){
            txt_Tittle.setText("Riwayat");
        }
    }
    
    public class tittleProfile extends setTittle{
        public void ubah(){
            txt_Tittle.setText("Profile");
        }
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }  
    void resetColor(JPanel panel){
         panel.setBackground(new Color(64,43,100));
    }
    
    public void switchPanels(JPanel panel){
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Side_panel = new javax.swing.JPanel();
        btn_transaksi = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_riwayat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_profile = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_transaksi = new javax.swing.JPanel();
        Total_harga = new javax.swing.JLabel();
        Total_harga2 = new javax.swing.JLabel();
        Uang = new javax.swing.JLabel();
        Uang2 = new javax.swing.JTextField();
        Kembali = new javax.swing.JLabel();
        Kembali2 = new javax.swing.JLabel();
        Proses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_riwayatTransaksi = new javax.swing.JTable();
        editProfile = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nama1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        no_telp1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jabatan1 = new javax.swing.JLabel();
        backEditProfile = new javax.swing.JButton();
        saveEditProfile = new javax.swing.JButton();
        browseEditProfile = new javax.swing.JButton();
        passwordProfile = new javax.swing.JPanel();
        passwordSave = new javax.swing.JButton();
        passwordCancel = new javax.swing.JButton();
        kolomPassword = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        passwordBaru = new javax.swing.JTextField();
        passwordLama = new javax.swing.JTextField();
        lihatProfile = new javax.swing.JPanel();
        Foto = new javax.swing.JPanel();
        Identitas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textNama = new javax.swing.JLabel();
        textNoTelp = new javax.swing.JLabel();
        textEmail = new javax.swing.JLabel();
        textJabatan = new javax.swing.JLabel();
        gantiPassword = new javax.swing.JButton();
        editData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(922, 534));
        setSize(new java.awt.Dimension(922, 534));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(922, 534));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Side_panel.setBackground(new java.awt.Color(54, 33, 89));
        Side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_transaksi.setBackground(new java.awt.Color(64, 43, 100));
        btn_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_transaksiMousePressed(evt);
            }
        });
        btn_transaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_transaction_15px.png"))); // NOI18N
        btn_transaksi.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Transaksi");
        btn_transaksi.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 40));

        btn_riwayat.setBackground(new java.awt.Color(64, 43, 100));
        btn_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayatMousePressed(evt);
            }
        });
        btn_riwayat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_clock_15px.png"))); // NOI18N
        btn_riwayat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Riwayat");
        btn_riwayat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 40));

        btn_profile.setBackground(new java.awt.Color(64, 43, 100));
        btn_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_profileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_profileMousePressed(evt);
            }
        });
        btn_profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_admin_settings_male_15px.png"))); // NOI18N
        btn_profile.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Profile");
        btn_profile.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 40));

        btn_logout.setBackground(new java.awt.Color(64, 43, 100));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logoutMousePressed(evt);
            }
        });
        btn_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_logout_rounded_left_15px.png"))); // NOI18N
        btn_logout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Logout");
        btn_logout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 40));
        Side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Kasir");
        Side_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Transaksi");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

        Layout_transaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_transaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total_harga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total_harga.setText("Total Harga");
        Layout_transaksi.add(Total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, 30));
        Layout_transaksi.add(Total_harga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 120, 30));

        Uang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Uang.setText("Uang Dibayar");
        Layout_transaksi.add(Uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 100, 30));

        Uang2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Uang2KeyReleased(evt);
            }
        });
        Layout_transaksi.add(Uang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 120, 30));

        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Kembali.setText("Uang Kembali");
        Layout_transaksi.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, 30));
        Layout_transaksi.add(Kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 30));

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        Layout_transaksi.add(Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        tabelTransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelTransaksi.setForeground(new java.awt.Color(12, 12, 12));
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Harga", "Diskon", "Qty", "Satuan", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelTransaksi.setGridColor(new java.awt.Color(240, 240, 240));
        tabelTransaksi.setRowHeight(20);
        tabelTransaksi.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelTransaksi);
        if (tabelTransaksi.getColumnModel().getColumnCount() > 0) {
            tabelTransaksi.getColumnModel().getColumn(0).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelTransaksi.getColumnModel().getColumn(1).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelTransaksi.getColumnModel().getColumn(2).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(3).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(4).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabelTransaksi.getColumnModel().getColumn(5).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(5).setPreferredWidth(50);
            tabelTransaksi.getColumnModel().getColumn(6).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        Layout_transaksi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 223));

        Layout_riwayat.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_riwayatTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Pelanggan", "DATE", "Total Belanja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_riwayatTransaksi.setGridColor(new java.awt.Color(240, 240, 240));
        tabel_riwayatTransaksi.setRowHeight(50);
        tabel_riwayatTransaksi.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabel_riwayatTransaksi);
        if (tabel_riwayatTransaksi.getColumnModel().getColumnCount() > 0) {
            tabel_riwayatTransaksi.getColumnModel().getColumn(0).setResizable(false);
            tabel_riwayatTransaksi.getColumnModel().getColumn(1).setResizable(false);
            tabel_riwayatTransaksi.getColumnModel().getColumn(2).setResizable(false);
            tabel_riwayatTransaksi.getColumnModel().getColumn(3).setResizable(false);
        }

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 390));

        editProfile.setBackground(new java.awt.Color(255, 255, 255));
        editProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        editProfile.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nama  :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("No. telp :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Email   :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Jabatan :");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jabatan1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(jabatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 340, 30));

        editProfile.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 490, 280));

        backEditProfile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        backEditProfile.setText("Back");
        backEditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backEditProfileMouseClicked(evt);
            }
        });
        editProfile.add(backEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        saveEditProfile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        saveEditProfile.setText("Save");
        saveEditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEditProfileMouseClicked(evt);
            }
        });
        editProfile.add(saveEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        browseEditProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        browseEditProfile.setText("Browse");
        editProfile.add(browseEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 90, 30));

        passwordProfile.setBackground(new java.awt.Color(255, 255, 255));
        passwordProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordSave.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordSave.setText("Save");
        passwordSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordSaveMouseClicked(evt);
            }
        });
        passwordProfile.add(passwordSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        passwordCancel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordCancel.setText("Cancel");
        passwordCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordCancelMouseClicked(evt);
            }
        });
        passwordProfile.add(passwordCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        kolomPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Password Lama  :");
        kolomPassword.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Password Baru   :");
        kolomPassword.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 30));

        passwordBaru.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        kolomPassword.add(passwordBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 330, 30));

        passwordLama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        kolomPassword.add(passwordLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 30));

        passwordProfile.add(kolomPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 280));

        lihatProfile.setBackground(new java.awt.Color(255, 255, 255));
        lihatProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout FotoLayout = new javax.swing.GroupLayout(Foto);
        Foto.setLayout(FotoLayout);
        FotoLayout.setHorizontalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        FotoLayout.setVerticalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        lihatProfile.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        Identitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Nama  :");
        Identitas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("No. telp :");
        Identitas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Email   :");
        Identitas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Jabatan :");
        Identitas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        textNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Identitas.add(textNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 30));

        textNoTelp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Identitas.add(textNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        textEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Identitas.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        textJabatan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Identitas.add(textJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 340, 30));

        lihatProfile.add(Identitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 490, 280));

        gantiPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gantiPassword.setText("Ganti Password");
        gantiPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gantiPasswordMouseClicked(evt);
            }
        });
        lihatProfile.add(gantiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        editData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        editData.setText("Edit data");
        editData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDataMouseClicked(evt);
            }
        });
        lihatProfile.add(editData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_transaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bg.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 710, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void btn_transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMousePressed
        setColor(btn_transaksi);
        resetColor(btn_riwayat);
        resetColor(btn_profile);
        switchPanels(Layout_transaksi);
        layoutActive="btn_transaksi";
        
        tittleTransaksi y  = new tittleTransaksi();
        x=y;
        x.ubah();
        
        
    
    }//GEN-LAST:event_btn_transaksiMousePressed

    private void btn_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMousePressed
        setColor(btn_riwayat);
        resetColor(btn_transaksi);
        resetColor(btn_profile);
        switchPanels(Layout_riwayat);
        layoutActive="btn_riwayat";
        
        tittleRiwayat y  = new tittleRiwayat();
        x=y;
        x.ubah();
        
        setTableData(tabel_riwayatTransaksi);
    }//GEN-LAST:event_btn_riwayatMousePressed

    private void btn_profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMousePressed
        setColor(btn_profile);
        resetColor(btn_riwayat);
        resetColor(btn_transaksi);
        switchPanels(lihatProfile);
        layoutActive="btn_profile";
        
        tittleProfile y  = new tittleProfile();
        x=y;
        x.ubah();
        
        user kasir = new user(idAkun);
        textNama.setText(kasir.nama);
        textNoTelp.setText(kasir.no_telp);
        textEmail.setText(kasir.email);
        textJabatan.setText(kasir.jabatan);
    }//GEN-LAST:event_btn_profileMousePressed

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutMousePressed

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        setColor(btn_transaksi);
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        if(!"btn_transaksi".equals(layoutActive)){
            resetColor(btn_transaksi);
        }
    }//GEN-LAST:event_btn_transaksiMouseExited

    private void btn_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseEntered
        setColor(btn_riwayat);
    }//GEN-LAST:event_btn_riwayatMouseEntered

    private void btn_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseExited
        if(!"btn_riwayat".equals(layoutActive)){
            resetColor(btn_riwayat);
        }    
    }//GEN-LAST:event_btn_riwayatMouseExited

    private void btn_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseEntered
        setColor(btn_profile);
    }//GEN-LAST:event_btn_profileMouseEntered

    private void btn_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseExited
        if(!"btn_profile".equals(layoutActive)){
            resetColor(btn_profile);
        } 
    }//GEN-LAST:event_btn_profileMouseExited

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        setColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        resetColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseExited

    private void gantiPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gantiPasswordMouseClicked
        switchPanels(passwordProfile);
    }//GEN-LAST:event_gantiPasswordMouseClicked

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        user kasir = new user(idAkun);
        nama1.setText(kasir.nama);
        no_telp1.setText(kasir.no_telp);
        email1.setText(kasir.email);
        jabatan1.setText(kasir.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        user kasir = new user(idAkun);
        textNama.setText(kasir.nama);
        textNoTelp.setText(kasir.no_telp);
        textEmail.setText(kasir.email);
        textJabatan.setText(kasir.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void saveEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditProfileMouseClicked
        try{
            sql="UPDATE akun SET nama='"+nama1.getText()+"',noTelp='"+no_telp1.getText()+"',email='"+email1.getText()+"',foto=NULL WHERE idAkun='"+idAkun+"'";
            stat.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

    private void passwordSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSaveMouseClicked
        try{
            sql="SELECT password FROM akun WHERE idAkun='"+idAkun+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            if(passwordLama.getText().equals(rs.getString(1))){
                sql="UPDATE akun SET password='"+passwordBaru.getText()+"'WHERE idAkun='"+idAkun+"'";
                stat.execute(sql);
                JOptionPane.showMessageDialog(null, "Password berhasil diupdate");
            }else{
                JOptionPane.showMessageDialog(null, "Password salah");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_passwordSaveMouseClicked

    private void passwordCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordCancelMouseClicked
        switchPanels(lihatProfile);
        user kasir = new user(idAkun);
        textNama.setText(kasir.nama);
        textNoTelp.setText(kasir.no_telp);
        textEmail.setText(kasir.email);
        textJabatan.setText(kasir.jabatan);
    }//GEN-LAST:event_passwordCancelMouseClicked

    private void Uang2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Uang2KeyReleased
        int totalBelanja=Integer.parseInt(Total_harga2.getText());
        if(Uang2.getText()!=null && Uang2.getText()!=""){
            int totalDibayar=Integer.parseInt(Uang2.getText());
            Kembali2.setText(String.valueOf(totalDibayar-totalBelanja));
        }
    }//GEN-LAST:event_Uang2KeyReleased

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        int idTransaksi;
        String s=JOptionPane.showInputDialog(null,"Masukkan id Pelanggan");
        try{
            if(s!=null){
                if(s.equalsIgnoreCase("")){
                    sql="INSERT INTO transaksi values (NULL,'"+idAkun+"',0,CURDATE(),'"+Total_harga2.getText()+"')";
                    stat.executeUpdate(sql);
                }else{
                    sql="INSERT INTO transaksi values (NULL,'"+idAkun+"','"+s+"',CURDATE(),'"+Total_harga2.getText()+"')";
                    stat.executeUpdate(sql);
                }
            }
        }catch(Exception x){
            System.out.println(x);
        }
      
        try{
            sql="SELECT idTransaksi FROM transaksi ORDER BY tanggal DESC LIMIT 1";
            rs=stat.executeQuery(sql);
            rs.next();
            idTransaksi=Integer.parseInt(rs.getString(1));
            
            for(int i=0;tabelTransaksi.getValueAt(i, 0)!=null;i++){
                sql="INSERT INTO transaksi_detail values (NULL,'"+idTransaksi+"','"+tabelTransaksi.getValueAt(i, 0)+"','" + tabelTransaksi.getValueAt(i, 2) + "','"+tabelTransaksi.getValueAt(i, 4)+"','"+tabelTransaksi.getValueAt(i, 3)+"')";
                stat.executeUpdate(sql);
                
                sql="UPDATE barang SET stok=stok-'"+tabelTransaksi.getValueAt(i, 4)+"'WHERE idBarang='"+tabelTransaksi.getValueAt(i,0)+"'";
                stat.execute(sql);
                
            }
            JOptionPane.showMessageDialog(null, "Transaksi Berhasil");
            DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
            dtm.setRowCount(0);
            dtm.setRowCount(8);
            Total_harga2.setText("");
            Uang2.setText("");
            Kembali2.setText("");
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ProsesActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }
    
    public class user{
        String nama,no_telp,email,jabatan;
        public user(int id){
            try{
                sql="Select nama,noTelp,email,jabatan From akun Where idAkun='"+id+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                nama=rs.getString(1);
                no_telp=rs.getString(2);
                email=rs.getString(3);
                jabatan=rs.getString(4);
            }catch(Exception e){
                System.out.print(e);
            }
        }
    }
    
    private void setTableData(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idTransaksi,idPelanggan,tanggal,totalBelanja FROM transaksi WHERE idKasir='"+idAkun+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
//            System.out.println(rows);
            String[][] data=new String[rows][4];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getInt(2)+"";
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getInt(4)+"";
                rowIndex++;
            }
            String[] cols={"ID Transaksi","ID Pelanggan","DATE","Total Belanja"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    
    public void addListener(){
        tabelTransaksi.getModel().addTableModelListener(new TableModelListener() {
            
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    final int row = e.getFirstRow();
                    final int column = e.getColumn();
                    switch(column){
                        case 0:
                            int id_barang=(int) tabelTransaksi.getValueAt(row, column);
                            try{
                                sql="SELECT namaBarang, hargaJual, diskon, satuan FROM barang WHERE idBarang='"+id_barang+"'";
                                rs=stat.executeQuery(sql);
                                rs.next();
                                tabelTransaksi.setValueAt(rs.getString(1), row, 1);
                                tabelTransaksi.setValueAt(rs.getString(2), row, 2);
                                tabelTransaksi.setValueAt(rs.getString(3), row, 3);
                                tabelTransaksi.setValueAt(rs.getString(4), row, 5);
                            }catch(Exception x){
                                System.out.print(x);
                            }
                        case 4:
                            if(tabelTransaksi.getValueAt(row, 0)!=null && tabelTransaksi.getValueAt(row, 4)!=null)
                                try{
                                    int totalHarga=(Integer.parseInt(tabelTransaksi.getValueAt(row, 2).toString())-Integer.parseInt(tabelTransaksi.getValueAt(row, 3).toString())) * Integer.parseInt(tabelTransaksi.getValueAt(row, 4).toString());
                                    tabelTransaksi.setValueAt(totalHarga, row, 6);
                                    int totalBelanja=0;
                                    for(int i=0;tabelTransaksi.getValueAt(i, 6)!=null;i++){
                                        totalBelanja+=Integer.parseInt(tabelTransaksi.getValueAt(i,6).toString());
                                    }
                                    Total_harga2.setText(String.valueOf(totalBelanja));
                                }catch(Exception x){
                                    System.out.print(x);
                                }
                            
                            
                            if(Total_harga2.getText()!=null && Total_harga2.getText()!="" && Uang2.getText()!=null && !Uang2.getText().equals("")){
                                int totalBelanja=Integer.parseInt(Total_harga2.getText());
                                int totalDibayar=Integer.parseInt(Uang2.getText());
                                Kembali2.setText(String.valueOf(totalDibayar-totalBelanja));
                            }
                            break;
                    }
                    
                }
            }
        });    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Identitas;
    private javax.swing.JLabel Kembali;
    private javax.swing.JLabel Kembali2;
    private javax.swing.JPanel Layout_riwayat;
    private javax.swing.JPanel Layout_transaksi;
    private javax.swing.JButton Proses;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JLabel Total_harga;
    private javax.swing.JLabel Total_harga2;
    private javax.swing.JLabel Uang;
    private javax.swing.JTextField Uang2;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_transaksi;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email1;
    private javax.swing.JButton gantiPassword;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jabatan1;
    private javax.swing.JPanel kolomPassword;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JPanel lihatProfile;
    private javax.swing.JTextField nama1;
    private javax.swing.JTextField no_telp1;
    private javax.swing.JTextField passwordBaru;
    private javax.swing.JButton passwordCancel;
    private javax.swing.JTextField passwordLama;
    private javax.swing.JPanel passwordProfile;
    private javax.swing.JButton passwordSave;
    private javax.swing.JButton saveEditProfile;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTable tabel_riwayatTransaksi;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JLabel txt_Tittle;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(Object object, String transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
