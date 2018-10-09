<%@page import="Guns.Gun"%>
<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.SQLOrderGun"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%        
    //Valeur de gun
    String description = "";
    String imageUrl= "";
    int typeId= 0;
    String calibre= "";
    String action= "";
    float poids= 0;
    
    try
    {
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
        
    }catch(Exception e)
    {
        System.out.println(e);
    }
    Gun gunToAdd = new Gun(description, typeId, imageUrl, calibre, action, poids);
    if(SQLOrderGun.AddGun(gunToAdd)){
        out.print("L'ajout de " + description + " avec succès");
    }else{
        out.print("Échec");
    };
%>
