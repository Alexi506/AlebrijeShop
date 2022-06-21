/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Implementacion de metodos Usuario
 */
package com.artesanias.mx.model;

import com.artesanias.mx.entity.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsuarioModelImpl implements IUsuarioModel{
    private SessionFactory sf;
    private Session s;
    //implemtación método crear
    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    //método implementación actualizacion usuarios
    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    //método para listar a los usuarios
    @Override
    public List<Usuario> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Usuario> lista = s.createCriteria(Usuario.class).list();
            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros " + e.getMessage());
        }
        return null;

    }
    //método para obtener un registro en especifico
    @Override
    public Usuario obtenerRegistro(int codigo) {
        try{
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Usuario usuario = (Usuario) s.get(Usuario.class, codigo);
            s.close();
            sf.close();
            return usuario;
        }catch (HibernateException e)
        {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }
    //método para eliminar un registro
    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
       
    }
}







