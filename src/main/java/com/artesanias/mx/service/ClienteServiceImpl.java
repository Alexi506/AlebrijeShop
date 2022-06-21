/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Implementacion de metodos service cliente
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
