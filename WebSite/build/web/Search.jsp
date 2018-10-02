<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.SQLOrderGun"%>
<%@page import="org.json.JSONArray"%>

<%@ page contentType="application/json" %>
<%
    String name = request.getParameter("name");
    JSONArray json = SQLOrderGun.importGunsFromName(name);
    
    out.print(json);
    out.flush();
%>