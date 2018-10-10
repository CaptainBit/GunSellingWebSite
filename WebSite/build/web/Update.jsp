<%@page import="Guns.Gun"%>
<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.SQLOrderGun"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Valeur de gun
    String description = "";
    String imageUrl= "";
    int typeId= 0;
    String calibre= "";
    String action= "";
    float poids= 0;
    int idGun = 0;
    
    try
    {
        idGun = Integer.parseInt(request.getParameter("idItem"));
        if(request.getParameter("description") != null && !request.getParameter("description").isEmpty())
            description = request.getParameter("description");
        if(request.getParameter("calibre") != null && !request.getParameter("calibre").isEmpty())
            calibre = request.getParameter("calibre");
        if(request.getParameter("action") != null && !request.getParameter("action").isEmpty())
            action = request.getParameter("action");
        if(request.getParameter("poids") != null && !request.getParameter("poids").isEmpty())
            poids =  Float.valueOf(request.getParameter("poids"));
        if(request.getParameter("type") != null && !request.getParameter("type").isEmpty())
            typeId = Integer.parseInt(request.getParameter("type"));
        if(request.getParameter("image") != null && !request.getParameter("image").isEmpty())
            imageUrl = request.getParameter("image");
        
    }catch(Exception e)
    {
        System.out.println(e);
    }
    Gun gunToUpdate = new Gun(idGun,description, typeId, imageUrl, calibre, action, poids);
    
    if(SQLOrderGun.UpdateGun(gunToUpdate)){
        out.print("L'édition de " + description + " avec succès");
    }else{
        out.print("Échec");
    };
    
 
%>
