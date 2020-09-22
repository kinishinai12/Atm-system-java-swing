package alfonsobankofthephilippines;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class DataBaseConn {
    public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?zeroDateTimeBehavior=convertToNull", "root", "");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
            
}
