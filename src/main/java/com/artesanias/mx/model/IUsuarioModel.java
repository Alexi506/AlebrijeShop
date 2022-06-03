/*
Autor: Alexi Daniel Ramirez Ruiz
Fecha de creación:17 de Marzo 2022
Fecha de Actualización: 17 de Marzo de 2022
Descripción: Servlet formulario editar registros
 */
package com.artesanias.mx.model;

import com.artesanias.mx.entity.Usuario;
import java.util.List;

/**
 *
 * @author labtw04
 */
public interface IUsuarioModel {
    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(int codigo);

    public void eliminarRegistro(Usuario usuario);  
}
