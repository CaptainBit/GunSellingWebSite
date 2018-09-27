
package Guns;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author admin
 */
public class ApplyChangeGun 
{
    public final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String SERVERNAME= "localhost";
    public final static String PORT = "3306";
    public final static String SCHEMA = "prog_web";
    public final static String PARAMETER = "?serverTimezone=UTC";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "";
    
    public static void ApplyChange(Gun gun)
    {
         //propreties for server
        Properties properties = new Properties();
        properties.setProperty("user", USERNAME);
        properties.setProperty("password", PASSWORD);
        properties.setProperty("useSSL", "false");
        properties.setProperty("verifyServerCertificate", "true");
        properties.setProperty("requireSSL", "false");
        
        Connection conn = null; 
        PreparedStatement pst=null;
       
        
        //Server url
        String url = "jdbc:mysql://" + SERVERNAME + ":" + PORT + "/" + SCHEMA + PARAMETER;
        
        
        //Connect
        try{
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(url, properties);
        }
        catch(SQLException |ClassNotFoundException | IllegalAccessException | InstantiationException e){
            System.out.println(e);
            System.exit(-1);
        }
        
        String clause = "UPDATE guns SET description = ? , imageUrl= ? , calibre= ?, action = ?, poids = ? WHERE idguns = ? ;";
        try{
            pst = conn.prepareStatement(clause, 1005, 1008);
            pst.setString(1, gun.getDescription());
            pst.setString(2, gun.getImageUrl());
            pst.setString(3, gun.getCalibre());
            pst.setString(4, gun.getAction());
            pst.setFloat(5, gun.getPoids());
            pst.executeQuery();
            pst.clearParameters();
        }catch(SQLException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
    }
    
}
