import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Team One!");
        Connection con = DB_Connector.connect();
        System.out.println();
    }
}
