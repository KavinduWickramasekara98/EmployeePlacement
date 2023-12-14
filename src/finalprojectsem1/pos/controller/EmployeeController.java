
package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeController {
    
    public static ArrayList<String> getEmployeeID() throws ClassNotFoundException, SQLException{
    ArrayList<String> arr=new ArrayList<>();
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT E_ID FROM employee").executeQuery();
    while(rst.next()){
        arr.add(rst.getString(1));   
    }
    return arr;
    }
   public boolean saveEmployee(Employee e) throws ClassNotFoundException, SQLException {
        
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Customer VALUES(?,?,?,?)");
       
        stm.setInt(1, e.getEmployee_Seniority());
        stm.setString(2, e.getEID());
        stm.setString(3, e.getName());
        stm.setString(4, e.getAddress());
        return stm.executeUpdate() > 0;
    }
   public static Employee getEmployee(String id) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Employee WHERE E_ID='"+id+"'").executeQuery();
        if(rst.next()){
            return new Employee(
            rst.getInt(1),
            rst.getString(2),
            rst.getString(3),
            rst.getString(4)
            );
        }
        return null;
   }

}

