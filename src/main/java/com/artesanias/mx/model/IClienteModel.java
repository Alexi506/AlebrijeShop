/*
Autor: Alexi Daniel Ramirez Ruiz 
Fecha de creación: 17 de Marzo 2022
Fecha de Actualización: 17 de Marzo de 2022
Descripción: Interface Clientes
 */
package com.artesanias.mx.model;


import com.artesanias.mx.entity.Clientes;
import java.util.List;


public interface IClienteModel {
    public void crearRegistro(Clientes clientes);

    public void actualizarRegistro(Clientes clientes);

    public List<Clientes> obtenerRegistros();

    public Clientes obtenerRegistro(int codigo);

    public void eliminarRegistro(Clientes clientes); 
}
