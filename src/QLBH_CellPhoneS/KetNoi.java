package QLBH_CellPhoneS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

    public class KetNoi {
    Connection conn = null;
    PreparedStatement st;
    ResultSet rs;

    public KetNoi() {
        getConn();
    }

    public Connection getConn() {
        try {
            String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLBH_CellPhoneS";
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn = (Connection) DriverManager.getConnection(URL, user, pass);
        }
        catch (Exception ex) {
            System.out.println("Ðang Nhập thất bại, Lỗi");
        }
        return conn;
    }
    
    
}
