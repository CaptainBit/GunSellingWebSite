<%@page import="Guns.SQLOrderGun"%>
<%@page import="org.json.JSONArray"%>
<%@ page contentType="application/json" %>
<%
    JSONArray types = SQLOrderGun.GetType();
    out.print(types);
    out.flush();
%>