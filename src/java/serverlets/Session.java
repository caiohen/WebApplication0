package serverlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.Util;
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
@WebServlet(name = "Session", urlPatterns = {"/Session"})
public class Session extends HttpServlet {

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
        
        String msg = (String) request.getAttribute("msg");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

            /* TODO output your page here. You may use following sample code. */
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
                    out.println("<h3>Efetue Login antes de Prosseguir</h3>");
                    out.println("<form name=\"login\" action=\"validaLogin\" method=\"POST\">");
                        if(!Util.StrEmpty(msg)){
                            out.println("<code>" + msg + "</code><br />");
                        }
                        out.println("<input class=\"span3\" type=\"text\" name=\"user\" placeholder=\"usuario\" /><br />");
                        out.println("<input class=\"span3\" type=\"password\" name=\"pass\" placeholder=\"senha\" /><br />");
                        out.println("<button type=\"submit\" name=\"submit\" class=\"btn\"> Enviar </button>");
                    out.println("</form>");
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
