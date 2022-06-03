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

   
}
