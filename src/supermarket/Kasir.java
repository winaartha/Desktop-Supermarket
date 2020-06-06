package supermarket;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Kasir extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
        
    public static int idAkun;
    String layoutActive,buttonActive;
    public int baris, kolom;
    public akun_kasir self = new akun_kasir();
    
    public Kasir(int id){
        idAkun=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        akun_kasir x = new akun_kasir(idAkun);
        copyData(x);
        
        initComponents();
                     
        setColor(btn_transaksi);
        switchPanels(Layout_transaksi);
        addListener();
        txt_Tittle.setText("Transaksi");
    }
    
    public Kasir() {
        initComponents();
    }
    
    private void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }  
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }
    
    private void switchPanels(JPanel panel){
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    private void resetLayoutInactive(JPanel panel){
        if(!"btn_transaksi".equals(layoutActive))resetColor(btn_transaksi);
        if(!"btn_riwayat".equals(layoutActive))resetColor(btn_riwayat);
        if(!"btn_tukarPoin".equals(layoutActive))resetColor(btn_tukarPoin);
        if(!"btn_daftarMember".equals(layoutActive))resetColor(btn_daftarMember);
        if(!"btn_logKasir".equals(layoutActive))resetColor(btn_logKasir);
        if(!"btn_profile".equals(layoutActive))resetColor(btn_profile);
        if(!"btn_dataKasir".equals(layoutActive))resetColor(btn_dataKasir);
        setColor(panel);
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
        btn_daftarMember = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_tukarPoin = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btn_dataKasir = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_logKasir = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
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
        Layout_daftarMember = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tf_namaMember = new javax.swing.JTextField();
        txt_idPelanggan = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tf_noTelpMember = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tf_emailMember = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        simpanMember = new javax.swing.JButton();
        Layout_logKasir = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_log = new javax.swing.JTable();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_riwayatTransaksi = new javax.swing.JTable();
        btn_rincian = new javax.swing.JButton();
        Layout_rincian = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelRincian = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JLabel();
        txt_tanggal = new javax.swing.JLabel();
        txt_namaKasir = new javax.swing.JLabel();
        txt_idKasir = new javax.swing.JLabel();
        Layout_tukarPoin = new javax.swing.JPanel();
        btn_prosesTukarPoin = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelTukarPoin = new javax.swing.JTable();
        txt_totalPoinBelanja = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tf_idPelanggan = new javax.swing.JTextField();
        txt_poinPelanggan = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        removeRow1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        addRow1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
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
        removeRow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addRow = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordProfile = new javax.swing.JPanel();
        passwordSave = new javax.swing.JButton();
        passwordCancel = new javax.swing.JButton();
        kolomPassword = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        passwordLama = new javax.swing.JPasswordField();
        passwordBaru = new javax.swing.JPasswordField();
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
        Layout_button = new javax.swing.JPanel();
        btn_tabelTukar = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        btn_listDiskon = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        Layout_dataKasir = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kasirTable = new javax.swing.JTable();
        Layout_listDiskon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelListDiskon = new javax.swing.JTable();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_transaction_15px.png"))); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_clock_15px.png"))); // NOI18N
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
        Side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Kasir");
        Side_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_daftarMember.setBackground(new java.awt.Color(64, 43, 100));
        btn_daftarMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_daftarMemberMousePressed(evt);
            }
        });
        btn_daftarMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/registration_15px.png"))); // NOI18N
        btn_daftarMember.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Daftar Member");
        btn_daftarMember.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_daftarMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 40));

        btn_tukarPoin.setBackground(new java.awt.Color(64, 43, 100));
        btn_tukarPoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tukarPoinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tukarPoinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tukarPoinMousePressed(evt);
            }
        });
        btn_tukarPoin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/coins_15px.png"))); // NOI18N
        btn_tukarPoin.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Tukar Poin");
        btn_tukarPoin.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_tukarPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 40));

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

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/staff_15px.png"))); // NOI18N
        btn_dataKasir.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setText("Data Kasir");
        btn_dataKasir.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 40));

        btn_logKasir.setBackground(new java.awt.Color(64, 43, 100));
        btn_logKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logKasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logKasirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logKasirMousePressed(evt);
            }
        });
        btn_logKasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/document_15px.png"))); // NOI18N
        btn_logKasir.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setText("Log Kasir");
        btn_logKasir.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_logKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 40));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

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
        jPanel4.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nama  :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("No. telp :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        no_telp1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 300, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Email   :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 300, 30));

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

        Layout_daftarMember.setBackground(new java.awt.Color(255, 255, 255));
        Layout_daftarMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 140, true));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_namaMember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_namaMember.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel6.add(tf_namaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 340, 30));

        txt_idPelanggan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(txt_idPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("No. Telp :");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 30));

        tf_noTelpMember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_noTelpMember.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel6.add(tf_noTelpMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 340, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Email   :");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 30));

        tf_emailMember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_emailMember.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel6.add(tf_emailMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 340, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Nama  :");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("ID  :");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 40, 30));

        Layout_daftarMember.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 610, 280));

        simpanMember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        simpanMember.setText("Simpan");
        simpanMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMemberMouseClicked(evt);
            }
        });
        Layout_daftarMember.add(simpanMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        Layout_logKasir.setBackground(new java.awt.Color(255, 255, 255));
        Layout_logKasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        if (tabel_log.getColumnModel().getColumnCount() > 0) {
            tabel_log.getColumnModel().getColumn(0).setResizable(false);
            tabel_log.getColumnModel().getColumn(1).setResizable(false);
            tabel_log.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        Layout_logKasir.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

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
            tabel_riwayatTransaksi.getColumnModel().getColumn(3).setPreferredWidth(450);
        }

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 330));

        btn_rincian.setText("Rincian");
        btn_rincian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rincianActionPerformed(evt);
            }
        });
        Layout_riwayat.add(btn_rincian, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        Layout_rincian.setBackground(new java.awt.Color(255, 255, 255));
        Layout_rincian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel45.setText("Total Harga : Rp.");
        Layout_rincian.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 130, 30));

        tabelRincian.setForeground(new java.awt.Color(12, 12, 12));
        tabelRincian.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRincian.setGridColor(new java.awt.Color(240, 240, 240));
        tabelRincian.setRowHeight(20);
        tabelRincian.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tabelRincian);
        if (tabelRincian.getColumnModel().getColumnCount() > 0) {
            tabelRincian.getColumnModel().getColumn(0).setResizable(false);
            tabelRincian.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelRincian.getColumnModel().getColumn(1).setResizable(false);
            tabelRincian.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelRincian.getColumnModel().getColumn(2).setResizable(false);
            tabelRincian.getColumnModel().getColumn(3).setResizable(false);
            tabelRincian.getColumnModel().getColumn(4).setResizable(false);
            tabelRincian.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabelRincian.getColumnModel().getColumn(5).setResizable(false);
            tabelRincian.getColumnModel().getColumn(5).setPreferredWidth(50);
            tabelRincian.getColumnModel().getColumn(6).setResizable(false);
            tabelRincian.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        Layout_rincian.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 690, 260));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Tanggal Transaksi :");
        Layout_rincian.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("ID Kasir :");
        Layout_rincian.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setText("Nama Kasir :");
        Layout_rincian.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        txt_totalHarga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 120, 30));

        txt_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 30));

        txt_namaKasir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_namaKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 280, 30));

        txt_idKasir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincian.add(txt_idKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, 30));

        Layout_tukarPoin.setBackground(new java.awt.Color(255, 255, 255));
        Layout_tukarPoin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prosesTukarPoin.setText("Tukar");
        btn_prosesTukarPoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesTukarPoinActionPerformed(evt);
            }
        });
        Layout_tukarPoin.add(btn_prosesTukarPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        tabelTukarPoin.setForeground(new java.awt.Color(12, 12, 12));
        tabelTukarPoin.setModel(new javax.swing.table.DefaultTableModel(
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
                "Kode", "Nama", "Harga Poin", "Qty", "Satuan", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelTukarPoin.setGridColor(new java.awt.Color(240, 240, 240));
        tabelTukarPoin.setRowHeight(20);
        tabelTukarPoin.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tabelTukarPoin);
        if (tabelTukarPoin.getColumnModel().getColumnCount() > 0) {
            tabelTukarPoin.getColumnModel().getColumn(0).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelTukarPoin.getColumnModel().getColumn(1).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelTukarPoin.getColumnModel().getColumn(2).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(3).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabelTukarPoin.getColumnModel().getColumn(4).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabelTukarPoin.getColumnModel().getColumn(5).setResizable(false);
            tabelTukarPoin.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        Layout_tukarPoin.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 690, 210));

        txt_totalPoinBelanja.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_totalPoinBelanja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Layout_tukarPoin.add(txt_totalPoinBelanja, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 110, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setText("ID Pelanggan :");
        Layout_tukarPoin.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        tf_idPelanggan.setMargin(new java.awt.Insets(2, 8, 2, 2));
        tf_idPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_idPelangganKeyReleased(evt);
            }
        });
        Layout_tukarPoin.add(tf_idPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 30));

        txt_poinPelanggan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_tukarPoin.add(txt_poinPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 180, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel38.setText("Poin dimiliki :");
        Layout_tukarPoin.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 100, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel36.setText("Total Poin diperlukan : ");
        Layout_tukarPoin.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, 30));

        removeRow1.setBackground(new java.awt.Color(255, 255, 255));
        removeRow1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        removeRow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeRow1MouseClicked(evt);
            }
        });
        removeRow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setForeground(new java.awt.Color(50, 50, 50));
        jLabel33.setText("- remove");
        removeRow1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_tukarPoin.add(removeRow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 30));

        addRow1.setBackground(new java.awt.Color(255, 255, 255));
        addRow1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        addRow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRow1MouseClicked(evt);
            }
        });
        addRow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setForeground(new java.awt.Color(50, 50, 50));
        jLabel37.setText("+ add");
        addRow1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        Layout_tukarPoin.add(addRow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 30));

        Layout_transaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_transaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total_harga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total_harga.setText("Total Harga");
        Layout_transaksi.add(Total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, 30));

        Total_harga2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Layout_transaksi.add(Total_harga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 110, 30));

        Uang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Uang.setText("Uang Dibayar");
        Layout_transaksi.add(Uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 100, 30));

        Uang2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Uang2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Uang2KeyReleased(evt);
            }
        });
        Layout_transaksi.add(Uang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 110, 30));

        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Kembali.setText("Uang Kembali");
        Layout_transaksi.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, 30));

        Kembali2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Layout_transaksi.add(Kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 110, 30));

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        Layout_transaksi.add(Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

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

        Layout_transaksi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 223));

        removeRow.setBackground(new java.awt.Color(255, 255, 255));
        removeRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        removeRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeRowMouseClicked(evt);
            }
        });
        removeRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(50, 50, 50));
        jLabel1.setText("- remove");
        removeRow.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_transaksi.add(removeRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        addRow.setBackground(new java.awt.Color(255, 255, 255));
        addRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        addRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRowMouseClicked(evt);
            }
        });
        addRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(50, 50, 50));
        jLabel2.setText("+ add");
        addRow.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        Layout_transaksi.add(addRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 30));

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

        passwordLama.setMargin(new java.awt.Insets(2, 8, 2, 2));
        kolomPassword.add(passwordLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 30));

        passwordBaru.setMargin(new java.awt.Insets(2, 8, 2, 2));
        kolomPassword.add(passwordBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 330, 30));

        passwordProfile.add(kolomPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 280));

        lihatProfile.setBackground(new java.awt.Color(255, 255, 255));
        lihatProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Foto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        Layout_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tabelTukar.setBackground(new java.awt.Color(64, 43, 100));
        btn_tabelTukar.setForeground(new java.awt.Color(250, 250, 250));
        btn_tabelTukar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tabelTukarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tabelTukarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tabelTukarMousePressed(evt);
            }
        });
        btn_tabelTukar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Tabel Tukar");
        btn_tabelTukar.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        Layout_button.add(btn_tabelTukar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 30));

        btn_listDiskon.setBackground(new java.awt.Color(64, 43, 100));
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

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("List Poin");
        btn_listDiskon.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        Layout_button.add(btn_listDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 30));

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
                "ID", "Nama Kasir", "Tanggal Masuk"
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
        jScrollPane3.setViewportView(kasirTable);

        Layout_dataKasir.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 680, 380));

        Layout_listDiskon.setBackground(new java.awt.Color(255, 255, 255));
        Layout_listDiskon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelListDiskon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Poin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelListDiskon.setGridColor(new java.awt.Color(240, 240, 240));
        tabelListDiskon.setRowHeight(30);
        tabelListDiskon.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelListDiskon);

        Layout_listDiskon.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 310));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 35, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 35, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 73, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_daftarMember, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_tukarPoin, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 45, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincian, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
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
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 67, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_daftarMember, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(Layout_tukarPoin, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 420, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincian, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_daftarMember, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_logKasir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_rincian, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_tukarPoin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_transaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataKasir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_listDiskon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bg.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 720, 410));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/close_window_25px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 30));

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
        switchPanels(Layout_transaksi);
        layoutActive="btn_transaksi";
        resetLayoutInactive(btn_transaksi);
        txt_Tittle.setText("Transaksi");
    }//GEN-LAST:event_btn_transaksiMousePressed

    private void btn_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMousePressed
        switchPanels(Layout_riwayat);
        layoutActive="btn_riwayat";
        resetLayoutInactive(btn_riwayat);
        txt_Tittle.setText("Riwayat");
        setTableData(tabel_riwayatTransaksi);
    }//GEN-LAST:event_btn_riwayatMousePressed

    private void btn_profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMousePressed
        switchPanels(lihatProfile);
        layoutActive="btn_profile";
        resetLayoutInactive(btn_profile);
        txt_Tittle.setText("Profile");
        
        textNama.setText(self.nama);
        textNoTelp.setText(self.noTelp);
        textEmail.setText(self.email);
        textJabatan.setText(self.jabatan);
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
        nama1.setText(self.nama);
        no_telp1.setText(self.noTelp);
        email1.setText(self.email);
        jabatan1.setText(self.jabatan);
    }//GEN-LAST:event_editDataMouseClicked

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        textNama.setText(self.nama);
        textNoTelp.setText(self.noTelp);
        textEmail.setText(self.email);
        textJabatan.setText(self.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void saveEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditProfileMouseClicked
        String error="";
        if(nama1.getText().equals(""))error+="Nama tidak boleh kosong\n";
        if(no_telp1.getText().equals(""))error+="No.Telp tidak boleh kosong\n";
        if(email1.getText().equals(""))error+="Email tidak boleh kosong\n";
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null, error);
        }else{
            self.editProfile(nama1.getText(),no_telp1.getText(),email1.getText());
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

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
        textNama.setText(self.nama);
        textNoTelp.setText(self.noTelp);
        textEmail.setText(self.email);
        textJabatan.setText(self.jabatan);
    }//GEN-LAST:event_passwordCancelMouseClicked

    private void Uang2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Uang2KeyReleased
        int totalBelanja=Integer.parseInt(Total_harga2.getText());
        if(Uang2.getText()!=null && Uang2.getText()!=""){
            int totalDibayar=Integer.parseInt(Uang2.getText());
            Kembali2.setText(String.valueOf(totalDibayar-totalBelanja));
        }
    }//GEN-LAST:event_Uang2KeyReleased

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        if(Total_harga2.getText()=="" || Integer.parseInt(Total_harga2.getText().toString())==0 ){
            JOptionPane.showMessageDialog(null, "Masukkan barang belanjaan terlebih dahulu");
        }else if(Uang2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan uang yang dibayarkan");
        }else if(Integer.parseInt(Uang2.getText().toString()) >= Integer.parseInt(Total_harga2.getText().toString())){
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
                        sql="UPDATE pelanggan SET poin=poin+(0.1*'"+Total_harga2.getText()+"') WHERE idPelanggan='"+s+"'";
                        stat.execute(sql);
                    }
                    sql="SELECT idTransaksi FROM transaksi ORDER BY tanggal DESC LIMIT 1";
                    rs=stat.executeQuery(sql);
                    rs.next();
                    idTransaksi=Integer.parseInt(rs.getString(1));
                    
                    if(s.equalsIgnoreCase("")){
                        String aktivitas="Kasir id "+idAkun+" mengelola transaksi "+idTransaksi+" dari pelanggan non-member";
                        sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                        stat.executeUpdate(sql);
                    }else{
                        String aktivitas="Kasir id "+idAkun+" mengelola transaksi "+idTransaksi+" dari pelanggan id "+s;
                        sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                        stat.executeUpdate(sql);
                    }

                    for(int i=0;tabelTransaksi.getValueAt(i, 0)!=null;i++){
                        sql="INSERT INTO transaksi_detail values (NULL,'"+idTransaksi+"','"+tabelTransaksi.getValueAt(i, 0)+"','" + tabelTransaksi.getValueAt(i, 2) + "','"+tabelTransaksi.getValueAt(i, 4)+"','"+tabelTransaksi.getValueAt(i, 3)+"')";
                        stat.executeUpdate(sql);

                        sql="UPDATE barang SET stok=stok-'"+tabelTransaksi.getValueAt(i, 4)+"'WHERE idBarang='"+tabelTransaksi.getValueAt(i,0)+"'";
                        stat.execute(sql);

                    }

                    DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
                    dtm.setRowCount(0);
                    dtm.setRowCount(8);
                    Total_harga2.setText("");
                    Uang2.setText("");
                    Kembali2.setText("");
                    JOptionPane.showMessageDialog(null, "Transaksi Berhasil");
                }
            }catch(Exception x){
                System.out.println(x);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uang yang dibayarkan tidak cukup");
        }
    }//GEN-LAST:event_ProsesActionPerformed

    private void btn_daftarMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMemberMouseEntered
        setColor(btn_daftarMember);
    }//GEN-LAST:event_btn_daftarMemberMouseEntered

    private void btn_daftarMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMemberMouseExited
        if(!"btn_daftarMember".equals(layoutActive)){
            resetColor(btn_daftarMember);
        } 
    }//GEN-LAST:event_btn_daftarMemberMouseExited

    private void btn_daftarMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMemberMousePressed
        switchPanels(Layout_daftarMember);
        layoutActive="btn_daftarMember";
        resetLayoutInactive(btn_daftarMember);
        txt_Tittle.setText("Daftar Member");
        
        try{
            sql="SELECT idPelanggan from pelanggan ORDER BY idPelanggan DESC LIMIT 1";
            rs=stat.executeQuery(sql);
            rs.next();
            int id=rs.getInt(1);
            txt_idPelanggan.setText(id+1+"");
        }catch(Exception e){
            txt_idPelanggan.setText("1");
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_daftarMemberMousePressed

    private void btn_tukarPoinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tukarPoinMouseEntered
        setColor(btn_tukarPoin);
    }//GEN-LAST:event_btn_tukarPoinMouseEntered

    private void btn_tukarPoinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tukarPoinMouseExited
        if(!"btn_tukarPoin".equals(layoutActive)){
            resetColor(btn_tukarPoin);
        } 
    }//GEN-LAST:event_btn_tukarPoinMouseExited

    private void btn_tukarPoinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tukarPoinMousePressed
        switchPanels(Layout_tukarPoin);
        layeredPane.add(Layout_button);
        setColor(btn_tabelTukar);
        layoutActive="btn_tukarPoin";
        resetLayoutInactive(btn_tukarPoin);
        txt_Tittle.setText("Tukar Poin");
        addListenerTukarPoin();
    }//GEN-LAST:event_btn_tukarPoinMousePressed

    private void btn_dataKasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMouseEntered
        setColor(btn_dataKasir);
    }//GEN-LAST:event_btn_dataKasirMouseEntered

    private void btn_dataKasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMouseExited
        if(!"btn_dataKasir".equals(layoutActive)){
            resetColor(btn_dataKasir);
        } 
    }//GEN-LAST:event_btn_dataKasirMouseExited

    private void btn_dataKasirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataKasirMousePressed
        switchPanels(Layout_dataKasir);
        layoutActive="btn_dataKasir";
        resetLayoutInactive(btn_dataKasir);
        txt_Tittle.setText("Data Kasir");
        
        setTableData3Col(kasirTable);
    }//GEN-LAST:event_btn_dataKasirMousePressed

    private void btn_logKasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKasirMouseEntered
        setColor(btn_logKasir);
    }//GEN-LAST:event_btn_logKasirMouseEntered

    private void btn_logKasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKasirMouseExited
        if(!"btn_logKasir".equals(layoutActive)){
            resetColor(btn_logKasir);
        } 
    }//GEN-LAST:event_btn_logKasirMouseExited

    private void btn_logKasirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logKasirMousePressed
        switchPanels(Layout_logKasir);
        layoutActive="btn_logKasir";
        resetLayoutInactive(btn_logKasir);
        txt_Tittle.setText("Log Kasir");
        setLog();
    }//GEN-LAST:event_btn_logKasirMousePressed

    private void simpanMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMemberMouseClicked
        try{
            String error="";
            if(tf_namaMember.getText().equals(""))error+="Nama Member tidak boleh kosong\n";
            if(tf_noTelpMember.getText().equals(""))error+="No.Telp tidak boleh kosong";
            if(tf_emailMember.getText().equals(""))error+="Email tidak boleh kosong";
            if(!error.equals("")){
                JOptionPane.showMessageDialog(null, error);
            }else{
                sql="INSERT INTO pelanggan values (NULL,'"+tf_namaMember.getText()+"','"+tf_noTelpMember.getText()+"','"+tf_emailMember.getText()+"',0)";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil menambah member");
                
                sql="SELECT idPelanggan FROM pelanggan ORDER BY idPelanggan DESC LIMIT 1";
                rs=stat.executeQuery(sql);
                rs.next();
                String idPelanggan=rs.getInt(1)+"";
                
                String aktivitas="Kasir id "+idAkun+" menambah member baru dengan id "+idPelanggan;
                sql="INSERT INTO log values(null,3,"+idAkun+",'"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                tf_namaMember.setText("");
                tf_noTelpMember.setText("");
                tf_emailMember.setText("");

                sql="SELECT idPelanggan from pelanggan ORDER BY idPelanggan DESC LIMIT 1";
                rs=stat.executeQuery(sql);
                rs.next();
                int id=rs.getInt(1);
                txt_idPelanggan.setText(id+1+"");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_simpanMemberMouseClicked

    private void btn_prosesTukarPoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesTukarPoinActionPerformed
        
        if(txt_totalPoinBelanja.getText()!="" && Integer.parseInt(txt_totalPoinBelanja.getText().toString())!=0){
            int idTukar;
            try{
                sql="SELECT * FROM pelanggan WHERE idPelanggan='"+tf_idPelanggan.getText()+"'";
                rs=stat.executeQuery(sql);
                if(rs.next()){
                    if(Integer.parseInt(txt_totalPoinBelanja.getText()) > Integer.parseInt(txt_poinPelanggan.getText())){
                        JOptionPane.showMessageDialog(null, "Poin Pelanggan tidak mencukupi");
                    }
                    else if(Integer.parseInt(txt_totalPoinBelanja.getText().toString())==0 || txt_totalPoinBelanja.getText()==""){
                        JOptionPane.showMessageDialog(null, "Masukkan barang terlebih dahulu");
                    }
                    else{
                        sql="INSERT INTO tukarpoin values (NULL,'"+idAkun+"','"+tf_idPelanggan.getText()+"',CURDATE(),'"+txt_totalPoinBelanja.getText()+"')";
                        stat.executeUpdate(sql);

                        sql="SELECT idTukar FROM tukarpoin ORDER BY tanggal DESC LIMIT 1";
                        rs=stat.executeQuery(sql);
                        rs.next();
                        idTukar=Integer.parseInt(rs.getString(1));

                        String aktivitas="Kasir id "+idAkun+" mengelola penukaran poin dengan id "+idTukar;
                        sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                        stat.executeUpdate(sql);
                        
                        for(int i=0;tabelTukarPoin.getValueAt(i, 0)!=null;i++){
                            sql="INSERT INTO tukarpoin_detail values (NULL,'"+idTukar+"','"+tabelTukarPoin.getValueAt(i, 0)+"','" + tabelTukarPoin.getValueAt(i, 2) + "','"+tabelTukarPoin.getValueAt(i, 3)+"')";
                            stat.executeUpdate(sql);

                            sql="UPDATE barang SET stok=stok-'"+tabelTukarPoin.getValueAt(i, 3)+"'WHERE idBarang='"+tabelTukarPoin.getValueAt(i,0)+"'";
                            stat.execute(sql);

                        }
                        sql="UPDATE pelanggan SET poin=poin-'"+txt_totalPoinBelanja.getText()+"'WHERE idPelanggan='"+tf_idPelanggan.getText()+"'";
                        stat.execute(sql);

                        DefaultTableModel dtm = (DefaultTableModel) tabelTukarPoin.getModel();
                        dtm.setRowCount(0);
                        dtm.setRowCount(8);

                        JOptionPane.showMessageDialog(null, "Tukar Poin Berhasil");
                        tf_idPelanggan.setText("");
                        txt_poinPelanggan.setText("");
                        txt_totalPoinBelanja.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ID Pelanggan belum terdaftar");
                }
            }catch(Exception x){
                System.out.println(x);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Masukkan barang terlebih dahulu");
        }
    }//GEN-LAST:event_btn_prosesTukarPoinActionPerformed

    private void btn_tabelTukarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelTukarMouseEntered
        setColor(btn_tabelTukar);
    }//GEN-LAST:event_btn_tabelTukarMouseEntered

    private void btn_tabelTukarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelTukarMouseExited
        if(!"btn_tabelTukar".equals(buttonActive)){
            resetColor(btn_tabelTukar);
        }
    }//GEN-LAST:event_btn_tabelTukarMouseExited

    private void btn_tabelTukarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tabelTukarMousePressed
        setColor(btn_tabelTukar);
        resetColor(btn_listDiskon);
        switchPanels(Layout_tukarPoin);
        layeredPane.add(Layout_button);
        buttonActive="btn_tabelTukar";
    }//GEN-LAST:event_btn_tabelTukarMousePressed

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
        resetColor(btn_tabelTukar);
        switchPanels(Layout_listDiskon);
        layeredPane.add(Layout_button);
        buttonActive="btn_listDiskon";
        
        setTableDataDiskon(tabelListDiskon);
    }//GEN-LAST:event_btn_listDiskonMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin keluar dari program ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void tf_idPelangganKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_idPelangganKeyReleased
        if(tf_idPelanggan.getText() != null){
            try{
                sql="SELECT poin FROM pelanggan WHERE idPelanggan='"+tf_idPelanggan.getText()+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                txt_poinPelanggan.setText(rs.getInt(1)+"");
            }catch(Exception x){
                txt_poinPelanggan.setText("");
                System.out.print(x);
            }
        }
    }//GEN-LAST:event_tf_idPelangganKeyReleased

    private void removeRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeRowMouseClicked
        int row=tabelTransaksi.getSelectedRow();
        if(row!=-1){
            ((DefaultTableModel)tabelTransaksi.getModel()).removeRow(row);
            int totalBelanja=0;
            for(int i=0;i<tabelTransaksi.getRowCount() && tabelTransaksi.getValueAt(i, 6)!=null;i++){
                totalBelanja+=Integer.parseInt(tabelTransaksi.getValueAt(i,6).toString());
            }
            Total_harga2.setText(String.valueOf(totalBelanja));
            
            if(Total_harga2.getText()!=null && Total_harga2.getText()!="" && Uang2.getText()!=null && !Uang2.getText().equals("")){
                totalBelanja=Integer.parseInt(Total_harga2.getText());
                int totalDibayar=Integer.parseInt(Uang2.getText());
                Kembali2.setText(String.valueOf(totalDibayar-totalBelanja));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih belanjaan yang ingin dihapus terlebih dahulu");
        }
    }//GEN-LAST:event_removeRowMouseClicked

    private void addRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRowMouseClicked
        ((DefaultTableModel)tabelTransaksi.getModel()).addRow(new Object[]{"","","","","","",""});
    }//GEN-LAST:event_addRowMouseClicked

    private void removeRow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeRow1MouseClicked
        int row=tabelTukarPoin.getSelectedRow();
        if(row!=-1){
            ((DefaultTableModel)tabelTukarPoin.getModel()).removeRow(row);
            int totalBelanja=0;
            for(int i=0;tabelTukarPoin.getValueAt(i, 5)!=null;i++){
                totalBelanja+=Integer.parseInt(tabelTukarPoin.getValueAt(i,5).toString());
            }
            txt_totalPoinBelanja.setText(String.valueOf(totalBelanja));
        }else{
            JOptionPane.showMessageDialog(null, "Pilih belanjaan yang ingin dihapus terlebih dahulu");
        }
    }//GEN-LAST:event_removeRow1MouseClicked

    private void addRow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRow1MouseClicked
        ((DefaultTableModel)tabelTukarPoin.getModel()).addRow(new Object[]{"","","","","",""});
    }//GEN-LAST:event_addRow1MouseClicked

    private void btn_rincianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rincianActionPerformed
        try{
            int row=tabel_riwayatTransaksi.getSelectedRow();
            if(row!=-1){
                setRincianTransaksi(Integer.parseInt(tabel_riwayatTransaksi.getValueAt(row,0).toString()));
                setTabelRincian(Integer.parseInt(tabel_riwayatTransaksi.getValueAt(row,0).toString()));
                switchPanels(Layout_rincian);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Riwayat terlebih dahulu");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_rincianActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kasir().setVisible(true);
            }
        });
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
    
    private void setTableData3Col(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idAkun,nama,tglMasuk FROM akun INNER JOIN jabatan USING (idJabatan) WHERE namaJabatan='Kasir'";
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
            String[] cols={"ID","Nama Kasir","Tanggal Masuk"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setRincianTransaksi(int idTransaksi){
        try{
            sql="SELECT * FROM transaksi INNER JOIN akun on idAkun=idKasir WHERE idTransaksi='"+idTransaksi+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            txt_tanggal.setText(rs.getString("tanggal"));
            txt_idKasir.setText(rs.getString("idKasir"));
            txt_namaKasir.setText(rs.getString("nama"));
            txt_totalHarga.setText(rs.getString("totalBelanja"));
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTabelRincian(int idTransaksi){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT * FROM transaksi_detail INNER JOIN barang USING (idBarang) WHERE idTransaksi='"+idTransaksi+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][7];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt("idBarang")+"";
                data[rowIndex][1]=rs.getString("namaBarang");
                data[rowIndex][2]=rs.getInt("transaksi_detail.hargaJual")+"";
                data[rowIndex][3]=rs.getInt("transaksi_detail.diskon")+"";
                data[rowIndex][4]=rs.getInt("transaksi_detail.quantity")+"";
                data[rowIndex][5]=rs.getString("satuan");
                data[rowIndex][6]=(Integer.parseInt(data[rowIndex][2])-Integer.parseInt(data[rowIndex][3]))*Integer.parseInt(data[rowIndex][4])+"";
                rowIndex++;
            }
            String[] cols={"Kode","Nama","Harga","Diskon","qty","Satuan","Total"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabelRincian.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    
    private void setTableDataDiskon(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idBarang,namaBarang,poin FROM barang WHERE poin > 0";
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
            String[] cols={"Kode Barang","Nama Barang","Harga Poin"};
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
            
            sql="SELECT tanggal,aktivitas FROM log INNER JOIN jabatan using (idJabatan) WHERE namaJabatan='Kasir'";
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
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabel_log.setModel(model);
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void addListener(){
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
                                    for(int i=0;i<tabelTransaksi.getRowCount() && tabelTransaksi.getValueAt(i, 6)!=null;i++){
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
    
    private void addListenerTukarPoin(){
        tabelTukarPoin.getModel().addTableModelListener(new TableModelListener() {
            
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    final int row = e.getFirstRow();
                    final int column = e.getColumn();
                    switch(column){
                        case 0:
                            int id_barang=(int) tabelTukarPoin.getValueAt(row, column);
                            try{
                                sql="SELECT namaBarang, poin, satuan FROM barang WHERE idBarang='"+id_barang+"'AND poin > 0";
                                rs=stat.executeQuery(sql);
                                rs.next();
                                tabelTukarPoin.setValueAt(rs.getString(1), row, 1);
                                tabelTukarPoin.setValueAt(rs.getInt(2)+"", row, 2);
                                tabelTukarPoin.setValueAt(rs.getString(3), row, 4);
                            }catch(Exception x){
                                System.out.print(x);
                            }
                        case 3:
                            if(tabelTukarPoin.getValueAt(row, 0)!=null && tabelTukarPoin.getValueAt(row, 3)!=null)
                                try{
                                    int totalHarga=Integer.parseInt(tabelTukarPoin.getValueAt(row, 2).toString()) * Integer.parseInt(tabelTukarPoin.getValueAt(row, 3).toString());
                                    tabelTukarPoin.setValueAt(totalHarga, row, 5);
                                    int totalBelanja=0;
                                    for(int i=0;tabelTukarPoin.getValueAt(i, 5)!=null;i++){
                                        totalBelanja+=Integer.parseInt(tabelTukarPoin.getValueAt(i,5).toString());
                                    }
                                    txt_totalPoinBelanja.setText(String.valueOf(totalBelanja));
                                }catch(Exception x){
                                    System.out.print(x);
                                }
                            
                            break;
                    }
                }
            }
        });    
    }
    
    private void copyData(akun_kasir x){
        self.nama=x.nama;
        self.noTelp=x.noTelp;
        self.email=x.email;
        self.jabatan=x.jabatan;
        self.tglMasuk=x.tglMasuk;
        self.username=x.username;
        self.password=x.password;
    }
    
    public class akun_kasir extends super_akun{
        
        int idAkun;
        String nama,noTelp,email,jabatan,tglMasuk,username,password;
//
//        public akun_kasir(int id){
//            this.idAkun=id;
//            try{
//                sql="SELECT * From akun INNER JOIN jabatan USING (idJabatan) Where idAkun='"+this.idAkun+"'";
//                rs=stat.executeQuery(sql);
//                rs.next();
//                
//                this.nama=rs.getString("nama");
//                this.noTelp=rs.getString("noTelp");
//                this.email=rs.getString("email");
//                this.jabatan=rs.getString("namaJabatan");
//                this.tglMasuk=rs.getString("tglMasuk");
//                this.username=rs.getString("username");
//                this.password=rs.getString("password");
//                
//            }catch(Exception e){
//                System.out.print(e);
//            }
//        }
//
//        private akun_kasir() {
//            this.nama="";
//            this.noTelp="";
//            this.email="";
//            this.jabatan="";
//            this.tglMasuk="";
//            this.username="";
//            this.password="";
//        }
//        
//        private void editProfile(String nama,String noTelp,String email){
//            this.nama=nama;
//            this.noTelp=noTelp;
//            this.email=email;
//            
//            try{
//                sql="UPDATE akun SET nama='"+this.nama+"',noTelp='"+this.noTelp+"',email='"+this.email+"',foto=NULL WHERE idAkun='"+this.idAkun+"'";
//                stat.executeUpdate(sql);
//
//                String aktivitas="Kasir id "+idAkun+" mengupdate profile";
//                sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
//                stat.executeUpdate(sql);
//                
//                JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
//            }catch(Exception e){
//                System.out.print(e);
//            }
//        }

        public akun_kasir(int id) {
            super(id);
        }
        public akun_kasir() {
            super();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Identitas;
    private javax.swing.JLabel Kembali;
    private javax.swing.JLabel Kembali2;
    private javax.swing.JPanel Layout_button;
    private javax.swing.JPanel Layout_daftarMember;
    private javax.swing.JPanel Layout_dataKasir;
    private javax.swing.JPanel Layout_listDiskon;
    private javax.swing.JPanel Layout_logKasir;
    private javax.swing.JPanel Layout_rincian;
    private javax.swing.JPanel Layout_riwayat;
    private javax.swing.JPanel Layout_transaksi;
    private javax.swing.JPanel Layout_tukarPoin;
    private javax.swing.JButton Proses;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JLabel Total_harga;
    private javax.swing.JLabel Total_harga2;
    private javax.swing.JLabel Uang;
    private javax.swing.JTextField Uang2;
    private javax.swing.JPanel addRow;
    private javax.swing.JPanel addRow1;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JPanel btn_daftarMember;
    private javax.swing.JPanel btn_dataKasir;
    private javax.swing.JPanel btn_listDiskon;
    private javax.swing.JPanel btn_logKasir;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JButton btn_prosesTukarPoin;
    private javax.swing.JButton btn_rincian;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_tabelTukar;
    private javax.swing.JPanel btn_transaksi;
    private javax.swing.JPanel btn_tukarPoin;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel exit;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTable kasirTable;
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
    private javax.swing.JPanel removeRow1;
    private javax.swing.JButton saveEditProfile;
    private javax.swing.JButton simpanMember;
    private javax.swing.JTable tabelListDiskon;
    private javax.swing.JTable tabelRincian;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTable tabelTukarPoin;
    private javax.swing.JTable tabel_log;
    private javax.swing.JTable tabel_riwayatTransaksi;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JTextField tf_emailMember;
    private javax.swing.JTextField tf_idPelanggan;
    private javax.swing.JTextField tf_namaMember;
    private javax.swing.JTextField tf_noTelpMember;
    private javax.swing.JLabel txt_Tittle;
    private javax.swing.JLabel txt_idKasir;
    private javax.swing.JLabel txt_idPelanggan;
    private javax.swing.JLabel txt_namaKasir;
    private javax.swing.JLabel txt_poinPelanggan;
    private javax.swing.JLabel txt_tanggal;
    private javax.swing.JLabel txt_totalHarga;
    private javax.swing.JLabel txt_totalPoinBelanja;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(Object object, String transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
