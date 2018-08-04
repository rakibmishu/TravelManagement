
package ExamProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Database_Connection {
    Connection con;
    public static Connection DbConn(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_management", "root", "123");
        //JOptionPane.showMessageDialog(null, "database successfully Connect");
    return con;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    } 
    
}
