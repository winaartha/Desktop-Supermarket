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

public class Karyawan extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
        
    public static int idAkun;
    String layoutActive, buttonActive;
    public int baris, kolom;
    
    public Karyawan(int id){
        idAkun=id;
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
        addListener();
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
        Layout_Tabel = new javax.swing.JPanel();
        btn_tambahInputBarang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelInput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_totalPembelian = new javax.swing.JLabel();
        Layout_ListBarang = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelListBarang = new javax.swing.JTable();
        btn_hapusList = new javax.swing.JButton();
        btn_tampilkanList = new javax.swing.JButton();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_riwayatPembelian = new javax.swing.JTable();
        Layout_Tambah = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_tambahBarang = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        input_namaBarang = new javax.swing.JTextField();
        input_kode = new javax.swing.JTextField();
        input_satuan = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        input_kategori = new javax.swing.JComboBox();
        btn_tambahKategori = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        input_hargaJual = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        input_diskon = new javax.swing.JTextField();
        Layout_button = new javax.swing.JPanel();
        btn_tabel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
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

        Layout_Tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambahInputBarang.setText("Proses");
        btn_tambahInputBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahInputBarangActionPerformed(evt);
            }
        });
        Layout_Tabel.add(btn_tambahInputBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        tabelInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        Layout_Tabel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 220));

        jLabel1.setText("Total Pembelian :   Rp.");
        Layout_Tabel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, -1));
        Layout_Tabel.add(txt_totalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 120, 20));

        Layout_ListBarang.setBackground(new java.awt.Color(255, 255, 255));
        Layout_ListBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelListBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Harga Jual", "Diskon", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelListBarang.setGridColor(new java.awt.Color(240, 240, 240));
        tabelListBarang.setRowHeight(30);
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
            tabelListBarang.getColumnModel().getColumn(4).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(5).setResizable(false);
        }

        Layout_ListBarang.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 340));

        btn_hapusList.setText("Hapus");
        btn_hapusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusListActionPerformed(evt);
            }
        });
        Layout_ListBarang.add(btn_hapusList, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 90, -1));

        btn_tampilkanList.setText("Tampilkan");
        Layout_ListBarang.add(btn_tampilkanList, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 110, -1));

        Layout_riwayat.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_riwayatPembelian.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID Restok", "DATE", "Total Pembelian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_riwayatPembelian.setGridColor(new java.awt.Color(240, 240, 240));
        tabel_riwayatPembelian.setRowHeight(50);
        tabel_riwayatPembelian.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabel_riwayatPembelian);
        if (tabel_riwayatPembelian.getColumnModel().getColumnCount() > 0) {
            tabel_riwayatPembelian.getColumnModel().getColumn(0).setResizable(false);
            tabel_riwayatPembelian.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabel_riwayatPembelian.getColumnModel().getColumn(1).setResizable(false);
            tabel_riwayatPembelian.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabel_riwayatPembelian.getColumnModel().getColumn(2).setResizable(false);
        }

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

        Layout_Tambah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Kategori  :");
        Layout_Tambah.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Satuan  :");
        Layout_Tambah.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, -1));

        btn_tambahBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_tambahBarang.setText("Tambah");
        btn_tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahBarangActionPerformed(evt);
            }
        });
        Layout_Tambah.add(btn_tambahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Kode   :");
        Layout_Tambah.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 70, -1));

        input_namaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, -1));

        input_kode.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 230, -1));

        input_satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 230, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Nama Barang  :");
        Layout_Tambah.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, -1));

        input_kategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 230, 30));

        btn_tambahKategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_tambahKategori.setText("+");
        btn_tambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahKategoriActionPerformed(evt);
            }
        });
        Layout_Tambah.add(btn_tambahKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 50, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Harga Jual  :");
        Layout_Tambah.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 110, -1));

        input_hargaJual.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 230, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Diskon   :");
        Layout_Tambah.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 80, -1));

        input_diskon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_Tambah.add(input_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 230, -1));

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

        Layout_button.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 40));

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
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(Layout_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_ListBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 37, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_Tabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_ListBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Tambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        
        setTableRiwayat(tabel_riwayatPembelian);
        
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
        
        user karyawan = new user(idAkun);
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
        user karyawan = new user(idAkun);
        textNama.setText(karyawan.nama);
        textNoTelp.setText(karyawan.no_telp);
        textEmail.setText(karyawan.email);
        textJabatan.setText(karyawan.jabatan);
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

    private void gantiPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gantiPasswordMouseClicked
        switchPanels(passwordProfile);
    }//GEN-LAST:event_gantiPasswordMouseClicked

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        user karyawan = new user(idAkun);
        nama1.setText(karyawan.nama);
        no_telp1.setText(karyawan.no_telp);
        email1.setText(karyawan.email);
        jabatan1.setText(karyawan.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

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
        resetColor(btn_tabel);
        buttonActive="btn_tambah";
        
        input_kategori.removeAllItems();
        input_kategori.addItem("-- Pilih Kategori --");
        try{
            sql="SELECT namaKategori FROM kategori";
            rs=stat.executeQuery(sql);
            while(rs.next()){
                input_kategori.addItem(rs.getString(1));
            }
        }catch(Exception x){
            System.out.println(x);
        }
            
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
        resetColor(btn_tambah);
        buttonActive="btn_tabel";
    }//GEN-LAST:event_btn_tabelMousePressed

    private void btn_tambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahKategoriActionPerformed
        String s=JOptionPane.showInputDialog(null,"Masukkan nama kategori");
        if(s!=null && !s.equalsIgnoreCase("")){
            try{
                sql="INSERT into kategori (namaKategori) values ('"+s+"')";
                stat.executeUpdate(sql);
            }catch(Exception x){
                System.out.println(x);
            }
            input_kategori.removeAllItems();
            input_kategori.addItem("-- Pilih Kategori --");
            try{
                sql="SELECT namaKategori FROM kategori";
                rs=stat.executeQuery(sql);
                while(rs.next()){
                    input_kategori.addItem(rs.getString(1));
                }
            }catch(Exception x){
                System.out.println(x);
            }
        }
    }//GEN-LAST:event_btn_tambahKategoriActionPerformed

    private void btn_tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahBarangActionPerformed
        int idKategori;
        try{
            sql="SELECT idKategori FROM kategori WHERE namaKategori='"+input_kategori.getSelectedItem()+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            idKategori=Integer.parseInt(rs.getString(1));
            
            sql="INSERT INTO barang Values('"+input_kode.getText()+"','"+input_namaBarang.getText()+"','"+idKategori+"',0,'"+input_satuan.getText()+"','"+input_hargaJual.getText()+"','"+input_diskon.getText()+"')";
            stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Berhasil menambah data");
            
            kosongkan_form();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input\n"+e);
        }
    }//GEN-LAST:event_btn_tambahBarangActionPerformed

    private void btn_hapusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusListActionPerformed
        int baris = tabelListBarang.getSelectedRow();
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus barang ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

        //        System.out.print(kasirTable.getValueAt(baris, 0));
        if(x==0){
            try{
                sql="DELETE FROM barang WHERE idBarang='"+tabelListBarang.getValueAt(baris, 0)+"'";
                stat.execute(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                setTableData(tabelListBarang);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_hapusListActionPerformed

    private void btn_tambahInputBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahInputBarangActionPerformed
        int idRestok;
        try{
            sql="INSERT INTO restok values (NULL,'"+idAkun+"',CURDATE(),'"+txt_totalPembelian.getText()+"')";
            stat.executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            sql="SELECT idRestok FROM restok ORDER BY tanggal DESC LIMIT 1";
            rs=stat.executeQuery(sql);
            rs.next();
            idRestok=Integer.parseInt(rs.getString(1));
            
            for(int i=0;tabelInput.getValueAt(i, 0)!=null;i++){
                sql="INSERT INTO restok_detail values (NULL,'"+idRestok+"','"+tabelInput.getValueAt(i, 0)+"','" + tabelInput.getValueAt(i, 2) + "','"+tabelInput.getValueAt(i, 4)+"','"+tabelInput.getValueAt(i, 3)+"')";
                stat.executeUpdate(sql);
                
                int tambahStok=Integer.parseInt(tabelInput.getValueAt(i, 2).toString())+Integer.parseInt(tabelInput.getValueAt(i, 4).toString());
                sql="UPDATE barang SET stok=stok+'"+tambahStok+"'WHERE idBarang='"+tabelInput.getValueAt(i, 0)+"'";
                stat.execute(sql);
            }
            
            JOptionPane.showMessageDialog(null, "Input Barang Berhasil");
            DefaultTableModel dtm = (DefaultTableModel) tabelInput.getModel();
            dtm.setRowCount(0);
            dtm.setRowCount(8);
            txt_totalPembelian.setText("");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btn_tambahInputBarangActionPerformed

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
    
    private void kosongkan_form(){
        input_kode.setText("");
        input_kategori.setSelectedItem("-- Pilih jabatan --");
        input_namaBarang.setText("");
        input_satuan.setText("");
        input_hargaJual.setText("");
        input_diskon.setText("");
    }

    private void setTableData(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idBarang,namaBarang,kategori.namaKategori,hargaJual,diskon,stok FROM barang LEFT JOIN kategori USING (idKategori)";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
//            System.out.println(rows);
            String[][] data=new String[rows][6];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getInt(4)+"";
                data[rowIndex][4]=rs.getInt(5)+"";
                data[rowIndex][5]=rs.getInt(6)+"";
                rowIndex++;
            }
            String[] cols={"Kode","Nama Barang","Kategori","Harga Jual","Diskon","Stok"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTableRiwayat(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idRestok,tanggal,totalPembelian FROM restok WHERE idKaryawan='"+idAkun+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][3];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getInt(3)+"";
                rowIndex++;
            }
            String[] cols={"ID Restok","DATE","Total Pembelian"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    
    public void addListener(){
        tabelInput.getModel().addTableModelListener(new TableModelListener() {
            
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    final int row = e.getFirstRow();
                    final int column = e.getColumn();
                    switch(column){
                        case 0:
                            int id_barang=(int) tabelInput.getValueAt(row, column);
                            try{
                                sql="SELECT namaBarang FROM barang WHERE idBarang='"+id_barang+"'";
                                rs=stat.executeQuery(sql);
                                rs.next();
                                tabelInput.setValueAt(rs.getString(1), row, 1);
                            }catch(Exception x){
                                System.out.print(x);
                            }
                            break;
                        case 2:
                        case 3:
                            if(tabelInput.getValueAt(row, 2)!=null && tabelInput.getValueAt(row, 3)!=null)
                                try{
                                    int totalHarga=Integer.parseInt(tabelInput.getValueAt(row, 2).toString()) * Integer.parseInt(tabelInput.getValueAt(row, 3).toString());
                                    tabelInput.setValueAt(totalHarga, row, 5);
                                    int totalPembelian=0;
                                    for(int i=0;tabelInput.getValueAt(i, 5)!=null;i++){
                                        totalPembelian+=Integer.parseInt(tabelInput.getValueAt(i,5).toString());
                                    }
                                    txt_totalPembelian.setText(String.valueOf(totalPembelian));
                                }catch(Exception x){
                                    System.out.print(x);
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
    private javax.swing.JButton btn_hapusList;
    private javax.swing.JPanel btn_inputBarang;
    private javax.swing.JPanel btn_listBarang;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_tabel;
    private javax.swing.JPanel btn_tambah;
    private javax.swing.JButton btn_tambahBarang;
    private javax.swing.JButton btn_tambahInputBarang;
    private javax.swing.JButton btn_tambahKategori;
    private javax.swing.JButton btn_tampilkanList;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email1;
    private javax.swing.JButton gantiPassword;
    private javax.swing.JTextField input_diskon;
    private javax.swing.JTextField input_hargaJual;
    private javax.swing.JComboBox input_kategori;
    private javax.swing.JTextField input_kode;
    private javax.swing.JTextField input_namaBarang;
    private javax.swing.JTextField input_satuan;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JTable tabel_riwayatPembelian;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JLabel txt_Tittle;
    private javax.swing.JLabel txt_totalPembelian;
    // End of variables declaration//GEN-END:variables
}
