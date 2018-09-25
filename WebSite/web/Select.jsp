
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.ImportationGun"%>
<%@page import="org.json.JSONArray"%>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int idType = Integer.valueOf(request.getParameter("idType"));
    JSONArray json = ImportationGun.importGunsFromId(idType);
    
    out.print(json);
    out.flush();
%>