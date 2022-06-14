/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.controller;

import com.artesanias.mx.entity.Producto;
import com.artesanias.mx.service.IProductoService;
import com.artesanias.mx.service.ProductoServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author labtw04
 */
public class ProductoServletController extends HttpServlet {
    
    IProductoService service;

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
    
     private void Listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/listarProducto.jsp");
        this.service = new ProductoServiceImpl();
        List<Producto> ListaProductos = this.service.obtenerRegistros();
        request.setAttribute("ListaProductos", ListaProductos);
        dispatcher.forward(request, response);
    }
     
     private void crearFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/CrearProducto.jsp");
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = new Producto();
        producto.setNombre(request.getParameter("nombre"));
        producto.setDescripcion(request.getParameter("descripcion"));
        double e = Double.parseDouble(request.getParameter("precio"));
        producto.setPrecio(e);
        service = new ProductoServiceImpl();
        service.crearRegistro(producto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/listarProducto.jsp");
        this.service = new ProductoServiceImpl();
        List<Producto> ListaProductos = this.service.obtenerRegistros();
        System.out.println("Lista: " + ListaProductos.size());
        request.setAttribute("ListaProductos", ListaProductos);
        dispatcher.forward(request, response);
    }
    
    
   private void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/listarProducto.jsp");
        this.service = new ProductoServiceImpl();
        Producto producto = new Producto();
        producto = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        service.eliminarRegistro(producto);
        List<Producto> ListaProductos = this.service.obtenerRegistros();
        request.setAttribute("ListaProductos", ListaProductos);
        dispatcher.forward(request, response);
    }
   
    private void ActualizarForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        request.setAttribute("producto", producto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ActualizarProducto.jsp");
        dispatcher.forward(request, response);
    }

    private void Actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getParameter("codigo"));
        Producto producto = new Producto(Integer.parseInt(request.getParameter("codigo")));
        producto.setNombre(request.getParameter("nombre"));
        producto.setDescripcion(request.getParameter("descripcion"));
        producto.setPrecio(Double.parseDouble(request.getParameter("precio")));
        service.actualizarRegistro(producto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/listarProducto.jsp");
        List<Producto> ListaProductos = this.service.obtenerRegistros();
        request.setAttribute("ListaProductos", ListaProductos);
        dispatcher.forward(request, response);
    }

   
}
