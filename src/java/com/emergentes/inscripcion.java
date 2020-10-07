package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Parametros", urlPatterns = {"/Parametros"})
public class inscripcion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Inscripcion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Inscripcion en curso</h1>");
            out.println("<br><br");
            out.print("from action='' method='post'>");
            out.println("Nombre:");
            out.println("<input type='text' name='nombre' required");
            out.println("<br><br>");
            out.println("Apellido");
            out.println("<input type='text' name='apellido' required");
            out.println("<br><br>");
            out.println("<input type='submit' value='Enbiar'");
            out.println("</from>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Parametros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>los datos resividos son</h1>");

            if (nombre != null || apellido != null) {
                out.println("Sus datos son: <br>");
                out.println("Nombre:" + nombre + "<br>");
                out.println("Apellido:" + apellido + "<br>");

            } else {
                out.println("No hay datos para mostrar!");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();

        }

    }

}
