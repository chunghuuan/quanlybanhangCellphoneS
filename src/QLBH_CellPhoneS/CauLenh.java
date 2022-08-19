package QLBH_CellPhoneS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class CauLenh extends KetNoi {

    public CauLenh() {
    }

    public boolean thoatCT() {
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }

    public boolean timDLTblModel(DefaultTableModel tblmodel, String giaTriID) {
        int sodong = tblmodel.getRowCount();
        int kt = 0;
        for (int i = sodong - 1; i >= 0; i--) {
            if (tblmodel.getValueAt(i, 0).equals(giaTriID)) {
                kt = 1;
            } else {
                tblmodel.removeRow(i);
            }
        }
        if (kt == 1) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả !");
            return false;
        }
    }

    public String lay1DL1BangcoDK(String cotCanLay, String table, String cotdk, String giatri) {
        String caulenh = "Select TOP 1 " + cotCanLay + " from " + table + " where " + cotdk + "= N'" + giatri + "'";
        String kq = lay1DL(caulenh);
        return kq;
    }

    public void xoa1DongDL1BangcoDK_RBTV(String table, String tableRBTV, String cotDK, String giatri) {
        String caulenh1 = "DELETE from " + tableRBTV + " where " + cotDK + "='" + giatri + "'";
        chaySQLUpdate(caulenh1);
        String caulenh2 = "DELETE from " + table + " where " + cotDK + "='" + giatri + "'";
        chaySQLUpdate(caulenh2);
    }

    public void xoa1DongDL1co2DK(String tableSQL, String cotDK1, String giaTriDk1, String cotDK2, String giaTriDk2) {
        String caulenh = "DELETE from " + tableSQL + " where " + cotDK1 + " ='" + giaTriDk1 + "' and " + cotDK2 + " ='" + giaTriDk2 + "'";
        chaySQLUpdate(caulenh);
    }

    public void chaySQLUpdate(String caulenh) {
        try {
            st = conn.prepareStatement(caulenh);
            st.executeUpdate();
            st.close();// Đóng câu lệnh truy vấn
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai câu lệnh truy vấn !!");

        }
    }

    public void xoa1DongDL1BangcoDK(String table, String cotDK, String giatri) {
        String caulenh = "Delete From " + table + " where " + cotDK + " = '" + giatri + "'";

        chaySQLUpdate(caulenh);
    }

    public String lay1DLcoRBTV(String cotCanLay, String table1, String table2, String cot1cuaTable1, String giatriID, String cotKhoaNgoai) {
        String caulenh = "select Top 1 " + cotCanLay + " from " + table1 + " a , " + table2 + " b WHERE a." + cot1cuaTable1 + "='" + giatriID + "' and a." + cotKhoaNgoai + "=b." + cotKhoaNgoai;
        String kq = lay1DL(caulenh);
        return kq;
    }

    public String themPhay(String a) {
        int b = Integer.parseInt(a);
        String kq = String.format("%,d%n", b); // a phải là kdl Số 
        return kq;
    }

    public String xoaPhay(String a) {
        String kq = a.replace(",", ""); //  Xóa phẩy
        return kq;
    }

    public String lay1DL(String caulenh) {
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            String kq = "";
            if (rs.next()) {
                kq = rs.getString(1);
            }
            st.close();// Đóng câu lệnh truy vấn
            return kq;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi 100: Không thể kết nối đến máy chủ !");
            return "";
        }
    }

    public String lay1DLCuoi1Bang0DK(String cotCanLay, String table) {
        String caulenh = "Select TOP 1 " + cotCanLay + " from " + table + " ORDER BY " + cotCanLay + " DESC";
        String kq = lay1DL(caulenh);
        return kq;
    }

    public Boolean themCbx(JComboBox cbx, String tenCot, String tableSQL) {
        cbx.removeAllItems();
        List<String> listNV = layDL1Cot1BangcoDK(tenCot, tableSQL);
        for (int i = 0; i < listNV.size(); i++) {
            cbx.addItem(listNV.get(i).trim());
        }
        return true;
    }

    public DefaultTableModel resetTable(DefaultTableModel tblmodel, String SQLTable) {
        tblmodel = new DefaultTableModel();
        tblmodel = themDLchoTable(tblmodel, SQLTable);
        return tblmodel;
    }

    public boolean layDSDLtrongTblmodel(DefaultTableModel tblmodel, Vector<Object[]> vec) {
        if (vec.size() > 0) {
            int socot = tblmodel.getColumnCount();
            int sodong = tblmodel.getRowCount();
            for (int i = sodong - 1; i >= 0; i--) {
                tblmodel.removeRow(i);
            }
            Object ob[] = new Object[socot];
            for (int i = 0; i < vec.size(); i++) {
                for (int j = 0; j < socot; j++) {
                    ob[j] = vec.get(i)[j];
                }
                tblmodel.addRow(ob);
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tìm kiếm thất bại !");
            return false;
        }

    }

    public Vector<Object[]> layDSDongDL1BangcoDK(String cotDK, String giaTri, String Table) {
        Vector<Object[]> vec = new Vector<Object[]>();
        try {
            String caulenh = "Select * from " + Table + " where " + cotDK + " = N'" + giaTri + "' ";
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount(); // Lấy số cột , cột đầu là cột 1
            int ghimcot = 0;
            for (int i = socot; i > 0; i--) {
                if (rsm.getColumnLabel(i).equals(cotDK)) {
                    ghimcot = i;
                }
            }
            if (ghimcot == 0) {
                JOptionPane.showMessageDialog(null, "Cột " + cotDK + " không tồn tại trong bảng " + Table + " !");
                return vec;
            }
            int ghinhan = 0;
            while (rs.next()) {
                if (rs.getString(ghimcot).equals(giaTri)) {
                    ghinhan++;
                    Object ob[] = new Object[socot];
                    for (int i = 0; i < socot; i++) {
                        ob[i] = rs.getString(i + 1);
                    }
                    vec.add(ghinhan - 1, ob);
                }

            }
            st.close(); // Đóng câu lệnh truy vấn
            JOptionPane.showMessageDialog(null, "Ghi nhận " + ghinhan + " kết quả !");
            if (vec.size() > 0) {

                return vec;
            } else {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + giaTri + " trong cột " + cotDK + " !");

            }

            return vec;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
            return vec;
        }
    }

    public List<String> layDL1Cot1BangcoDK(String cotCanLay, String table) {
        List<String> listDLCot = new ArrayList<String>();

        String caulenh = "Select " + cotCanLay + " from " + table;
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            while (rs.next()) {
                listDLCot.add(rs.getString(cotCanLay));
            }
            st.close();
            return listDLCot;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi 100: Không thể kết nối đến máy chủ !");
            return null;
        }
    }

    public DefaultTableModel themDLchoTable(DefaultTableModel tblmodel, String table) {
        String caulenh = "Select * from " + table;
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ///LẤY TÊN CỘT
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount(); // Lấy số cột , cột đầu là cột 1
            for (int i = 1; i <= socot; i++) {// các dòng sau là tên cột;
                tblmodel.addColumn(rsm.getColumnLabel(i).toString());// đặt tên cho từng cột tblmodel
            }
            /// KẾT THÚC
            ///ĐẨY DỬ LIỆU VÀO CỘT
            Object ob[] = new Object[socot];

            while (rs.next()) { // Xuống từng dòng rs.

                for (int i = 0; i < socot; i++) {
                    ob[i] = rs.getString(i + 1); // lấy DL của rs, cột đầu tiên phải bắt đầu từ 1
                }
                tblmodel.addRow(ob); // tblmodel lấy dữ liệu từ mảng Object
            }
            // Kết Thúc
            st.close();// Đóng câu lệnh truy vấn
            return tblmodel; // trả về cột tblmodel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai tên bảng !");
            return null;
        }

    }

    public DefaultTableModel themDLchoTablecoDK(DefaultTableModel tblmodel, String table, String cotDK, String giatri) {
        String caulenh = "Select * from " + table + " where " + cotDK + " = '" + giatri + "'";
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ///LẤY TÊN CỘT
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount(); // Lấy số cột , cột đầu là cột 1
            for (int i = 1; i <= socot; i++) {// các dòng sau là tên cột;
                tblmodel.addColumn(rsm.getColumnLabel(i).toString());// đặt tên cho từng cột tblmodel
            }
            ///ĐẨY DỬ LIỆU VÀO CỘT
            Object ob[] = new Object[socot];
            while (rs.next()) { // Xuống từng dòng rs.
                for (int i = 0; i < socot; i++) {
                    ob[i] = rs.getString(i + 1); // lấy DL của rs, cột đầu tiên phải bắt đầu từ 1
                }
                tblmodel.addRow(ob); // tblmodel lấy dữ liệu từ mảng Object
            }
            // Kết Thúc
            st.close();// Đóng câu lệnh truy vấn
            return tblmodel; // trả về cột tblmodel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai tên bảng !");
            return null;
        }
    }

//    public String layMH() {
//        String cl = "SELECT sp.MaSP,sp.TenSP,sp.GiaBan from dbo.SanPham sp";
//        return cl;
//    }
    public String layTongGT1CotTblmodel(DefaultTableModel tblmodel) {
        int SL = Integer.parseInt(tblmodel.getValueAt(0, 2).toString());
        for (int i = 1; i < tblmodel.getRowCount(); i++) {
//                    JOptionPane.showMessageDialog(null,SL);
            SL += Integer.parseInt(tblmodel.getValueAt(i, 2).toString());
        }
        return String.valueOf(SL);
    }

    public String layNgayHT() {
        String cl = String.valueOf(java.time.LocalDate.now());
        String ngay = cl.substring(8, 10); //2021-12-05
        String thang = cl.substring(5, 7);
        String nam = cl.substring(0, 4);
        return ngay + "/" + thang + "/" + nam;
    }

    public int laySLCotTrongTableSQL(String tableSQL) {
        String caulenh = "Select * from " + tableSQL;
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ///LẤY TÊN CỘT
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount();
            st.close();// Đóng câu lệnh truy vấn
            return socot;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai câu lệnh truy vấn !!");
            return -1;
        }
    }

    public Object[] layTenCotTrongTableSQL(String tableSQL) {
        Object[] ob = null;
        String caulenh = "Select Top 1 * from " + tableSQL;
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ///LẤY TÊN CỘT
            ResultSetMetaData rsm = rs.getMetaData();
            int socot = rsm.getColumnCount(); // Lấy số cột , cột đầu là cột 1
            ob = new Object[socot];
            for (int i = 1; i <= socot; i++) {// các dòng sau là tên cột;
                ob[i - 1] = rsm.getColumnLabel(i);
            }
            return ob;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
            return ob;
        }

    }

    public Boolean suaDLchoTableSQL(Object[] ob, String tableSQL) {

        int Slcot = laySLCotTrongTableSQL(tableSQL);
        if (ob.length != Slcot) {
            JOptionPane.showMessageDialog(null, "Dữ liệu chưa đủ để chỉnh sửa. Yêu cầu bổ sung thêm !");
            return false;
        }
        Object[] DSCot = layTenCotTrongTableSQL(tableSQL);
        String caulenhBegin = " Update " + tableSQL + " Set ";
        String chuoi = "";
        for (int i = 1; i < ob.length; i++) {
            chuoi += DSCot[i] + " = N'" + ob[i] + "',";
        }
        chuoi = chuoi.substring(0, chuoi.length() - 1) + " Where " + DSCot[0] + " =N'" + ob[0] + "'";
        String caulenh = caulenhBegin + chuoi;
        try {
            st = conn.prepareStatement(caulenh);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sửa thành công !");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến SQL");
            return false;
        }

    }

    public boolean themDLchoTableSQL(Object[] ob, String tableSQL) {
        int Slcot = laySLCotTrongTableSQL(tableSQL);
        if (ob.length != Slcot) {
            JOptionPane.showMessageDialog(null, "Dữ liệu chưa đủ để thêm vào. Yêu cầu bổ sung thêm !");
            return false;
        }
        String caulenhBegin = "Insert into " + tableSQL + " values (";
        String chuoi = "";
        for (int i = 0; i < ob.length; i++) {
            chuoi += "N'" + ob[i] + "'" + ",";
        }
        chuoi = chuoi.substring(0, chuoi.length() - 1) + ")";
        String caulenh = caulenhBegin + chuoi;
        try {
            st = conn.prepareStatement(caulenh);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tạo thành công !");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Lỗi: Sai câu lệnh ");
            return false;
        }
    }

    public boolean sua1DL2PKTableRBTV(DefaultTableModel tblmodel, int dongtbldangchon, String TableSQL, String cotPk1, String giaTriPk1, String cotPk2,
            String giaTriPK2, String cotThayDoi, String giatriTD) {
        String caulenh = "UPDATE " + TableSQL + "  set " + cotThayDoi + "='" + giatriTD + "' where " + cotPk1 + "='" + giaTriPk1 + "'and " + cotPk2 + " = '" + giaTriPK2 + "'";
        chaySQLUpdate(caulenh);
        try {
            caulenh = "Select * from " + TableSQL;
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int vitricotTD = 0;
            for (int i = rsm.getColumnCount(); i >= 1; i--) {
                if (rsm.getColumnLabel(i).equals(cotThayDoi)) {
                    vitricotTD = i - 1;
                }
            }
            tblmodel.setValueAt(giatriTD, dongtbldangchon, vitricotTD);
            st.close();// Đóng câu lệnh truy vấn
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai câu lệnh truy vấn !!");
            return false;

        }
    }

    public boolean sua2DLFK2PKTable(String TableSQL, String cotPkTD, String giaTriMoi, String giaTriCu,
            String cotSLTD, String giatriSLTD, String cotPk2, String giaTriPk2) {
        String caulenh = "SELECT " + cotPkTD + ", " + cotSLTD + " FROM " + TableSQL + " where " + cotPk2 + " = '" + giaTriPk2 + "'";
        int ghim = 0;
        String SLcu = "";
        try {
            st = conn.prepareStatement(caulenh);
            rs = st.executeQuery();
            int xn = 0;
            int i = 0;
            while (rs.next()) {
                i++;
                if (giaTriMoi.equals(rs.getString(cotPkTD))) {
                    SLcu = rs.getString(cotSLTD);
                    ghim = i;
                }
                if (giaTriCu.equals(rs.getString(cotPkTD).trim())) {
                    xn = 1;
                }
            }
            st.close();// Đóng câu lệnh truy vấn
            if (xn == 0) {
                JOptionPane.showMessageDialog(null, "Mã sản phẩm: " + giaTriCu + " không tồn tại trong Đơn hàng: " + giaTriPk2);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Sai câu lệnh truy vấn !!");
            return false;
        }
        int ques = -1;
        if (ghim > 0) {
            ques = JOptionPane.showConfirmDialog(null, "Sản phẩm bạn muốn thay đổi đã tồn tại trong Đơn hàng, "
                    + "bạn muốn cộng dồn SL mới vào sản phẩm đó không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        } else {
            caulenh = "Update " + TableSQL + " set " + cotPkTD + " ='"
                    + giaTriMoi + "' , " + cotSLTD + " = '" + giatriSLTD + "' where "
                    + cotPk2 + " = '" + giaTriPk2 + "' and " + cotPkTD + " = '" + giaTriCu + "'";
            chaySQLUpdate(caulenh);
            return true;
        }
        if (ques == 1) {
            JOptionPane.showMessageDialog(null, "Hủy thay đổi !");
            return false;
        } else if (ques == 0) {
            String SLmoi = String.valueOf(Integer.parseInt(SLcu) + Integer.parseInt(giatriSLTD));
            caulenh = "Delete from " + TableSQL + " where " + cotPkTD + " = '" + giaTriCu + "' and " + cotPk2 + " ='" + giaTriPk2 + "' ";
            chaySQLUpdate(caulenh);

            caulenh = "Update " + TableSQL + " set " + cotSLTD + " ='" + SLmoi + "' where " + cotPkTD + " ='" + giaTriMoi + "' and " + cotPk2 + " = '" + giaTriPk2 + "'";
            chaySQLUpdate(caulenh);
            return true;
        }
        return false;
    }
}
