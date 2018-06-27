/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentbleu;

/**
 *
 * @author user_PC
 */
import java.sql.*;
import javax.swing.*;


public class JavaConnect {
    
    Connection conn = null;
    public static Connection ConnectDb() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // database directory
            
            /** get connection from mySQL**/
             Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/laurentbleu?autoReconnect=true&useSSL=false","root","toor");
            return conn;
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
        
        return null;
    }
    
}
