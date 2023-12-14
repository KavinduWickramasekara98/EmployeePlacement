
package finalprojectsem1.pos.controller;

import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.Port;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PortTypeController {
    public static Port getPortType(String id) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM port_type WHERE P_ID='"+id+"'").executeQuery();
        if(rst.next()){
             return new Port(
                rst.getString(1),
                rst.getString(2)
        );
        }
       
        return null;
    }
    public List<Port> getAllPorts() throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM port_type";
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet set = stm.executeQuery();
        List<Port> list= new ArrayList<>();
        
        while (set.next()) {            
            list.add(new Port(
            set.getString(1),
            set.getString(2)
            ));
        }
        
        return list;
    }
}
