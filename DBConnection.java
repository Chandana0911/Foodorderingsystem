import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/foodorder",
                "root",
                "Chandanareddy123@"
            );

        } catch(Exception e) {

            System.out.println(e);
        }

        return con;
    }
}