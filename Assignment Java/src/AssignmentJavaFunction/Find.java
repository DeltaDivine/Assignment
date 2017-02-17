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
public class Find {

    public static void search() {
        System.out.println("Connecting ...");
        Connection conn;
        String sql = "";
        String id = "";
        String name = "";
        try {
            conn = DAO.connectNow();
            System.out.println("Connect success" + conn);
            Statement statement = conn.createStatement();
             System.out.println("Insert student id: ");
            id = new Scanner(System.in).next();
            sql = "SELECT * FROM students WHERE maSV = '" + id + "'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("maSV");
                name = rs.getString("name");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
            }

        } catch (SQLException e) {
            System.out.println("Unable to connect database." + e.getMessage());

        }
    }
}
