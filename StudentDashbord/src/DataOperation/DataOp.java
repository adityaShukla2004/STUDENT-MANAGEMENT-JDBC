package DataOperation;

import java.sql.*;

import java.sql.Connection;

public class DataOp {
    public String select = "select * from stu_data;";
    public String insert = "INSERT INTO stu_data (sName,sAge,sAdd,scourse)values(?,?,?,?);";
    public String updata = "UPDATE stu_data set sName=?,sAge=?,sAdd=?,scourse = ? where s_id = ? ;";
    public String delete = "DELETE FROM stu_data where s_id= ?;";

    public void insertData(Connection con, String sName, int sAge, String sAdd, String scourse) throws Exception {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO stu_data (sName,sAge,sAdd,scourse)values(?,?,?,?);");

        stmt.setString(1, sName);
        stmt.setInt(2, sAge);
        stmt.setString(3, sAdd);
        stmt.setString(4, scourse);

        int i = stmt.executeUpdate();

        System.out.println(i + "Record Insert");
    }

    public void showData(Connection con) throws Exception {
        PreparedStatement stmt = con.prepareStatement(select);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("\nStudent id:" + rs.getInt("s_id"));
            System.out.println("Name:" + rs.getString("sName"));
            System.out.println("Age:" + rs.getInt("sAge"));
            System.out.println("Address:" + rs.getString("sAdd"));
            System.out.println("Course:" + rs.getString("scourse")+"\n");
        }

    }


    public void deleteData(Connection con, int id) throws Exception{
         PreparedStatement stmt = con.prepareStatement(delete);
         stmt.setInt(1, id);

         int i = stmt.executeUpdate();

         System.out.println(i+"  Record is deleted ");
    }

    public void updataData(Connection con , int id,String name,int age,String add,String course)throws Exception{
        PreparedStatement stmt = con.prepareStatement(updata);
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, add);
        stmt.setString(4, course);
        stmt.setInt(5, id);
        int i = stmt.executeUpdate();
        if(i==1){
            System.out.println("record is updated");
        }
    }
}
