
package alfonsobankofthephilippines;

import java.sql.*;

//com.mysql.jdbc.MysqlDataTruncation: Data truncation: Incorrect integer value: '' for column `atm`.`card_number`.`balance` at row 1
public class Validation{
    public static int toRegister(String name,String card,String password){
		int status=0;
                String balance = "0";
		try{
			Connection con = DataBaseConn.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into card_number(id,card, name, balance, password) values(null,?,?,?,?)");
			ps.setString(1,card);
			ps.setString(2,name);
			ps.setString(3,balance);
                        ps.setString(4,password);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){
                    System.out.println(e);
                }return status;
	}
    public static boolean toConfirm(String name, String password){
        boolean status = false;
        try{
            Connection con = DataBaseConn.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT card FROM card_number WHERE name = ? AND password = ?;");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        }catch(Exception e){
            System.out.println(e);
        }return status;
    }
    
    public static boolean validation(String card){
        boolean status = false;
        try{
            Connection con = DataBaseConn.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT card FROM card_number WHERE card = ?;");
            ps.setString(1,card);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        }catch(Exception e){
            System.out.println(e);
        }return status;
    }
    public static boolean validation1(String password){
        boolean status = false;
        try{
            Connection con = DataBaseConn.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT password FROM card_number WHERE password = ?");
            ps.setString(1,password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        }catch(Exception e){
            System.out.println(e);
        }return status;
    }
    
    public static String toUpdateWithdraw(int minuend, int subtrahend, String card){
        int diff = minuend - subtrahend;
        
        try{
            Connection con = DataBaseConn.getConnection();
            String updateBalance = "UPDATE card_number SET balance = ? WHERE card = '" +card+"' ";
            PreparedStatement preparedStmt = con.prepareStatement(updateBalance);
            preparedStmt.setInt(1,diff);
            preparedStmt.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }return "done";
    }
    
    public static String toUpdateDeposit(int addends, int added, String card){
        int sum = addends + added;
        try{
            Connection con = DataBaseConn.getConnection();
            String updateBalance = "UPDATE card_number SET balance = ? WHERE card = '" +card+"' ";
            PreparedStatement preparedStmt = con.prepareStatement(updateBalance);
            preparedStmt.setInt(1,sum);
            preparedStmt.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }return "done";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static String getBalance(String card){
        String resultQ = "";
        try{
            Connection con = DataBaseConn.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT balance FROM card_number WHERE card = ?");
            ps.setString(1,card);
            ResultSet rs = ps.executeQuery();
             if(rs.next()){
                     resultQ = rs.getString(1);
            }
        }catch(Exception e){
            System.out.println(e);
        }return resultQ;
    }
    
   
}
