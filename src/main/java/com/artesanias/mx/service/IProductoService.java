/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Interface productos
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Producto;
import java.util.List;


public interface IProductoService {
    public void crearRegistro(Producto producto);

    public void actualizarRegistro(Producto producto);

    public List<Producto> obtenerRegistros();

    public Producto obtenerRegistro(int codigo);

    public void eliminarRegistro(Producto producto); 
}
