import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bruger {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    // Laver en bruger med navn, adresse og id
    public static void lavBruger(String fnavn,String lnavn, String adresse) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO bruger (fnavn,lnavn, adresse) VALUES ('" + fnavn + "', '" + lnavn + "', '" + adresse + "');";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }


    public static void insertBrugerData() throws SQLException {

        lavBruger( "Erik", "Ruhmanis", "Troensevej");
        lavBruger("Thomas", "Christensen", "Parkvej");
        lavBruger( "Michael", "Trans", "Danavej");
        lavBruger( "Daniel", "Nørd", "Femøvej");
        lavBruger( "Burhan", "Öztürk", "Maglemølle");

    }
}
