<%-- 
    Autor: Alexi Daniel Ramirez Ruiz
    Fecha de creación:17 de Marzo 2022
    Fecha de Actualización: 10 de Junio de 2022
    Descripción: JSP Formulario para Actualizar Usuarios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style type = "text/css">
            <%@ include file = "../resources/actualizar.css"%>
            <%@ include file = "../webjars/bootstrap/5.1.3/css/bootstrap.min.css"%>
        </style>
        <script type=text/javascript">
            <%@ include file = "../resources/actualiza.js"%>
        </script>
        <title>Actualizar</title>


    </head>

    <body>
        <!-- Menu index -->
        <div class="contenido">
            <div class="topnav" id="myTopnav">
                <a href="pages/index.html" class="active">Home</a>
                <a href="UsuarioServletController?action=crearForm">Crear</a>
                <a href="UsuarioServletController?action=listar">Listar </a>
                <a href="UsuarioServletController?action=listar">Eliminar </a>
                <a href="pages/presentacion.html">Acerca de </a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
            </div>
        </div>
        <!-- Fin Menu index -->

       <!-- Inicio formulario actualizar -->
        <div class="modernForm">
            <div class="imageSection">
                <div class="image">
                    <div class="overlay"></div>
                    <img class="img" src="https://previews.123rf.com/images/bautislf/bautislf1712/bautislf171200004/92004499-con-sus-colores-y-formas-cada-alebrije-es-%C3%BAnico-excelente-artesan%C3%ADa-mexicana-.jpg" alt="pexels-yuri-manei-2272854">
                </div>
                <div class="textInside">
                    <h1>Artesanias Oaxaqueñas</h1>
                    <p class="tagLine">Todo lo que puede ser imaginado es real</p>
                    <p class="tagLine">(pablo picasso)</p><br><br>
                </div>
            </div>
            <div class="contactForm">
                <h1>Actualizar registro</h1>
                <form action="UsuarioServletController?action=actualizar" method="POST">
                    <input type="hidden" name="codigo" value="<c:out value="${usuario.codigo}"></c:out>">
                        <div class="name">
                            <label for="fullName">Nombre:</label>
                            <input type="text" name="nombre" id="fullName" placeholder="Nombre" value="<c:out value="${usuario.nombre}"></c:out>" required="required"/>
                            <div class="iconName"><i class="fa fa-user-circle-o" aria-hidden="true"></i></div>
                        </div>
                        <div class="name">
                            <label for="fullName">Edad:</label>
                            <input type="text" name="edad" id="fullName" placeholder="Edad" value="<c:out value="${usuario.edad}"></c:out>" required pattern="[0-9]{1,2}"/>
                            <div class="iconName"><i class="fa fa-check-circle" aria-hidden="true"></i></div>
                        </div>
                        <div class="name">
                            <label for="fullName">Sexo:</label>
                            <input type="text" name="sexo" id="fullName" placeholder="Sexo" value="<c:out value="${usuario.sexo}"></c:out>" required pattern="[a-zA-Z]*"/>
                            <div class="iconName"><i class="fa fa-venus-mars" aria-hidden="true"></i></div>
                        </div>
                        <div class="name">
                            <label for="fullName">Nombre Usuario:</label>
                            <input type="text" name="nombreusuario" id="fullName" placeholder="Nombre Usuario" value="<c:out value="${usuario.nombreusuario}"></c:out>" required="required"/>
                            <div class="iconName"><i class="fa fa-user-circle" aria-hidden="true"></i></div>
                        </div>
                        <div class="name">
                            <label for="Password">Password:</label>
                            <input type="password" name="password" id="password" placeholder="Password" value="<c:out value="${usuario.contraseña}"></c:out>" required pattern="[A-Za-z0-9!?-]{8,12}*" />
                        <div class="iconName"><i class="fa fa-lock" aria-hidden="true"></i></div>
                    </div>  
                    <input type="submit" value="Actualizar">
                </form>
            </div>
        </div>
        <!-- Fin formulario actualizar -->
                        
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
                            <a href="#"> <img src="resources/img/instagram.png"><i class="text-white"> AlexRam</i></a><br><br>
                            <a href="#"> <img src="resources/img/facebook.png"><i class="text-white"> Alexi Ramirez</i></a><br><br>
                            <a href="#"> <img src="resources/img/whatsapp.png"><i class="text-white"> 2548759658</i></a><br>
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
    </body>
</html>


