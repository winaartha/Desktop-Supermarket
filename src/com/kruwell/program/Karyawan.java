package com.kruwell.program;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Karyawan extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
        
    public static int id_user;
    String layoutActive, buttonActive;
    public int baris, kolom;
    
    public Karyawan(int id){
        id_user=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        initComponents();
                     
        setColor(btn_inputBarang);
        switchPanels(Layout_Tabel);
        layeredPane.add(Layout_button);
        layoutActive="btn_inputBarang";
        buttonActive="btn_tabel";
        txt_Tittle.setText("Input Barang");
    }
    
    public Karyawan() {
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
        btn_inputBarang = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_listBarang = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_button = new javax.swing.JPanel();
        btn_tabel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_input = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Layout_Tabel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelInput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotalPembelian = new javax.swing.JLabel();
        Layout_ListBarang = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelListBarang = new javax.swing.JTable();
        Layout_Tambah = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        Layout_Input = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        inputKategori = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        inputNamaBarang = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
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
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        textNama = new javax.swing.JLabel();
        textNoTelp = new javax.swing.JLabel();
        textEmail = new javax.swing.JLabel();
        textJabatan = new javax.swing.JLabel();
        gantiPassword = new javax.swing.JButton();
        editData = new javax.swing.JButton();
        editProfile = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nama1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        no_telp1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jabatan1 = new javax.swing.JLabel();
        backEditProfile = new javax.swing.JButton();
        saveEditProfile = new javax.swing.JButton();
        browseEditProfile = new javax.swing.JButton();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(922, 534));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Side_panel.setBackground(new java.awt.Color(54, 33, 89));
        Side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inputBarang.setBackground(new java.awt.Color(64, 43, 100));
        btn_inputBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inputBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inputBarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_inputBarangMousePressed(evt);
            }
        });
        btn_inputBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_transaction_15px.png"))); // NOI18N
        btn_inputBarang.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Input Barang");
        btn_inputBarang.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_inputBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 40));

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

        Side_panel.add(btn_riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 40));

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Karyawan");
        Side_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        Side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 10));

        btn_listBarang.setBackground(new java.awt.Color(64, 43, 100));
        btn_listBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_listBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_listBarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_listBarangMousePressed(evt);
            }
        });
        btn_listBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kruwell/program/images/icons8_transaction_15px.png"))); // NOI18N
        btn_listBarang.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("List Barang");
        btn_listBarang.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_listBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 40));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

        Layout_button.setBackground(new java.awt.Color(255, 255, 255));
        Layout_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tabel.setBackground(new java.awt.Color(64, 43, 100));
        btn_tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tabelMousePressed(evt);
            }
        });
        btn_tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tabel Input");
        btn_tabel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 40));

        Layout_button.add(btn_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        btn_input.setBackground(new java.awt.Color(64, 43, 100));
        btn_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inputMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_inputMousePressed(evt);
            }
        });
        btn_input.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Input Barang");
        btn_input.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 40));

        Layout_button.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 40));

        btn_tambah.setBackground(new java.awt.Color(64, 43, 100));
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahMousePressed(evt);
            }
        });
        btn_tambah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Tambah List");
        btn_tambah.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 40));

        Layout_button.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 110, 40));

        Layout_Tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Proses");
        Layout_Tabel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        tabelInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "QTerima", "Harga Satuan", "QBonus", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelInput.setGridColor(new java.awt.Color(240, 240, 240));
        tabelInput.setRowHeight(20);
        jScrollPane2.setViewportView(tabelInput);
        if (tabelInput.getColumnModel().getColumnCount() > 0) {
            tabelInput.getColumnModel().getColumn(0).setResizable(false);
            tabelInput.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelInput.getColumnModel().getColumn(1).setResizable(false);
            tabelInput.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelInput.getColumnModel().getColumn(2).setResizable(false);
            tabelInput.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabelInput.getColumnModel().getColumn(3).setResizable(false);
            tabelInput.getColumnModel().getColumn(4).setResizable(false);
            tabelInput.getColumnModel().getColumn(4).setPreferredWidth(70);
            tabelInput.getColumnModel().getColumn(5).setResizable(false);
        }

        Layout_Tabel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 190));

        jLabel1.setText("Total Pembelian :   Rp.");
        Layout_Tabel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 170, -1));
        Layout_Tabel.add(txtTotalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 120, 20));

        Layout_ListBarang.setBackground(new java.awt.Color(255, 255, 255));
        Layout_ListBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelListBarang.setModel(new javax.swing.table.DefaultTableModel(
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
                "Kode Barang", "Nama Barang", "Kategori", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelListBarang.setGridColor(new java.awt.Color(240, 240, 240));
        tabelListBarang.setRowHeight(50);
        tabelListBarang.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelListBarang);
        if (tabelListBarang.getColumnModel().getColumnCount() > 0) {
            tabelListBarang.getColumnModel().getColumn(0).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelListBarang.getColumnModel().getColumn(1).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabelListBarang.getColumnModel().getColumn(2).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelListBarang.getColumnModel().getColumn(3).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        Layout_ListBarang.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

        Layout_Tambah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Kategori  :");
        Layout_Tambah.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Satuan  :");
        Layout_Tambah.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, -1));

        jButton3.setText("Tambah");
        Layout_Tambah.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Kode  :");
        Layout_Tambah.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 70, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 230, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 230, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 230, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Nama Barang  :");
        Layout_Tambah.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, -1));

        Layout_Input.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Kategori  :");
        Layout_Input.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));

        inputKategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKategoriActionPerformed(evt);
            }
        });
        Layout_Input.add(inputKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 250, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Nama Barang  :");
        Layout_Input.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        inputNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputNamaBarang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Barang --" }));
        Layout_Input.add(inputNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 250, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("QTerima  :");
        Layout_Input.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Input.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 250, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Harga Satuan  :");
        Layout_Input.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Input.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 250, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("QBonus  :");
        Layout_Input.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 90, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Input.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 250, -1));

        jButton2.setText("Tambah");
        Layout_Input.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

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

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Nama  :");
        Identitas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("No. telp :");
        Identitas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Email   :");
        Identitas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Jabatan :");
        Identitas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nama  :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("No. telp :");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Email   :");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Jabatan :");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

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

        Layout_riwayat.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(240, 240, 240));
        jTable1.setRowHeight(50);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(140);
        }

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_Tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Layout_Input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_ListBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 426, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(Layout_Tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 47, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(63, Short.MAX_VALUE)
                    .addComponent(Layout_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(Layout_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_ListBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 37, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Tabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_ListBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Tambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btn_inputBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMouseEntered
        setColor(btn_inputBarang);
    }//GEN-LAST:event_btn_inputBarangMouseEntered

    private void btn_inputBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMouseExited
        if(!layoutActive.equals("btn_transaksi")){
            resetColor(btn_inputBarang);
        }
    }//GEN-LAST:event_btn_inputBarangMouseExited

    private void btn_inputBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMousePressed
        setColor(btn_inputBarang);
        resetColor(btn_riwayat);
        resetColor(btn_profile);
        resetColor(btn_listBarang);
        switchPanels(Layout_Tabel);
        layeredPane.add(Layout_button);
        layoutActive="btn_transaksi";
        txt_Tittle.setText("Input Barang");
    }//GEN-LAST:event_btn_inputBarangMousePressed

    private void btn_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseEntered
        setColor(btn_riwayat);
    }//GEN-LAST:event_btn_riwayatMouseEntered

    private void btn_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseExited
        if(!layoutActive.equals("btn_riwayat")){
            resetColor(btn_riwayat);
        }
    }//GEN-LAST:event_btn_riwayatMouseExited

    private void btn_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMousePressed
        setColor(btn_riwayat);
        resetColor(btn_inputBarang);
        resetColor(btn_profile);
        resetColor(btn_listBarang);
        switchPanels(Layout_riwayat);
        layoutActive="btn_riwayat";
        txt_Tittle.setText("Riwayat");
        
    }//GEN-LAST:event_btn_riwayatMousePressed

    private void btn_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseEntered
        setColor(btn_profile);
    }//GEN-LAST:event_btn_profileMouseEntered

    private void btn_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseExited
        if(!layoutActive.equals("btn_profile")){
            resetColor(btn_profile);
        }
    }//GEN-LAST:event_btn_profileMouseExited

    private void btn_profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMousePressed
        setColor(btn_profile);
        resetColor(btn_riwayat);
        resetColor(btn_inputBarang);
        switchPanels(lihatProfile);
        resetColor(btn_listBarang);
        layoutActive="btn_profile";
        txt_Tittle.setText("Profile");
        
        user karyawan = new user(id_user);
        textNama.setText(karyawan.nama);
        textNoTelp.setText(karyawan.no_telp);
        textEmail.setText(karyawan.email);
        textJabatan.setText(karyawan.jabatan);
    }//GEN-LAST:event_btn_profileMousePressed

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

    private void btn_listBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMouseEntered
        setColor(btn_listBarang);
    }//GEN-LAST:event_btn_listBarangMouseEntered

    private void btn_listBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMouseExited
        if(!layoutActive.equals("btn_listBarang")){
            resetColor(btn_listBarang);
        }    
    }//GEN-LAST:event_btn_listBarangMouseExited

    private void btn_listBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMousePressed
        setColor(btn_listBarang);
        resetColor(btn_inputBarang);
        resetColor(btn_riwayat);
        resetColor(btn_profile);
        switchPanels(Layout_ListBarang);
        setTableData(tabelListBarang);
        tabelListBarang.setAutoCreateRowSorter(true);
        
        layoutActive="btn_listBarang";
        txt_Tittle.setText("List Barang");
        
    }//GEN-LAST:event_btn_listBarangMousePressed

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        user karyawan = new user(id_user);
        textNama.setText(karyawan.nama);
        textNoTelp.setText(karyawan.no_telp);
        textEmail.setText(karyawan.email);
        textJabatan.setText(karyawan.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void saveEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditProfileMouseClicked
        try{
            sql="UPDATE user SET nama='"+nama1.getText()+"',no_telp='"+no_telp1.getText()+"',email='"+email1.getText()+"',foto=NULL WHERE id_user='"+id_user+"'";
            stat.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

    private void gantiPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gantiPasswordMouseClicked
        switchPanels(passwordProfile);
    }//GEN-LAST:event_gantiPasswordMouseClicked

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        user karyawan = new user(id_user);
        nama1.setText(karyawan.nama);
        no_telp1.setText(karyawan.no_telp);
        email1.setText(karyawan.email);
        jabatan1.setText(karyawan.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

    private void passwordSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSaveMouseClicked
        try{
            sql="SELECT password FROM user WHERE id_user='"+id_user+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            if(passwordLama.getText().equals(rs.getString(1))){
                sql="UPDATE user SET password='"+passwordBaru.getText()+"'WHERE id_user='"+id_user+"'";
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
        user kasir = new user(id_user);
        textNama.setText(kasir.nama);
        textNoTelp.setText(kasir.no_telp);
        textEmail.setText(kasir.email);
        textJabatan.setText(kasir.jabatan);
    }//GEN-LAST:event_passwordCancelMouseClicked

    private void btn_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseEntered
        setColor(btn_tambah);
    }//GEN-LAST:event_btn_tambahMouseEntered

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        if(!buttonActive.equals("btn_tambah")){
            resetColor(btn_tambah);
        }
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMousePressed
        switchPanels(Layout_Tambah);
        layeredPane.add(Layout_button);
        resetColor(btn_input);
        resetColor(btn_tabel);
        buttonActive="btn_tambah";
    }//GEN-LAST:event_btn_tambahMousePressed

    private void btn_tabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelMouseEntered
        setColor(btn_tabel);
    }//GEN-LAST:event_btn_tabelMouseEntered

    private void btn_tabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelMouseExited
        if(!buttonActive.equals("btn_tabel")){
            resetColor(btn_tabel);
        }
    }//GEN-LAST:event_btn_tabelMouseExited

    private void btn_tabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelMousePressed
        switchPanels(Layout_Tabel);
        layeredPane.add(Layout_button);
        resetColor(btn_input);
        resetColor(btn_tambah);
        buttonActive="btn_tabel";
    }//GEN-LAST:event_btn_tabelMousePressed

    private void btn_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputMouseEntered
        setColor(btn_input);
    }//GEN-LAST:event_btn_inputMouseEntered

    private void btn_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputMouseExited
        if(!buttonActive.equals("btn_input")){
            resetColor(btn_input);
        }
    }//GEN-LAST:event_btn_inputMouseExited

    private void btn_inputMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputMousePressed
        switchPanels(Layout_Input);
        layeredPane.add(Layout_button);
        resetColor(btn_tambah);
        resetColor(btn_tabel);
        buttonActive="btn_input";
        
        inputKategori.removeAllItems();
        inputKategori.addItem("-- Pilih Kategori --");
        try{
            sql="SELECT DISTINCT kategori from barang order by kategori ASC";
            rs=stat.executeQuery(sql);
            
            if(rs.next()){
                inputKategori.addItem(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_inputMousePressed

    private void inputKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKategoriActionPerformed
        inputNamaBarang.removeAllItems();
        inputNamaBarang.addItem("-- Pilih Barang --");
        String kategori =String.valueOf(inputKategori.getSelectedItem());
        
        try{
            sql="SELECT nama_barang from barang WHERE kategori ='"+kategori+"'order by nama_barang ASC";
            rs=stat.executeQuery(sql);
            
            while(rs.next()){
                inputNamaBarang.addItem(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_inputKategoriActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
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

    private void setTableData(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT id_barang,nama_barang,kategori,stok FROM barang";
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
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getInt(4)+"";
                rowIndex++;
            }
            String[] cols={"Kode","Nama Barang","Kategori","Stok"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Identitas;
    private javax.swing.JPanel Layout_Input;
    private javax.swing.JPanel Layout_ListBarang;
    private javax.swing.JPanel Layout_Tabel;
    private javax.swing.JPanel Layout_Tambah;
    private javax.swing.JPanel Layout_button;
    private javax.swing.JPanel Layout_riwayat;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JPanel btn_input;
    private javax.swing.JPanel btn_inputBarang;
    private javax.swing.JPanel btn_listBarang;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_tabel;
    private javax.swing.JPanel btn_tambah;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email1;
    private javax.swing.JButton gantiPassword;
    private javax.swing.JComboBox inputKategori;
    private javax.swing.JComboBox inputNamaBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
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
    private javax.swing.JTable tabelInput;
    private javax.swing.JTable tabelListBarang;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JLabel txtTotalPembelian;
    private javax.swing.JLabel txt_Tittle;
    // End of variables declaration//GEN-END:variables
}
