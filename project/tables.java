
package project;
import java.sql.*;
import javax.swing.*;

public class tables {
    
    public static void main(String[] args) {
        
        Connection con= null;
        Statement st= null;
        
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table users(fullName varchar(200),cellNo varchar(10),email varchar(200),password varchar(50),securityQuestions varchar(500),answer varchar(200),address varchar(500),status varchar(200))");
            st.executeUpdate("create table room(roomNumber varchar(10),roomType varchar(200),bed varchar(200),price int, status varchar(20))");
            st.executeUpdate("create table customer(Id int,FullName varchar(200),ContactNo varchar(10),Nationality varchar(20),Gender varchar(20),Email varchar(200),ID_Proof varchar(200),Address varchar(500),CheckInDate varchar(50),RoomNo varchar(10),Bed varchar(200),RoomType varchar(200),PricePerDay int,NoOfDaysStay int,TotalAmount varchar(200),CheckOutDate varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {}
        }
    }
    
    
}
