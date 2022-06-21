/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Implementacion de metodos abtractos cliente
 */
package com.artesanias.mx.model;

import com.artesanias.mx.entity.Clientes;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ClienteModelImpl implements IClienteModel{
    //Declaracion de variables para la session
    private SessionFactory sf;
    private Session s;
    //método creacion
    @Override
    public void crearRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(clientes);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    //método actualización
    @Override
    public void actualizarRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(clientes);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error " +e.getMessage());
        }
    }
    //método para listar los registros
    @Override
    public List<Clientes> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Clientes> lista = s.createCriteria(Clientes.class).list();
            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros " + e.getMessage());
        }
        return null;
    }
    //Metodo obtencion de un registro
    @Override
    public Clientes obtenerRegistro(int codigo) {
        try{
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Clientes clientes = (Clientes) s.get(Clientes.class, codigo);
            s.close();
            sf.close();
            return clientes;
        }catch (HibernateException e)
        {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }
    //método eliminar un registro
    @Override
    public void eliminarRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(clientes);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

































