/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Servlet Usuario
 */
package com.artesanias.mx.controller;

import com.artesanias.mx.entity.Usuario;
import com.artesanias.mx.model.IUsuarioModel;
import com.artesanias.mx.model.UsuarioModelImpl;
import com.artesanias.mx.service.IUsuarioService;
import com.artesanias.mx.service.UsuarioServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DefaultEditorKit;

public class UsuarioServletController extends HttpServlet {

    IUsuarioService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("Mostrar accion " + action);
        switch (action) {
            case "listar":
                System.out.println("listando....");
                Listar(request, response);
                break;
            case "crear":
                System.out.println("Creando....");
                crear(request, response);
                break;
            case "crearForm":
                crearFormulario(request, response);
                break;
            case "crearBD":
                crear(request, response);
                break;
            case "delete":
                Eliminar(request, response);
                break;
            case "actualizaForm":
                ActualizarForm(request, response);
                break;
            case "actualizar":
                System.out.println("Actualizando....");
                Actualizar(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    //Método llamada de formulario creacion clientes
    private void crearFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/createForm.jsp");
        dispatcher.forward(request, response);
    }
    //Método creación de clientes
    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getParameter("nombre"));
        int e = Integer.parseInt(request.getParameter("edad"));
        usuario.setEdad(e);
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setNombreusuario(request.getParameter("nombreusuario"));
        usuario.setContraseña(request.getParameter("password"));
        service = new UsuarioServiceImpl();
        service.crearRegistro(usuario);
        System.out.println("INGRESADO: " + usuario.getNombre());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/list.jsp");
        this.service = new UsuarioServiceImpl();
        List<Usuario> ListaUsuario = this.service.obtenerRegistros();
        System.out.println("Lista: " + ListaUsuario.size());
        request.setAttribute("ListaUsuario", ListaUsuario);
        dispatcher.forward(request, response);
    }
    //Método listar productos
    private void Listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/list.jsp");
        this.service = new UsuarioServiceImpl();
        List<Usuario> ListaUsuario = this.service.obtenerRegistros();
        request.setAttribute("ListaUsuario", ListaUsuario);
        dispatcher.forward(request, response);
    }
    //Método para eliminar usuario
    private void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/list.jsp");
        this.service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        service.eliminarRegistro(usuario);
        System.out.println("eliminando.....");
        List<Usuario> ListaUsuario = this.service.obtenerRegistros();
        request.setAttribute("ListaUsuario", ListaUsuario);
        dispatcher.forward(request, response);
    }
    //Método llamada al formulario Actualización
    private void ActualizarForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario usuario = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        request.setAttribute("usuario", usuario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/actualizar.jsp");
        dispatcher.forward(request, response);
    }
    //Método Actualizar usuario
    private void Actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getParameter("codigo"));
        Usuario usuario = new Usuario(Integer.parseInt(request.getParameter("codigo")));
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setNombreusuario(request.getParameter("nombreusuario"));
        usuario.setContraseña(request.getParameter("password"));
        service.actualizarRegistro(usuario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/list.jsp");
        List<Usuario> ListaUsuario = this.service.obtenerRegistros();
        request.setAttribute("ListaUsuario", ListaUsuario);
        dispatcher.forward(request, response);
    }

}
