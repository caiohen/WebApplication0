/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverlets;

import classes.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CaioHen
 */
@WebServlet(name = "HomeApplication", urlPatterns = {"/HomeApplication"})
public class HomeApplication extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        User objUser = (User) request.getSession().getAttribute("user");
        
        String nome = objUser.getNome();
        String user = objUser.getNickName();
        String pass = objUser.getPassword();
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Servlet Session</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
                out.println("<div class=\"page-header\">Treinando Java</div>");
                out.println("<div class=\"nav\">");
                    out.println("<ul class=\"breadcrumb\">");
                        out.println("<li><a href=\"index.jsp\" class=\"\">Index</a> <span class=\"divider\">/</span></li>");
                        out.println("<li><a href=\"#\" class=\"active\">Gerenciamento de Sessoes</a> <span class=\"divider\">/</span></li>");
                    out.println("</ul>");
                out.println("</div>");
                out.println("<div class=\"container\">");
                    out.println("<div class=\"navbar\">");
                        out.println("<div class=\"navbar-inner\">");
                            out.println("<div class=\"container\">");
                                out.println("<a class=\"brand\" href=\"#\">Bem-vindo</a>");
                                out.println("<div class=\"nav-collapse collapse navbar-responsive-collapse\">");
                                    out.println("<form class=\"navbar-search pull-left\" action=\"\">");
                                        out.println("<input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">");
                                    out.println("</form>");
                                    out.println("<ul class=\"nav pull-right\">");
                                        out.println("<li>");
                                            out.println("<a href=\"LogOff\">Sair</a>");
                                        out.println("</li>");
                                    out.println("</ul>");
                                out.println("</div>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"hero-unit\">");
                        out.println("<h1>" + nome + ",</h1><br /><h2>Bem vindo!!</h2>");
                        out.println("<h3>A servlet criou uma sessão, então a partir de agora você está logado!</h3>");
                        out.println("<p>");
                            out.println("Seus dados Básicos:<br />");
                            out.println("Usuário: " + user + "<br />");
                            out.println("Senha: " + pass);
                        out.println("</p>");
                        out.println("<a href=\"LogOff\" class=\"btn btn-primary btn-large\"> Sair </a>");
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
