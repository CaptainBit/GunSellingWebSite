package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Guns.Gun;
import org.json.JSONException;
import org.json.JSONObject;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Guns.SQLOrderGun;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
    
 

      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
