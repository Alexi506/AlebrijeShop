/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Implementacion de metodos Productos
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Producto;
import com.artesanias.mx.model.IProductoModel;
import com.artesanias.mx.model.ProductoModelImpl;
import java.util.List;


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
