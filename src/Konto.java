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

        lavKonto("Lønkonto", 3652, 568465125,1,100000,1200,"Ja",1);
        lavKonto("Opsparingskonto", 1457, 547891203, 1.2, 250000, 1200,"Nej",1);

        lavKonto("Lønkonto", 8748, 698551789, 1.8, 10000, 1500, "Ja", 2);
        lavKonto("Opsparingskonto", 6985, 264874259, 1.1, 600000, 1200, "Nej", 2);

        lavKonto("Lønkonto", 5874, 748547989, 1.3, 41000, 500, "Ja", 3);
        lavKonto("Opsparingskonto", 3698, 478514789, 1.2, 600000, 1000, "Nej", 3);

        lavKonto("Lønkonto", 1520, 697564654, 1, 20000, 500, "Ja",4);
        lavKonto("Opsparingskonto", 7845, 258748965, 1.4, 500000, 2000, "Nej", 4);

        lavKonto("Lønkonto", 0325, 582102093, 1.1, 35000, 1200, "Ja", 5);
        lavKonto("Opsparingskonto", 8745, 754864896, 1.3, 700000, 1500, "Nej", 5);



    }

}