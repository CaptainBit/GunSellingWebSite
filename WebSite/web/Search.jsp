<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.ImportationGun"%>
<%@page import="org.json.JSONArray"%>

<%@ page contentType="application/json" %>
<%
    String name = request.getParameter("name");
    JSONArray json = ImportationGun.importGunsFromName(name);
    
    out.print(json);
    out.flush();
%>