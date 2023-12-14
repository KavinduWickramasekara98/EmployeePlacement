
package finalprojectsem1.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   private static DBConnection dbconnection;
   private Connection connection;
   private DBConnection() throws ClassNotFoundException, SQLException{
          Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");      
   }
   public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
      return dbconnection==null?dbconnection=new DBConnection():dbconnection;
   }
   public Connection getConnection(){
      return connection; 
   }
}
