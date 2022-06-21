<%-- 
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: JSP Listar Productos
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style type = "text/css">
            <%@ include file = "../resources/css/menuprod.css"%>
        </style>
        <style>
            <%@include file="../webjars/bootstrap/5.1.3/css/bootstrap.min.css"%>
        </style>
    </head>
    <body style="background: azure">
        <!-- Menu Producto -->
        <div class="contenido">
            <div class="topnav" id="myTopnav">
                <a href="pages/index.html" class="active">Home</a>
                <a href="ProductoServletController?action=crearForm">Crear</a>
                <a href="ProductoServletController?action=listar">Actualizar</a>
                <a href="ProductoServletController?action=listar">Listar </a>
                <a href="ProductoServletController?action=listar">Eliminar </a>
                <a href="pages/presentacion.html">Acerca de </a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
            </div>
        </div> <br>
        <!-- Fin Menu Producto -->


        <!-- Inicio body seccion de Product details -->
        <div class="shell">
            <div class="container">
                <div class="row">
                    <c:forEach var="producto" items="${ListaProductos}">
                        <div class="col-md-3">
                            <div class="wsk-cp-product">
                                <div class="wsk-cp-img">
                                    <img src="<c:url value="${producto.urlImagen}"/>"/>
                                </div>
                                <div class="wsk-cp-text">
                                    <div class="category">
                                        <span><c:out value="${producto.nombre}"/></span>
                                    </div>
                                    <div class="title-product">
                                        <h3><c:out value="${producto.descripcion}"/></h3>
                                    </div>
                                    <div class="description-prod">
                                        <p>
                                        <td><a href="ProductoServletController?action=actualizaForm&codigo=<c:out value="${producto.codigo}"/>" onclick="return confirm('Estás seguro que deseas actualizar el registro?')">Actualizar</a></td>
                                        <td><a href="ProductoServletController?action=delete&codigo=<c:out value="${producto.codigo}"/>" onclick="return confirm('Estás seguro que deseas eliminar el registro?')"  >Eliminar</a></td>
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="wcf-left"><span class="price">Precio: $ <c:out value="${producto.precio}"/></span></div>
                                        <div class="wcf-right"><a href="#" class="buy-btn"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>          
                </div>
            </div>
        </div>
        <!-- Fin body seccion de Product details -->


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
        <!-- Script navegador -->
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
