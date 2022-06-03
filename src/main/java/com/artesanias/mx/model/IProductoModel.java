/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.model;


import com.artesanias.mx.entity.Producto;
import java.util.List;

/**
 *
 * @author labtw04
 */
public interface IProductoModel {
    public void crearRegistro(Producto producto);

    public void actualizarRegistro(Producto producto);

    public List<Producto> obtenerRegistros();

    public Producto obtenerRegistro(int codigo);

    public void eliminarRegistro(Producto producto); 
}
