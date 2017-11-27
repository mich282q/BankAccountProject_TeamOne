import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Konto {

    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    //Laver en bruger med navn, adresse og id
    public static void lavKonto(String Konto_type, int reg_nr, int konto_nr, double rentesats,
                                int saldo, int overtraeksgebyr, String overtraek, int id) throws SQLException {

        System.out.println("Creating statement...");
        stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO konto VALUES ('" + Konto_type + "', " + reg_nr + ", " + konto_nr + ", " + rentesats
                + ", " + saldo + ", " + overtraeksgebyr + ", '"+ overtraek + "', "+ id +" );";
        System.out.println(sql);
        stmt.execute(sql);
        System.out.println("Successful!");

    }

    public static void insertKontoData() throws SQLException {

        lavKonto("Lønkonto", 3652, 568465125,1,100000,1200,"Ja",6);
        lavKonto("Opsparingskonto", 1457, 547891203, 1.2, 250000, 1200,"Nej",6);
        lavKonto("Opsparingskonto", 6985, 264874259, 1.1, 600000, 1200, "Nej", 7);
        lavKonto("Lønkonto", 8748, 698551789, 1.8, 10000, 1500, "Ja", 7);

    }

}