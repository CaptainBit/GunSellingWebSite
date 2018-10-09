<%@page import="Guns.SQLOrderGun"%>
<%@ page contentType="text/xml" %>
<%@page pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%
    int idGun = Integer.valueOf(request.getParameter("idGun"));
    boolean deleted = SQLOrderGun.DeleteGun(idGun);
    
    if(deleted){
        out.print("Suppression réussi");
    }else{
        out.print("Erreur de la suppression");
    }
    out.flush();
%>
