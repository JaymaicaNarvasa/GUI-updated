package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnector {
    
    public Connection connect;
    
    public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_bank", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    
    public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
     public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }
    
     
     public void updateData(String sql){
         try{
                PreparedStatement pst = connect.prepareStatement(sql);
                int rowsUpdated = pst.executeUpdate();
                if(rowsUpdated > 0){
                    JOptionPane.showMessageDialog(null, "Data Updated SUCCESSFULLY!");
                }else {
                    System.out.println("Data Updated FAILED!");
                }
                pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
         
     }
     
     public void deleteData(int id, String table ,String tbl_id){
         try{
             PreparedStatement pst = connect.prepareStatement("DELETE FROM "+table+" WHERE "+tbl_id+" = ?");
             pst.setInt(1, id);
             int rowsDeleted = pst.executeUpdate();
             
             if(rowsDeleted > 0){
                 JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY!");
             }else{
                 System.out.println("Deletion FAILED!");
             }
             pst.close();
         }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
         }
     }

    public Connection getConnection() {
        return connect;
    }

}
