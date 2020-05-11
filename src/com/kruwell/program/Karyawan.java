package com.kruwell.program;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Karyawan extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
        
    public static int id_user;
    String layoutActive;
    public int baris, kolom;
    
    public Karyawan(int id){
        id_user=id;
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        initComponents();
                     
        setColor(btn_transaksi);
        switchPanels(Layout_transaksi);
    }
    
    public Karyawan() {
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
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tittle = new javax.swing.JPanel();
        txt_Tittle = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        Layout_riwayat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Layout_transaksi = new javax.swing.JPanel();
        Total_harga = new javax.swing.JLabel();
        Total_harga2 = new javax.swing.JLabel();
        Kembali2 = new javax.swing.JLabel();
        Proses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        Layout_profile = new javax.swing.JPanel();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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
        jLabel10.setText("Barang");
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Karyawan");
        Side_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        Side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 10));

        bg.add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 220, 540));

        Tittle.setBackground(new java.awt.Color(122, 72, 221));
        Tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Tittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_Tittle.setForeground(new java.awt.Color(240, 240, 240));
        txt_Tittle.setText("Tittle Text");
        Tittle.add(txt_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 40));

        bg.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 720, 100));

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

        Layout_riwayat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 380));

        Layout_transaksi.setBackground(new java.awt.Color(255, 255, 255));
        Layout_transaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total_harga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total_harga.setText("Total Harga");
        Layout_transaksi.add(Total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, 30));
        Layout_transaksi.add(Total_harga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 120, 30));
        Layout_transaksi.add(Kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 30));

        Proses.setText("Proses");
        Layout_transaksi.add(Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        tabelTransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelTransaksi.setForeground(new java.awt.Color(12, 12, 12));
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Kode", "Nama", "Harga", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false
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
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        tabelTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelTransaksiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabelTransaksiKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tabelTransaksi);
        if (tabelTransaksi.getColumnModel().getColumnCount() > 0) {
            tabelTransaksi.getColumnModel().getColumn(0).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(1).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(2).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(3).setResizable(false);
            tabelTransaksi.getColumnModel().getColumn(4).setResizable(false);
        }

        Layout_transaksi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 223));

        Layout_profile.setBackground(new java.awt.Color(255, 255, 255));
        Layout_profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Layout_profile.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, 130));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nama");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("No. telp");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));
        jPanel2.add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Email");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Jabatan");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));
        jPanel2.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 340, 30));

        Layout_profile.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 490, 280));

        jButton1.setText("Edit data");
        Layout_profile.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Layout_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layeredPane.setLayer(Layout_riwayat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_transaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(Layout_profile, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        setColor(btn_transaksi);
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        if(!layoutActive.equals("btn_transaksi")){
            resetColor(btn_transaksi);
        }
    }//GEN-LAST:event_btn_transaksiMouseExited

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
        resetColor(btn_transaksi);
        resetColor(btn_profile);
        switchPanels(Layout_riwayat);
        layoutActive="btn_riwayat";

        tittleRiwayat y  = new tittleRiwayat();
        x=y;
        x.ubah();
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
        resetColor(btn_transaksi);
        switchPanels(Layout_profile);
        layoutActive="btn_profile";

        tittleProfile y  = new tittleProfile();
        x=y;
        x.ubah();
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

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        baris = tabelTransaksi.getSelectedRow();
        kolom = tabelTransaksi.getSelectedColumn();
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void tabelTransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelTransaksiKeyPressed

    }//GEN-LAST:event_tabelTransaksiKeyPressed

    private void tabelTransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelTransaksiKeyTyped
        int id_barang = (int) tabelTransaksi.getModel().getValueAt(baris,1);
        //        JOptionPane.showMessageDialog(null, id_barang);
        try{
            sql = "SELECT * FROM barang WHERE id_barang='"+id_barang+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(id_barang == rs.getInt(id_barang)){
                }
            }

        }catch(Exception e){

        }

        JOptionPane.showMessageDialog(null, id_barang);
    }//GEN-LAST:event_tabelTransaksiKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kembali2;
    private javax.swing.JPanel Layout_profile;
    private javax.swing.JPanel Layout_riwayat;
    private javax.swing.JPanel Layout_transaksi;
    private javax.swing.JButton Proses;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel Tittle;
    private javax.swing.JLabel Total_harga;
    private javax.swing.JLabel Total_harga2;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_profile;
    private javax.swing.JPanel btn_riwayat;
    private javax.swing.JPanel btn_transaksi;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jabatan;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JLabel txt_Tittle;
    // End of variables declaration//GEN-END:variables
}
