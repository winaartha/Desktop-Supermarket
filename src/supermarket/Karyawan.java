package supermarket;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
  
    private void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }  
    void resetColor(JPanel panel){
         panel.setBackground(new Color(64,43,100));
    }
    
    private void switchPanels(JPanel panel){
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    
    private void resetLayoutInactive(JPanel panel){
        if(!"btn_inputBarang".equals(layoutActive))resetColor(btn_inputBarang);
        if(!"btn_listBarang".equals(layoutActive))resetColor(btn_listBarang);
        if(!"btn_riwayat".equals(layoutActive))resetColor(btn_riwayat);
        if(!"btn_diskonPoin".equals(layoutActive))resetColor(btn_diskonPoin);
        if(!"btn_logKaryawan".equals(layoutActive))resetColor(btn_logKaryawan);
        if(!"btn_dataKaryawan".equals(layoutActive))resetColor(btn_dataKaryawan);
        if(!"btn_profile".equals(layoutActive))resetColor(btn_profile);
        setColor(panel);
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
        btn_dataKaryawan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_diskonPoin = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_logKaryawan = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_logKaryawan = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_log = new javax.swing.JTable();
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
        Layout_tambahDiskon = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txt_hargaJual = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_namaBarang = new javax.swing.JLabel();
        tf_hargaPoinBarang = new javax.swing.JTextField();
        tf_kodeBarang = new javax.swing.JTextField();
        tf_diskonBarang = new javax.swing.JTextField();
        saveEditDiskon = new javax.swing.JButton();
        Layout_ListBarang = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelListBarang = new javax.swing.JTable();
        btn_hapusList = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_editList = new javax.swing.JButton();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_riwayatPembelian = new javax.swing.JTable();
        btn_rincian = new javax.swing.JButton();
        Layout_Tabel = new javax.swing.JPanel();
        btn_tambahInputBarang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelInput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_totalPembelian = new javax.swing.JLabel();
        addRow = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        removeRow = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Layout_EditBarang = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btn_editBarang = new javax.swing.JButton();
        edit_namaBarang = new javax.swing.JTextField();
        edit_satuan = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        edit_kategori = new javax.swing.JComboBox();
        btn_tambahKategori1 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        edit_hargaJual = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        edit_diskon = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        edit_stok = new javax.swing.JTextField();
        edit_kode = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
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
        Layout_rincian = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JLabel();
        txt_tanggal = new javax.swing.JLabel();
        txt_namaKaryawan = new javax.swing.JLabel();
        txt_idKaryawan = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelRincianInput = new javax.swing.JTable();
        Layout_listDiskon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelListDiskon = new javax.swing.JTable();
        passwordProfile = new javax.swing.JPanel();
        passwordSave = new javax.swing.JButton();
        passwordCancel = new javax.swing.JButton();
        kolomPassword = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        passwordLama = new javax.swing.JPasswordField();
        passwordBaru = new javax.swing.JPasswordField();
        Layout_button = new javax.swing.JPanel();
        btn_tabel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Layout_button2 = new javax.swing.JPanel();
        btn_listDiskon = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btn_tambahDiskon = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
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
        Layout_dataKaryawan = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();
        exit = new javax.swing.JLabel();

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/product_management_15px.png"))); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_clock_15px.png"))); // NOI18N
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_admin_settings_male_15px.png"))); // NOI18N
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_logout_rounded_left_15px.png"))); // NOI18N
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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/list_15px.png"))); // NOI18N
        btn_listBarang.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("List Barang");
        btn_listBarang.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_listBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 40));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/staff_15px.png"))); // NOI18N
        btn_dataKaryawan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Data Karyawan");
        btn_dataKaryawan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 40));

        btn_diskonPoin.setBackground(new java.awt.Color(64, 43, 100));
        btn_diskonPoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_diskonPoinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_diskonPoinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_diskonPoinMousePressed(evt);
            }
        });
        btn_diskonPoin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/coins_15px.png"))); // NOI18N
        btn_diskonPoin.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setText("Diskon & Poin");
        btn_diskonPoin.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_diskonPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 40));

        btn_logKaryawan.setBackground(new java.awt.Color(64, 43, 100));
        btn_logKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logKaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logKaryawanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logKaryawanMousePressed(evt);
            }
        });
        btn_logKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/document_15px.png"))); // NOI18N
        btn_logKaryawan.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setText("Log Karyawan");
        btn_logKaryawan.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_logKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 40));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

        Layout_logKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_logKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_log.setModel(new javax.swing.table.DefaultTableModel(
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
                "DATE", "Aktivitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
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
        tabel_log.setGridColor(new java.awt.Color(240, 240, 240));
        tabel_log.setRowHeight(50);
        tabel_log.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabel_log);

        Layout_logKaryawan.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 140, true));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nama1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 310, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nama  :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("No. telp :");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        no_telp1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 310, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Email   :");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 310, 30));

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

        Layout_tambahDiskon.setBackground(new java.awt.Color(255, 255, 255));
        Layout_tambahDiskon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 150, true));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_hargaJual.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel6.add(txt_hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 360, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel40.setText("Harga Jual   :");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Harga Poin  :");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 110, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("Nama Barang  :");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setText("Kode Barang   :");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setText("Diskon  :");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 80, 30));

        txt_namaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel6.add(txt_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 360, 30));

        tf_hargaPoinBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_hargaPoinBarang.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel6.add(tf_hargaPoinBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 30));

        tf_kodeBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_kodeBarang.setMargin(new java.awt.Insets(2, 8, 2, 2));
        tf_kodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_kodeBarangKeyReleased(evt);
            }
        });
        jPanel6.add(tf_kodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 250, 30));

        tf_diskonBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_diskonBarang.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel6.add(tf_diskonBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 250, 30));

        Layout_tambahDiskon.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 610, 270));

        saveEditDiskon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        saveEditDiskon.setText("Simpan");
        saveEditDiskon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEditDiskonMouseClicked(evt);
            }
        });
        Layout_tambahDiskon.add(saveEditDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

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
            tabelListBarang.getColumnModel().getColumn(2).setHeaderValue("Kategori");
            tabelListBarang.getColumnModel().getColumn(3).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(3).setPreferredWidth(20);
            tabelListBarang.getColumnModel().getColumn(4).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(4).setPreferredWidth(20);
            tabelListBarang.getColumnModel().getColumn(5).setResizable(false);
            tabelListBarang.getColumnModel().getColumn(5).setHeaderValue("Stok");
        }

        Layout_ListBarang.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 690, 300));

        btn_hapusList.setText("Hapus");
        btn_hapusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusListActionPerformed(evt);
            }
        });
        Layout_ListBarang.add(btn_hapusList, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 80, -1));

        tf_search.setToolTipText("");
        tf_search.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        Layout_ListBarang.add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 30));
        tf_search.getAccessibleContext().setAccessibleName("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/search_20px.png"))); // NOI18N
        Layout_ListBarang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));

        btn_editList.setText("Edit");
        btn_editList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editListActionPerformed(evt);
            }
        });
        Layout_ListBarang.add(btn_editList, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 80, -1));

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

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 330));

        btn_rincian.setText("Rincian");
        btn_rincian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rincianActionPerformed(evt);
            }
        });
        Layout_riwayat.add(btn_rincian, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        Layout_Tabel.setBackground(new java.awt.Color(255, 255, 255));
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

        Layout_Tabel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Total Pembelian :   Rp.");
        Layout_Tabel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 30));

        txt_totalPembelian.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Layout_Tabel.add(txt_totalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 110, 30));

        addRow.setBackground(new java.awt.Color(255, 255, 255));
        addRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        addRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRowMouseClicked(evt);
            }
        });
        addRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setForeground(new java.awt.Color(50, 50, 50));
        jLabel47.setText("+ add");
        addRow.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        Layout_Tabel.add(addRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 30));

        removeRow.setBackground(new java.awt.Color(255, 255, 255));
        removeRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        removeRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeRowMouseClicked(evt);
            }
        });
        removeRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setForeground(new java.awt.Color(50, 50, 50));
        jLabel52.setText("- remove");
        removeRow.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_Tabel.add(removeRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        Layout_EditBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setText("Kategori  :");
        Layout_EditBarang.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 90, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Satuan  :");
        Layout_EditBarang.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 90, -1));

        btn_editBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_editBarang.setText("Simpan");
        btn_editBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editBarangActionPerformed(evt);
            }
        });
        Layout_EditBarang.add(btn_editBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 90, -1));

        edit_namaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edit_namaBarang.setMargin(new java.awt.Insets(2, 8, 2, 2));
        Layout_EditBarang.add(edit_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, -1));

        edit_satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edit_satuan.setMargin(new java.awt.Insets(2, 8, 2, 2));
        Layout_EditBarang.add(edit_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 230, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Nama Barang  :");
        Layout_EditBarang.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, -1));

        edit_kategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_EditBarang.add(edit_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 230, 30));

        btn_tambahKategori1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_tambahKategori1.setText("+");
        btn_tambahKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahKategori1ActionPerformed(evt);
            }
        });
        Layout_EditBarang.add(btn_tambahKategori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 50, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Harga Jual  :");
        Layout_EditBarang.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, -1));

        edit_hargaJual.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edit_hargaJual.setMargin(new java.awt.Insets(2, 8, 2, 2));
        Layout_EditBarang.add(edit_hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("Diskon  :");
        Layout_EditBarang.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, -1));

        edit_diskon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edit_diskon.setMargin(new java.awt.Insets(2, 8, 2, 2));
        Layout_EditBarang.add(edit_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Stok  :");
        Layout_EditBarang.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 50, -1));

        edit_stok.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edit_stok.setMargin(new java.awt.Insets(2, 8, 2, 2));
        Layout_EditBarang.add(edit_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 230, -1));

        edit_kode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edit_kode.setText("'");
        Layout_EditBarang.add(edit_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 230, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("Kode   :");
        Layout_EditBarang.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, -1));

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

        Layout_rincian.setBackground(new java.awt.Color(255, 255, 255));
        Layout_rincian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel54.setText("Total Harga : Rp.");
        Layout_rincian.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 130, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel55.setText("Tanggal Input :");
        Layout_rincian.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel56.setText("ID Karyawan :");
        Layout_rincian.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 30));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel57.setText("Nama Karyawan :");
        Layout_rincian.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        txt_totalHarga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 120, 30));

        txt_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 30));

        txt_namaKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_namaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 250, 30));

        txt_idKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_idKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, 30));

        tabelRincianInput.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRincianInput.setGridColor(new java.awt.Color(240, 240, 240));
        tabelRincianInput.setRowHeight(20);
        jScrollPane7.setViewportView(tabelRincianInput);
        if (tabelRincianInput.getColumnModel().getColumnCount() > 0) {
            tabelRincianInput.getColumnModel().getColumn(0).setResizable(false);
            tabelRincianInput.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelRincianInput.getColumnModel().getColumn(1).setResizable(false);
            tabelRincianInput.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelRincianInput.getColumnModel().getColumn(2).setResizable(false);
            tabelRincianInput.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabelRincianInput.getColumnModel().getColumn(3).setResizable(false);
            tabelRincianInput.getColumnModel().getColumn(4).setResizable(false);
            tabelRincianInput.getColumnModel().getColumn(4).setPreferredWidth(70);
            tabelRincianInput.getColumnModel().getColumn(5).setResizable(false);
        }

        Layout_rincian.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, 260));

        Layout_listDiskon.setBackground(new java.awt.Color(255, 255, 255));
        Layout_listDiskon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelListDiskon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Jual", "Diskon", "Harga Poin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelListDiskon.setGridColor(new java.awt.Color(240, 240, 240));
        tabelListDiskon.setRowHeight(30);
        tabelListDiskon.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelListDiskon);
        if (tabelListDiskon.getColumnModel().getColumnCount() > 0) {
            tabelListDiskon.getColumnModel().getColumn(0).setResizable(false);
            tabelListDiskon.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelListDiskon.getColumnModel().getColumn(1).setResizable(false);
            tabelListDiskon.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabelListDiskon.getColumnModel().getColumn(2).setResizable(false);
            tabelListDiskon.getColumnModel().getColumn(2).setPreferredWidth(20);
            tabelListDiskon.getColumnModel().getColumn(3).setResizable(false);
            tabelListDiskon.getColumnModel().getColumn(3).setPreferredWidth(20);
            tabelListDiskon.getColumnModel().getColumn(4).setResizable(false);
            tabelListDiskon.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        Layout_listDiskon.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 310));

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
        kolomPassword.add(passwordLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 30));
        kolomPassword.add(passwordBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 330, 30));

        passwordProfile.add(kolomPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 280));

        Layout_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tabel.setBackground(new java.awt.Color(54, 43, 100));
        btn_tabel.setForeground(new java.awt.Color(250, 250, 250));
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
        btn_tabel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        Layout_button.add(btn_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 30));

        btn_tambah.setBackground(new java.awt.Color(64, 43, 100));
        btn_tambah.setForeground(new java.awt.Color(240, 240, 240));
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
        btn_tambah.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        Layout_button.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 30));

        Layout_button2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_listDiskon.setBackground(new java.awt.Color(64, 43, 100));
        btn_listDiskon.setForeground(new java.awt.Color(250, 250, 250));
        btn_listDiskon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_listDiskonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_listDiskonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_listDiskonMousePressed(evt);
            }
        });
        btn_listDiskon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("List Diskon & Poin");
        btn_listDiskon.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        Layout_button2.add(btn_listDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 30));

        btn_tambahDiskon.setBackground(new java.awt.Color(64, 43, 100));
        btn_tambahDiskon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahDiskonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahDiskonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahDiskonMousePressed(evt);
            }
        });
        btn_tambahDiskon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Edit Diskon & Poin");
        btn_tambahDiskon.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        Layout_button2.add(btn_tambahDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 30));

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

        Identitas.setBackground(new java.awt.Color(255, 255, 255));
        Identitas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 140, true));
        Identitas.setForeground(new java.awt.Color(255, 255, 255));
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

        Layout_dataKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_dataKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        karyawanTable.setGridColor(new java.awt.Color(240, 240, 240));
        karyawanTable.setRowHeight(50);
        karyawanTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(karyawanTable);

        Layout_dataKaryawan.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 380));

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
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 49, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Layout_tambahDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_EditBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincian, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 437, Short.MAX_VALUE))
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
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 437, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(Layout_tambahDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Layout_EditBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincian, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_logKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_tambahDiskon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_ListBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Tabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_EditBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_Tambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_rincian, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_listDiskon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bg.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 720, 410));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/close_window_25px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
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
        switchPanels(Layout_Tabel);
        layeredPane.add(Layout_button);
        layoutActive="btn_transaksi";
        resetLayoutInactive(btn_inputBarang);
        txt_Tittle.setText("Input Barang");
    }//GEN-LAST:event_btn_inputBarangMousePressed

    private void btn_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseEntered
        setColor(btn_riwayat);
    }//GEN-LAST:event_btn_riwayatMouseEntered

    private void btn_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseExited
        if(!"btn_riwayat".equals(layoutActive)){
            resetColor(btn_riwayat);
        }
    }//GEN-LAST:event_btn_riwayatMouseExited

    private void btn_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMousePressed
        switchPanels(Layout_riwayat);
        layoutActive="btn_riwayat";
        resetLayoutInactive(btn_riwayat);
        txt_Tittle.setText("Riwayat");
        tabel_riwayatPembelian.setAutoCreateRowSorter(true);
        
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
        layoutActive="btn_profile";
        resetLayoutInactive(btn_profile);
        txt_Tittle.setText("Profile");
        switchPanels(lihatProfile);
        
        akun_karyawan karyawan = new akun_karyawan(idAkun);
        textNama.setText(karyawan.nama);
        textNoTelp.setText(karyawan.noTelp);
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
        switchPanels(Layout_ListBarang);
        tabelListBarang.setAutoCreateRowSorter(true);
        layoutActive="btn_listBarang";
        resetLayoutInactive(btn_listBarang);
        txt_Tittle.setText("List Barang");
        setTableData(tabelListBarang);    
    }//GEN-LAST:event_btn_listBarangMousePressed

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        akun_karyawan karyawan = new akun_karyawan(idAkun);
        textNama.setText(karyawan.nama);
        textNoTelp.setText(karyawan.noTelp);
        textEmail.setText(karyawan.email);
        textJabatan.setText(karyawan.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void saveEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditProfileMouseClicked
        String error="";
        if(nama1.getText().equals(""))error+="Nama tidak boleh kosong\n";
        if(no_telp1.getText().equals(""))error+="No.Telp tidak boleh kosong\n";
        if(email1.getText().equals(""))error+="Email tidak boleh kosong\n";
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null, error);
        }else{
            try{
                sql="UPDATE akun SET nama='"+nama1.getText()+"',noTelp='"+no_telp1.getText()+"',email='"+email1.getText()+"',foto=NULL WHERE idAkun='"+idAkun+"'";
                stat.executeUpdate(sql);
                
                String aktivitas="Karyawan id "+idAkun+" mengupdate profile";
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
            }catch(Exception e){
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

    private void gantiPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gantiPasswordMouseClicked
        switchPanels(passwordProfile);
    }//GEN-LAST:event_gantiPasswordMouseClicked

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        akun_karyawan karyawan = new akun_karyawan(idAkun);
        nama1.setText(karyawan.nama);
        no_telp1.setText(karyawan.noTelp);
        email1.setText(karyawan.email);
        jabatan1.setText(karyawan.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

    private void passwordSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSaveMouseClicked
        try{
            String error="";
            if(passwordLama.getText().equals(""))error+="Password lama tidak boleh kosong\n";
            if(passwordBaru.getText().equals(""))error+="Password baru tidak boleh kosong";
            if(!error.equals("")){
                JOptionPane.showMessageDialog(null, error);
            }else{
                sql="SELECT * FROM akun WHERE idAkun='"+idAkun+"' AND password=MD5('"+passwordLama.getText()+"')";
                rs=stat.executeQuery(sql);
                if(rs.next()){
                    sql="UPDATE akun SET password=MD5('"+passwordBaru.getText()+"')WHERE idAkun='"+idAkun+"'";
                    stat.execute(sql);
                    JOptionPane.showMessageDialog(null, "Password berhasil diupdate");
                }else{
                    JOptionPane.showMessageDialog(null, "Password salah");
                }
                passwordLama.setText("");
                passwordBaru.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_passwordSaveMouseClicked

    private void passwordCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordCancelMouseClicked
        switchPanels(lihatProfile);
        akun_karyawan kasir = new akun_karyawan(idAkun);
        textNama.setText(kasir.nama);
        textNoTelp.setText(kasir.noTelp);
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
        tambah_kategori(input_kategori);
    }//GEN-LAST:event_btn_tambahKategoriActionPerformed

    private void btn_tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahBarangActionPerformed
        try{
            String error="";
            if(input_kode.getText().equals(""))error+="Kode tidak boleh kosong\n";
            if(input_kategori.getSelectedIndex()==0)error+="Kategori belum dipilih\n";
            if(input_namaBarang.getText().equals(""))error+="Nama Barang tidak boleh kosong\n";
            if(input_satuan.getText().equals(""))error+="Satuan tidak boleh kosong\n";
            if(input_hargaJual.getText().equals(""))error+="Harga Jual tidak boleh kosong\n";
            if(input_diskon.getText().equals(""))error+="Diskon tidak boleh kosong\n";
            if(!error.equals("")){
                JOptionPane.showMessageDialog(null, error);
            }else{
                int idKategori;
                sql="SELECT idKategori FROM kategori WHERE namaKategori='"+input_kategori.getSelectedItem()+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                idKategori=Integer.parseInt(rs.getString(1));

                sql="INSERT INTO barang Values('"+input_kode.getText()+"','"+input_namaBarang.getText()+"','"+idKategori+"',0,'"+input_satuan.getText()+"','"+input_hargaJual.getText()+"','"+input_diskon.getText()+"',0)";
                stat.executeUpdate(sql);
                
                String aktivitas="Karyawan id "+idAkun+" menambah barang baru dengan id "+input_kode.getText();
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil menambah data");

                kosongkan_form();
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_btn_tambahBarangActionPerformed

    private void btn_hapusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusListActionPerformed
        int baris = tabelListBarang.getSelectedRow();
        if(baris!=-1){
            String[] options = {"Ya","Tidak"};
            int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus barang ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

            if(x==0){
                try{
                    sql="DELETE FROM barang WHERE idBarang='"+tabelListBarang.getValueAt(baris, 0)+"'";
                    stat.execute(sql);
                    
                    String aktivitas="Karyawan id "+idAkun+" menghapus barang dengan id "+tabelListBarang.getValueAt(baris, 0);
                    sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                    stat.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    setTableData(tabelListBarang);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih Barang terlebih dahulu");
        }
    }//GEN-LAST:event_btn_hapusListActionPerformed

    private void btn_tambahInputBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahInputBarangActionPerformed
        if(txt_totalPembelian.getText()!="" && Integer.parseInt(txt_totalPembelian.getText().toString())!=0){
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

                String aktivitas="Karyawan id "+idAkun+" melakukan restok barang dengan id "+idRestok;
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                
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
        }else{
            JOptionPane.showMessageDialog(null, "Masukkan barang terlebih dahulu");
        }
    }//GEN-LAST:event_btn_tambahInputBarangActionPerformed

    private void btn_dataKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMouseEntered
        setColor(btn_dataKaryawan);
    }//GEN-LAST:event_btn_dataKaryawanMouseEntered

    private void btn_dataKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMouseExited
        if(!"btn_dataKaryawan".equals(layoutActive)){
            resetColor(btn_dataKaryawan);
        }
    }//GEN-LAST:event_btn_dataKaryawanMouseExited

    private void btn_dataKaryawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKaryawanMousePressed
        switchPanels(Layout_dataKaryawan);
        layoutActive="btn_dataKaryawan";
        resetLayoutInactive(btn_dataKaryawan);
        txt_Tittle.setText("Data Karyawan");
        
        setTableData3Col(karyawanTable);
    }//GEN-LAST:event_btn_dataKaryawanMousePressed

    private void btn_diskonPoinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diskonPoinMouseEntered
        setColor(btn_diskonPoin);
    }//GEN-LAST:event_btn_diskonPoinMouseEntered

    private void btn_diskonPoinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diskonPoinMouseExited
        if(!"btn_diskonPoin".equals(layoutActive)){
            resetColor(btn_diskonPoin);
        }
    }//GEN-LAST:event_btn_diskonPoinMouseExited

    private void btn_diskonPoinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diskonPoinMousePressed
        switchPanels(Layout_listDiskon);
        layeredPane.add(Layout_button2);
        layoutActive="btn_diskonPoin";
        resetLayoutInactive(btn_diskonPoin);
        txt_Tittle.setText("Diskon & Poin");
        
        setColor(btn_listDiskon);
        buttonActive="btn_listDiskon";
        setTableDataDiskon(tabelListDiskon);
    }//GEN-LAST:event_btn_diskonPoinMousePressed

    private void btn_logKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKaryawanMouseEntered
        setColor(btn_logKaryawan);
    }//GEN-LAST:event_btn_logKaryawanMouseEntered

    private void btn_logKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKaryawanMouseExited
        if(!"btn_logKaryawan".equals(layoutActive)){
            resetColor(btn_logKaryawan);
        }
    }//GEN-LAST:event_btn_logKaryawanMouseExited

    private void btn_logKaryawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKaryawanMousePressed
        switchPanels(Layout_logKaryawan);
        layoutActive="btn_logKaryawan";
        resetLayoutInactive(btn_logKaryawan);
        txt_Tittle.setText("Log Karyawan");
        setLog();
    }//GEN-LAST:event_btn_logKaryawanMousePressed

    private void btn_listDiskonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonMouseEntered
        setColor(btn_listDiskon);
    }//GEN-LAST:event_btn_listDiskonMouseEntered

    private void btn_listDiskonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonMouseExited
        if(!"btn_listDiskon".equals(buttonActive)){
            resetColor(btn_listDiskon);
        }
    }//GEN-LAST:event_btn_listDiskonMouseExited

    private void btn_listDiskonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonMousePressed
       setColor(btn_listDiskon);
       resetColor(btn_tambahDiskon);
       buttonActive="btn_listDiskon";
       switchPanels(Layout_listDiskon);
       layeredPane.add(Layout_button2);
       setTableDataDiskon(tabelListDiskon);
    }//GEN-LAST:event_btn_listDiskonMousePressed

    private void btn_tambahDiskonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahDiskonMouseEntered
        setColor(btn_tambahDiskon);
    }//GEN-LAST:event_btn_tambahDiskonMouseEntered

    private void btn_tambahDiskonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahDiskonMouseExited
        if(!"btn_tambahDiskon".equals(buttonActive)){
            resetColor(btn_tambahDiskon);
        }
    }//GEN-LAST:event_btn_tambahDiskonMouseExited

    private void btn_tambahDiskonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahDiskonMousePressed
        setColor(btn_tambahDiskon);
        resetColor(btn_listDiskon);
        buttonActive="btn_tambahDiskon";
        switchPanels(Layout_tambahDiskon);
        layeredPane.add(Layout_button2);
        
    }//GEN-LAST:event_btn_tambahDiskonMousePressed

    private void saveEditDiskonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditDiskonMouseClicked
        try{
            String error="";
            if(tf_kodeBarang.getText().equals(""))error+="Kode tidak boleh kosong\n";
            if(tf_diskonBarang.getText().equals(""))error+="Diskon tidak boleh kosong\n";
            if(tf_hargaPoinBarang.getText().equals(""))error+="Harga Poin tidak boleh kosong\n";
            if(!error.equals("")){
                JOptionPane.showMessageDialog(null, error);
            }else{
                sql="UPDATE barang SET diskon='"+tf_diskonBarang.getText()+"',poin='"+tf_hargaPoinBarang.getText()+"' WHERE idBarang='"+tf_kodeBarang.getText()+"'";
                stat.executeUpdate(sql);
                
                String aktivitas="Karyawan id "+idAkun+" mengubah diskon barang id "+tf_kodeBarang.getText()+" menjadi "+tf_diskonBarang.getText();
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil mengubah diskon & poin");
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_saveEditDiskonMouseClicked

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin keluar dari program ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        setTableData(tabelListBarang);
    }//GEN-LAST:event_tf_searchKeyReleased

    private void btn_editBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editBarangActionPerformed
        String error="";
        if(edit_kategori.getSelectedIndex()==0)error+="Kategori belum dipilih\n";
        if(edit_namaBarang.getText().equals(""))error+="Nama Barang tidak boleh kosong\n";
        if(edit_satuan.getText().equals(""))error+="Satuan tidak boleh kosong\n";
        if(edit_hargaJual.getText().equals(""))error+="Harga Jual tidak boleh kosong\n";
        if(edit_diskon.getText().equals(""))error+="Diskon tidak boleh kosong\n";
        if(edit_stok.getText().equals(""))error+="Stok tidak boleh kosong\n";
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null, error);
        }else{
            int idKategori;
            try{
                sql="SELECT idKategori FROM kategori WHERE namaKategori='"+edit_kategori.getSelectedItem()+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                idKategori=Integer.parseInt(rs.getString(1));

                sql="UPDATE barang SET namaBarang='"+edit_namaBarang.getText()+"',idKategori='"+idKategori+"',stok='"+edit_stok.getText()+"',satuan='"+edit_satuan.getText()+"',hargaJual='"+edit_hargaJual.getText()+"',diskon='"+edit_diskon.getText()+"' WHERE idBarang='"+edit_kode.getText()+"'";
                stat.executeUpdate(sql);

                String aktivitas="Karyawan id "+idAkun+" mengedit data barang id "+edit_kode.getText();
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Berhasil mengedit data");
                kosongkan_form();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Invalid Input\n"+e);
            }
        }
    }//GEN-LAST:event_btn_editBarangActionPerformed

    private void btn_tambahKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahKategori1ActionPerformed
        tambah_kategori(edit_kategori);
    }//GEN-LAST:event_btn_tambahKategori1ActionPerformed

    private void btn_editListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editListActionPerformed
        try{
            int row=tabelListBarang.getSelectedRow();
            if(row!=-1){
                setEditBarang(Integer.parseInt(tabelListBarang.getValueAt(row,0).toString()));
                switchPanels(Layout_EditBarang);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Barang terlebih dahulu");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_editListActionPerformed

    private void tf_kodeBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_kodeBarangKeyReleased
        if(tf_kodeBarang.getText() != null){
            try{
                sql="SELECT namaBarang,hargaJual,diskon,poin FROM barang WHERE idBarang='"+tf_kodeBarang.getText()+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                txt_namaBarang.setText(rs.getString(1));
                txt_hargaJual.setText(rs.getInt(2)+"");
                tf_diskonBarang.setText(rs.getInt(3)+"");
                tf_hargaPoinBarang.setText(rs.getInt(4)+"");
            }catch(Exception x){
                System.out.print(x);
            }
        }
    }//GEN-LAST:event_tf_kodeBarangKeyReleased

    private void addRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRowMouseClicked
        ((DefaultTableModel)tabelInput.getModel()).addRow(new Object[]{"","","","","",""});
    }//GEN-LAST:event_addRowMouseClicked

    private void removeRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeRowMouseClicked
        int row=tabelInput.getSelectedRow();
        if(row!=-1){
            ((DefaultTableModel)tabelInput.getModel()).removeRow(row);
            int totalPembelian=0;
            for(int i=0;i<tabelInput.getRowCount() && tabelInput.getValueAt(i, 5)!=null;i++){
                totalPembelian+=Integer.parseInt(tabelInput.getValueAt(i,5).toString());
            }
            txt_totalPembelian.setText(String.valueOf(totalPembelian));
        }else{
            JOptionPane.showMessageDialog(null, "Pilih belanjaan yang ingin dihapus terlebih dahulu");
        }
    }//GEN-LAST:event_removeRowMouseClicked

    private void btn_rincianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rincianActionPerformed
        try{
            int row=tabel_riwayatPembelian.getSelectedRow();
            if(row!=-1){
                setRincianInput(Integer.parseInt(tabel_riwayatPembelian.getValueAt(row,0).toString()));
                setTabelRincian(Integer.parseInt(tabel_riwayatPembelian.getValueAt(row,0).toString()));
                switchPanels(Layout_rincian);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Barang terlebih dahulu");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_rincianActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Karyawan().setVisible(true);
        });
    }
    
    private void kosongkan_form(){
        input_kode.setText("");
        input_kategori.setSelectedItem("-- Pilih jabatan --");
        input_namaBarang.setText("");
        input_satuan.setText("");
        input_hargaJual.setText("");
        input_diskon.setText("");
    }

    private void tambah_kategori(JComboBox cb){
        String s=JOptionPane.showInputDialog(null,"Masukkan nama kategori");
        if(s!=null && !s.equalsIgnoreCase("")){
            try{
                sql="INSERT into kategori (namaKategori) values ('"+s+"')";
                stat.executeUpdate(sql);
                
                String aktivitas="Karyawan id "+idAkun+" menambah kategori barang "+s;
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
            }catch(Exception x){
                System.out.println(x);
            }
            cb.removeAllItems();
            cb.addItem("-- Pilih Kategori --");
            try{
                sql="SELECT namaKategori FROM kategori";
                rs=stat.executeQuery(sql);
                while(rs.next()){
                    cb.addItem(rs.getString(1));
                }
            }catch(Exception x){
                System.out.println(x);
            }
        }
    }
    
    private void setEditBarang(int idBarang){
        edit_kategori.removeAllItems();
        edit_kategori.addItem("-- Pilih Kategori --");
        try{
            sql="SELECT namaKategori FROM kategori";
            rs=stat.executeQuery(sql);
            while(rs.next()){
                edit_kategori.addItem(rs.getString(1));
            }
            
            sql="SELECT * FROM barang WHERE idBarang='"+idBarang+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            edit_kode.setText(rs.getString("idBarang"));
            edit_kategori.setSelectedIndex(rs.getInt("idKategori"));
            edit_namaBarang.setText(rs.getString("namaBarang"));
            edit_satuan.setText(rs.getString("satuan"));
            edit_hargaJual.setText(rs.getString("hargaJual"));
            edit_diskon.setText(rs.getString("diskon"));
            edit_stok.setText(rs.getString("stok"));
            
        }catch(Exception x){
            System.out.println(x);
        }
    }
    
    private void setRincianInput(int idRestok){
        try{
            sql="SELECT * FROM restok INNER JOIN akun on idAkun=idKaryawan WHERE idRestok='"+idRestok+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            txt_tanggal.setText(rs.getString("tanggal"));
            txt_idKaryawan.setText(rs.getString("idKaryawan"));
            txt_namaKaryawan.setText(rs.getString("nama"));
            txt_totalHarga.setText(rs.getString("totalPembelian"));
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTabelRincian(int idRestok){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT * FROM restok_detail INNER JOIN barang USING (idBarang) WHERE idRestok='"+idRestok+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][6];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt("idBarang")+"";
                data[rowIndex][1]=rs.getString("namaBarang");
                data[rowIndex][2]=rs.getInt("qTerima")+"";
                data[rowIndex][3]=rs.getInt("hargaBeliSatuan")+"";
                data[rowIndex][4]=rs.getInt("qBonus")+"";
                data[rowIndex][5]=Integer.parseInt(data[rowIndex][2])*Integer.parseInt(data[rowIndex][3])+"";
                rowIndex++;
            }
            String[] cols={"Kode","Nama","QTerima","HargaSatuan","QBonus","Total"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabelRincianInput.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTableData(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            if(tf_search.getText() != null){
                String search = tf_search.getText();
                sql="SELECT idBarang,namaBarang,kategori.namaKategori,hargaJual,diskon,stok FROM barang LEFT JOIN kategori USING (idKategori) WHERE namaBarang LIKE '%"+search+"%'";
            } else {
                sql="SELECT idBarang,namaBarang,kategori.namaKategori,hargaJual,diskon,stok FROM barang LEFT JOIN kategori USING (idKategori)";
            }
                
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
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
            
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(200);
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
    
    public void setTableData3Col(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idAkun,nama,tglMasuk FROM akun INNER JOIN jabatan USING (idJabatan) WHERE namaJabatan='Karyawan'";
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
                data[rowIndex][2]=rs.getString(3);
                rowIndex++;
            }
            String[] cols={"ID","Nama Karyawan","Tanggal Masuk"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    public void setTableDataDiskon(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idBarang,namaBarang,hargaJual,diskon,poin FROM barang WHERE diskon > 0 OR poin > 0";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][5];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getInt(3)+"";
                data[rowIndex][3]=rs.getInt(4)+"";
                data[rowIndex][4]=rs.getInt(5)+"";                
                rowIndex++;
            }
            String[] cols={"Kode Barang","Nama Barang","Harga Jual","Diskon","Harga Poin"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setLog(){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT tanggal,aktivitas FROM log INNER JOIN jabatan using (idJabatan) WHERE namaJabatan='Karyawan'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][2];
            while(rs.next()){
                data[rowIndex][0]=rs.getString(1);
                data[rowIndex][1]=rs.getString(2);               
                rowIndex++;
            }
            String[] cols={"DATE","Aktivitas"};
            tabel_log.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabel_log.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabel_log.setModel(model);
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void addListener(){
        tabelInput.getModel().addTableModelListener(new TableModelListener() {
            
            @Override
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
                                    for(int i=0;i<tabelInput.getRowCount() && tabelInput.getValueAt(i, 5)!=null;i++){
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
    
    public class akun_karyawan{
        int idAkun;
        String nama,noTelp,email,jabatan,tglMasuk,username,password;

        public akun_karyawan(int id){
            try{
                sql="Select nama,noTelp,email,namaJabatan From akun INNER JOIN jabatan USING (idJabatan) Where idAkun='"+id+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                this.nama=rs.getString(1);
                this.noTelp=rs.getString(2);
                this.email=rs.getString(3);
                this.jabatan=rs.getString(4);
            }catch(Exception e){
                System.out.print(e);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Identitas;
    private javax.swing.JPanel Layout_EditBarang;
    private javax.swing.JPanel Layout_ListBarang;
    private javax.swing.JPanel Layout_Tabel;
    private javax.swing.JPanel Layout_Tambah;
    private javax.swing.JPanel Layout_button;
    private javax.swing.JPanel Layout_button2;
    private javax.swing.JPanel Layout_dataKaryawan;
    private javax.swing.JPanel Layout_listDiskon;
    private javax.swing.JPanel Layout_logKaryawan;
    private javax.swing.JPanel Layout_rincian;
    private javax.swing.JPanel Layout_riwayat;
    private javax.swing.JPanel Layout_tambahDiskon;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JPanel addRow;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JPanel btn_dataKaryawan;
    private javax.swing.JPanel btn_diskonPoin;
    private javax.swing.JButton btn_editBarang;
    private javax.swing.JButton btn_editList;
    private javax.swing.JButton btn_hapusList;
    private javax.swing.JPanel btn_inputBarang;
    private javax.swing.JPanel btn_listBarang;
    private javax.swing.JPanel btn_listDiskon;
    private javax.swing.JPanel btn_logKaryawan;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JButton btn_rincian;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_tabel;
    private javax.swing.JPanel btn_tambah;
    private javax.swing.JButton btn_tambahBarang;
    private javax.swing.JPanel btn_tambahDiskon;
    private javax.swing.JButton btn_tambahInputBarang;
    private javax.swing.JButton btn_tambahKategori;
    private javax.swing.JButton btn_tambahKategori1;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField edit_diskon;
    private javax.swing.JTextField edit_hargaJual;
    private javax.swing.JComboBox edit_kategori;
    private javax.swing.JLabel edit_kode;
    private javax.swing.JTextField edit_namaBarang;
    private javax.swing.JTextField edit_satuan;
    private javax.swing.JTextField edit_stok;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton gantiPassword;
    private javax.swing.JTextField input_diskon;
    private javax.swing.JTextField input_hargaJual;
    private javax.swing.JComboBox input_kategori;
    private javax.swing.JTextField input_kode;
    private javax.swing.JTextField input_namaBarang;
    private javax.swing.JTextField input_satuan;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jabatan1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JPanel kolomPassword;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JPanel lihatProfile;
    private javax.swing.JTextField nama1;
    private javax.swing.JTextField no_telp1;
    private javax.swing.JPasswordField passwordBaru;
    private javax.swing.JButton passwordCancel;
    private javax.swing.JPasswordField passwordLama;
    private javax.swing.JPanel passwordProfile;
    private javax.swing.JButton passwordSave;
    private javax.swing.JPanel removeRow;
    private javax.swing.JButton saveEditDiskon;
    private javax.swing.JButton saveEditProfile;
    private javax.swing.JTable tabelInput;
    private javax.swing.JTable tabelListBarang;
    private javax.swing.JTable tabelListDiskon;
    private javax.swing.JTable tabelRincianInput;
    private javax.swing.JTable tabel_log;
    private javax.swing.JTable tabel_riwayatPembelian;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JTextField tf_diskonBarang;
    private javax.swing.JTextField tf_hargaPoinBarang;
    private javax.swing.JTextField tf_kodeBarang;
    private javax.swing.JTextField tf_search;
    private javax.swing.JLabel txt_Tittle;
    private javax.swing.JLabel txt_hargaJual;
    private javax.swing.JLabel txt_idKaryawan;
    private javax.swing.JLabel txt_namaBarang;
    private javax.swing.JLabel txt_namaKaryawan;
    private javax.swing.JLabel txt_tanggal;
    private javax.swing.JLabel txt_totalHarga;
    private javax.swing.JLabel txt_totalPembelian;
    // End of variables declaration//GEN-END:variables
}
