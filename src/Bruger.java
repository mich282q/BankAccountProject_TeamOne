import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bruger {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    // Laver en bruger med navn, adresse og id
    public static void lavBruger(int person_id, String navn, String adresse) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO bruger VALUES (" + person_id + ", '" + navn + "', '" + adresse + "');";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }


    public static void insertBrugerData() throws SQLException {

        lavBruger(1, "Erik Ruhmanis", "Troensevej");
        lavBruger(2, "Thomas", "Parkvej");
        lavBruger(3, "Mads", "Danavej");
        lavBruger(4, "Daniel", "Femøvej");
        lavBruger(5, "Burhan", "Maglemølle");

    }
}
