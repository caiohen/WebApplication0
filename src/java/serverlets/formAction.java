/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CaioHen
 */
@WebServlet(name = "formAction", urlPatterns = {"/formAction"})
public class formAction extends HttpServlet {   

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
        String getMethod;
        getMethod = request.getMethod();
        String getRequestURI;
        getRequestURI = request.getRequestURI();
        StringBuffer getRequestURL;
        getRequestURL = request.getRequestURL();
        String getContextPath;
        getContextPath = request.getContextPath();
        String getServletPath;
        getServletPath = request.getServletPath();
        String getQueryString;
        getQueryString = request.getQueryString();
        String getHeader;
        getHeader = request.getHeader("user-agent");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("getMethod() -> " + getMethod);
            out.println("<br />");
            out.println("getRequestURI() -> " + getRequestURI);
            out.println("<br />");
            out.println("getRequestURL() -> " + getRequestURL);
            out.println("<br />");
            out.println("getContextPath() -> " + getContextPath);
            out.println("<br />");
            out.println("getServletPath() -> " + getServletPath);
            out.println("<br />");
            out.println("getQueryString() -> " + getQueryString);
            out.println("<br />");
            out.println("getHeader(\"user-agent\") -> " + getHeader);
        } finally {            
            out.close();
        }
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
