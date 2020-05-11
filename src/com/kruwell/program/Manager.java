package com.kruwell.program;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
     
public class Manager extends javax.swing.JFrame {
    //Koneksi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    //Image
    String gender;
    String filename=null;
    byte[] person_image=null;
    private byte[] picture;
            
    //Bantuan        
    public static int id_user;
    String layoutActive;
    public int baris, kolom;
    
    public Manager(int id){
        id_user=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        initComponents();
        
        //baru masuk
        setColor(btn_dataKasir);
        switchPanels(Layout_dataKasir);
        setTableData("Kasir",kasirTable);
    }
    
    public Manager() {
        initComponents();
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
        btn_dataKasir = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_dataKaryawan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_riwayatTransaksi = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_riwayatBarang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_tambahPekerja = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_profile = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_dataKasir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kasirTable = new javax.swing.JTable();
        dataKasirTampilkan = new javax.swing.JButton();
        dataKasirHapus = new javax.swing.JButton();
        Layout_dataKaryawan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();
        Layout_tambahPekerja = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nama1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        no_telp1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        password1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        jabatan1 = new javax.swing.JComboBox();
        btnImage = new javax.swing.JButton();
        add = new javax.swing.JButton();
        editProfile = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        no_telp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jabatan = new javax.swing.JLabel();
        backEditProfile = new javax.swing.JButton();
        saveEditProfile = new javax.swing.JButton();
        browseEditProfile = new javax.swing.JButton();
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
        Layout_riwayatTransaksi = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Layout_riwayatBarang = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        passwordProfile = new javax.swing.JPanel();
        passwordSave = new javax.swing.JButton();
        passwordCancel = new javax.swing.JButton();
        kolomPassword = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(922, 534));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Side_panel.setBackground(new java.awt.Color(54, 33, 89));
        Side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dataKasir.setBackground(new java.awt.Color(64, 43, 100));
        btn_dataKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dataKasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dataKasirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dataKasirMousePressed(evt);
            }
        });
        btn_dataKasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_transaction_15px.png"))); // NOI18N
        btn_dataKasir.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Data Kasir");
        btn_dataKasir.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 40));

        btn_dataKaryawan.setBackground(new java.awt.Color(64, 43, 100));
        btn_dataKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dataKaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dataKaryawanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dataKaryawanMousePressed(evt);
            }
        });
        btn_dataKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_transaction_15px.png"))); // NOI18N
        btn_dataKaryawan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Data Karyawan");
        btn_dataKaryawan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 40));

        btn_riwayatTransaksi.setBackground(new java.awt.Color(64, 43, 100));
        btn_riwayatTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatTransaksiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayatTransaksiMousePressed(evt);
            }
        });
        btn_riwayatTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_clock_15px.png"))); // NOI18N
        btn_riwayatTransaksi.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Riwayat Transaksi");
        btn_riwayatTransaksi.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_riwayatTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 40));

        btn_riwayatBarang.setBackground(new java.awt.Color(64, 43, 100));
        btn_riwayatBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatBarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayatBarangMousePressed(evt);
            }
        });
        btn_riwayatBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_clock_15px.png"))); // NOI18N
        btn_riwayatBarang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Riwayat Barang");
        btn_riwayatBarang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_riwayatBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 40));

        btn_tambahPekerja.setBackground(new java.awt.Color(64, 43, 100));
        btn_tambahPekerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahPekerjaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahPekerjaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahPekerjaMousePressed(evt);
            }
        });
        btn_tambahPekerja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_admin_settings_male_15px.png"))); // NOI18N
        btn_tambahPekerja.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Tambah Pekerja");
        btn_tambahPekerja.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_tambahPekerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 40));

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Manager");
        Side_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        Side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 10));

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

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_admin_settings_male_15px.png"))); // NOI18N
        btn_profile.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Profile");
        btn_profile.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 40));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

        Layout_dataKasir.setBackground(new java.awt.Color(255, 255, 255));
        Layout_dataKasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kasirTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Karyawan", "Tanggal Masuk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kasirTable.setGridColor(new java.awt.Color(240, 240, 240));
        kasirTable.setRowHeight(50);
        kasirTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(kasirTable);
        if (kasirTable.getColumnModel().getColumnCount() > 0) {
            kasirTable.getColumnModel().getColumn(0).setResizable(false);
            kasirTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            kasirTable.getColumnModel().getColumn(1).setResizable(false);
            kasirTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            kasirTable.getColumnModel().getColumn(2).setResizable(false);
        }

        Layout_dataKasir.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 340));

        dataKasirTampilkan.setText("Tampilkan");
        Layout_dataKasir.add(dataKasirTampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 110, -1));

        dataKasirHapus.setText("Hapus");
        dataKasirHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKasirHapusActionPerformed(evt);
            }
        });
        Layout_dataKasir.add(dataKasirHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 90, -1));

        Layout_dataKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_dataKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Karyawan", "Tanggal Masuk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        karyawanTable.setGridColor(new java.awt.Color(240, 240, 240));
        karyawanTable.setRowHeight(50);
        karyawanTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(karyawanTable);
        if (karyawanTable.getColumnModel().getColumnCount() > 0) {
            karyawanTable.getColumnModel().getColumn(0).setResizable(false);
            karyawanTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            karyawanTable.getColumnModel().getColumn(1).setResizable(false);
            karyawanTable.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        Layout_dataKaryawan.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 400));

        Layout_tambahPekerja.setBackground(new java.awt.Color(255, 255, 255));
        Layout_tambahPekerja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_img.setBackground(new java.awt.Color(220, 220, 220));
        Layout_tambahPekerja.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Nama  :");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("No. telp :");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Email   :");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        password1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 340, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Password :");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Jabatan :");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Username :");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        username1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 340, 30));

        jabatan1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jabatan1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih jabatan --", "Kasir", "Karyawan" }));
        jPanel4.add(jabatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 196, 340, 30));

        Layout_tambahPekerja.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 490, 390));

        btnImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImage.setText("Browse");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        Layout_tambahPekerja.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 90, 30));

        add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        Layout_tambahPekerja.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 100, 50));

        editProfile.setBackground(new java.awt.Color(255, 255, 255));
        editProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        editProfile.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nama  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("No. telp :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Email   :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Jabatan :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jabatan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 340, 30));

        editProfile.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 490, 280));

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

        Layout_riwayatTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayatTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Transaksi", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(240, 240, 240));
        jTable3.setRowHeight(50);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        Layout_riwayatTransaksi.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 400));

        Layout_riwayatBarang.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayatBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Pemasukan Barang", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(240, 240, 240));
        jTable4.setRowHeight(50);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        Layout_riwayatBarang.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 400));

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

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        kolomPassword.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 330, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        kolomPassword.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 30));

        passwordProfile.add(kolomPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 280));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layout_dataKasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_tambahPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_dataKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 125, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 121, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 111, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 97, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_tambahPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_dataKasir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_tambahPekerja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatTransaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bg.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 730, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dataKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMouseEntered
        setColor(btn_dataKaryawan);
    }//GEN-LAST:event_btn_dataKaryawanMouseEntered

    private void btn_dataKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMouseExited
        if(!"btn_dataKaryawan".equals(layoutActive)){
            resetColor(btn_dataKaryawan);
        }
    }//GEN-LAST:event_btn_dataKaryawanMouseExited

    private void btn_dataKaryawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMousePressed
        setColor(btn_dataKaryawan);
        resetColor(btn_dataKasir);
        resetColor(btn_riwayatTransaksi);
        resetColor(btn_riwayatBarang);
        resetColor(btn_tambahPekerja);
        resetColor(btn_profile);
        switchPanels(Layout_dataKaryawan);
        layoutActive="btn_dataKaryawan";

        txt_Tittle.setText("Data Karyawan");
        setTableData("Karyawan",karyawanTable);
    }//GEN-LAST:event_btn_dataKaryawanMousePressed

    private void btn_riwayatBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatBarangMouseEntered
        setColor(btn_riwayatBarang);
    }//GEN-LAST:event_btn_riwayatBarangMouseEntered

    private void btn_riwayatBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatBarangMouseExited
        if(!"btn_riwayatBarang".equals(layoutActive)){
            resetColor(btn_riwayatBarang);
        }
    }//GEN-LAST:event_btn_riwayatBarangMouseExited

    private void btn_riwayatBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatBarangMousePressed
        setColor(btn_riwayatBarang);
        resetColor(btn_dataKasir);
        resetColor(btn_riwayatTransaksi);
        resetColor(btn_dataKaryawan);
        resetColor(btn_tambahPekerja);
        resetColor(btn_profile);
        switchPanels(Layout_riwayatBarang);
        layoutActive="btn_riwayatBarang";

        txt_Tittle.setText("Riwayat Pemasukan Barang");
    }//GEN-LAST:event_btn_riwayatBarangMousePressed

    private void btn_tambahPekerjaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPekerjaMouseEntered
        setColor(btn_tambahPekerja);
    }//GEN-LAST:event_btn_tambahPekerjaMouseEntered

    private void btn_tambahPekerjaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPekerjaMouseExited
        if(!"btn_tambahPekerja".equals(layoutActive)){
            resetColor(btn_tambahPekerja);
        }
    }//GEN-LAST:event_btn_tambahPekerjaMouseExited

    private void btn_tambahPekerjaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPekerjaMousePressed
        setColor(btn_tambahPekerja);
        resetColor(btn_dataKasir);
        resetColor(btn_riwayatTransaksi);
        resetColor(btn_riwayatBarang);
        resetColor(btn_dataKaryawan);
        resetColor(btn_profile);
        switchPanels(Layout_tambahPekerja);
        layoutActive="btn_tambahPekerja";

        txt_Tittle.setText("Pekerja");
    }//GEN-LAST:event_btn_tambahPekerjaMousePressed

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        setColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        resetColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutMousePressed

    private void btn_dataKasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMouseEntered
        setColor(btn_dataKasir);
    }//GEN-LAST:event_btn_dataKasirMouseEntered

    private void btn_dataKasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMouseExited
        if(!"btn_dataKasir".equals(layoutActive)){
            resetColor(btn_dataKasir);
        }
    }//GEN-LAST:event_btn_dataKasirMouseExited

    private void btn_dataKasirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMousePressed
        setColor(btn_dataKasir);
        resetColor(btn_tambahPekerja);
        resetColor(btn_riwayatTransaksi);
        resetColor(btn_riwayatBarang);
        resetColor(btn_dataKaryawan);
        resetColor(btn_profile);
        switchPanels(Layout_dataKasir);
        layoutActive="btn_dataKasir";

        txt_Tittle.setText("Data Kasir");
        
        setTableData("Kasir",kasirTable);
    }//GEN-LAST:event_btn_dataKasirMousePressed

    private void btn_riwayatTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatTransaksiMouseEntered
        setColor(btn_riwayatTransaksi);
    }//GEN-LAST:event_btn_riwayatTransaksiMouseEntered

    private void btn_riwayatTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatTransaksiMouseExited
        if(!"btn_riwayatTransaksi".equals(layoutActive)){
            resetColor(btn_riwayatTransaksi);
        }
    }//GEN-LAST:event_btn_riwayatTransaksiMouseExited

    private void btn_riwayatTransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatTransaksiMousePressed
        setColor(btn_riwayatTransaksi);
        resetColor(btn_dataKasir);
        resetColor(btn_tambahPekerja);
        resetColor(btn_riwayatBarang);
        resetColor(btn_dataKaryawan);
        resetColor(btn_profile);
        switchPanels(Layout_riwayatTransaksi);
        layoutActive="btn_riwayatTransaksi";

        txt_Tittle.setText("Riwayat Transaksi");
    }//GEN-LAST:event_btn_riwayatTransaksiMousePressed

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        user admin = new user(id_user);
        nama.setText(admin.nama);
        no_telp.setText(admin.no_telp);
        email.setText(admin.email);
        jabatan.setText(admin.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

    private void gantiPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gantiPasswordMouseClicked
        switchPanels(passwordProfile);
    }//GEN-LAST:event_gantiPasswordMouseClicked

    private void btn_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseEntered
        setColor(btn_profile);
    }//GEN-LAST:event_btn_profileMouseEntered

    private void btn_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseExited
        if(!"btn_profile".equals(layoutActive)){
            resetColor(btn_profile);
        }
    }//GEN-LAST:event_btn_profileMouseExited

    private void btn_profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMousePressed
        setColor(btn_profile);
        resetColor(btn_dataKasir);
        resetColor(btn_tambahPekerja);
        resetColor(btn_riwayatBarang);
        resetColor(btn_dataKaryawan);
        resetColor(btn_riwayatTransaksi);
        switchPanels(lihatProfile);
        layoutActive="btn_profile";

        txt_Tittle.setText("Profile");

        user admin = new user(id_user);
        textNama.setText(admin.nama);
        textNoTelp.setText(admin.no_telp);
        textEmail.setText(admin.email);
        textJabatan.setText(admin.jabatan);
    }//GEN-LAST:event_btn_profileMousePressed

    private void passwordCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordCancelMouseClicked
        switchPanels(lihatProfile);
        user admin = new user(id_user);
        textNama.setText(admin.nama);
        textNoTelp.setText(admin.no_telp);
        textEmail.setText(admin.email);
        textJabatan.setText(admin.jabatan);
    }//GEN-LAST:event_passwordCancelMouseClicked

    private void passwordSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSaveMouseClicked
        
    }//GEN-LAST:event_passwordSaveMouseClicked

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        user admin = new user(id_user);
        textNama.setText(admin.nama);
        textNoTelp.setText(admin.no_telp);
        textEmail.setText(admin.email);
        textJabatan.setText(admin.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       
        try{
            sql="INSERT INTO user (nama,no_telp,email,jabatan,foto,tgl_masuk,username,password) Values('"+nama1.getText()+"','"+no_telp1.getText()+"','"+email1.getText()+"','"+jabatan1.getSelectedItem()+"',NULL,CURDATE(),'"+username1.getText()+"','"+password1.getText()+"')";
            stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Berhasil menambah data");
            kosongkan_form();
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_addMouseClicked

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void saveEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditProfileMouseClicked
        try{
            sql="UPDATE user SET nama='"+nama.getText()+"',no_telp='"+no_telp.getText()+"',email='"+email.getText()+"',foto=NULL WHERE id_user='"+id_user+"'";
            stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

    private void dataKasirHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKasirHapusActionPerformed
        int baris = kasirTable.getSelectedRow();
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus data ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        System.out.print(kasirTable.getValueAt(baris, 0));
        if(x==0){
            try{
                sql="DELETE FROM user WHERE id_user='"+kasirTable.getValueAt(baris, 0)+"'";
                stat.execute(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                setTableData("Kasir",kasirTable);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_dataKasirHapusActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    
    public class user{
        String nama,no_telp,email,jabatan;
        public user(int id){
            try{
                sql="Select nama,no_telp,email,jabatan From user Where id_user='"+id+"'";
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
    
    private void kosongkan_form(){
        nama1.setText("");
        no_telp1.setText("");
        email1.setText("");
        jabatan1.setSelectedItem("-- Pilih jabatan --");
        username1.setText("");
        password1.setText("");
        lbl_img.setText("");
    }
    private void setTableData(String jabatan, JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT id_user,nama,tgl_masuk FROM user WHERE jabatan='"+jabatan+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
//            System.out.println(rows);
            String[][] data=new String[rows][3];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);
                rowIndex++;
            }
            String[] cols={"ID","Nama Kasir","Tanggal Masuk"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Identitas;
    private javax.swing.JPanel Layout_dataKaryawan;
    private javax.swing.JPanel Layout_dataKasir;
    private javax.swing.JPanel Layout_riwayatBarang;
    private javax.swing.JPanel Layout_riwayatTransaksi;
    private javax.swing.JPanel Layout_tambahPekerja;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JButton add;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JButton btnImage;
    private javax.swing.JPanel btn_dataKaryawan;
    private javax.swing.JPanel btn_dataKasir;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JPanel btn_riwayatBarang;
    private javax.swing.JPanel btn_riwayatTransaksi;
    private javax.swing.JPanel btn_tambahPekerja;
    private javax.swing.JButton dataKasirHapus;
    private javax.swing.JButton dataKasirTampilkan;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JButton gantiPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jabatan;
    private javax.swing.JComboBox jabatan1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JTable kasirTable;
    private javax.swing.JPanel kolomPassword;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JPanel lihatProfile;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama1;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTextField no_telp1;
    private javax.swing.JTextField password1;
    private javax.swing.JButton passwordCancel;
    private javax.swing.JPanel passwordProfile;
    private javax.swing.JButton passwordSave;
    private javax.swing.JButton saveEditProfile;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JLabel txt_Tittle;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables

}
