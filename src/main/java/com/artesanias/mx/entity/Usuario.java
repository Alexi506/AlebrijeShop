/*
Autor: Alexi Daniel Ramirez Ruiz 
Fecha de creación: 17 de Marzo 2022
Fecha de Actualización: 17 de Marzo de 2022
Descripción: Servlet formulario editar registros
 */
package com.artesanias.mx.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
//@NamedQueries({
//    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})

/* Driver para la base de datos */
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "codigo", length = 20, nullable = true)
    private Integer codigo;
    // @Size(max = 20)
    @Column(name = "nombre", length = 30, nullable = true)
    private String nombre;
    @Column(name = "edad", length = 20, nullable = true)
    private Integer edad;
    //@Size(max = 15)
    @Column(name = "sexo", length = 20, nullable = true)
    private String sexo;
    //@Size(max = 20)
    @Column(name = "nombreusuario", length = 30, nullable = true)
    private String nombreusuario;
    //@Size(max = 20)  \u00f1
    @Column(name = "contraseña", length = 30, nullable = true)
    private String contraseña;
    
    @Column(name = "urlimagen", length = 30, nullable = true)
    private String urlImagen;

    public Usuario() {
    }

    public Usuario(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.artesanias.mx.entity.Usuario[ codigo=" + codigo + " ]";
    }

}
