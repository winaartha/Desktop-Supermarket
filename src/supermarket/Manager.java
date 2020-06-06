package supermarket;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
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
    public static int idAkun;
    String layoutActive,buttonActive;
    public int baris, kolom;
    
    public Manager(int id){
        idAkun=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        initComponents();
        
        //baru masuk
        setColor(btn_laporan);
        switchPanels(Layout_laporan);
        layeredPane.add(Layout_button4);
        opening();
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
    
    private void resetLayoutInactive(JPanel panel){
        if(!"btn_laporan".equals(layoutActive))resetColor(btn_laporan);
        if(!"btn_keperluanUsaha".equals(layoutActive))resetColor(btn_keperluanUsaha);
        if(!"btn_dataPegawai".equals(layoutActive))resetColor(btn_dataPegawai);
        if(!"btn_dataPelanggan".equals(layoutActive))resetColor(btn_dataPelanggan);
        if(!"btn_informasiBarang".equals(layoutActive))resetColor(btn_informasiBarang);
        if(!"btn_riwayatPegawai".equals(layoutActive))resetColor(btn_riwayatPegawai);
        if(!"btn_tambahPegawai".equals(layoutActive))resetColor(btn_tambahPegawai);
        if(!"btn_logPegawai".equals(layoutActive))resetColor(btn_logPegawai);
        if(!"btn_profile".equals(layoutActive))resetColor(btn_profile);
        setColor(panel);
    }
    
    private void resetButtonInactive(JPanel panel){
        if(!"btn_inputKeperluan".equals(buttonActive))resetColor(btn_inputKeperluan);
        if(!"btn_riwayatKeperluan".equals(buttonActive))resetColor(btn_riwayatKeperluan);
        if(!"btn_transaksi".equals(buttonActive))resetColor(btn_transaksi);
        if(!"btn_inputBarang".equals(buttonActive))resetColor(btn_inputBarang);
        if(!"btn_kasir".equals(buttonActive))resetColor(btn_kasir);
        if(!"btn_karyawan".equals(buttonActive))resetColor(btn_karyawan);
        if(!"btn_listBarang".equals(buttonActive))resetColor(btn_listBarang);
        if(!"btn_listDiskonPoin".equals(buttonActive))resetColor(btn_listDiskonPoin);
        setColor(panel);
    }
    
    private void switchPanels(JPanel panel){
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
        btn_dataPegawai = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_riwayatPegawai = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_informasiBarang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_tambahPegawai = new javax.swing.JPanel();
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
        btn_laporan = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_logPegawai = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btn_keperluanUsaha = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn_dataPelanggan = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_logPegawai = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tabel_log = new javax.swing.JTable();
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
        Layout_riwayatKeperluan = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tabelRiwayatKeperluan = new javax.swing.JTable();
        btn_hapusriwayat = new javax.swing.JButton();
        Layout_listBarang = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelListBarang = new javax.swing.JTable();
        btn_hapusList = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        Layout_button5 = new javax.swing.JPanel();
        btn_inputKeperluan = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btn_riwayatKeperluan = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        Layout_rincianInput = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txt_totalHarga1 = new javax.swing.JLabel();
        txt_tanggal1 = new javax.swing.JLabel();
        txt_namaKaryawan = new javax.swing.JLabel();
        txt_idKaryawan = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabelRincianInput = new javax.swing.JTable();
        Layout_riwayatInputBarang = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_riwayatPembelian = new javax.swing.JTable();
        rincianInput = new javax.swing.JButton();
        Layout_rincianTransaksi = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelRincian = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JLabel();
        txt_tanggal = new javax.swing.JLabel();
        txt_namaKasir = new javax.swing.JLabel();
        txt_idKasir = new javax.swing.JLabel();
        Layout_riwayatTransaksi = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabel_riwayatTransaksi = new javax.swing.JTable();
        rincianTransaksi = new javax.swing.JButton();
        Layout_button2 = new javax.swing.JPanel();
        btn_transaksi = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        btn_inputBarang = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        Layout_button = new javax.swing.JPanel();
        btn_kasir = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        btn_karyawan = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        Layout_button3 = new javax.swing.JPanel();
        btn_listBarang = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        btn_listDiskonPoin = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        Layout_inputKeperluan = new javax.swing.JPanel();
        btn_prosesKeperluan = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelKeperluanUsaha = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_totalKeperluan = new javax.swing.JLabel();
        removeRow = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        addRow = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        Layout_button4 = new javax.swing.JPanel();
        bulanLaporan = new javax.swing.JComboBox();
        bulanTahun = new javax.swing.JLabel();
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
        Layout_dataKasir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kasirTable = new javax.swing.JTable();
        dataKasirTampilkan = new javax.swing.JButton();
        dataKasirHapus = new javax.swing.JButton();
        Layout_dataKaryawan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();
        dataKaryawanHapus = new javax.swing.JButton();
        dataKaryawanTampilkan = new javax.swing.JButton();
        Layout_tambahPekerja = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nama1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        no_telp1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        jabatan1 = new javax.swing.JComboBox();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        jLabel48 = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        add = new javax.swing.JButton();
        Layout_laporan = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabelPendapatan = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabelPengeluaran = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txt_totalPendapatan = new javax.swing.JLabel();
        txt_totalPengeluaran = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        txt_labaKotor = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_labaBersih = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        passwordProfile = new javax.swing.JPanel();
        passwordSave1 = new javax.swing.JButton();
        passwordCancel1 = new javax.swing.JButton();
        kolomPassword1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        passwordBaru = new javax.swing.JPasswordField();
        passwordLama = new javax.swing.JPasswordField();
        Layout_dataPelanggan = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pelangganTable = new javax.swing.JTable();
        Layout_listDiskon = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelListDiskon = new javax.swing.JTable();
        Layout_riwayatBarang = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        riwayatBarangTampil = new javax.swing.JButton();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(922, 534));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Side_panel.setBackground(new java.awt.Color(54, 33, 89));
        Side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dataPegawai.setBackground(new java.awt.Color(64, 43, 100));
        btn_dataPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dataPegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dataPegawaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dataPegawaiMousePressed(evt);
            }
        });
        btn_dataPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/staff_15px.png"))); // NOI18N
        btn_dataPegawai.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Data Pegawai");
        btn_dataPegawai.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 40));

        btn_riwayatPegawai.setBackground(new java.awt.Color(64, 43, 100));
        btn_riwayatPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatPegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatPegawaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayatPegawaiMousePressed(evt);
            }
        });
        btn_riwayatPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_clock_15px.png"))); // NOI18N
        btn_riwayatPegawai.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Riwayat Pegawai");
        btn_riwayatPegawai.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_riwayatPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 40));

        btn_informasiBarang.setBackground(new java.awt.Color(64, 43, 100));
        btn_informasiBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_informasiBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_informasiBarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_informasiBarangMousePressed(evt);
            }
        });
        btn_informasiBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/product_management_15px.png"))); // NOI18N
        btn_informasiBarang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Informasi Barang");
        btn_informasiBarang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_informasiBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 40));

        btn_tambahPegawai.setBackground(new java.awt.Color(64, 43, 100));
        btn_tambahPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahPegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahPegawaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahPegawaiMousePressed(evt);
            }
        });
        btn_tambahPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/add_user_group_man_man_15px.png"))); // NOI18N
        btn_tambahPegawai.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Tambah Pegawai");
        btn_tambahPegawai.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_tambahPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, 40));

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

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/icons8_admin_settings_male_15px.png"))); // NOI18N
        btn_profile.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Profile");
        btn_profile.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 40));

        btn_laporan.setBackground(new java.awt.Color(64, 43, 100));
        btn_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_laporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_laporanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_laporanMousePressed(evt);
            }
        });
        btn_laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/document_15px.png"))); // NOI18N
        btn_laporan.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Laporan");
        btn_laporan.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 40));

        btn_logPegawai.setBackground(new java.awt.Color(64, 43, 100));
        btn_logPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logPegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logPegawaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logPegawaiMousePressed(evt);
            }
        });
        btn_logPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/document_15px.png"))); // NOI18N
        btn_logPegawai.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setText("Log Pegawai");
        btn_logPegawai.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_logPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, 40));

        btn_keperluanUsaha.setBackground(new java.awt.Color(64, 43, 100));
        btn_keperluanUsaha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_keperluanUsahaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_keperluanUsahaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_keperluanUsahaMousePressed(evt);
            }
        });
        btn_keperluanUsaha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/coins_15px.png"))); // NOI18N
        btn_keperluanUsaha.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setText("Keperluan Usaha");
        btn_keperluanUsaha.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_keperluanUsaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 40));

        btn_dataPelanggan.setBackground(new java.awt.Color(64, 43, 100));
        btn_dataPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dataPelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dataPelangganMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dataPelangganMousePressed(evt);
            }
        });
        btn_dataPelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/staff_15px.png"))); // NOI18N
        btn_dataPelanggan.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 40));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setText("Data Pelanggan");
        btn_dataPelanggan.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 127, 40));

        Side_panel.add(btn_dataPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 40));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 730, 100));

        Layout_logPegawai.setBackground(new java.awt.Color(255, 255, 255));
        Layout_logPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_log.setModel(new javax.swing.table.DefaultTableModel(
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
                "DATE", "Jabatan", "Aktivitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
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
        jScrollPane15.setViewportView(tabel_log);

        Layout_logPegawai.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 140, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nama.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 310, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nama  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("No. telp :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        no_telp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        no_telp.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel2.add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 310, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Email   :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 310, 30));

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

        Layout_riwayatKeperluan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayatKeperluan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelRiwayatKeperluan.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nama Keperluan", "DATE", "Harga", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelRiwayatKeperluan.setGridColor(new java.awt.Color(240, 240, 240));
        tabelRiwayatKeperluan.setRowHeight(30);
        tabelRiwayatKeperluan.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tabelRiwayatKeperluan);

        Layout_riwayatKeperluan.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 290));

        btn_hapusriwayat.setText("Hapus");
        btn_hapusriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusriwayatActionPerformed(evt);
            }
        });
        Layout_riwayatKeperluan.add(btn_hapusriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 90, -1));

        Layout_listBarang.setBackground(new java.awt.Color(255, 255, 255));
        Layout_listBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane6.setViewportView(tabelListBarang);

        Layout_listBarang.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 690, 260));

        btn_hapusList.setText("Hapus");
        btn_hapusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusListActionPerformed(evt);
            }
        });
        Layout_listBarang.add(btn_hapusList, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 90, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/images/search_20px.png"))); // NOI18N
        Layout_listBarang.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));

        tf_search.setToolTipText("");
        tf_search.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        Layout_listBarang.add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 30));

        Layout_button5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inputKeperluan.setBackground(new java.awt.Color(64, 43, 100));
        btn_inputKeperluan.setForeground(new java.awt.Color(250, 250, 250));
        btn_inputKeperluan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inputKeperluanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inputKeperluanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_inputKeperluanMousePressed(evt);
            }
        });
        btn_inputKeperluan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(240, 240, 240));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Input Keperluan");
        btn_inputKeperluan.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        Layout_button5.add(btn_inputKeperluan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 30));

        btn_riwayatKeperluan.setBackground(new java.awt.Color(64, 43, 100));
        btn_riwayatKeperluan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatKeperluanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatKeperluanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayatKeperluanMousePressed(evt);
            }
        });
        btn_riwayatKeperluan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(240, 240, 240));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Riwayat");
        btn_riwayatKeperluan.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_button5.add(btn_riwayatKeperluan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 90, 30));

        Layout_rincianInput.setBackground(new java.awt.Color(255, 255, 255));
        Layout_rincianInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel60.setText("Total Harga : Rp.");
        Layout_rincianInput.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel61.setText("Tanggal Input :");
        Layout_rincianInput.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 30));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel62.setText("ID Karyawan :");
        Layout_rincianInput.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel63.setText("Nama Karyawan :");
        Layout_rincianInput.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        txt_totalHarga1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianInput.add(txt_totalHarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 120, 30));

        txt_tanggal1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianInput.add(txt_tanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 30));

        txt_namaKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianInput.add(txt_namaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 250, 30));

        txt_idKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianInput.add(txt_idKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 30));

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
        jScrollPane13.setViewportView(tabelRincianInput);

        Layout_rincianInput.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 700, 220));

        Layout_riwayatInputBarang.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayatInputBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_riwayatPembelian.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID Restok", "ID Karyawan", "DATE", "Total Pembelian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_riwayatPembelian.setGridColor(new java.awt.Color(240, 240, 240));
        tabel_riwayatPembelian.setRowHeight(50);
        tabel_riwayatPembelian.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabel_riwayatPembelian);
        if (tabel_riwayatPembelian.getColumnModel().getColumnCount() > 0) {
            tabel_riwayatPembelian.getColumnModel().getColumn(3).setResizable(false);
        }

        Layout_riwayatInputBarang.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 690, 280));

        rincianInput.setText("Rincian");
        rincianInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianInputActionPerformed(evt);
            }
        });
        Layout_riwayatInputBarang.add(rincianInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 310, 90, -1));

        Layout_rincianTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_rincianTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel56.setText("Total Harga : Rp.");
        Layout_rincianTransaksi.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 130, 30));

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
        jScrollPane10.setViewportView(tabelRincian);

        Layout_rincianTransaksi.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 690, 220));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel57.setText("Tanggal Transaksi :");
        Layout_rincianTransaksi.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel58.setText("ID Kasir :");
        Layout_rincianTransaksi.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel59.setText("Nama Kasir :");
        Layout_rincianTransaksi.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        txt_totalHarga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianTransaksi.add(txt_totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 120, 30));

        txt_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianTransaksi.add(txt_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 30));

        txt_namaKasir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianTransaksi.add(txt_namaKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 280, 30));

        txt_idKasir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Layout_rincianTransaksi.add(txt_idKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, 30));

        Layout_riwayatTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_riwayatTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_riwayatTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Kasir", "ID Pelanggan", "DATE", "Total Belanja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane8.setViewportView(tabel_riwayatTransaksi);

        Layout_riwayatTransaksi.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 280));

        rincianTransaksi.setText("Rincian");
        rincianTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianTransaksiActionPerformed(evt);
            }
        });
        Layout_riwayatTransaksi.add(rincianTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 90, -1));

        Layout_button2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_transaksi.setBackground(new java.awt.Color(64, 43, 100));
        btn_transaksi.setForeground(new java.awt.Color(250, 250, 250));
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

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(240, 240, 240));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Transaksi");
        btn_transaksi.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_button2.add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 30));

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

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(240, 240, 240));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Input Barang");
        btn_inputBarang.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        Layout_button2.add(btn_inputBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 30));

        Layout_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_kasir.setBackground(new java.awt.Color(64, 43, 100));
        btn_kasir.setForeground(new java.awt.Color(250, 250, 250));
        btn_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_kasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_kasirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_kasirMousePressed(evt);
            }
        });
        btn_kasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(240, 240, 240));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Kasir");
        btn_kasir.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        Layout_button.add(btn_kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        btn_karyawan.setBackground(new java.awt.Color(64, 43, 100));
        btn_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_karyawanMousePressed(evt);
            }
        });
        btn_karyawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Karyawan");
        btn_karyawan.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        Layout_button.add(btn_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 30));

        Layout_button3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_listBarang.setBackground(new java.awt.Color(64, 43, 100));
        btn_listBarang.setForeground(new java.awt.Color(250, 250, 250));
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

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(240, 240, 240));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("List Barang");
        btn_listBarang.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        Layout_button3.add(btn_listBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 30));

        btn_listDiskonPoin.setBackground(new java.awt.Color(64, 43, 100));
        btn_listDiskonPoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_listDiskonPoinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_listDiskonPoinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_listDiskonPoinMousePressed(evt);
            }
        });
        btn_listDiskonPoin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("List Diskon & Poin");
        btn_listDiskonPoin.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        Layout_button3.add(btn_listDiskonPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        Layout_inputKeperluan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_inputKeperluan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prosesKeperluan.setText("Proses");
        btn_prosesKeperluan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesKeperluanActionPerformed(evt);
            }
        });
        Layout_inputKeperluan.add(btn_prosesKeperluan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        tabelKeperluanUsaha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Nama Keperluan", "Harga", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelKeperluanUsaha.setGridColor(new java.awt.Color(240, 240, 240));
        tabelKeperluanUsaha.setRowHeight(20);
        jScrollPane9.setViewportView(tabelKeperluanUsaha);
        if (tabelKeperluanUsaha.getColumnModel().getColumnCount() > 0) {
            tabelKeperluanUsaha.getColumnModel().getColumn(0).setResizable(false);
            tabelKeperluanUsaha.getColumnModel().getColumn(0).setPreferredWidth(350);
            tabelKeperluanUsaha.getColumnModel().getColumn(1).setResizable(false);
            tabelKeperluanUsaha.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelKeperluanUsaha.getColumnModel().getColumn(2).setResizable(false);
            tabelKeperluanUsaha.getColumnModel().getColumn(3).setResizable(false);
            tabelKeperluanUsaha.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        Layout_inputKeperluan.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 240));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Total Pengeluaran :   Rp.");
        Layout_inputKeperluan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 170, 30));

        txt_totalKeperluan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Layout_inputKeperluan.add(txt_totalKeperluan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 30));

        removeRow.setBackground(new java.awt.Color(255, 255, 255));
        removeRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        removeRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeRowMouseClicked(evt);
            }
        });
        removeRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setForeground(new java.awt.Color(50, 50, 50));
        jLabel49.setText("- remove");
        removeRow.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Layout_inputKeperluan.add(removeRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 30));

        addRow.setBackground(new java.awt.Color(255, 255, 255));
        addRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 20, true));
        addRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRowMouseClicked(evt);
            }
        });
        addRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setForeground(new java.awt.Color(50, 50, 50));
        jLabel53.setText("+ add");
        addRow.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        Layout_inputKeperluan.add(addRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 30));

        Layout_button4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Layout_button4.add(bulanLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        bulanTahun.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Layout_button4.add(bulanTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 30));

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
            kasirTable.getColumnModel().getColumn(2).setResizable(false);
            kasirTable.getColumnModel().getColumn(2).setHeaderValue("Tanggal Masuk");
        }

        Layout_dataKasir.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 290));

        dataKasirTampilkan.setText("Tampilkan");
        Layout_dataKasir.add(dataKasirTampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 110, 30));

        dataKasirHapus.setText("Hapus");
        dataKasirHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKasirHapusActionPerformed(evt);
            }
        });
        Layout_dataKasir.add(dataKasirHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, 30));

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

        Layout_dataKaryawan.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 290));

        dataKaryawanHapus.setText("Hapus");
        dataKaryawanHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKaryawanHapusActionPerformed(evt);
            }
        });
        Layout_dataKaryawan.add(dataKaryawanHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, 30));

        dataKaryawanTampilkan.setText("Tampilkan");
        Layout_dataKaryawan.add(dataKaryawanTampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 110, 30));

        Layout_tambahPekerja.setBackground(new java.awt.Color(255, 255, 255));
        Layout_tambahPekerja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_img.setBackground(new java.awt.Color(220, 220, 220));
        Layout_tambahPekerja.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nama1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 340, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Nama  :");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("No. telp :");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        no_telp1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        no_telp1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(no_telp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 340, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Email   :");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Password :");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Jabatan :");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Username :");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 340, 30));

        username1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        username1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 340, 30));

        jabatan1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jabatan1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih jabatan --", "Kasir", "Karyawan" }));
        jPanel4.add(jabatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 340, 30));

        password1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 340, 30));

        password2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jPanel4.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 340, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Ulangi Password :");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 30));

        Layout_tambahPekerja.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 390));

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

        Layout_laporan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelPendapatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama", "Total"
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
        tabelPendapatan.setGridColor(new java.awt.Color(240, 240, 240));
        tabelPendapatan.setRowHeight(30);
        tabelPendapatan.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tabelPendapatan);
        if (tabelPendapatan.getColumnModel().getColumnCount() > 0) {
            tabelPendapatan.getColumnModel().getColumn(0).setResizable(false);
            tabelPendapatan.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelPendapatan.getColumnModel().getColumn(1).setResizable(false);
        }

        Layout_laporan.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 240, 260));

        tabelPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama", "Total"
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
        tabelPengeluaran.setGridColor(new java.awt.Color(240, 240, 240));
        tabelPengeluaran.setRowHeight(30);
        tabelPengeluaran.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tabelPengeluaran);
        if (tabelPengeluaran.getColumnModel().getColumnCount() > 0) {
            tabelPengeluaran.getColumnModel().getColumn(0).setResizable(false);
            tabelPengeluaran.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelPengeluaran.getColumnModel().getColumn(1).setResizable(false);
        }

        Layout_laporan.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 260));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tabel Pendapatan");
        Layout_laporan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel40.setText("Total Pendapatan :");
        Layout_laporan.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel47.setText("Tabel Pengeluaran");
        Layout_laporan.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        Layout_laporan.add(txt_totalPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 100, 40));
        Layout_laporan.add(txt_totalPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel50.setText("Total Pengeluaran :");
        Layout_laporan.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 40, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Laba Kotor");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        txt_labaKotor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_labaKotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txt_labaKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        Layout_laporan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 170, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 40, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_labaBersih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_labaBersih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(txt_labaBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Laba Bersih");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        Layout_laporan.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 170, 80));

        passwordProfile.setBackground(new java.awt.Color(255, 255, 255));
        passwordProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordSave1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordSave1.setText("Save");
        passwordSave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordSave1MouseClicked(evt);
            }
        });
        passwordProfile.add(passwordSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        passwordCancel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordCancel1.setText("Cancel");
        passwordCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordCancel1MouseClicked(evt);
            }
        });
        passwordProfile.add(passwordCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        kolomPassword1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Password Lama  :");
        kolomPassword1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Password Baru   :");
        kolomPassword1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 30));
        kolomPassword1.add(passwordBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 330, 30));
        kolomPassword1.add(passwordLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 30));

        passwordProfile.add(kolomPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 280));

        Layout_dataPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        Layout_dataPelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pelangganTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Pelanggan", "No Telp", "Email", "Poin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pelangganTable.setGridColor(new java.awt.Color(240, 240, 240));
        pelangganTable.setRowHeight(50);
        pelangganTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(pelangganTable);
        if (pelangganTable.getColumnModel().getColumnCount() > 0) {
            pelangganTable.getColumnModel().getColumn(0).setResizable(false);
            pelangganTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            pelangganTable.getColumnModel().getColumn(1).setResizable(false);
            pelangganTable.getColumnModel().getColumn(2).setResizable(false);
            pelangganTable.getColumnModel().getColumn(2).setHeaderValue("Tanggal Masuk");
            pelangganTable.getColumnModel().getColumn(3).setResizable(false);
            pelangganTable.getColumnModel().getColumn(4).setResizable(false);
        }

        Layout_dataPelanggan.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 380));

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
        jScrollPane7.setViewportView(tabelListDiskon);

        Layout_listDiskon.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 300));

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

        Layout_riwayatBarang.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 340));

        riwayatBarangTampil.setText("Tampilkan");
        Layout_riwayatBarang.add(riwayatBarangTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 110, -1));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layout_dataKasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_tambahPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 43, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_listBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(Layout_riwayatInputBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button4, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_inputKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button5, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincianTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_rincianInput, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Layout_riwayatKeperluan, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addComponent(Layout_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Layout_dataKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_riwayatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 111, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(Layout_dataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(editProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_tambahPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(passwordProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(lihatProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 83, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 488, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_dataPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 97, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 488, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(Layout_listBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(Layout_listDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(Layout_riwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(Layout_riwayatInputBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 489, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(Layout_inputKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(Layout_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(97, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_button5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 489, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(Layout_rincianTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(Layout_rincianInput, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(Layout_riwayatKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addComponent(Layout_logPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_logPegawai, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(editProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatKeperluan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_listBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_rincianInput, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatInputBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_rincianTransaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatTransaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_inputKeperluan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_button4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(lihatProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataKasir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_tambahPekerja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_laporan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(passwordProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_dataPelanggan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_listDiskon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_riwayatBarang, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bg.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 730, 420));

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahPegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPegawaiMouseEntered
        setColor(btn_tambahPegawai);
    }//GEN-LAST:event_btn_tambahPegawaiMouseEntered

    private void btn_tambahPegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPegawaiMouseExited
        if(!"btn_tambahPekerja".equals(layoutActive)){
            resetColor(btn_tambahPegawai);
        }
    }//GEN-LAST:event_btn_tambahPegawaiMouseExited

    private void btn_tambahPegawaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahPegawaiMousePressed
        switchPanels(Layout_tambahPekerja);
        layoutActive="btn_tambahPekerja";
        resetLayoutInactive(btn_tambahPegawai);
        txt_Tittle.setText("Tambah Pegawai");
    }//GEN-LAST:event_btn_tambahPegawaiMousePressed

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

    private void btn_dataPegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPegawaiMouseEntered
        setColor(btn_dataPegawai);
    }//GEN-LAST:event_btn_dataPegawaiMouseEntered

    private void btn_dataPegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPegawaiMouseExited
        if(!"btn_dataPegawai".equals(layoutActive)){
            resetColor(btn_dataPegawai);
        }
    }//GEN-LAST:event_btn_dataPegawaiMouseExited

    private void btn_dataPegawaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPegawaiMousePressed
        switchPanels(Layout_dataKasir);
        layeredPane.add(Layout_button);
        layoutActive="btn_dataPegawai";
        resetLayoutInactive(btn_dataPegawai);
        buttonActive="btn_kasir";
        resetButtonInactive(btn_kasir);
        
        txt_Tittle.setText("Data Kasir");
        setTableData("Kasir",kasirTable);
    }//GEN-LAST:event_btn_dataPegawaiMousePressed

    private void btn_riwayatPegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatPegawaiMouseEntered
        setColor(btn_riwayatPegawai);
    }//GEN-LAST:event_btn_riwayatPegawaiMouseEntered

    private void btn_riwayatPegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatPegawaiMouseExited
        if(!"btn_riwayatPegawai".equals(layoutActive)){
            resetColor(btn_riwayatPegawai);
        }
    }//GEN-LAST:event_btn_riwayatPegawaiMouseExited

    private void btn_riwayatPegawaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatPegawaiMousePressed
        switchPanels(Layout_riwayatTransaksi);
        layeredPane.add(Layout_button2);
        layoutActive="btn_riwayatPegawai";
        resetLayoutInactive(btn_riwayatPegawai);
        buttonActive="btn_transaksi";
        resetButtonInactive(btn_transaksi);
        txt_Tittle.setText("Riwayat Transaksi");
        setTableTransaksi(tabel_riwayatTransaksi);
    }//GEN-LAST:event_btn_riwayatPegawaiMousePressed

    private void editDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataMouseClicked
        switchPanels(editProfile);
        akun_pegawai admin = new akun_pegawai(idAkun);
        nama.setText(admin.nama);
        no_telp.setText(admin.noTelp);
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
        switchPanels(lihatProfile);
        layoutActive="btn_profile";
        resetLayoutInactive(btn_profile);
        txt_Tittle.setText("Profile");

        akun_pegawai admin = new akun_pegawai(idAkun);
        textNama.setText(admin.nama);
        textNoTelp.setText(admin.noTelp);
        textEmail.setText(admin.email);
        textJabatan.setText(admin.jabatan);
    }//GEN-LAST:event_btn_profileMousePressed

    private void backEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEditProfileMouseClicked
        switchPanels(lihatProfile);
        akun_pegawai admin = new akun_pegawai(idAkun);
        textNama.setText(admin.nama);
        textNoTelp.setText(admin.noTelp);
        textEmail.setText(admin.email);
        textJabatan.setText(admin.jabatan);
    }//GEN-LAST:event_backEditProfileMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(password1.getText().equals(password2.getText())){
            try{
                sql="SELECT idJabatan FROM jabatan WHERE namaJabatan='"+jabatan1.getSelectedItem()+"'";
                rs=stat.executeQuery(sql);
                rs.next();
                int jabatan=rs.getInt(1);

                sql="INSERT INTO akun (nama,noTelp,email,idJabatan,foto,tglMasuk,username,password) Values('"+nama1.getText()+"','"+no_telp1.getText()+"','"+email1.getText()+"','"+jabatan+"',NULL,CURDATE(),'"+username1.getText()+"',MD5('"+password1.getText()+"'))";
                stat.executeUpdate(sql);
                
                sql="SELECT idAkun,idJabatan FROM akun ORDER BY idAkun DESC LIMIT 1";
                rs=stat.executeQuery(sql);
                rs.next();
                int idPegawaiBaru=rs.getInt(1);
                int idJabatanBaru=rs.getInt(2);
                
                String aktivitas=jabatan1.getSelectedItem()+" baru terdaftar dengan id "+idPegawaiBaru;
                sql="INSERT INTO log values(null,"+idJabatanBaru+",'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Berhasil menambah data");
                kosongkan_form();
            }catch(Exception e){
                System.out.print(e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Password tidak sesuai");
            password1.setText("");
            password2.setText("");
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
        String error="";
        if(nama.getText().equals(""))error+="Nama tidak boleh kosong\n";
        if(no_telp.getText().equals(""))error+="No.Telp tidak boleh kosong\n";
        if(email.getText().equals(""))error+="Email tidak boleh kosong\n";
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null, error);
        }else{
            try{
                sql="UPDATE akun SET nama='"+nama.getText()+"',noTelp='"+no_telp.getText()+"',email='"+email.getText()+"',foto=NULL WHERE idAkun='"+idAkun+"'";
                stat.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
            }catch(Exception e){
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_saveEditProfileMouseClicked

    private void dataKasirHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKasirHapusActionPerformed
        int baris = kasirTable.getSelectedRow();
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus data ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        if(x==0){
            try{
                sql="DELETE FROM akun WHERE idAkun='"+kasirTable.getValueAt(baris, 0)+"'";
                stat.execute(sql);
                
                String aktivitas="Kasir id "+kasirTable.getValueAt(baris, 0)+" telah dihapus";
                sql="INSERT INTO log values(null,3,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                setTableData("Kasir",kasirTable);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_dataKasirHapusActionPerformed

    private void passwordSave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSave1MouseClicked
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
    }//GEN-LAST:event_passwordSave1MouseClicked

    private void passwordCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordCancel1MouseClicked
        switchPanels(lihatProfile);
        akun_pegawai manager = new akun_pegawai(idAkun);
        textNama.setText(manager.nama);
        textNoTelp.setText(manager.noTelp);
        textEmail.setText(manager.email);
        textJabatan.setText(manager.jabatan);
    }//GEN-LAST:event_passwordCancel1MouseClicked

    private void dataKaryawanHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKaryawanHapusActionPerformed
        int baris = karyawanTable.getSelectedRow();
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus data ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        if(x==0){
            try{
                sql="DELETE FROM akun WHERE idAkun='"+karyawanTable.getValueAt(baris, 0)+"'";
                stat.execute(sql);
                
                String aktivitas="Karyawan id "+karyawanTable.getValueAt(baris, 0)+" telah dihapus";
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                setTableData("Karyawan",karyawanTable);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_dataKaryawanHapusActionPerformed

    private void btn_laporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseEntered
        setColor(btn_laporan);
    }//GEN-LAST:event_btn_laporanMouseEntered

    private void btn_laporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseExited
        if(!"btn_laporan".equals(layoutActive)){
            resetColor(btn_laporan);
        }
    }//GEN-LAST:event_btn_laporanMouseExited

    private void btn_laporanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMousePressed
        layoutActive="btn_laporan";
        resetLayoutInactive(btn_laporan);
        switchPanels(Layout_laporan);
        layeredPane.add(Layout_button4);
        txt_Tittle.setText("Laporan");
        opening();
    }//GEN-LAST:event_btn_laporanMousePressed

    private void btn_logPegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logPegawaiMouseEntered
        setColor(btn_logPegawai);
    }//GEN-LAST:event_btn_logPegawaiMouseEntered

    private void btn_logPegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logPegawaiMouseExited
        if(!"btn_logPegawai".equals(layoutActive)){
            resetColor(btn_logPegawai);
        }
    }//GEN-LAST:event_btn_logPegawaiMouseExited

    private void btn_logPegawaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logPegawaiMousePressed
        layoutActive="btn_logPegawai";
        resetLayoutInactive(btn_logPegawai);
        txt_Tittle.setText("Log Pegawai");
        switchPanels(Layout_logPegawai);
        setLog();
    }//GEN-LAST:event_btn_logPegawaiMousePressed

    private void btn_keperluanUsahaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keperluanUsahaMouseEntered
        setColor(btn_keperluanUsaha);
    }//GEN-LAST:event_btn_keperluanUsahaMouseEntered

    private void btn_keperluanUsahaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keperluanUsahaMouseExited
        if(!"btn_keperluanUsaha".equals(layoutActive)){
            resetColor(btn_keperluanUsaha);
        }
    }//GEN-LAST:event_btn_keperluanUsahaMouseExited

    private void btn_keperluanUsahaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keperluanUsahaMousePressed
        layoutActive="btn_keperluanUsaha";
        resetLayoutInactive(btn_keperluanUsaha);
        buttonActive="btn_inputKeperluan";
        resetButtonInactive(btn_inputKeperluan);
        switchPanels(Layout_inputKeperluan);
        layeredPane.add(Layout_button5);
        txt_Tittle.setText("Keperluan Usaha");
        addListenerKeperluanUsaha();
        
    }//GEN-LAST:event_btn_keperluanUsahaMousePressed

    private void btn_kasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kasirMouseEntered
        setColor(btn_kasir);
    }//GEN-LAST:event_btn_kasirMouseEntered

    private void btn_kasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kasirMouseExited
        if(!"btn_kasir".equals(buttonActive)){
            resetColor(btn_kasir);
        }
    }//GEN-LAST:event_btn_kasirMouseExited

    private void btn_kasirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kasirMousePressed
        switchPanels(Layout_dataKasir);
        layeredPane.add(Layout_button);
        buttonActive="btn_kasir";
        resetButtonInactive(btn_kasir);
        txt_Tittle.setText("Data Kasir");
        setTableData("Kasir",kasirTable);
    }//GEN-LAST:event_btn_kasirMousePressed

    private void btn_karyawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseEntered
        setColor(btn_karyawan);
    }//GEN-LAST:event_btn_karyawanMouseEntered

    private void btn_karyawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseExited
        if(!"btn_karyawan".equals(buttonActive)){
            resetColor(btn_karyawan);
        }
    }//GEN-LAST:event_btn_karyawanMouseExited

    private void btn_karyawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMousePressed
        switchPanels(Layout_dataKaryawan);
        layeredPane.add(Layout_button);
        buttonActive="btn_karyawan";
        resetButtonInactive(btn_karyawan);
        txt_Tittle.setText("Data Karyawan");
        setTableData("Karyawan",karyawanTable);
    }//GEN-LAST:event_btn_karyawanMousePressed

    private void btn_informasiBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_informasiBarangMousePressed
        
        switchPanels(Layout_listBarang);
        layeredPane.add(Layout_button3);
        layoutActive="btn_informasiBarang";
        resetLayoutInactive(btn_informasiBarang);
        buttonActive="btn_listBarang";
        resetButtonInactive(btn_listBarang);

        txt_Tittle.setText("List Barang");
        setTableData(tabelListBarang);
        tabelListBarang.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_btn_informasiBarangMousePressed

    private void btn_informasiBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_informasiBarangMouseExited
        if(!"btn_informasiBarang".equals(layoutActive)){
            resetColor(btn_informasiBarang);
        }
    }//GEN-LAST:event_btn_informasiBarangMouseExited

    private void btn_informasiBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_informasiBarangMouseEntered
        setColor(btn_informasiBarang);
    }//GEN-LAST:event_btn_informasiBarangMouseEntered

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        setColor(btn_transaksi);
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        if(!"btn_transaksi".equals(buttonActive)){
            resetColor(btn_karyawan);
        }
    }//GEN-LAST:event_btn_transaksiMouseExited

    private void btn_transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMousePressed
        switchPanels(Layout_riwayatTransaksi);
        layeredPane.add(Layout_button2);
        buttonActive="btn_transaksi";
        resetButtonInactive(btn_transaksi);
        
        txt_Tittle.setText("Riwayat Transaksi");
        setTableTransaksi(tabel_riwayatTransaksi);
    }//GEN-LAST:event_btn_transaksiMousePressed

    private void btn_inputBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMouseEntered
        setColor(btn_inputBarang);
    }//GEN-LAST:event_btn_inputBarangMouseEntered

    private void btn_inputBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMouseExited
        if(!"btn_inputBarang".equals(buttonActive)){
            resetColor(btn_inputBarang);
        }
    }//GEN-LAST:event_btn_inputBarangMouseExited

    private void btn_inputBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputBarangMousePressed
        switchPanels(Layout_riwayatInputBarang);
        layeredPane.add(Layout_button2);
        txt_Tittle.setText("Riwayat Input Barang");
        tabel_riwayatPembelian.setAutoCreateRowSorter(true);
        buttonActive="btn_inputBarang";
        resetButtonInactive(btn_inputBarang);
        
        setTableRiwayat(tabel_riwayatPembelian);
    }//GEN-LAST:event_btn_inputBarangMousePressed

    private void btn_dataPelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPelangganMouseEntered
        setColor(btn_dataPelanggan);
    }//GEN-LAST:event_btn_dataPelangganMouseEntered

    private void btn_dataPelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPelangganMouseExited
        if(!"btn_dataPelanggan".equals(layoutActive)){
            resetColor(btn_dataPelanggan);
        }
    }//GEN-LAST:event_btn_dataPelangganMouseExited

    private void btn_dataPelangganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPelangganMousePressed
        layoutActive="btn_dataPelanggan";
        resetLayoutInactive(btn_dataPelanggan);
        switchPanels(Layout_dataPelanggan);
        layoutActive="btn_dataPelanggan";
        txt_Tittle.setText("Data Pelanggan");
        setTablePelanggan();
    }//GEN-LAST:event_btn_dataPelangganMousePressed

    private void btn_listBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMouseEntered
        setColor(btn_listBarang);
    }//GEN-LAST:event_btn_listBarangMouseEntered

    private void btn_listBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMouseExited
        if(!"btn_listBarang".equals(buttonActive)){
            resetColor(btn_listBarang);
        }
    }//GEN-LAST:event_btn_listBarangMouseExited

    private void btn_listBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listBarangMousePressed
        switchPanels(Layout_listBarang);
        layeredPane.add(Layout_button3);
        setTableData(tabelListBarang);
        tabelListBarang.setAutoCreateRowSorter(true);
        
        buttonActive="btn_listBarang";
        resetButtonInactive(btn_listBarang);
        txt_Tittle.setText("List Barang");
    }//GEN-LAST:event_btn_listBarangMousePressed

    private void btn_listDiskonPoinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonPoinMouseEntered
        setColor(btn_listDiskonPoin);
    }//GEN-LAST:event_btn_listDiskonPoinMouseEntered

    private void btn_listDiskonPoinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonPoinMouseExited
        if(!"btn_listDiskonPoin".equals(buttonActive)){
            resetColor(btn_listDiskonPoin);
        }
    }//GEN-LAST:event_btn_listDiskonPoinMouseExited

    private void btn_listDiskonPoinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listDiskonPoinMousePressed
        switchPanels(Layout_listDiskon);
        layeredPane.add(Layout_button3);
        buttonActive="btn_listDiskonPoin";
        resetButtonInactive(btn_listDiskonPoin);
        setTableDataDiskon(tabelListDiskon);
        txt_Tittle.setText("List Diskon & Poin");
    }//GEN-LAST:event_btn_listDiskonPoinMousePressed

    private void btn_hapusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusListActionPerformed
        int baris = tabelListBarang.getSelectedRow();
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus barang ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

        if(x==0){
            try{
                sql="DELETE FROM barang WHERE idBarang='"+tabelListBarang.getValueAt(baris, 0)+"'";
                stat.execute(sql);
                
                String aktivitas="Barang id "+tabelListBarang.getValueAt(baris, 0)+" telah dihapus";
                sql="INSERT INTO log values(null,2,'"+idAkun+"','"+aktivitas+"',CURDATE())";
                stat.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                setTableData(tabelListBarang);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_hapusListActionPerformed

    private void btn_prosesKeperluanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesKeperluanActionPerformed
        if(txt_totalKeperluan.getText()!="" && Integer.parseInt(txt_totalKeperluan.getText().toString())!=0){
            try{
                for(int i=0;tabelKeperluanUsaha.getValueAt(i, 0)!=null;i++){
                    sql="INSERT INTO keperluan values (NULL,'"+tabelKeperluanUsaha.getValueAt(i, 0)+"',CURDATE(),'"+tabelKeperluanUsaha.getValueAt(i, 1)+"','" + tabelKeperluanUsaha.getValueAt(i, 2) + "','"+tabelKeperluanUsaha.getValueAt(i, 3)+"')";
                    stat.executeUpdate(sql);
                }

                JOptionPane.showMessageDialog(null, "Input Keperluan Berhasil");
                DefaultTableModel dtm = (DefaultTableModel) tabelKeperluanUsaha.getModel();
                dtm.setRowCount(0);
                dtm.setRowCount(8);
                txt_totalKeperluan.setText("");
            }catch(Exception e){
                System.out.print(e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Masukkan keperluan terlebih dahulu");
        }
    }//GEN-LAST:event_btn_prosesKeperluanActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        String[] options = {"Ya","Tidak"};
        int x=JOptionPane.showOptionDialog(null,"Yakin ingin keluar dari program ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void removeRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeRowMouseClicked
        int row=tabelKeperluanUsaha.getSelectedRow();
        if(row!=-1){
            ((DefaultTableModel)tabelKeperluanUsaha.getModel()).removeRow(row);
            int totalPembelian=0;
            for(int i=0;tabelKeperluanUsaha.getValueAt(i, 3)!=null;i++){
                totalPembelian+=Integer.parseInt(tabelKeperluanUsaha.getValueAt(i,3).toString());
            }
            txt_totalKeperluan.setText(String.valueOf(totalPembelian));
        }else{
            JOptionPane.showMessageDialog(null, "Pilih belanjaan yang ingin dihapus terlebih dahulu");
        }
    }//GEN-LAST:event_removeRowMouseClicked

    private void addRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRowMouseClicked
        ((DefaultTableModel)tabelKeperluanUsaha.getModel()).addRow(new Object[]{"","","",""});
    }//GEN-LAST:event_addRowMouseClicked

    private void btn_inputKeperluanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputKeperluanMouseEntered
        setColor(btn_inputKeperluan);
    }//GEN-LAST:event_btn_inputKeperluanMouseEntered

    private void btn_inputKeperluanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputKeperluanMouseExited
        if(!"btn_inputKeperluan".equals(buttonActive)){
            resetColor(btn_inputKeperluan);
        }
    }//GEN-LAST:event_btn_inputKeperluanMouseExited

    private void btn_inputKeperluanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inputKeperluanMousePressed
        buttonActive="btn_inputKeperluan";
        resetButtonInactive(btn_inputKeperluan);
        switchPanels(Layout_inputKeperluan);
        layeredPane.add(Layout_button5);
    }//GEN-LAST:event_btn_inputKeperluanMousePressed

    private void btn_riwayatKeperluanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatKeperluanMouseEntered
        setColor(btn_riwayatKeperluan);
    }//GEN-LAST:event_btn_riwayatKeperluanMouseEntered

    private void btn_riwayatKeperluanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatKeperluanMouseExited
        if(!"btn_riwayatKeperluan".equals(buttonActive)){
            resetColor(btn_riwayatKeperluan);
        }
    }//GEN-LAST:event_btn_riwayatKeperluanMouseExited

    private void btn_riwayatKeperluanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatKeperluanMousePressed
        buttonActive="btn_riwayatKeperluan";
        resetButtonInactive(btn_riwayatKeperluan);
        switchPanels(Layout_riwayatKeperluan);
        layeredPane.add(Layout_button5);
        setTabelKeperluan();
    }//GEN-LAST:event_btn_riwayatKeperluanMousePressed

    private void rincianTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianTransaksiActionPerformed
        try{
            int row=tabel_riwayatTransaksi.getSelectedRow();
            if(row!=-1){
                setRincianTransaksi(Integer.parseInt(tabel_riwayatTransaksi.getValueAt(row,0).toString()));
                setTabelRincianTransaksi(Integer.parseInt(tabel_riwayatTransaksi.getValueAt(row,0).toString()));
                switchPanels(Layout_rincianTransaksi);
                layeredPane.add(Layout_button2);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Riwayat terlebih dahulu");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rincianTransaksiActionPerformed

    private void rincianInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianInputActionPerformed
        try{
            int row=tabel_riwayatPembelian.getSelectedRow();
            if(row!=-1){
                setRincianInput(Integer.parseInt(tabel_riwayatPembelian.getValueAt(row,0).toString()));
                setTabelRincianInput(Integer.parseInt(tabel_riwayatPembelian.getValueAt(row,0).toString()));
                switchPanels(Layout_rincianInput);
                layeredPane.add(Layout_button2);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Riwayat terlebih dahulu");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rincianInputActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        setTableData(tabelListBarang);
    }//GEN-LAST:event_tf_searchKeyReleased

    private void btn_hapusriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusriwayatActionPerformed
        int baris = tabelRiwayatKeperluan.getSelectedRow();
        if(baris!=-1){
            String[] options = {"Ya","Tidak"};
            int x=JOptionPane.showOptionDialog(null,"Yakin ingin menghapus riwayat ?","Confirm",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

            if(x==0){
                try{
                    sql="DELETE FROM keperluan WHERE idKeperluan='"+tabelRiwayatKeperluan.getValueAt(baris, 0)+"'";
                    stat.execute(sql);
                    JOptionPane.showMessageDialog(null, "Riwayat berhasil dihapus");
                    setTabelKeperluan();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih Riwayat terlebih dahulu");
        }
    }//GEN-LAST:event_btn_hapusriwayatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    
    private void kosongkan_form(){
        nama1.setText("");
        no_telp1.setText("");
        email1.setText("");
        jabatan1.setSelectedItem("-- Pilih jabatan --");
        username1.setText("");
        password1.setText("");
        lbl_img.setText("");
        password2.setText("");
    }
    
    private void opening(){
        bulanLaporan.removeAllItems();
        try{
            sql="SELECT DISTINCT tanggal from(\n" +
                "    SELECT substring(tanggal,1,7) AS tanggal FROM keperluan \n" +
                "    UNION SELECT substring(tanggal,1,7) AS tanggal FROM transaksi \n" +
                "    UNION SELECT substring(tanggal,1,7) AS tanggal from restok) AS tb_gabungan\n" +
                "    ORDER BY tanggal DESC";
            rs=stat.executeQuery(sql);
            while(rs.next()){
                bulanLaporan.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        txt_Tittle.setText("Laporan");
        if(bulanLaporan.getItemCount()!=0){
            String[] bulan=bulanLaporan.getSelectedItem().toString().split("-");
            String[] namaBulan={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
            int bulan_i=Integer.parseInt(bulan[1]);
            bulanTahun.setText(namaBulan[bulan_i-1]+" "+bulan[0]);

            setTablePendapatan(tabelPendapatan);
            setTablePengeluaran(tabelPengeluaran);
            hitungLaporan();
            bulanLaporan.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    String[] bulan=bulanLaporan.getSelectedItem().toString().split("-");
                    int bulan_i=Integer.parseInt(bulan[1]);
                    bulanTahun.setText(namaBulan[bulan_i-1]+" "+bulan[0]);

                    setTablePendapatan(tabelPendapatan);
                    setTablePengeluaran(tabelPengeluaran);
                    hitungLaporan();
                }
            });
        }
    }
    
    private void hitungLaporan(){
        int pengeluaran=0;
        for(int i=0;i<tabelPengeluaran.getRowCount();i++){
            pengeluaran+=Integer.parseInt(tabelPengeluaran.getValueAt(i,1).toString());
        }
        txt_totalPengeluaran.setText(pengeluaran+"");
        int pendapatan=0;
        for(int i=0;i<tabelPendapatan.getRowCount();i++){
            pendapatan+=Integer.parseInt(tabelPendapatan.getValueAt(i,1).toString());
        }
        txt_totalPendapatan.setText(pendapatan+"");
        txt_labaBersih.setText("Rp. "+(pendapatan-pengeluaran));
        
        try{
            sql="SELECT SUM(total) FROM keperluan WHERE tanggal LIKE '"+bulanLaporan.getSelectedItem()+"%'";
            rs=stat.executeQuery(sql);
            rs.next();
            int keperluan = rs.getInt(1);
            txt_labaKotor.setText("Rp. "+(pendapatan-keperluan));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private void setTableData(String jabatan, JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idAkun,nama,tglMasuk FROM akun INNER JOIN jabatan USING (idJabatan) WHERE namaJabatan='"+jabatan+"'";
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
            
            String[] cols={"ID","Nama "+jabatan+"","Tanggal Masuk"};
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTablePelanggan(){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT * FROM pelanggan";
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
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getString(4);
                data[rowIndex][4]=rs.getInt(5)+"";
                rowIndex++;
            }
            
            String[] cols={"ID","Nama Pelanggan","No Telp","Email","Poin"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            pelangganTable.setModel(model);
            
            
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
    
    private void setTabelRincianTransaksi(int idTransaksi){
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
    
    private void setRincianInput(int idRestok){
        try{
            sql="SELECT * FROM restok INNER JOIN akun on idAkun=idKaryawan WHERE idRestok='"+idRestok+"'";
            rs=stat.executeQuery(sql);
            rs.next();
            txt_tanggal1.setText(rs.getString("tanggal"));
            txt_idKaryawan.setText(rs.getString("idKaryawan"));
            txt_namaKaryawan.setText(rs.getString("nama"));
            txt_totalHarga1.setText(rs.getString("totalPembelian"));
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTabelRincianInput(int idRestok){
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
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(20);
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
    
    private void setTableRiwayat(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idRestok,idKaryawan,tanggal,totalPembelian FROM restok";
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
            String[] cols={"ID Restok","ID Karyawan","DATE","Total Pembelian"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTableTransaksi(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT idTransaksi,idKasir,idPelanggan,tanggal,totalBelanja FROM transaksi";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][5];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getInt(2)+"";
                data[rowIndex][2]=rs.getInt(3)+"";
                data[rowIndex][3]=rs.getString(4);
                data[rowIndex][4]=rs.getInt(5)+"";
                rowIndex++;
            }
            String[] cols={"ID Transaksi","ID Kasir","ID Pelanggan","DATE","Total Belanja"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTabelKeperluan(){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT * FROM keperluan"; 
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
            String[] cols={"Kode","Nama Keperluan","DATE","Harga","Qty","Total"};
            
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabelRiwayatKeperluan.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelRiwayatKeperluan.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setLog(){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT tanggal,namaJabatan,aktivitas FROM log INNER JOIN jabatan using(idJabatan)";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][3];
            while(rs.next()){
                data[rowIndex][0]=rs.getString(1);
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);               
                rowIndex++;
            }
            String[] cols={"DATE","Jabatan","Aktivitas"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            tabel_log.setModel(model);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    public void addListenerKeperluanUsaha(){
        tabelKeperluanUsaha.getModel().addTableModelListener(new TableModelListener() {
            
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    final int row = e.getFirstRow();
                    final int column = e.getColumn();
                    switch(column){
                        case 1:
                        case 2:
                            if(tabelKeperluanUsaha.getValueAt(row, 1)!=null && tabelKeperluanUsaha.getValueAt(row, 2)!=null)
                                try{
                                    int totalHarga=Integer.parseInt(tabelKeperluanUsaha.getValueAt(row, 1).toString()) * Integer.parseInt(tabelKeperluanUsaha.getValueAt(row, 2).toString());
                                    tabelKeperluanUsaha.setValueAt(totalHarga, row, 3);
                                    int totalPembelian=0;
                                    for(int i=0;tabelKeperluanUsaha.getValueAt(i, 3)!=null;i++){
                                        totalPembelian+=Integer.parseInt(tabelKeperluanUsaha.getValueAt(i,3).toString());
                                    }
                                    txt_totalKeperluan.setText(String.valueOf(totalPembelian));
                                }catch(Exception x){
                                    System.out.print(x);
                                }
                            break;
                    }
                    
                }
            }
        });    
    }
    
    private void setTablePengeluaran(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT namaKeperluan as nama, total FROM keperluan WHERE tanggal LIKE '"+bulanLaporan.getSelectedItem()+"%' GROUP BY namaKeperluan\n" +
                "UNION\n" +
                "SELECT barang.namaBarang, SUM(qTerima * hargaBeliSatuan) AS total\n" +
                "FROM restok_detail INNER JOIN barang USING (idBarang) INNER JOIN restok USING (idRestok) WHERE tanggal LIKE '"+bulanLaporan.getSelectedItem()+"%' \n" +
                "GROUP BY idBarang;";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][2];
            while(rs.next()){
                data[rowIndex][0]=rs.getString(1);
                data[rowIndex][1]=rs.getInt(2)+"";
                rowIndex++;
            }
            String[] cols={"Nama","Total"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    private void setTablePendapatan(JTable dataTable){
        try{
            int rows=0;
            int rowIndex=0;
            
            sql="SELECT barang.namaBarang,SUM((transaksi_detail.hargaJual-transaksi_detail.diskon)*quantity) AS Total FROM transaksi_detail \n" +
                    "	INNER JOIN barang\n USING(idBarang)\n" +
                    "   INNER JOIN transaksi USING (idTransaksi)\n" +
                    "   WHERE tanggal LIKE '"+bulanLaporan.getSelectedItem()+"%'\n" +
                    "	GROUP BY transaksi_detail.idBarang ";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            String[][] data=new String[rows][2];
            while(rs.next()){
                data[rowIndex][0]=rs.getString(1);
                data[rowIndex][1]=rs.getInt(2)+"";
                rowIndex++;
            }
            String[] cols={"Nama","Total"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            dataTable.setModel(model);
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    public class akun_pegawai{
        int idAkun;
        String nama,noTelp,email,jabatan,tglMasuk,username,password;

        public akun_pegawai(int id){
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
    private javax.swing.JPanel Layout_button;
    private javax.swing.JPanel Layout_button2;
    private javax.swing.JPanel Layout_button3;
    private javax.swing.JPanel Layout_button4;
    private javax.swing.JPanel Layout_button5;
    private javax.swing.JPanel Layout_dataKaryawan;
    private javax.swing.JPanel Layout_dataKasir;
    private javax.swing.JPanel Layout_dataPelanggan;
    private javax.swing.JPanel Layout_inputKeperluan;
    private javax.swing.JPanel Layout_laporan;
    private javax.swing.JPanel Layout_listBarang;
    private javax.swing.JPanel Layout_listDiskon;
    private javax.swing.JPanel Layout_logPegawai;
    private javax.swing.JPanel Layout_rincianInput;
    private javax.swing.JPanel Layout_rincianTransaksi;
    private javax.swing.JPanel Layout_riwayatBarang;
    private javax.swing.JPanel Layout_riwayatInputBarang;
    private javax.swing.JPanel Layout_riwayatKeperluan;
    private javax.swing.JPanel Layout_riwayatTransaksi;
    private javax.swing.JPanel Layout_tambahPekerja;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JButton add;
    private javax.swing.JPanel addRow;
    private javax.swing.JButton backEditProfile;
    private javax.swing.JPanel bg;
    private javax.swing.JButton browseEditProfile;
    private javax.swing.JButton btnImage;
    private javax.swing.JPanel btn_dataPegawai;
    private javax.swing.JPanel btn_dataPelanggan;
    private javax.swing.JButton btn_hapusList;
    private javax.swing.JButton btn_hapusriwayat;
    private javax.swing.JPanel btn_informasiBarang;
    private javax.swing.JPanel btn_inputBarang;
    private javax.swing.JPanel btn_inputKeperluan;
    private javax.swing.JPanel btn_karyawan;
    private javax.swing.JPanel btn_kasir;
    private javax.swing.JPanel btn_keperluanUsaha;
    private javax.swing.JPanel btn_laporan;
    private javax.swing.JPanel btn_listBarang;
    private javax.swing.JPanel btn_listDiskonPoin;
    private javax.swing.JPanel btn_logPegawai;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JButton btn_prosesKeperluan;
    private javax.swing.JPanel btn_riwayatKeperluan;
    private javax.swing.JPanel btn_riwayatPegawai;
    private javax.swing.JPanel btn_tambahPegawai;
    private javax.swing.JPanel btn_transaksi;
    private javax.swing.JComboBox bulanLaporan;
    private javax.swing.JLabel bulanTahun;
    private javax.swing.JButton dataKaryawanHapus;
    private javax.swing.JButton dataKaryawanTampilkan;
    private javax.swing.JButton dataKasirHapus;
    private javax.swing.JButton dataKasirTampilkan;
    private javax.swing.JButton editData;
    private javax.swing.JPanel editProfile;
    private javax.swing.JTextField email;
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel jabatan;
    private javax.swing.JComboBox jabatan1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JTable kasirTable;
    private javax.swing.JPanel kolomPassword1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JPanel lihatProfile;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama1;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTextField no_telp1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JPasswordField passwordBaru;
    private javax.swing.JButton passwordCancel1;
    private javax.swing.JPasswordField passwordLama;
    private javax.swing.JPanel passwordProfile;
    private javax.swing.JButton passwordSave1;
    private javax.swing.JTable pelangganTable;
    private javax.swing.JPanel removeRow;
    private javax.swing.JButton rincianInput;
    private javax.swing.JButton rincianTransaksi;
    private javax.swing.JButton riwayatBarangTampil;
    private javax.swing.JButton saveEditProfile;
    private javax.swing.JTable tabelKeperluanUsaha;
    private javax.swing.JTable tabelListBarang;
    private javax.swing.JTable tabelListDiskon;
    private javax.swing.JTable tabelPendapatan;
    private javax.swing.JTable tabelPengeluaran;
    private javax.swing.JTable tabelRincian;
    private javax.swing.JTable tabelRincianInput;
    private javax.swing.JTable tabelRiwayatKeperluan;
    private javax.swing.JTable tabel_log;
    private javax.swing.JTable tabel_riwayatPembelian;
    private javax.swing.JTable tabel_riwayatTransaksi;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textJabatan;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNoTelp;
    private javax.swing.JTextField tf_search;
    private javax.swing.JLabel txt_Tittle;
    private javax.swing.JLabel txt_idKaryawan;
    private javax.swing.JLabel txt_idKasir;
    private javax.swing.JLabel txt_labaBersih;
    private javax.swing.JLabel txt_labaKotor;
    private javax.swing.JLabel txt_namaKaryawan;
    private javax.swing.JLabel txt_namaKasir;
    private javax.swing.JLabel txt_tanggal;
    private javax.swing.JLabel txt_tanggal1;
    private javax.swing.JLabel txt_totalHarga;
    private javax.swing.JLabel txt_totalHarga1;
    private javax.swing.JLabel txt_totalKeperluan;
    private javax.swing.JLabel txt_totalPendapatan;
    private javax.swing.JLabel txt_totalPengeluaran;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables

}
