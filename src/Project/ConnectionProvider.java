/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package Project;
//import java.sql.*;

package Project;
import static java.lang.Class.forName;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class ConnectionProvider {
   
        
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Sanu@2002");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
    

