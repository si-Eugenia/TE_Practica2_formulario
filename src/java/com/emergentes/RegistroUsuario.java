package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroUsuario", urlPatterns = {"/RegistroUsuario"})
public class RegistroUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = "";
            String apellido = "";
            String correo = "";
            String contraceña = "";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro de Usuario</h1>");
            out.println("<br></br>");
            out.print("<form action='' method='post'>");
            
            out.println("Nombre:");
            out.println("<input type='text' name ='nombre' required>");
            out.println("<br>");
            
            out.println("Apellido:");
            out.println("<input type='text' name ='apellido' required>");
            out.println("<br>");
            
            out.println("Correo Electronico");
            out.println("<input type='email' name='correo'>");
            out.println("<br>");
            
            out.println("Contraceña:");
            out.println("<input type='text' name ='contraceña' required>");
            out.println("<br>");
            out.println("<input type='submit' value='enviar'>");

            out.println("</form>");
            out.println("</body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contraceña = request.getParameter("contraceña");
        PrintWriter out = response.getWriter();
        try {
            if (request.getParameter("enviar") != null) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet LeeParametros</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Los datos recibidos son:");
                out.println("Sus datos son:");
                out.println("Nombre:" + nombre + "<br>");
                out.println("Apellido:" + apellido + "<br>");
                out.println("correo:" + correo + "<br>");
                out.println("Contraceña:" + contraceña + "<br>");
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

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contraceña = request.getParameter("contraceña");
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
            out.println("Nombre:" + nombre + "<br>");
            out.println("Aperllido:" + apellido + "<br>");
            out.println("correo:" + correo + "<br>");
            out.println("Contraceña:" + contraceña + "<br>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }

    }

}
