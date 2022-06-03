/*
Autor: Alexi Daniel Ramirez Ruiz
Fecha de creación:17 de Marzo 2022
Fecha de Actualización: 17 de Marzo de 2022
Descripción: Servlet formulario editar registros
 */
package com.artesanias.mx.service;

import com.artesanias.mx.model.*;
import com.artesanias.mx.entity.Usuario;

import java.util.List;


public class UsuarioServiceImpl implements IUsuarioService{
    
    IUsuarioModel modelo = new UsuarioModelImpl();

    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int codigo) {
        return modelo.obtenerRegistro(codigo);
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        modelo.eliminarRegistro(usuario);
    }
    
}
