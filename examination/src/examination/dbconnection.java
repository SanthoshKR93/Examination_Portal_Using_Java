/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.DriverManager;


/**
 *
 * @author HP
 */

import java.sql.*;
import javax.swing.*;

public class dbconnection {
    
 Connection conn=null;
 
 public static Connection ConnectDb()
 {
  try{
      Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exam","root","santhoshk@728");
//JOptionPane.showMessageDialog(null, "connection established");
return conn;
  }       
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
         return null;
         }
 }
}