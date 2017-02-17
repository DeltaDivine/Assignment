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
public class Fix {

    public static void Update() {
        System.out.println("Connecting ...");
        Connection conn;
        String id = "";
        String name = "";
        try {
            conn = DAO.connectNow();
            System.out.println("Connect success" + conn);
            Statement statement = conn.createStatement();

            System.out.println("Id of the student you want to fix: ");
            id = new Scanner(System.in).next();
            System.out.println("Insert new name: ");
            name = new Scanner(System.in).next();
            statement.execute("UPDATE students SET name ='" + name + "' WHERE maSV = '" + id + "'");

            System.out.println("Success, u have update a student: ");
            System.out.println("id:  "+ id);
            System.out.println("name:  "+ name);
            
        } catch (SQLException e) {
            System.out.println("Unable to connect database." + e.getMessage());

        }
    }
}
