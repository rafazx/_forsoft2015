/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Rodovia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DarkBox
 */
@WebServlet(name = "ServletUI015", urlPatterns = {"/ServletUI015"})
public class ServletUI015 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Rodovia rodovia = new Rodovia ();
                
        String idRodovia = request.getParameter("idRodovia");
        String nome = request.getParameter("nome");
        String extensaoKm = request.getParameter("extensaoKM");
        String ufInicial = request.getParameter("ufInicial");
        String cidadeInicial = request.getParameter("cidadeInicial");
        String ufFinal = request.getParameter("ufFinal");
        String cidadeFinal = request.getParameter("cidadeFinal");
        
        rodovia.setIdRodovia(Integer.parseInt(idRodovia));
        rodovia.setNome(nome);
        rodovia.setExtensaoKm(Integer.parseInt(extensaoKm));
        rodovia.setUfInicial(ufInicial);
        rodovia.setCidadeInicial(cidadeInicial);
        rodovia.setUfFinal(ufFinal);
        rodovia.setCidadeFinal(cidadeFinal);
        
        
        
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("Nome: "+rodovia.getNome()+"<br>");
        out.println("Extensão: "+rodovia.getExtensaoKm()+"<br>");
        out.println("Cidade Inicial: "+rodovia.getCidadeInicial()+"<br>");
        out.println("UF Inicial: "+rodovia.getUfInicial()+"<br>");
        out.println("Cidade Final: "+rodovia.getCidadeFinal()+"<br>");
        out.println("UF Final: "+rodovia.getUfFinal()+"<br>");
        out.println("</body></html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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