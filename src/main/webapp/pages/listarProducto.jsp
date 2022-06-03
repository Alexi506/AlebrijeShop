<%-- 
    Document   : listarProducto
    Created on : 17 may 2022, 15:24:09
    Author     : labtw04
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type = "text/css">
            <%@ include file = "../resources/css/menuprod.css"%>
        </style>
    </head>
    <body>
        <%-- Inicio ménu --%>
        <div class="wrapper">
            <header class="main-header">
                <a href="#" class="logo">Artesanías</a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <div class="navbar-custom-menu">

                    </div>
                </nav>
            </header>
            <aside class="main-sidebar">
                <section class="sidebar">
                    <ul class="sidebar-menu">
                        <li role="presentation"><a href="pages/index.html"><i class="fa fa-tachometer"></i> Home </a></li>
                        <li class="header">CRUD</li>

                        <li role="presentation"><a href="pages/index.html"><i class="fa fa-tachometer"></i> Registro </a></li>
                        <li role="presentation"><a href="pages/index.html"><i class="fa fa-tachometer"></i> Actualizar </a></li>
                        <li role="presentation"><a href="pages/index.html"><i class="fa fa-tachometer"></i> Eliminar </a></li>

                        <li class="header">ACCOUNT</li>
                        <li role="presentation"><a href="pages/LOgin.html"><i class="fa fa-sign-out"></i>Log out</a></li>
                    </ul>
                </section>
            </aside>

            <!-- Inicio body seccion de Product details -->
            <div class="content-wrapper" style="min-height: 600px;">

                <div class="col-md-12">
                    <div id="alertTarget">
                    </div>
                </div>
                <section class="content">
                    <%--  Targetas producto --%>
                    <table border="1" width="100%"  class="table">
                        <c:forEach var="producto" items="${ListaProductos}">
                            <div id="container">
                                <!-- Start Product details -->
                                <div class="product-details"> 
                                    <h1>Alebrijes</h1>
                                    <span class="hint-star star">
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star-half-o" aria-hidden="true"></i>
                                        <i class="fa fa-star-o" aria-hidden="true"></i>
                                    </span>
                                    <div class="control">
                                        <button class="btn">
                                            <!-- 		shopping cart icon-->
                                            <span class="shopping-cart"><i class="fa fa-shopping-cart" aria-hidden="true"></i></span>
                                            <!-- 		Buy Now / ADD to Cart-->
                                            <span class="buy">Comprar</span>
                                        </button>

                                    </div>
                                </div>
                                <!-- Fin Start Product details -->
                                <!--  Inicio product image  -->
                                <div class="product-image">
                                    <img src="https://i.pinimg.com/474x/23/9e/4f/239e4f48bf732ee1ba022c45b5d06418.jpg" alt="Omar Dsoky">
                                    <div class="info">
                                        <h2>Producto</h2>
                                        <ul>
                                            <li><c:out value="${producto.nombre}"/></li>
                                            <li><c:out value="${producto.descripcion}"/></li>
                                            <li><c:out value="${producto.precio}"/></li>
                                        </ul>
                                    </div>
                                </div>
                                <!--  End product image  -->
                            </div>
                        </c:forEach>
                    </table>
                    <%--  Fin Targetas producto --%>
                </section>
                <script type="text/javascript">
                    window.ckValues = {"pageId": "sqlite2", "writable": true, "rowsPerPage": 20, "flashbag": []};
                </script>
            </div>
            <!-- Fin body seccion de Product details -->
            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 0.3
                </div>
                <strong>Artesanías <a href="http://crudkit.com">CRUD</a>.</strong>
            </footer>
        </div>
        <%-- Inicio ménu --%>



    </body>
</html>
