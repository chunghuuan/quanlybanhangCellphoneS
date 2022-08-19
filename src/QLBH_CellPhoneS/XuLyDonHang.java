package QLBH_CellPhoneS;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class XuLyDonHang extends CauLenh {

    private int giaBan;
    private int SLMua;
    private String thanhTien;

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        int a = Integer.parseInt(giaBan.trim());
        this.giaBan = a;
    }

    public int getSLMua() {
        return SLMua;
    }

    public void setSLMua(String SLMua) {
        int b = Integer.parseInt(SLMua.trim());
        this.SLMua = b;
    }

    public String getThanhTien() {
        String TT = themPhay(String.valueOf(this.giaBan * this.SLMua)).trim();
        return TT;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    public boolean KTDH(String maDH, String ngayLap, String nhanVien, String khachHang, String ktNV, String ktKH) {

        if (maDH.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống mã đơn hàng");
            return false;
        }
        if (ngayLap.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống ngày lập");
            return false;
        }
        if (nhanVien.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống mã nhân viên");
            return false;
        }
        if (khachHang.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống mã khách hàng");
            return false;
        }

        if (ktNV.equals("")) {
            JOptionPane.showMessageDialog(null, "Sai mã nhân viên ! Vui lòng nhập chính xác");
            return false;
        }
        if (ktKH.equals("")) {
            JOptionPane.showMessageDialog(null, "Sai mã khách hàng ! Vui lòng nhập lại");
            return false;
        }
        return true;
    }

    public boolean themSPchoTblmodel(DefaultTableModel tblmodel, int CotID, int cotCongDon1, int cotCongDon2) {
        int dongCuoi = tblmodel.getRowCount() - 1;
        int c;
        int d;
        int kq;
        String kq2;
        for (int i = 0; i < dongCuoi; i++) {
            if (tblmodel.getValueAt(i, CotID).equals(tblmodel.getValueAt(dongCuoi, CotID))) {
                c = Integer.valueOf(tblmodel.getValueAt(i, cotCongDon1).toString());
                d = Integer.valueOf(tblmodel.getValueAt(dongCuoi, cotCongDon1).toString());
                kq = c + d;
                kq2 = String.valueOf(kq);
                tblmodel.setValueAt(kq2, i, cotCongDon1);
                c = Integer.parseInt(xoaPhay(tblmodel.getValueAt(i, cotCongDon2).toString().trim()));
                d = Integer.parseInt(xoaPhay(tblmodel.getValueAt(dongCuoi, cotCongDon2).toString().trim()));
                kq = c + d;
                kq2 = themPhay(String.valueOf(kq));
                tblmodel.setValueAt(kq2, i, cotCongDon2);
                tblmodel.removeRow(dongCuoi);  // Xóa dòng cuối
                return true;
            }
        }
        return false;
    }

    public boolean dangXuat() {
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất?", "Chủ đề", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            new FrLogin().setVisible(true);
            return true;
        } else {
            return false;
        }
    }

    public String taoMaSPTuDong() {
        String maSP = lay1DLCuoi1Bang0DK("MaSP", "SanPham");
        int soSP = Integer.parseInt(maSP.substring(2, 5)) + 1;
        if (soSP < 100) {
            maSP = "SP0" + String.valueOf(soSP);
        } else {
            maSP = "SP" + String.valueOf(soSP);
        }
        return maSP.trim();
    }

    public String taoMaDHTuDong() {
        String maDH = lay1DLCuoi1Bang0DK("MaDH", "DonDatHang");
        int soHD = Integer.parseInt(maDH.trim().substring(2, 4)) + 1;//HD01
        if (soHD < 10) {
            maDH = "DH0" + String.valueOf(soHD);
        } else {
            maDH = "DH" + String.valueOf(soHD);
        }
        return maDH.trim();
    }

    public boolean KTTaiKhoan(String tk, String mk, PhanQuyen pq) {

        try {
            String cl = "Select * From TaiKhoan where Tendangnhap =? and Matkhau = ?";
            st = conn.prepareStatement(cl);
            st.setString(1, tk);
            st.setString(2, mk);
            rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("LoaiTK").equals("2")) {
                    pq.setTk(tk);
                    pq.setKey("2");
                    new FrQuanLyChung(pq).setVisible(true);
                    return true;
                } else if (rs.getString("LoaiTK").equals("1")) {
                    pq.setTk(tk);
                    pq.setKey("1");
                    new FrQuanLyChung(pq).setVisible(true);
                    return true;
                } else if (rs.getString("LoaiTK").equals("3")) {
                    JOptionPane.showMessageDialog(null, "Chức vụ của bạn không được cấp quyền truy cập  ");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu !");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi: Không thể kết nối đến máy chủ !");
        }
        return false;
    }

    public String layGiaSP(String maSP) {
        try {
            String caulenh = "Select GiaBan from dbo.SanPham Where MaSP=?";
            st = conn.prepareStatement(caulenh);
            st.setString(1, maSP);
            rs = st.executeQuery();
            String kq = "";
            while (rs.next()) {
                kq = rs.getString(1);
            }
            st.close();// ĐÓNG CÂU LỆNH TRUY VẤN
            return kq;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi: Không thể kết nối đến máy chủ !");
        }
        return "";
    }

    public String layMaHDCuoi() {
        try {
            String caulenh = "SELECT TOP 1 MaDH FROM dbo.DonDatHang ORDER BY MaDH DESC";
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            String kq = "";
            if (rs.next()) {
                kq = rs.getString(1);
            }
            st.close();// ĐÓNG CÂU LỆNH TRUY VẤN
            return kq;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi: Không thể kết nối đến SQL !");
        }
        return "";
    }

    public boolean huyDon() {
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn hủy đơn hàng ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public DefaultTableModel layDSCot(DefaultTableModel tblmodel, String table) {
        String caulenh = "Select * from " + table;
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount(); // Lấy số cột , cột đầu là cột 1
            for (int i = 1; i <= socot; i++) {// các dòng sau là tên cột;
                tblmodel.addColumn(rsm.getColumnLabel(i).toString());// đặt tên cho từng cột tblmodel
            }
            st.close(); //  ĐÓNG CÂU LỆNH TRUY VẤN
            return tblmodel; // trả về cột tblmodel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
            return null;
        }
    }

    public List<Object[]> layListDDH() {
        String caulenh = "Select * from dbo.DonDatHang";
        List<Object[]> listKH = new ArrayList<Object[]>();
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();

            while (rs.next()) {
//                rs.
                Object ob[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                listKH.add(ob);
            }
            st.close();// Đóng câu lệnh truy vấn
            return listKH;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
            return null;
        }
    }

    public List<String> thongTinKH(String maKH) {

        List<String> listKH = new ArrayList<String>();
        try {
            String caulenh = "SELECT kh.HoTenKH,kh.GioiTinh,kh.NgaySinh,kh.DienThoai "
                    + "FROM dbo.KhachHang kh, dbo.DonDatHang ddh "
                    + "Where ddh.MaDH ='" + maKH + "' and kh.MaKH=ddh.MaKH";

            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            while (rs.next()) {
                listKH.add(rs.getString("HoTenKH"));
                listKH.add(rs.getString("GioiTinh"));
                listKH.add(rs.getString("NgaySinh"));
                listKH.add(rs.getString("DienThoai"));
            }
            st.close(); //  ĐÓNG CÂU LỆNH TRUY VẤN
            return listKH;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
        }
        return listKH;
    }

    

//    public static void main(String[] args) {
//        XuLyDonHang x = new XuLyDonHang();
//        Object[] ob = {"SP021", "IPHONE15","Apple","DIen thoai My","10/2021","1Hop","128Gb","My","5000","ConHang","N01"};
//        System.out.println(x.themDLchoTableSQL(ob, "SanPham"));
//    }

    public void them1DH(String maDH, String NgayLap, String YeuCauKhac, String maCT, String maTT, String MaKH, String MaNV) {
        try {
            String caulenh = "Insert into dbo.DonDatHang values (?,?,?,?,?,?,?)";
            st = conn.prepareStatement(caulenh);
            st.setString(1, maDH);
            st.setString(2, NgayLap);
            st.setString(3, YeuCauKhac);
            st.setString(4, maCT);
            st.setString(5, maTT);
            st.setString(6, MaKH);
            st.setString(7, MaNV);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tạo đơn hàng thành công ! ");
            st.close(); //  ĐÓNG CÂU LỆNH TRUY VẤN
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
        }
    }

    public void them1SP(String MaDH, String MaSP, String SLMua, String MaBH) {
        try {
            String caulenh = "INSERT INTO dbo.CTDDH VALUES (?,?,?,?)";
            st = conn.prepareStatement(caulenh);
            st.setString(1, MaDH);
            st.setString(2, MaSP);
            st.setString(3, SLMua);
            st.setString(4, MaBH);
            st.executeUpdate();
            st.close(); // ĐÓNG CÂU LỆNH TRUY VẤN
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
        }
    }

}
