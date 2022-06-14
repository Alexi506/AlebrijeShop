/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
