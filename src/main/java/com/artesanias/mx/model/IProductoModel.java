/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Interface producto
 */
package com.artesanias.mx.model;
import com.artesanias.mx.entity.Producto;
import java.util.List;

//Declaracion de métodos
public interface IProductoModel {
    public void crearRegistro(Producto producto);

    public void actualizarRegistro(Producto producto);

    public List<Producto> obtenerRegistros();

    public Producto obtenerRegistro(int codigo);

    public void eliminarRegistro(Producto producto); 
}
