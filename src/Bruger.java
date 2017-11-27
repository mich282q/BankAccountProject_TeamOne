import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bruger {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    // Laver en bruger med navn, adresse og id
    public static void lavBruger(int Person_id, String fnavn, String lnavn, String adresse) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;

        //AI (fnavn, lnavn, adresse)
        sql = "INSERT INTO bruger VALUES (" + Person_id + ", '" + fnavn + "', '" + lnavn + "', '" + adresse + "');";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }


    public static void insertBrugerData() throws SQLException {

        lavBruger( 1,"Erik", "Ruhmanis", "Troensevej");
        lavBruger(2,"Thomas", "Christensen", "Parkvej");
        lavBruger( 3,"Michael", "Trans", "Danavej");
        lavBruger( 4,"Daniel", "Nørd", "Femøvej");
        lavBruger( 5,"Burhan", "Öztürk", "Maglemølle");

    }
}
