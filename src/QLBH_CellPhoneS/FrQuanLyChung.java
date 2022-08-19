/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBH_CellPhoneS;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FrQuanLyChung extends javax.swing.JFrame {

    XuLyDonHang xldh = new XuLyDonHang();
    PhanQuyen pq;

    public FrQuanLyChung(PhanQuyen pq) {
        this.pq = pq;
        initComponents();
        this.setTitle("Quản lý chung");
        lbMaNV.setText("");
        lbHoTen.setText("");
        lbChucVu.setText("");
        btnBoSungSP.setVisible(false);
        if (pq.getKey().equals("1")) {
            btnLapHD.setEnabled(false);
            btnBoSungSP.setVisible(true);
        }
        String maNV = xldh.lay1DLcoRBTV("MaNV", "dbo.TaiKhoan", "dbo.NhanVien", "TenDangNhap", pq.getTk(), "TenDangNhap");
        pq.setMaNV(maNV);
        lbMaNV.setText(maNV);
        lbHoTen.setText(xldh.lay1DL1BangcoDK("HoTenNV", "NhanVien", "MaNV", maNV));
        lbChucVu.setText(xldh.lay1DL1BangcoDK("ChucVu", "NhanVien", "MaNV", maNV));
    }

    public FrQuanLyChung() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        btnLapHD = new javax.swing.JButton();
        btnTimHD = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        lbTieuDe = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbNMaNV = new javax.swing.JLabel();
        lbNHoTen = new javax.swing.JLabel();
        lbNChucVu = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        btnBoSungSP = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnbTrangChu = new javax.swing.JMenu();
        mnbTroGiup = new javax.swing.JMenu();
        mnbDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        btnLapHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLapHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/SanPham.png"))); // NOI18N
        btnLapHD.setText("Lập hóa đơn");
        btnLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapHDActionPerformed(evt);
            }
        });
        pnl1.add(btnLapHD);

        btnTimHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/TraCuu.png"))); // NOI18N
        btnTimHD.setText("Lịch sử đơn hàng");
        btnTimHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimHDActionPerformed(evt);
            }
        });
        pnl1.add(btnTimHD);

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/DangXuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        pnl1.add(btnDangXuat);

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Thoat.png"))); // NOI18N
        btnThoat.setText("Thoát chương trình");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        pnl1.add(btnThoat);

        pnl2.setLayout(new java.awt.GridBagLayout());

        lbTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTieuDe.setForeground(new java.awt.Color(255, 51, 51));
        lbTieuDe.setText("TRANG QUẢN LÝ DÀNH CHO NHÂN VIÊN");
        pnl2.add(lbTieuDe, new java.awt.GridBagConstraints());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbNMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNMaNV.setForeground(new java.awt.Color(0, 51, 204));
        lbNMaNV.setText("Mã nhân viên:");

        lbNHoTen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNHoTen.setForeground(new java.awt.Color(0, 51, 204));
        lbNHoTen.setText("Họ tên:");

        lbNChucVu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNChucVu.setForeground(new java.awt.Color(0, 51, 204));
        lbNChucVu.setText("Chức Vụ:");

        lbMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(0, 0, 153));
        lbMaNV.setText("---------");

        lbHoTen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(0, 51, 204));
        lbHoTen.setText("---------");

        lbChucVu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbChucVu.setForeground(new java.awt.Color(0, 51, 204));
        lbChucVu.setText("---------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMaNV)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNHoTen)
                    .addComponent(lbNChucVu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHoTen)
                    .addComponent(lbChucVu))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNMaNV)
                    .addComponent(lbNHoTen)
                    .addComponent(lbMaNV)
                    .addComponent(lbHoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChucVu)
                    .addComponent(lbNChucVu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBoSungSP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBoSungSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/THEM.png"))); // NOI18N
        btnBoSungSP.setText("BỔ SUNG SẢN PHẨM");
        btnBoSungSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoSungSPActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoSungSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(pnl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBoSungSP, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapHDActionPerformed
        new FrLapHDBH(pq).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLapHDActionPerformed

    private void mnbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbDangXuatMouseClicked
        if (xldh.dangXuat()) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnbDangXuatMouseClicked

    private void mnbTroGiupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbTroGiupMouseClicked
        JOptionPane.showMessageDialog(this, "Liên hệ với quản lý để được giải đáp thắc mắc " + "\n" + "Hotline: 19002821");
    }//GEN-LAST:event_mnbTroGiupMouseClicked

    private void mnbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbTrangChuMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn đang ở trang chủ !");
    }//GEN-LAST:event_mnbTrangChuMouseClicked

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if (xldh.dangXuat()) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        xldh.thoatCT();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void mnbDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbDangXuatActionPerformed
        if (xldh.dangXuat()) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnbDangXuatActionPerformed

    private void btnTimHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimHDActionPerformed
        new FrXemDH(pq).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTimHDActionPerformed

    private void btnBoSungSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoSungSPActionPerformed
        new FrQLSP(pq).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBoSungSPActionPerformed

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
            java.util.logging.Logger.getLogger(FrQuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrQuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrQuanLyChung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoSungSP;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnLapHD;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimHD;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNChucVu;
    private javax.swing.JLabel lbNHoTen;
    private javax.swing.JLabel lbNMaNV;
    private javax.swing.JLabel lbTieuDe;
    private javax.swing.JMenu mnbDangXuat;
    private javax.swing.JMenu mnbTrangChu;
    private javax.swing.JMenu mnbTroGiup;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    // End of variables declaration//GEN-END:variables
}
