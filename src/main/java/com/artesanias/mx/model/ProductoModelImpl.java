/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artesanias.mx.model;

import com.artesanias.mx.entity.Producto;
import com.artesanias.mx.entity.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labtw04
 */
public class ProductoModelImpl implements IProductoModel{
    private SessionFactory sf;
    private Session s;

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
            System.out.println("Registrado correctamente");
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

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
            System.out.println("Actualizado correctamente");
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

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
             System.out.println("Eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        IProductoModel model = new ProductoModelImpl();
        Producto p = new Producto();
       // p.setCodigo(9);
        p.setNombre("Tapete");
        p.setDescripcion("Producto de lana");
        p.setPrecio(80.5);
        p.setUrlImagen("resources/img/tapete.jpg");
        model.crearRegistro(p);
        //model.actualizarRegistro(p);
        //model.eliminarRegistro(p);
    }

}
