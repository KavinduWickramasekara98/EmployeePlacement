
package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.DutyPoint;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DutyPointController {
    public static ArrayList<String> getDutypointID() throws ClassNotFoundException, SQLException{
    ArrayList<String> arr=new ArrayList<>();
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT DP_ID FROM duty_point").executeQuery();
    while(rst.next()){
        arr.add(rst.getString(1));   
    }
    return arr;
    }
    public static DutyPoint getDutyPoint(String ID) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM duty_point WHERE DP_ID='"+ID+"'").executeQuery();
       if(rst.next()){
            return new DutyPoint(
                rst.getString(1),
                rst.getInt(2),
                rst.getString(3),
                rst.getString(4)
            );
       }
        return null;
    }
    public static ArrayList<String> notFilledDutyPoints(String date){
       // String s="Select DP_ID from duty_Point where DP_ID='"+dp_id+"'";
         //DBConnection.getInstance().getConnection().prepareStatement(s);
        return null;
    
    }
   
}
