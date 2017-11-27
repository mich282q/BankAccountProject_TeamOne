import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Konto {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    // Laver en bruger med navn, adresse og id
    public static void lavKonto(String type, int reg_nr, int konto_nr, int rentesats, int saldo, int overtraeksgebyr, int overtraek, int id) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO bruger VALUES ('" + type + "', " + reg_nr + ", " + konto_nr + ", " + rentesats
                + ", " + saldo + ", " + overtraeksgebyr + ", "+ overtraek + ", "+ id +" );";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }

}