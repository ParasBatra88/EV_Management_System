/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.97
 * Generated at: 2024-11-11 17:46:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("  <title>EV charging Station</title>\r\n");
      out.write("  <meta content=\"\" name=\"description\">\r\n");
      out.write("  <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Favicons -->\r\n");
      out.write("  <link href=\"assets/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor CSS Files -->\r\n");
      out.write("  <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main CSS File -->\r\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- =======================================================\r\n");
      out.write("  * Template Name: Presento\r\n");
      out.write("  * Updated: Aug 30 2023 with Bootstrap v5.3.1\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/presento-bootstrap-corporate-template/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("  \r\n");
      out.write("  <style>\r\n");
      out.write("  button {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  margin: 4px 2px;\r\n");
      out.write("  border-radius: 12px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- ======= Header ======= -->\r\n");
      out.write("  <header id=\"header\" class=\"fixed-top d-flex align-items-center\">\r\n");
      out.write("    <div class=\"container d-flex align-items-center\">\r\n");
      out.write("      <h1 class=\"logo me-auto\"><a href=\"index.html\">EV Charging Station<span></span></a></h1>\r\n");
      out.write("      <!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("      <!-- <a href=\"index.html\" class=\"logo me-auto\"><img src=\"assets/img/logo.png\" alt=\"\"></a>-->\r\n");
      out.write("\r\n");
      out.write("      <nav id=\"navbar\" class=\"navbar order-last order-lg-0\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"Home.jsp\">Home</a></li>\r\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"UserRegister.jsp\">UserRegister</a></li>\r\n");
      out.write("        <!--   <li><a class=\"nav-link scrollto\" href=\"#services\">Admin</a></li> -->\r\n");
      out.write("          <!-- <li><a class=\"nav-link scrollto \" href=\"#portfolio\">Portfolio</a></li>\r\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#team\">Team</a></li>\r\n");
      out.write("          <li><a href=\"blog.html\">Blog</a></li>\r\n");
      out.write("          <li class=\"dropdown\"><a href=\"#\"><span>Drop Down</span> <i class=\"bi bi-chevron-down\"></i></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\">Drop Down 1</a></li>\r\n");
      out.write("              <li class=\"dropdown\"><a href=\"#\"><span>Deep Drop Down</span> <i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a href=\"#\">Deep Drop Down 1</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Drop Down 2</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Drop Down 3</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Drop Down 4</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Drop Down 5</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li><a href=\"#\">Drop Down 2</a></li>\r\n");
      out.write("              <li><a href=\"#\">Drop Down 3</a></li>\r\n");
      out.write("              <li><a href=\"#\">Drop Down 4</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#contact\">Contact</a></li> -->\r\n");
      out.write("        </ul>\r\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\r\n");
      out.write("      </nav><!-- .navbar -->\r\n");
      out.write("\r\n");
      out.write("      <a href=\"Home.jsp\" class=\"get-started-btn scrollto\">Get Started</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write(" <!--  <!-- ======= Hero Section ======= -->\r\n");
      out.write(" <!--  <section id=\"hero\" class=\"d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" data-aos=\"zoom-out\" data-aos-delay=\"100\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xl-6\">\r\n");
      out.write("          <h1>Bettter digital experience with Presento</h1>\r\n");
      out.write("          <h2>We are team of talented designers making websites with Bootstrap</h2>\r\n");
      out.write("          <a href=\"#about\" class=\"btn-get-started scrollto\">Get Started</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </section> -->\r\n");
      out.write("  <main id=\"main\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <!-- ======= About Section ======= -->\r\n");
      out.write("    <section id=\"about\" class=\"about section-bg\">\r\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row no-gutters\">\r\n");
      out.write("          <div class=\"content col-xl-6 d-flex align-items-stretch\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("           <center> <h2 class=\"bx bx-user\">UserLogin</h2></center><br><br>\r\n");
      out.write("            <form name=\"loginForm\" action=\"UserLoginController\" method=\"post\">\r\n");
      out.write("           \r\n");
      out.write("          \r\n");
      out.write("            <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\"   placeholder=\"abc@gmail.com\" required>\r\n");
      out.write("            <br>\r\n");
      out.write("           <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\"   placeholder=\"enter password\"  required data-validation-required-message=\"Please enter your password!\">\r\n");
      out.write("            <br><div class=\"text-center\">\r\n");
      out.write("             <button class=\"button\"  button name=\"login\"  type=\"submit\" value=\"login\">Login</button>\r\n");
      out.write("               <!-- <button class=\"button\" button name=\"login\"  type=\"submit\" value=\"login\">login</button> -->\r\n");
      out.write("                    <button class=\"button\" button name=\"reset\"  type=\"reset\" >Cancel</button>\r\n");
      out.write("               <!-- <button name=\"login\"  type=\"submit\" value=\"login\">login</button>\r\n");
      out.write("                   <button name=\"reset\"  type=\"reset\" >Cancel</button><br><br> -->\r\n");
      out.write("                   <!-- <p><i>Are you new? Please Register Here!!!</i></p> -->\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("			</div>\r\n");
      out.write("			</form>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("              <!-- <h3>Voluptatem dignissim</h3>\r\n");
      out.write("              <p>\r\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit\r\n");
      out.write("              </p> -->\r\n");
      out.write("             <!--  <a href=\"#\" class=\"about-btn\"><span>About us</span> <i class=\"bx bx-chevron-right\"></i></a> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-xl-6 d-flex align-items-stretch\">\r\n");
      out.write("            <div class=\"icon-boxes d-flex flex-column justify-content-center\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6 icon-box\" data-aos=\"fade-up\" data-aos-delay=\"100\">\r\n");
      out.write("                  <!-- <i class=\"bx bx-receipt\"></i> -->\r\n");
      out.write("                  <img src=\"assets/img/userreg.jpg\" class=\"img-fluid\" alt=\"\" style=\"margin-right: 60px\"><br><br>\r\n");
      out.write("                  <center><h5>Get start Your <a href=\"UserRegister.jsp\" class=\"btn-get-started scrollto\"> Registration!!!</a></h5></center>\r\n");
      out.write("                 <!--  <p>Consequuntur sunt aut quasi enim aliquam quae harum pariatur laboris nisi ut aliquip</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 icon-box\" data-aos=\"fade-up\" data-aos-delay=\"200\">\r\n");
      out.write("                  <!-- <i class=\"bx bx-cube-alt\"></i>\r\n");
      out.write("                  <h4>Ullamco laboris nisi</h4>\r\n");
      out.write("                  <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 icon-box\" data-aos=\"fade-up\" data-aos-delay=\"300\">\r\n");
      out.write("                 <!--  <i class=\"bx bx-images\"></i>\r\n");
      out.write("                  <h4>Labore consequatur</h4>\r\n");
      out.write("                  <p>Aut suscipit aut cum nemo deleniti aut omnis. Doloribus ut maiores omnis facere</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 icon-box\" data-aos=\"fade-up\" data-aos-delay=\"400\">\r\n");
      out.write("                 <!--  <i class=\"bx bx-shield\"></i>\r\n");
      out.write("                  <h4>Beatae veritatis</h4>\r\n");
      out.write("                  <p>Expedita veritatis consequuntur nihil tempore laudantium vitae denat pacta</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div><!-- End .content-->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </section><!-- End About Section -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor JS Files -->\r\n");
      out.write("  <script src=\"assets/vendor/purecounter/purecounter_vanilla.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/aos/aos.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main JS File -->\r\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
