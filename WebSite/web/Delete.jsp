<%@page import="org.json.JSONObject"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.SQLOrderGun"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int idGun = Integer.valueOf(request.getParameter("idGun"));
    boolean deleted = SQLOrderGun.DeleteGun(idGun);
    
   
    out.print(deleted);
    out.flush();
%>
