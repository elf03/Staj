package VeriTabani;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Connection conn = null;
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=DbYTAJavaOkul;encrypt=true;trustServerCertificate=true;";
        String user = "javauser";
        String pass = "1234";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Veritabanına bağlanıldı.");

            stmt = conn.prepareStatement("DELETE FROM TableOgrenciler WHERE OgrenicNo=?");

            stmt.setInt(1, 122);

            int n = stmt.executeUpdate();

            if (n == 1)
                System.out.println(n + " adet kayıt silinmiştir.");
            else
                System.out.println("Herhangi bir kayıt silinemedi.");

            System.out.println(conn.getAutoCommit());

        } catch (SQLException e) {

            System.out.println("Hata oluştu!");
            e.printStackTrace();

        } finally {

            try {

                if (rs != null)
                    rs.close();

                if (stmt != null)
                    stmt.close();

            } catch (SQLException ex) {

                Logger.getLogger(Main.class.getName())
                        .log(Level.SEVERE, null, ex);
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}