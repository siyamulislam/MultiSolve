/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcondamu;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SiamPC
 */
public class Connect2 {
    Connection con;
    Statement st;
    
    
    
    public Connect2() {

       try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     // line below needs to be modified to include the database name, user, and password (if any)
  con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=testCON;user=siam;password=123456;");
  
     System.out.println("Connected to database !");
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }
    }


  Connection obtainConnection() {
        return con;
    }
  
    
}


