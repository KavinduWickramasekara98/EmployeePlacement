
package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeChoiceController {
  
    
    public static ArrayList<String> getAllTransferDates() throws ClassNotFoundException, SQLException{
          ArrayList<String> arr=new ArrayList<>();
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT DISTINCT Duty_Point_add_date FROM employee_duty GROUP BY Duty_Point_add_date").executeQuery();
    while(rst.next()){
        arr.add(rst.getString(1));   
    }
    return arr;   
    }
    public static String getLastLeftDate() throws ClassNotFoundException, SQLException{
              ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT DISTINCT Duty_Point_add_date FROM employee_duty ORDER BY Duty_Point_add_date DESC LIMIT 1").executeQuery();
              if(rst.next()){
              return rst.getString(1);
              }
              return null;
    }
}
   