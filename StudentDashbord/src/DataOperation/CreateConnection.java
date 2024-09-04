package DataOperation;

import java.sql.*;

public class CreateConnection {
    private String D_URL = "jdbc:mysql://localhost:3306/s_management";
    private String USER = "root";
    private String PASS = "Aditya@1";
    private String Dri_v = "com.mysql.cj.jdbc.Driver";
    public Connection con;

    public Connection CreateCon() {

        try {
            Class.forName(Dri_v);

            con = DriverManager.getConnection(D_URL, USER, PASS);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return con;
    }

}
