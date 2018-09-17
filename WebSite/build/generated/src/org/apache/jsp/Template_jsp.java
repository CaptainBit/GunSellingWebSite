package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <script src=\"../js/libs/jquery/jquery.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./Css/Default.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Template</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1>Marchand d'armes</h1>\r\n");
      out.write("            <nav class=\"navsection\">\r\n");
      out.write("                <a href=\"Homepage.jsp\" class=\"logo\"><i class=\"fas fa-fighter-jet\"></i></a>\r\n");
      out.write("                <a href=\"Rifle.jsp\">Rifle</a>\r\n");
      out.write("                <a href=\"Pistol.jsp\">Pistol</a>\r\n");
      out.write("                <a href=\"./Jsp/Kids.jsp\">Kids</a>\r\n");
      out.write("                <div class=\"search-container\">\r\n");
      out.write("                  <form action=\"/action_page.php\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Search..\" name=\"search\">\r\n");
      out.write("                    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div class=\"Container\">\r\n");
      out.write("            <section class=\"section-gauche\">\r\n");
      out.write("                  <h1>Articles</h1>\r\n");
      out.write("                  <article>\r\n");
      out.write("                        <h1>Titre de l'article</h1>\r\n");
      out.write("                        <p>Contenu de l'article</p>\r\n");
      out.write("                  </article>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("              \r\n");
      out.write("        <div class=\"Container\">\r\n");
      out.write("            <aside class=\"aside-droite\">\r\n");
      out.write("                <h4>Sources de l'article</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a href=\"#\">Lien 1</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Lien 2</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Lien 3</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </aside>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <h5>Application web développée et programmée par </h5>            \r\n");
      out.write("            <h5><strong>William Lafontaine</strong> et <strong>Isaac Fiset</strong></h5>\r\n");
      out.write("            <h6>Étudiants programmeurs remarquables</h6>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
