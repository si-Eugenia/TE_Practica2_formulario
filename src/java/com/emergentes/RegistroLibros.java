
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroLibros", urlPatterns = {"/RegistroLibros"})
public class RegistroLibros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String titulo = "";
            String autor = "";
            String resumen = "";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>libros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro de libros</h1>");
            out.println("<br></br>");
            out.print("<form action='' method='post'>");
            out.println("tirulo:");
            out.println("<input type='text' name ='titulo' required>");
            out.println("<br>");
            
            out.println("autor:");
            out.println("<input type='text' name ='autor' required>");
            out.println("<br>");
            
            out.println("resumen");
            out.println("<input type='email' name='resumen'>");
            out.println("<br>");
            out.println("<input type='submit' value='enviar'>");

            out.println("</form>");
            out.println("</body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        String titulo = request.getParameter("Titulo");
        String autor = request.getParameter("Autor");
        String resumen = request.getParameter("Resumen");
        PrintWriter out = response.getWriter();
        try {
            if (request.getParameter("enviar") != null) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Registro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Los datos recibidos son:");
                out.println("Sus datos son:");
                out.println("Titulo:" + titulo + "<br>");
                out.println("Autor:" + autor + "<br>");
                out.println("Resumen:" + resumen + "<br>");
                out.println("</body>");
                out.println("</html>");
            }
        } finally {
            out.close();
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String titulo = request.getParameter("Titulo");
        String autor = request.getParameter("Autor");
        String resumen = request.getParameter("Resumen");
        PrintWriter out = response.getWriter();
        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Los datos recibidos son:");
            out.println("<br>");
            out.println("Sus datos son:");
            out.println("<br>");
            out.println("Nombre:" + titulo + "<br>");
            out.println("Apellido:" + autor + "<br>");
            out.println("correo:" + resumen + "<br>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }
        
    }


}
