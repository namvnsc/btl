/* @vannamsc */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO {
    protected static Connection con;
    public DAO(){
        if(con==null){
            String s = "jdbc:sqlserver://localhost:1433;instance=ADMIN;databaseName=web";
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                DAO.con = DriverManager.getConnection(s, "sa","1");
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
