package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;
import model.UsuarioNegocio;
// Snippet en visual studio code
public class UsuarioController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private UsuarioNegocio usuarioNegocio = new UsuarioNegocio();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener parámetros del formulario JSP
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        int edad = Integer.parseInt(request.getParameter("edad"));  
        Usuario usuario = new Usuario(nombre, email,edad);

        
        // Procesar la lógica de negocio
        String usuarioRegistrado = usuarioNegocio.registrarUsuario(usuario);

        //System.out.println(nombre);
        // Enviar resultado a la vista (JSP)
        request.setAttribute("nombre", nombre);
        request.setAttribute("edad", edad);
        request.setAttribute("email", email);
        request.setAttribute("usuarioRegistrado", usuarioRegistrado);

        // Redireccionar a la vista
        request.getRequestDispatcher("/vista/usuario.jsp").forward(request, response);
    }

}
