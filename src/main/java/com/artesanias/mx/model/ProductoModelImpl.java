/*
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: Implementacion de métodos productos
 */
package com.artesanias.mx.model;

import com.artesanias.mx.entity.Producto;
import com.artesanias.mx.entity.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ProductoModelImpl implements IProductoModel{
    private SessionFactory sf;
    private Session s;
    //implemetación metodo crear
    @Override
    public void crearRegistro(Producto producto) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(producto);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    //implementación método actualizar
    @Override
    public void actualizarRegistro(Producto producto) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(producto);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    //implementación método obtenerregistros-lista a los productos
    @Override
    public List<Producto> obtenerRegistros() {
         try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Producto> lista = s.createCriteria(Producto.class).list();
            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros " + e.getMessage());
        }
        return null;
    }
    //implemetación método obteneRegistro
    @Override
    public Producto obtenerRegistro(int codigo) {
        try{
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Producto producto = (Producto) s.get(Producto.class, codigo);
            s.close();
            sf.close();
            return producto;
        }catch (HibernateException e)
        {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }
    //método para eliminar un egistro
    @Override
    public void eliminarRegistro(Producto producto) {
         try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(producto);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
