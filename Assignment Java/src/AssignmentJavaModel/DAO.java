/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJavaModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class DAO {
    public static Connection connectNow() throws SQLException {
        String url = Config.getCONNECTION_URL_PREFIX() + Config.getHOST() + Config.getDATABASE();
        Connection conn = DriverManager.getConnection(url, Config.getUSERNAME(), Config.getPASSWORD());

        return conn;
    }
}
