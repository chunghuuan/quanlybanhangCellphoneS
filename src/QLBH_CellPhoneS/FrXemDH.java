/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBH_CellPhoneS;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrXemDH extends javax.swing.JFrame {

    DefaultTableModel tblmodel;
    XuLyDonHang xldh;
    PhanQuyen pq;

    public FrXemDH(PhanQuyen pq) {
        this.pq = pq;
        xldh = new XuLyDonHang();
        this.setTitle("Xem hóa đơn");
        initComponents();
        btnChinhSua.setEnabled(false);
        btnXoaDH.setEnabled(false);
        if (pq.getKey().equals("1")) {
            btnChinhSua.setEnabled(true);
            btnXoaDH.setEnabled(true);
        }

        txtNgayLap.setText("");
        txtNgayLap.setText("");
        xldh.themCbx(cbxNhanVien, "HoTenNV", "NhanVien");
        tblmodel = new DefaultTableModel();
        xldh.themDLchoTable(tblmodel, "DonDatHang");

        tblDDH.setModel(tblmodel);
    }

    public FrXemDH() {

        xldh = new XuLyDonHang();
        initComponents();
        txtNgayLap.setText("");
        xldh.themCbx(cbxNhanVien, "HoTenNV", "NhanVien");
        tblmodel = new DefaultTableModel();
        xldh.themDLchoTable(tblmodel, "DonDatHang");

        tblDDH.setModel(tblmodel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDDH = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTimTheoNgay = new javax.swing.JButton();
        lbNgayLap = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        lbNhanVien = new javax.swing.JLabel();
        cbxNhanVien = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnTimDH = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtMaHD = new javax.swing.JTextField();
        lbMaHD = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnXemCTDH = new javax.swing.JButton();
        btnChinhSua = new javax.swing.JButton();
        btnXoaDH = new javax.swing.JButton();
        btnVeTC = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnbTrangChu = new javax.swing.JMenu();
        mnbTroGiup = new javax.swing.JMenu();
        mnbDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDDH.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblDDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDDHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDDH);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimTheoNgay.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnTimTheoNgay.setForeground(new java.awt.Color(0, 0, 255));
        btnTimTheoNgay.setText("Tìm theo ngày tạo");
        btnTimTheoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTheoNgayActionPerformed(evt);
            }
        });

        lbNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNgayLap.setText("Ngày lập");

        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtNgayLap.setText("-----------");

        lbNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNhanVien.setText("Nhân viên");

        cbxNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNhanVien)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTimTheoNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cbxNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimTheoNgay)
                    .addComponent(lbNgayLap)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhanVien)
                    .addComponent(cbxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("MÃ HÓA ĐƠN");

        btnTimDH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimDH.setForeground(new java.awt.Color(0, 0, 204));
        btnTimDH.setText("Tìm kiếm");
        btnTimDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDHActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(0, 0, 204));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(0, 51, 153));

        lbMaHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaHD.setText("--------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTimDH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLamMoi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMaHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoi)
                    .addComponent(btnTimDH)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54))
        );

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banner/logocs2.png"))); // NOI18N
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new java.awt.GridLayout(1, 4, 30, 20));

        btnXemCTDH.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnXemCTDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/TraCuu.png"))); // NOI18N
        btnXemCTDH.setText("Xem CTHD");
        btnXemCTDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTDHActionPerformed(evt);
            }
        });
        jPanel5.add(btnXemCTDH);

        btnChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnChinhSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/CAPNHAP.png"))); // NOI18N
        btnChinhSua.setText("Chỉnh sửa");
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnChinhSua);

        btnXoaDH.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnXoaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/XOA.png"))); // NOI18N
        btnXoaDH.setText("Xóa hóa đơn");
        btnXoaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDHActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoaDH);

        btnVeTC.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnVeTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/DangXuat.png"))); // NOI18N
        btnVeTC.setText("Thoát");
        btnVeTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTCActionPerformed(evt);
            }
        });
        jPanel5.add(btnVeTC);

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 51, 153));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        mnbTrangChu.setText("Trang chủ");
        mnbTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnbTrangChuMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnbTrangChu);

        mnbTroGiup.setText("Trợ giúp");
        mnbTroGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnbTroGiupMouseClicked(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnReset)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDHActionPerformed
        tblmodel = xldh.resetTable(tblmodel, "DonDatHang");
        if (xldh.timDLTblModel(tblmodel, txtMaHD.getText())) {
            ;
        } else {
            tblmodel = xldh.resetTable(tblmodel, "DonDatHang");
            ;
        }
        ;
        tblDDH.setModel(tblmodel);

    }//GEN-LAST:event_btnTimDHActionPerformed

    private void btnXemCTDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTDHActionPerformed
        if (lbMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã đơn hàng !");
            return;
        }
        new FrXemCTDH(lbMaHD.getText().toString(), pq, "0").setVisible(true);
    }//GEN-LAST:event_btnXemCTDHActionPerformed

    private void tblDDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDDHMouseClicked
        int SelectedRow = tblDDH.getSelectedRow();
        lbMaHD.setText((tblDDH.getValueAt(SelectedRow, 0).toString()));
        txtNgayLap.setText(tblDDH.getValueAt(SelectedRow, 1).toString());

    }//GEN-LAST:event_tblDDHMouseClicked

    private void btnXoaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDHActionPerformed

        if (tblDDH.getSelectedRow() > 0) {
            int a = JOptionPane.showConfirmDialog(this, "Khi xóa đơn hàng thì hệ thống cũng sẽ "
                    + "xóa chi tiết mua hàng của đơn hàng đó, bạn có thật sự muốn xóa ?", "Cảnh báo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == 0) {
                int dong = tblDDH.getSelectedRow();
                String maDH = tblmodel.getValueAt(dong, 0).toString();
                xldh.xoa1DongDL1BangcoDK_RBTV("DonDatHang", "CTDDH", "MaDH", maDH);
                tblmodel.removeRow(tblDDH.getSelectedRow());
                tblDDH.setModel(tblmodel);
                JOptionPane.showMessageDialog(this, "Đã xóa !");
            } else {
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần xóa");
        }
    }//GEN-LAST:event_btnXoaDHActionPerformed

    private void mnbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbTrangChuMouseClicked
        new FrQuanLyChung().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnbTrangChuMouseClicked

    private void mnbTroGiupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbTroGiupMouseClicked
        JOptionPane.showMessageDialog(this, "Liên hệ với quản lý để được giải đáp thắc mắc " + "\n" + "Hotline: 19002821");
    }//GEN-LAST:event_mnbTroGiupMouseClicked

    private void mnbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbDangXuatMouseClicked
        xldh = new XuLyDonHang();
        if (xldh.dangXuat()) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnbDangXuatMouseClicked

    private void mnbDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbDangXuatActionPerformed

    }//GEN-LAST:event_mnbDangXuatActionPerformed

    private void btnVeTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTCActionPerformed
        new FrQuanLyChung(pq).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVeTCActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lbMaHD.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed

        if (lbMaHD.getText().equals(null)) {
            JOptionPane.showMessageDialog(this, "Vui lòng click chọn đơn hàng cần chỉnh sửa !");
            return;
        } else {
            new FrXemCTDH(lbMaHD.getText().toString(), pq, "1").setVisible(true);
        }

    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tblmodel = xldh.resetTable(tblmodel, "DonDatHang");
        tblDDH.setModel(tblmodel);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTimTheoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTheoNgayActionPerformed
        tblmodel = xldh.resetTable(tblmodel, "DonDatHang");
        tblDDH.setModel(tblmodel);
        Vector<Object[]> vec = new Vector<Object[]>();
        String ngayLap = txtNgayLap.getText();
        vec = xldh.layDSDongDL1BangcoDK("NgayLap", ngayLap, "DonDatHang");
        xldh.layDSDLtrongTblmodel(tblmodel, vec);
    }//GEN-LAST:event_btnTimTheoNgayActionPerformed

    private void cbxNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(FrXemDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrXemDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrXemDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrXemDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrXemDH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimDH;
    private javax.swing.JButton btnTimTheoNgay;
    private javax.swing.JButton btnVeTC;
    private javax.swing.JButton btnXemCTDH;
    private javax.swing.JButton btnXoaDH;
    private javax.swing.JComboBox<String> cbxNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbNgayLap;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JMenu mnbDangXuat;
    private javax.swing.JMenu mnbTrangChu;
    private javax.swing.JMenu mnbTroGiup;
    private javax.swing.JTable tblDDH;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayLap;
    // End of variables declaration//GEN-END:variables
}
