<%-- 
Autor: Alexi Daniel Ramirez Ruiz
Fecha de creación:17 de Marzo 2022
Fecha de Actualización: 17 de Marzo de 2022
Descripción: Servlet formulario editar registros
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Usuarios</title>
        <style type = "text/css">
            <%@ include file = "../resources/Tabla.css"%>
            <%@ include file = "../webjars/bootstrap/5.1.3/css/bootstrap.min.css"%>
            <%@ include file = "../webjars/fontawesome/4.7.0/css/font-awesome.css"%>
        </style>
        <script type=text/javascript">
            <%@ include file = "../resources/confirm.js"%>
        </script>
    </head>

    <body>
        <!-- Menu index -->
        <nav nav class="navbar navbar-dark bg-dark" style="background-color: #ddeeff;">
            <div class="container-fluid">
                <a href="pages/index.html" class="navbar-brand">Home</a>
            </div>
        </nav>
        <!-- Fin Menu index -->
        
        <div class="logo"><b>U<span>su</span><span>ar</span>ios</b></div><br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        
        

        <div id="main-wrapper">
            <div class="frozen-table" data-table="both">
                <table border="1" width="100%"  class="table">
                    <tr>

                        <td>Nombre</td>   
                        <td>Edad</td>  
                        <td>Sexo</td>  
                        <td>Nombreusuario</td>  
                        <td colspan=3>Acciones</td>  
                    </tr> 
                    <c:forEach var="usuario" items="${ListaUsuario}">
                        <tr>

                            <td><c:out value="${usuario.nombre}"/></td>
                            <td><c:out value="${usuario.edad}"/></td>
                            <td><c:out value="${usuario.sexo}"/></td>
                            <td><c:out value="${usuario.nombreusuario}"/></td>
                            
                            
                            <td><a href=""></a></td>
                            <td><a href="UsuarioServletController?action=actualizaForm&codigo=<c:out value="${usuario.codigo}"/>" onclick="return confirm('Estás seguro que deseas actualizar el registro?')">Editar</a></td>
                            <td><a href="UsuarioServletController?action=delete&codigo=<c:out value="${usuario.codigo}"/>" onclick="return confirm('Estás seguro que deseas eliminar el registro?')"  >Eliminar</a></td>


                        </tr> 
                    </c:forEach>
                </table> 
            </div>
        </div><br>
        <br>
        <br>


    </body>
</html>
