
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:H:\\tusher P\\JAVA\\Project\\Banking_Management_System_mizan\\bank.sqlite");
           return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
