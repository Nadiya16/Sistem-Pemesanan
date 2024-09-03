import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author M. ade nur Alfarisi
 */
public class koneksi {
    private static Connection conn;
    
    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_penjualan", "root", "");
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            throw new SQLException("Gagal menghubugkan ke database", e);
        }
    }
    return conn;
    }
}
