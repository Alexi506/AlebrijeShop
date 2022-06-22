<%-- 
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: JSP Formulario para Listar Clientes
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
        <script type="text/javascript" src="../resources/script.js"></script>
        <style type = "text/css">
            <%@ include file = "../resources/css/ListarCliente.css"%>
            <%@ include file = "../webjars/bootstrap/5.1.3/css/bootstrap.min.css"%>
            <%@ include file = "../webjars/fontawesome/4.7.0/css/font-awesome.css"%>
        </style>
    </head>
    <body>
        <!-- Menu index -->
        <div class="contenido">
            <div class="topnav" id="myTopnav">
                <a href="pages/index.html" class="active">Home</a>
                <a href="ClienteServletController?action=crearForm">Crear</a>
                <a href="ClienteServletController?action=listar">Actualizar </a>
                <a href="ClienteServletController?action=listar">Eliminar </a>
                <a href="pages/presentacion.html">Acerca de </a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
            </div>
        </div> <br>
        <!-- Fin Menu index -->
        
        <!-- Inicio for lista -->
        <div class="container">
            <c:forEach var="clientes" items="${ListaClientes}">
                <div class="card">
                    <div class="imgBx">
                        <img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOIeiLiTM8OCYqNr1du51aL_xJcZMEgJ-M-TVXL0TkYcPgGnymfm9lYHrG_8ZYwJkZuYk&usqp=CAU'>
                    </div>
                    <div class="content">
                        <h2><c:out value="${clientes.nombre}"/></h2>
                        <p>Edad: <c:out value="${clientes.edad}"/></p>
                        <p>Sexo: <c:out value="${clientes.sexo}"/></p>
                        <p>Dirección: <c:out value="${clientes.direccion}"/></p>
                        <p>Telefono: <c:out value="${clientes.telefono}"/></p>
                        <a href="ClienteServletController?action=actualizaForm&codigo=<c:out value="${clientes.codigo}"/>" onclick="return confirm('Estás seguro que deseas actualizar el registro?')">Actualizar</a>
                        <a href="ClienteServletController?action=delete&codigo=<c:out value="${clientes.codigo}"/>" onclick="return confirm('Estás seguro que deseas eliminar el registro?')"  >Eliminar</a>
                    </div>
                </div>
            </c:forEach>   
        </div>
        <!-- Fin for lista --> 
        
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
        <!-- Inicio script navegador -->
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
