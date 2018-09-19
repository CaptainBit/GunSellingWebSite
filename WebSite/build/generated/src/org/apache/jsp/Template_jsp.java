package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.DriverManager;

public final class Template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <script src=\"./js/libs/jquery/jquery.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            #navBarSearchForm input[type=text]{width:430px !important;}\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Template</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("              <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                  <a class=\"navbar-brand\" onclick=\"ChangerTable(0)\" href=\"#\">Dictionnaire des armes à feu  <i class=\"fas fa-fighter-jet\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li><a href=\"#\" onclick=\"ChangerTable(1)\">Rifle</a></li>\r\n");
      out.write("                    <li><a href=\"#\" onclick=\"ChangerTable(2)\">Pistol</a></li>\r\n");
      out.write("                    <li><a href=\"#\" onclick=\"ChangerTable(3)\">Kids</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form class=\"navbar-form navbar-right\" action=\"/action_page.php\" id=\"navBarSearchForm\">\r\n");
      out.write("                  <div class=\"input-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Recherche d'une arme à feu\" name=\"search\">\r\n");
      out.write("                    <div class=\"input-group-btn\">\r\n");
      out.write("                      <button class=\"btn btn-default\" type=\"submit\">\r\n");
      out.write("                        <i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("                      </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </nav>                            \r\n");
      out.write("        </div>  \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-fluid\" style=\"padding-top: 80px\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                <section class=\"col-xs-12 col-sm-12 col-md-8 col-lg-7\">\r\n");
      out.write("                    <article class=\"panel panel-default\" style=\"width:100%\">\r\n");
      out.write("                      <div class=\"panel-heading\">Recherche</div>\r\n");
      out.write("                      <div class=\"panel-body\">\r\n");
      out.write("                          <h4 id=\"table-nom\">Toutes les armes à feu</h4>\r\n");
      out.write("                          <table class=\"table table-hover\" id=\"table-data\">\r\n");
      out.write("                          </table>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </section>\r\n");
      out.write("                \r\n");
      out.write("                <aside class=\"col-xs-12 col-sm-12 col-md-4 col-lg-5\">\r\n");
      out.write("                    <article class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">Image de l'arme à feu</div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <h4 id=\"img-nom\">AK-47</h4>\r\n");
      out.write("                            <img id=\"img-data\" src=\"./img/pistol.jpg\" class=\"img-fluid\" alt=\"Erreur du chargement de l'image\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>                    \r\n");
      out.write("                </aside>\r\n");
      out.write("                \r\n");
      out.write("            </div>   \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer-copyright text-center py-3\">\r\n");
      out.write("                Application web développée et programmée par William Lafontaine et Isaac Fiset            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("        $('document').ready(function(){\r\n");
      out.write("            ChangerTable(0);\r\n");
      out.write("        })\r\n");
      out.write("        \r\n");
      out.write("        function ChangerTable(idType){\r\n");
      out.write("            \r\n");
      out.write("            switch(idType){\r\n");
      out.write("                case 0:\r\n");
      out.write("                    $(\"#table-nom\").text(\"Toute les armes\");\r\n");
      out.write("                    break;\r\n");
      out.write("                case 1:\r\n");
      out.write("                    $(\"#table-nom\").text(\"Rifle\");\r\n");
      out.write("                    break;\r\n");
      out.write("                case 2:\r\n");
      out.write("                    $(\"#table-nom\").text(\"Pistol\");\r\n");
      out.write("                    break;\r\n");
      out.write("                case 3:\r\n");
      out.write("                    $(\"#table-nom\").text(\"Kids\");\r\n");
      out.write("                    break;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            $.post(\"./Select.jsp\",{\"idType\":idType},function(data){\r\n");
      out.write("                $('#table-data').html(data);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("                \r\n");
      out.write("        function ChangerImage(id){\r\n");
      out.write("            switch(id){\r\n");
      out.write("                case 1:\r\n");
      out.write("                    $('#img-nom').text('uzi');\r\n");
      out.write("                    $('#img-data').attr(\"src\",\"./img/uzi.jpg\");                    \r\n");
      out.write("                    break;\r\n");
      out.write("                case 2: \r\n");
      out.write("                    $('#img-nom').text('pistol');                    \r\n");
      out.write("                    $('#img-data').attr(\"src\",\"./img/pistol.jpg\");\r\n");
      out.write("                    break;\r\n");
      out.write("                case 3: \r\n");
      out.write("                    $('#img-nom').text('ak-47');                    \r\n");
      out.write("                    $('#img-data').attr(\"src\",\"./img/ak-47.jpg\");                    \r\n");
      out.write("                    break;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        </script>        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>    ");
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
