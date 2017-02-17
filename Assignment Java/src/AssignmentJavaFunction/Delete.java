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
public class Delete {
    public static void Delete() {
        System.out.println("Connecting ...");
        Connection conn;
        try {
            conn = DAO.connectNow();
            System.out.println("Connect success" + conn);
            Statement statement = conn.createStatement();
            String id = "";
            String name = "";
            System.out.println("Insert student id you want to delete: ");
            id = new Scanner(System.in).next();
            statement.execute("DELETE FROM students " + "WHERE maSV = '" + id + "'");
            System.out.println("Success, u have delete a student.");

        } catch (SQLException e) {
            System.out.println("Unable to connect to database." + e.getMessage());

        }
    }
}
