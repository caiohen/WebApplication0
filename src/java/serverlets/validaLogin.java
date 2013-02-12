package serverlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CaioHen
 */
@WebServlet(name = "validaLogin", urlPatterns = {"/validaLogin"})
public class validaLogin extends HttpServlet {

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
        
        String usuario = request.getParameter("user");
        String senha = request.getParameter("pass");
        
        String urlDestino = "/Session";
        
        String msg;
        if(usuario == null || usuario.equals("") || !usuario.equals("adm")){
            msg = "Por favor digite um usuário válido.";
        }else if(senha == null || senha.equals("") || !senha.equals("adm")){
            msg = "Por favor digitar uma senha válida.";
        }else{
            User objUser = new User(usuario, senha);
            request.getSession().setAttribute("user", objUser);
            msg = "Usuário autenticado.";
            urlDestino = "HomeApplication";
        }
                
        RequestDispatcher dispatcher = request.getRequestDispatcher(urlDestino);
        request.setAttribute("msg", msg);
        dispatcher.forward(request, response);
        
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
