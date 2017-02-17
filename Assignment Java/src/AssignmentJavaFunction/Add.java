/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJavaFunction;

import AssignmentJavaModel.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Add {

    public static void New() {
        System.out.println("Connecting ...");
        Connection conn;
        try {
            conn = DAO.connectNow();
            System.out.println("Connect success" + conn);
            Statement statement = conn.createStatement();
            String id = "";
            String name = "";
            System.out.println("Insert new student id: ");
            id = new Scanner(System.in).next();
            System.out.println("Insert new student name: ");
            name = new Scanner(System.in).next();
           statement.execute("INSERT INTO students(maSV, name)" + "VALUES ('" + id + "', '" + name + "')");
            System.out.println("Success, u have add a new student: ");
            System.out.println("ID:  "+ id);
            System.out.println("name:  "+ name);

        } catch (SQLException e) {
            System.out.println("Unable to connect database." + e.getMessage());

        }
    }
}
