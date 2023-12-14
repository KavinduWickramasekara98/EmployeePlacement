

package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.Directorate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DirectorateController {
    public static ArrayList<String> getDirectorateID()throws ClassNotFoundException, SQLException{
        ArrayList<String> arr=new ArrayList<>();
        Connection con = DBConnection.getInstance().getConnection();
        String sql="SELECT D_ID FROM Directorate";
        ResultSet rset= con.prepareStatement(sql).executeQuery();
        while(rset.next()){
            arr.add(rset.getString(1));
        }
        return arr;
    }
    public static Directorate getDirectorate(String id) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Directorate WHERE D_ID='"+id+"'").executeQuery();
        if(rst.next()){
            return new Directorate(
            rst.getString(1),
            rst.getString(2),
            rst.getString(3)
            );
        }
        return null;
    }
}
