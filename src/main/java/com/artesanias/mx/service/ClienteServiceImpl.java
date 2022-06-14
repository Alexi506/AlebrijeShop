/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Clientes;
import com.artesanias.mx.model.ClienteModelImpl;
import com.artesanias.mx.model.IClienteModel;
import java.util.List;


public class ClienteServiceImpl implements IClienteService{
    IClienteModel model = new ClienteModelImpl();

    @Override
    public void crearRegistro(Clientes clientes) {
        model.crearRegistro(clientes);
    }

    @Override
    public void actualizarRegistro(Clientes clientes) {
        model.actualizarRegistro(clientes);
    }

    @Override
    public List<Clientes> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public Clientes obtenerRegistro(int codigo) {
        return model.obtenerRegistro(codigo);
    }

    @Override
    public void eliminarRegistro(Clientes producto) {
        model.eliminarRegistro(producto);
    }
    
}
