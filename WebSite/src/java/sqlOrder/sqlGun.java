/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlOrder;

import Guns.Gun;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import myExceptions.importException;
import myExceptions.operationException;


/**
 *
 * @author admin
 */
public class sqlGun {
    
    public  Connection _connection;
    
    //Var static
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";
    private final static String DATABASENAME = "prog_web";
    private final static String ADDREQUEST = "INSERT INTO LAB2(NOM,AGE,DATE_NAISSANCE,SALAIRE) VALUES(?,?,?,?)";
    
    public  void setConnection() throws importException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306" + "/" + DATABASENAME; // a JDBC url
            _connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
                throw new importException(e.toString());
        }
    }
    
    public ArrayList<Gun> getGuns() throws importException{
        ArrayList<Gun> myList = new ArrayList<Gun>();
        
        try{
            PreparedStatement statement = _connection.prepareStatement("SELECT ID, NOM, AGE, DATE_NAISSANCE, SALAIRE FROM LAB2");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                myList.add(new Gun(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getFloat(5)));
            }
           
        }catch(SQLException e){
            throw new importException(e.toString());
        }
        return myList;
    }
    public void addGun(Gun g) throws operationException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String[] params = new String[4];
        params[0] = g.getNom();
        params[1] = String.valueOf(g.getCalibre());
        params[2] = formatter.format(g.getDateSorti());
        params[3] = String.valueOf(g.getCout());
        
        PreparedStatement statement;
        
        try{
            statement = _connection.prepareStatement(ADDREQUEST);
            statement.clearParameters();
            for(int i = 0; i < params.length; i++){
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        }catch(SQLException e){
            throw new operationException(e.toString());
        }
        
    }
}

