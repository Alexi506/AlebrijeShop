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

    <body style="background-color: azure">

        <!-- Menu index -->
        <div class="contenido">
            <div class="topnav" id="myTopnav">
                <a href="pages/index.html" class="active">Home</a>
                <a href="UsuarioServletController?action=crearForm">Crear</a>
                <a href="UsuarioServletController?action=listar">Actualizar </a>
                <a href="UsuarioServletController?action=listar">Eliminar </a>
                <a href="#contact">Acerca de </a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
            </div>
        </div> <br>
        <!-- Fin Menu index -->



        <!-- Inicio form lista -->   
        <div class="cuader">
            <c:forEach var="usuario" items="${ListaUsuario}">
                <figure class="snip0056">
                    <figcaption>
                        <h2> <span>Usuario: </span> <c:out value="${usuario.nombre}"/> </h2>
                        <p>Edad: <c:out value="${usuario.edad}"/> </p>
                        <p>Sexo: <c:out value="${usuario.sexo}"/> </p>
                        <p>Nombre Usuario: <c:out value="${usuario.nombreusuario}"/> </p>
                    </figcaption>
                        <%--  <img src="<c:url value="${usuario.urlImagen}"/>"/> --%>
                        <img src="resources/img/alebrije7.jpg"/>
                    <div class="position"><a href="UsuarioServletController?action=actualizaForm&codigo=<c:out value="${usuario.codigo}"/>" onclick="return confirm('Estás seguro que deseas actualizar el registro?')">Editar</a> <a href="UsuarioServletController?action=delete&codigo=<c:out value="${usuario.codigo}"/>" onclick="return confirm('Estás seguro que deseas eliminar el registro?')"  >Eliminar</a></div>
                </figure>
            </c:forEach>
        </div>
        <!-- Fin form lista --> 



        <br>
        <br>
        <br>
        <br>
        <br>
        <!-- Pie de pagina -->
        <footer class="bg-dark text-white text-center text-lg-start">
            <!-- Grid container -->
            <div class="container p-4">
                <div class="row">
                    <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
                        <h5 class="text-uppercase">AlebrijesShop</h5>

                        <p>
                            "Hecho a mano hechos con el corazón"
                        </p>
                    </div>
                    <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                        <h5 class="text-uppercase">Redes sociales</h5>

                        <ul class="list-unstyled mb-0">

                            <a href="#"> <img src="resources/img/instagram.png"><i class="text-white">AlexRam</i></a><br><br>
                            <a href="#"> <img src="resources/img/facebook.png"><i class="text-white">Alexi Ramirez</i></a><br><br>
                            <a href="#"> <img src="resources/img/whatsapp.png"><i class="text-white">2548759658</i></a><br>

                        </ul>
                    </div>
                    <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                        <h5 class="text-uppercase mb-0">Contactos</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" class="text-white">01234567895</a>
                            </li>
                            <li>
                                <a href="#!" class="text-white">5687945684</a>
                            </li>
                        </ul>
                    </div>
                    <!--Grid column-->
                </div>
                <!--Grid row-->
            </div>

            <!-- Copyright -->
            <div class="text-center p-3" style="background-color: rgba(255, 63, 162, 1);">
                © 2022 Copyright:
                <a class="text-white" href="#">Artesanías .com</a>
            </div>
            <!-- Copyright -->
        </footer>
        <!-- Fin de Pie de pagina -->

        <script>
            function myFunction() {
                var x = document.getElementById("myTopnav");
                if (x.className === "topnav") {
                    x.className += " responsive";
                } else {
                    x.className = "topnav";
                }
            }
        </script>


    </body>
</html>
