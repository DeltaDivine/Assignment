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

/**
 *
 * @author User
 */
public class List {
    public static void getList() {
        System.out.println("Connecting ...");
        Connection conn;
        String id = "";
        String name = "";
        String sql = "";
        sql = "SELECT * FROM students;";
        try {
            conn = DAO.connectNow();
            System.out.println("Connect success");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("maSV");
                name = rs.getString("name");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Unable to connect database." + e.getMessage());
                
        }
    }
}
