<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    java.sql.Connection conn = null; 
    //Server
    String driver = "com.mysql.cj.jdbc.Driver";
    String servername = "localhost";
    String port = "3306";
    String schema = "prog_web";
    String parameter = "?serverTimezone=UTC";
    String url = "jdbc:mysql://" + servername + ":" + port + "/" + schema + parameter;
    String username = "root";
    String password = ""; 

    Properties properties = new Properties();
    properties.setProperty("user", username);
    properties.setProperty("password", password);
    properties.setProperty("useSSL", "false");
    properties.setProperty("verifyServerCertificate", "true");
    properties.setProperty("requireSSL", "false");

    try{
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, properties);
    }
    catch(SQLException e){
        System.out.println(e);
        System.exit(-1);
    }
    catch(Exception e){
        System.out.println(e);
        System.exit(-1);
    }
    
    String Where = ";";
    if(request.getParameter("idType") != null){
        if(!request.getParameter("idType").equals("0")){
            Where = " where types.idtype = " + request.getParameter("idType");
        }
    }
    else if(request.getParameter("search")!= null){
        if(!request.getParameter("search").equals(null)){
            Where = " where types.description = '" + request.getParameter("search") + "' or guns.description = '" + request.getParameter("search") + "'"; 
        }
    }
    
    String Requete = "SELECT * FROM guns inner join types on guns.idguns = types.idtype"+ Where;
    PreparedStatement pst=null;
    ResultSet rs = null;

    try{
        pst = conn.prepareStatement(Requete, 1005, 1008);
        //1005 == ResultSet.TYPE_SCROLL_SENSITIVE
        //1008 == ResultSet.CONCUR_UPDATABLE
        pst.clearParameters();
        rs = pst.executeQuery();

        String Retour = "<thead><tr><th scope=col'>Description</th>" +
                "<th scope=col'>Type</th></tr></thead><tbody>"; 
        
        while(rs.next()){
            Retour += "<tr onclick='ChangerImage("+ rs.getString("guns.idguns")+")'>" +
                "<td>"+rs.getString("guns.description")+"</td><td>"+rs.getString("types.description")+"</td></tr>";
        }

        Retour += "</tbody>";

        // Close ResultSet and PreparedStatement
        rs.close();
        pst.close();
        
        out.print(Retour);
    }
    catch(Exception e){
        System.out.println(e);
        System.exit(-1);
    }               
    finally{
        conn.close();
    }
%>