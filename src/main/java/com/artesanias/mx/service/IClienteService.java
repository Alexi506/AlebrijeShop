/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Interface cliente service
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Clientes;
import java.util.List;

public interface IClienteService {
    public void crearRegistro(Clientes clientes);

    public void actualizarRegistro(Clientes clientes);

    public List<Clientes> obtenerRegistros();

    public Clientes obtenerRegistro(int codigo);

    public void eliminarRegistro(Clientes producto); 
}
