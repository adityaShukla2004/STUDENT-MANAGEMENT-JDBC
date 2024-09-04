import java.sql.Connection;
import java.util.Scanner;

import DataOperation.CreateConnection;
import DataOperation.DataOp;

public class App {
    static Scanner sc;
    public static void main(String[] args) throws Exception {
        System.out.println("********* STUDENT MANAGEMENT SYSTEM *************");

        sc = new Scanner(System.in);

        CreateConnection db = new CreateConnection();
        DataOp operation = new DataOp();

        Connection con = db.CreateCon();

        int i = 1;
        while (i == 1) {
            System.out.println("Which Operation Perfrom\n");

            System.out.println("\n1 : Add Student");
            System.out.println("2 : Get Student Data");
            System.out.println("3 : Delete Student");
            System.out.println("4 : Updata Student");
            System.out.println("5 : Exit");

            System.out.println("Enter the choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the name of student:");
                    sc.nextLine();
                    String sname = sc.nextLine();

                    System.out.println("Enter the age of student:");
                    int sAge = sc.nextInt();

                    System.out.println("Enter the address of student:");
                    sc.nextLine();
                    String sAdd = sc.nextLine();

                    System.out.println("Enter the course of student:");
                    String scourse = sc.nextLine();

                    operation.insertData(con, sname, sAge, sAdd, scourse);

                    break;

                case 2:
                    operation.showData(con);
                    break;

                case 3:
                    System.out.println("Enter the Id of the Student that student delete:");
                    int id = sc.nextInt();

                    operation.deleteData(con,id);
                    break;

                case 4:
                System.out.println("Enter the Id of the Student that student Update:\n");
                int uid = sc.nextInt();

                System.out.println("\nEnter the name of student:");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.println("Enter the age of student:");
                    int Age = sc.nextInt();

                    System.out.println("Enter the address of student:");
                    sc.nextLine();
                    String Add = sc.nextLine();

                    System.out.println("Enter the course of student:");
                    String course = sc.nextLine();


                    operation.updataData(con, uid, name, Age, Add, course);

                    break;

                case 5:
                    i = 5;
                    break;

                default:
                  System.out.println("This choice is not exist");
                    break;
            }
        }
        con.close();

        System.out.println("THANKYOU FOR USING STUDENT MANAGEMENT SYSTEM");
    }
}
