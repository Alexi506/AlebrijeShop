/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Producto;
import com.artesanias.mx.model.IProductoModel;
import com.artesanias.mx.model.ProductoModelImpl;
import java.util.List;

/**
 *
 * @author labtw04
 */
public class ProductoServiceImpl implements IProductoService{
    
    IProductoModel model = new ProductoModelImpl();

    @Override
    public void crearRegistro(Producto producto) {
        model.crearRegistro(producto);
    }

    @Override
    public void actualizarRegistro(Producto producto) {
        model.actualizarRegistro(producto);
    }

    @Override
    public List<Producto> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public Producto obtenerRegistro(int codigo) {
          return model.obtenerRegistro(codigo);
    }

    @Override
    public void eliminarRegistro(Producto producto) {
        model.eliminarRegistro(producto);
    }
    
}
