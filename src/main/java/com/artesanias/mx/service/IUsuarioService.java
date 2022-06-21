/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Interface usuarios
 */
package com.artesanias.mx.service;

import com.artesanias.mx.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(int codigo);

    public void eliminarRegistro(Usuario usuario);  
    
}
