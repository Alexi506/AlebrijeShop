/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Interface cliente
 */
package com.artesanias.mx.model;


import com.artesanias.mx.entity.Clientes;
import java.util.List;

//Declaracion método abstrcatos
public interface IClienteModel {
    public void crearRegistro(Clientes clientes);

    public void actualizarRegistro(Clientes clientes);

    public List<Clientes> obtenerRegistros();

    public Clientes obtenerRegistro(int codigo);

    public void eliminarRegistro(Clientes clientes); 
}
