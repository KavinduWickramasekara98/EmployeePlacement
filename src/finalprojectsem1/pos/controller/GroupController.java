
package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.Group;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupController {
    public static Group getgroup(String id) throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Grouptype WHERE G_ID='"+id+"'").executeQuery();
        if(set.next()){
            return new Group(
                    set.getString(1),
                    set.getString(2)
            );
        }
        return null;
    }
    public static String getNewGroupID(String eid) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT G_ID FROM duty_point WHERE DP_ID =(select DP_ID from employee_duty where  E_ID='"+eid+"' order by Duty_Point_left_date desc limit 1)").executeQuery();
        if(rst.next()){
         return rst.getString(1)=="G01"?"Go2":"G01";
        }
        return null;
    }
  //  public static 
}
