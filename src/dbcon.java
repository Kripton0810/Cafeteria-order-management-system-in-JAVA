/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.sql.*;
public class dbcon {
    
    public static Connection con;
   
    public static Connection connection()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //jdbc:mysql://127.0.0.1:3000/?user=root
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3000/coffeeshop","root","Sub@2019");
        System.out.println(con);
        System.out.println("Connection Successfull");
        return con;
        }catch(Exception e)
        {
            con = null;
            return con;
        }
    }
    public static void main(String[] args) {
        dbcon obj = new dbcon();
        Connection con = obj.connection();
        String qur = "SELECT * FROM admin_login";
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(qur);
            rs.next();
            System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
