/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.controller;

import com.artesanias.mx.entity.Clientes;
import com.artesanias.mx.service.ClienteServiceImpl;
import com.artesanias.mx.service.IClienteService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author labtw04
 */
@WebServlet(name = "ClienteServletController", urlPatterns = {"/ClienteServletController"})
public class ClienteServletController extends HttpServlet {
    IClienteService service;

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
            case "actualizaForm":
                ActualizarForm(request, response);
                break;
            case "actualizar": 
                Actualizar(request, response);
                break;
            case "delete":
                Eliminar(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    private void Listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarClientes.jsp");
        this.service = new ClienteServiceImpl();
        List<Clientes> ListaClientes = this.service.obtenerRegistros();
        request.setAttribute("ListaClientes", ListaClientes);
        dispatcher.forward(request, response);
    }
    
    private void crearFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/CrearCliente.jsp");
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Clientes clientes = new Clientes();
        clientes.setNombre(request.getParameter("nombre"));
        int e = Integer.parseInt(request.getParameter("edad"));
        clientes.setEdad(e);
        clientes.setSexo(request.getParameter("sexo"));
        clientes.setDireccion(request.getParameter("direccion"));
        clientes.setTelefono(request.getParameter("telefono"));
        service = new ClienteServiceImpl();
        service.crearRegistro(clientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarClientes.jsp");
        this.service = new ClienteServiceImpl();
        List<Clientes> ListaClientes = this.service.obtenerRegistros();
        System.out.println("Lista: " + ListaClientes.size());
        request.setAttribute("ListaClientes", ListaClientes);
        dispatcher.forward(request, response);
    }
    
    private void ActualizarForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Clientes clientes = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        request.setAttribute("clientes", clientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ActualizarCliente.jsp");
        dispatcher.forward(request, response);
    }

    private void Actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getParameter("codigo"));
        Clientes clientes = new Clientes(Integer.parseInt(request.getParameter("codigo")));
        clientes.setNombre(request.getParameter("nombre"));
        clientes.setEdad(Integer.parseInt(request.getParameter("edad")));
        clientes.setSexo(request.getParameter("sexo"));
        clientes.setDireccion(request.getParameter("direccion"));
        clientes.setTelefono(request.getParameter("telefono"));
        service.actualizarRegistro(clientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarClientes.jsp");
        List<Clientes> ListaClientes = this.service.obtenerRegistros();
        request.setAttribute("ListaClientes", ListaClientes);
        dispatcher.forward(request, response);
    }
    
    
    private void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarClientes.jsp");
        this.service = new ClienteServiceImpl();
        Clientes clientes = new Clientes();
        clientes = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        service.eliminarRegistro(clientes);
        List<Clientes> ListaClientes = this.service.obtenerRegistros();
        request.setAttribute("ListaClientes", ListaClientes);
        dispatcher.forward(request, response);
    }

    
}
