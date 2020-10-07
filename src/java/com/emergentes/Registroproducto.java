
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Registroproducto", urlPatterns = {"/Registroproducto"})
public class Registroproducto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String producto = "";
            String Existencia = "";
            int precio = 0;
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Productos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro de productos</h1>");
            out.println("<br></br>");
            out.print("<form action='' method='post'>");
            
            out.println("producto:");
            out.println("<input type='text' name ='producto' required>");
            out.println("<br>");
            
            out.println("existencia:");
            out.println("<input type='text' name ='existencia' required>");
            out.println("<br>");
            
            out.println("precio:");
            out.println("<input id='precio' name ='precio' placeholder='' requared>");
            out.println("<br>");
            out.println("<input type='submit' value='enviar'>");

            out.println("</form>");
            out.println("</body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        String productos = request.getParameter("Producto");
        String existencia = request.getParameter("Existencia");
        int precio = Integer.parseInt(request.getParameter("Precio"));
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
                out.println("Producto:" + productos + "<br>");
                out.println("Apellido:" + existencia + "<br>");
                out.println("Precio:" + precio + "<br>");
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

        String producto = request.getParameter("Producto");
        String excistencia = request.getParameter("Existencia");
        int precio = Integer.parseInt(request.getParameter("Precio"));
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
            out.println("Nombre:" + producto + "<br>");
            out.println("Apellido:" + excistencia + "<br>");
            out.println("telefono:" + precio + "<br>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }
    }

}
