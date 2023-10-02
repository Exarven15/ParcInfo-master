import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL extends Materiel{
    private static String nomFichier;

    public SQL(String nomFichier) {
        SQL.nomFichier = nomFichier;
    }   

    public static void sauverSQL(String Nserie) {
        String url = "jdbc:sqlite:" + nomFichier;
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(
                     "INSERT INTO materiels (Nserie) VALUES (?)")) {

            pstmt.setString(1, Nserie);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}