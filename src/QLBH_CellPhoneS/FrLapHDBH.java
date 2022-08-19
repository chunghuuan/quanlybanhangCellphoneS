/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBH_CellPhoneS;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrLapHDBH extends javax.swing.JFrame {

    XuLyDonHang xldh = new XuLyDonHang();
    PhanQuyen pq;
    String maDH;

    public FrLapHDBH() {
        initComponents();
    }

    public FrLapHDBH(PhanQuyen pq) {
        this.pq = pq;
        initComponents();
        this.setTitle("Lập hóa đơn bán hàng");

        txtMDH.setEditable(false);
        pnlXacNhanDonHang.setVisible(false);
        xldh.themCbx(cbxKM, "TenCT", "CTKM");
        xldh.themCbx(cbxHTTT, "TenHT", "HinhThucThanhToan");
        txtMaNV.setText(pq.getMaNV());
        txtMaNV.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlXacNhanDonHang = new javax.swing.JPanel();
        lbNTDHD = new javax.swing.JLabel();
        lbNXNMaDH = new javax.swing.JLabel();
        lbXNMaDH = new javax.swing.JLabel();
        lbNXNNgayLap = new javax.swing.JLabel();
        lbNXNHTTT = new javax.swing.JLabel();
        lbNXNTenKH = new javax.swing.JLabel();
        lbXNNgayLap = new javax.swing.JLabel();
        lbXNTenKH = new javax.swing.JLabel();
        lbXNHTTT = new javax.swing.JLabel();
        btnXNDH = new javax.swing.JButton();
        btnXNTChoi = new javax.swing.JButton();
        lbNXNKM = new javax.swing.JLabel();
        lbXNKM = new javax.swing.JLabel();
        lbNXNThucHien = new javax.swing.JLabel();
        lbXNNVThucHien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbNMaDH = new javax.swing.JLabel();
        lbNNgayLap = new javax.swing.JLabel();
        txtMDH = new javax.swing.JTextField();
        txtNgayLap = new javax.swing.JTextField();
        lbNMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lbNMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        btnTaoDHTuDong = new javax.swing.JButton();
        btnTaoHD = new javax.swing.JButton();
        btnLamTuoi = new javax.swing.JButton();
        lbYeuCau = new javax.swing.JLabel();
        txtYeuCau = new javax.swing.JTextField();
        lbNHTTT = new javax.swing.JLabel();
        cbxHTTT = new javax.swing.JComboBox<>();
        cbxKM = new javax.swing.JComboBox<>();
        lbNKM = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnbTrangChu = new javax.swing.JMenu();
        mnbTroGiup = new javax.swing.JMenu();
        mnbDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlXacNhanDonHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbNTDHD.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lbNTDHD.setText("Thông tin đơn hàng");

        lbNXNMaDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNMaDH.setText("Mã hóa đơn");

        lbXNMaDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNMaDH.setText("-------");

        lbNXNNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNNgayLap.setText("Ngày lập");

        lbNXNHTTT.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNHTTT.setText("Hình thức thanh toán");

        lbNXNTenKH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNTenKH.setText("Tên khách hàng");

        lbXNNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNNgayLap.setText("-------");

        lbXNTenKH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNTenKH.setText("-------");

        lbXNHTTT.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNHTTT.setText("-------");

        btnXNDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnXNDH.setText("XÁC NHẬN HÓA ĐƠN");
        btnXNDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXNDHActionPerformed(evt);
            }
        });

        btnXNTChoi.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnXNTChoi.setText("HỦY BỎ");
        btnXNTChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXNTChoiActionPerformed(evt);
            }
        });

        lbNXNKM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNKM.setText("Khuyến mãi");

        lbXNKM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNKM.setText("-------");

        lbNXNThucHien.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNXNThucHien.setText("NV thực hiện");

        lbXNNVThucHien.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbXNNVThucHien.setText("-------");

        javax.swing.GroupLayout pnlXacNhanDonHangLayout = new javax.swing.GroupLayout(pnlXacNhanDonHang);
        pnlXacNhanDonHang.setLayout(pnlXacNhanDonHangLayout);
        pnlXacNhanDonHangLayout.setHorizontalGroup(
            pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacNhanDonHangLayout.createSequentialGroup()
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXacNhanDonHangLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXNTChoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlXacNhanDonHangLayout.createSequentialGroup()
                                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNXNNgayLap)
                                    .addComponent(lbNXNHTTT)
                                    .addComponent(lbNXNTenKH)
                                    .addComponent(lbNXNMaDH))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbXNMaDH)
                                    .addComponent(lbXNTenKH)
                                    .addComponent(lbXNHTTT)
                                    .addComponent(lbXNNgayLap)
                                    .addComponent(lbXNKM)
                                    .addComponent(lbXNNVThucHien)))))
                    .addGroup(pnlXacNhanDonHangLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbNTDHD)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlXacNhanDonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNXNKM)
                    .addComponent(btnXNDH)
                    .addComponent(lbNXNThucHien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlXacNhanDonHangLayout.setVerticalGroup(
            pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacNhanDonHangLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbNTDHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNMaDH)
                    .addComponent(lbXNMaDH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNNgayLap)
                    .addComponent(lbXNNgayLap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNTenKH)
                    .addComponent(lbXNTenKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNHTTT)
                    .addComponent(lbXNHTTT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNKM)
                    .addComponent(lbXNKM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlXacNhanDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNXNThucHien)
                    .addComponent(lbXNNVThucHien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnXNDH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXNTChoi)
                .addContainerGap())
        );

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banner/logocs.png"))); // NOI18N
        jPanel1.add(lbLogo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlXacNhanDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlXacNhanDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("TẠO HÓA ĐƠN BÁN HÀNG");
        jPanel3.add(jLabel3, new java.awt.GridBagConstraints());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbNMaDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNMaDH.setText("Mã hóa đơn");

        lbNNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNNgayLap.setText("Ngày lập");

        txtMDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMDHActionPerformed(evt);
            }
        });

        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        lbNMaNV.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNMaNV.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        lbNMaKH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNMaKH.setText("Mã khách hàng");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        btnTaoDHTuDong.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnTaoDHTuDong.setText("Tạo mã hóa đơn tự động");
        btnTaoDHTuDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDHTuDongActionPerformed(evt);
            }
        });

        btnTaoHD.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnTaoHD.setText("Tạo hóa đơn");
        btnTaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHDActionPerformed(evt);
            }
        });

        btnLamTuoi.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnLamTuoi.setText("Làm Tươi");
        btnLamTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamTuoiActionPerformed(evt);
            }
        });

        lbYeuCau.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbYeuCau.setText("Yêu cầu bổ sung của khách");

        txtYeuCau.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        lbNHTTT.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNHTTT.setText("Hình thức thanh toán");

        cbxHTTT.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxHTTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHTTTActionPerformed(evt);
            }
        });

        cbxKM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKMActionPerformed(evt);
            }
        });

        lbNKM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNKM.setText("Khuyến mãi");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNMaKH)
                            .addComponent(lbNMaNV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbNNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtYeuCau)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaoDHTuDong)
                            .addComponent(lbYeuCau)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNHTTT)
                                    .addComponent(lbNKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxKM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxHTTT, 0, 126, Short.MAX_VALUE))))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbNMaDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(txtMDH, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnTaoHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLamTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNMaDH)
                    .addComponent(txtMDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNNgayLap)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoDHTuDong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNMaKH)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNHTTT)
                    .addComponent(cbxHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNKM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoHD)
                    .addComponent(btnLamTuoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbYeuCau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnbTrangChu.setText("Trang chủ");
        mnbTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnbTrangChuMouseClicked(evt);
            }
        });
        mnbTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbTrangChuActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnbTrangChu);

        mnbTroGiup.setText("Trợ giúp");
        jMenuBar1.add(mnbTroGiup);

        mnbDangXuat.setText("Đăng xuất");
        mnbDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnbDangXuatMouseClicked(evt);
            }
        });
        mnbDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbDangXuatActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnbDangXuat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHDActionPerformed
        lbXNMaDH.setText(txtMDH.getText());
        lbXNNgayLap.setText(txtNgayLap.getText());
        String hotenKH = xldh.lay1DL1BangcoDK("HoTenKH", "KhachHang", "MaKH", txtMaKH.getText());
        lbXNTenKH.setText(hotenKH);
        lbXNHTTT.setText((String) cbxHTTT.getSelectedItem());
        lbXNKM.setText((String) cbxKM.getSelectedItem());
        String hotenNV = xldh.lay1DL1BangcoDK("HoTenNV", "NhanVien", "MaNV", txtMaNV.getText());
        lbXNNVThucHien.setText(hotenNV);
        if (xldh.KTDH(txtMDH.getText(), txtNgayLap.getText(), txtMaNV.getText(), txtMaKH.getText(), hotenNV, hotenKH)) {
            pnlXacNhanDonHang.setVisible(true);
        } else {
            return;
        }

        khoaChN(false);

    }//GEN-LAST:event_btnTaoHDActionPerformed

    private void khoaChN(boolean bl) {
        txtMaKH.setEditable(bl);
        txtYeuCau.setEditable(bl);
        txtNgayLap.setEditable(bl);
        cbxHTTT.setEnabled(bl);
        cbxKM.setEnabled(bl);
    }

    private void btnTaoDHTuDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDHTuDongActionPerformed
        txtNgayLap.setText(xldh.layNgayHT());
        txtMDH.setText(xldh.taoMaDHTuDong());
//        this.maDH = txtMDH.getText();
    }//GEN-LAST:event_btnTaoDHTuDongActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed

    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void cbxHTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHTTTActionPerformed
    }//GEN-LAST:event_cbxHTTTActionPerformed

    private void cbxKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKMActionPerformed
//        int a =cbxKM.getSelectedIndex();
//        XuLyDonHang xldh = new XuLyDonHang();
//        xldh.setCbxKM(a);
    }//GEN-LAST:event_cbxKMActionPerformed

    private void btnLamTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamTuoiActionPerformed
        pnlXacNhanDonHang.setVisible(false);
        txtMDH.setText("");
        txtMaKH.setText("");
        txtNgayLap.setText("");
        txtYeuCau.setText("");
        khoaChN(true);

    }//GEN-LAST:event_btnLamTuoiActionPerformed

    private void btnXNTChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXNTChoiActionPerformed
        pnlXacNhanDonHang.setVisible(false);
        khoaChN(false);
    }//GEN-LAST:event_btnXNTChoiActionPerformed

    private void mnbDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbDangXuatActionPerformed

    }//GEN-LAST:event_mnbDangXuatActionPerformed

    private void btnXNDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXNDHActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn tạo đơn hàng?", "Thông báo ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            String maCT = xldh.lay1DL1BangcoDK("MaCT", "CTKM", "TenCT", cbxKM.getSelectedItem().toString().trim());
            String maTT = xldh.lay1DL1BangcoDK("MaTT", "HinhThucThanhToan", "TenHT", cbxHTTT.getSelectedItem().toString().trim());
            xldh.them1DH(txtMDH.getText(), txtNgayLap.getText(), txtYeuCau.getText(), maCT, maTT, txtMaKH.getText(), txtMaNV.getText());
            JOptionPane.showMessageDialog(this, "Sau khi tạo, bạn sẽ được chuyển đến trang chi tiết đơn hàng, nhấn OK để xác nhận !");
            this.setVisible(false);
            new FrTaoCTDH(pq, lbXNMaDH.getText().trim()).setVisible(true);

        } else {
            return;
        }

    }//GEN-LAST:event_btnXNDHActionPerformed

    private void mnbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbDangXuatMouseClicked
        if (xldh.dangXuat()) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnbDangXuatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        new FrQuanLyChung(pq).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void mnbTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbTrangChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnbTrangChuActionPerformed

    private void mnbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbTrangChuMouseClicked
        new FrQuanLyChung().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnbTrangChuMouseClicked

    private void txtMDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMDHActionPerformed

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
            java.util.logging.Logger.getLogger(FrLapHDBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLapHDBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLapHDBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLapHDBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLapHDBH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamTuoi;
    private javax.swing.JButton btnTaoDHTuDong;
    private javax.swing.JButton btnTaoHD;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXNDH;
    private javax.swing.JButton btnXNTChoi;
    private javax.swing.JComboBox<String> cbxHTTT;
    private javax.swing.JComboBox<String> cbxKM;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNHTTT;
    private javax.swing.JLabel lbNKM;
    private javax.swing.JLabel lbNMaDH;
    private javax.swing.JLabel lbNMaKH;
    private javax.swing.JLabel lbNMaNV;
    private javax.swing.JLabel lbNNgayLap;
    private javax.swing.JLabel lbNTDHD;
    private javax.swing.JLabel lbNXNHTTT;
    private javax.swing.JLabel lbNXNKM;
    private javax.swing.JLabel lbNXNMaDH;
    private javax.swing.JLabel lbNXNNgayLap;
    private javax.swing.JLabel lbNXNTenKH;
    private javax.swing.JLabel lbNXNThucHien;
    private javax.swing.JLabel lbXNHTTT;
    private javax.swing.JLabel lbXNKM;
    private javax.swing.JLabel lbXNMaDH;
    private javax.swing.JLabel lbXNNVThucHien;
    private javax.swing.JLabel lbXNNgayLap;
    private javax.swing.JLabel lbXNTenKH;
    private javax.swing.JLabel lbYeuCau;
    private javax.swing.JMenu mnbDangXuat;
    private javax.swing.JMenu mnbTrangChu;
    private javax.swing.JMenu mnbTroGiup;
    private javax.swing.JPanel pnlXacNhanDonHang;
    private javax.swing.JTextField txtMDH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtYeuCau;
    // End of variables declaration//GEN-END:variables
}
