import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bruger {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    // Laver en bruger med navn, adresse og id
    public static void lavBruger(String navn, String adresse, int id) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO bruger VALUES ('" + navn + "', '" + adresse + "', " + id + ");";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }

}
