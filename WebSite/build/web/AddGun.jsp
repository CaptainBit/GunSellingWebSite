<%@page import="Guns.Gun"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Guns.SQLOrderGun"%>

<%@page contentType="application/json"%>
<%

    String item = request.getParameter("description");
    
    JSONObject json = new JSONObject(request.getParameter("gun"));
    
    //Valeur de gun
    String description = null;
    String imageUrl= null;
    int typeId= 0;
    String calibre= null;
    String action= null;
    float poids= 0;
    
    try
    {
        description = json.getString("gun_description");
        imageUrl = json.getString("gun_imageUrl");
        calibre = json.getString("gun_calibre");
        action = json.getString("gun_action");
        poids = (float)json.getLong("gun_poids");
        typeId = json.getInt("gun_typeId");
    }catch(JSONException e)
    {
        System.out.println(e);
        System.exit(-1);
    }
    Gun gunToAdd = new Gun(description, typeId, imageUrl, calibre, action, poids);
    SQLOrderGun.AddGun(gunToAdd);
    
 
%>
