<%-- 
Autor: Alexi Daniel Ramirez Ruiz
Fecha de creación:17 de Marzo 2022
Fecha de Actualización: 10 de Junio de 2022
Descripción: JSP Formulario para Crear Registro de Cliente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type = "text/css">
            <%@ include file = "../resources/form.css"%>
        </style>
        <style>
            <%@include file="../webjars/bootstrap/5.1.3/css/bootstrap.min.css"%>
        </style>
        <style>
            <%@ include file = "/webjars/fontawesome/4.7.0/css/font-awesome.css"%>
        </style>
        <title>Clientes</title>
    </head>
    <body>
        <!-- Menu Producto -->
        <div class="contenido">
            <div class="topnav" id="myTopnav">
                <a href="pages/index.html" class="active">Home</a>
                <a href="ClienteServletController?action=crearForm">Crear</a>
                <a href="ClienteServletController?action=listar">Listar </a>
                <a href="ClienteServletController?action=listar">Eliminar </a>
                <a href="pages/presentacion.html">Acerca de </a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
            </div>
        </div> <br>
        <!-- Fin Menu Producto -->
        <!-- Inicio formulario Cliente -->
        <div class="modernForm">
            <div class="imageSection">
                <div class="image">
                    <div class="overlay"></div>
                    <img class="img" src="https://cdn.pixabay.com/photo/2016/10/11/06/05/alebrijes-1730653_960_720.jpg" alt="pexels-yuri-manei-2272854">
                </div>
                <div class="textInside">
                    <h1>Artesanias Oaxaqueñas</h1>
                    <p class="tagLine">Todo lo que puede ser imaginado es real</p>
                    <p class="tagLine">(pablo picasso)</p><br><br>
                </div>
            </div>
            <div class="contactForm">
                <h1>Registro Cliente</h1>
                <form action="ClienteServletController?action=crearBD" method="POST">
                    <div class="name">
                        <label for="fullName">Nombre:</label>
                        <input type="text" name="nombre" id="fullName" placeholder="Nombre" required pattern="[a-zA-Z]*"/>
                        <div class="iconName"><i class="fa fa-user" aria-hidden="true"></i></div>
                    </div>
                    <div class="name">
                        <label for="fullName">Edad:</label>
                        <input type="text" name="edad" id="fullName" placeholder="Edad" required pattern="[0-9]{1,2}"/>
                        <div class="iconName"><i class="fa-solid fa-user"></i></div>
                    </div>
                    <div class="name">
                        <label for="fullName">Sexo:</label>
                        <input type="text" name="sexo" id="fullName" placeholder="Sexo" required pattern="[a-zA-Z]*"/>
                        <div class="iconName"><i class="fa-solid fa-user"></i></div>
                    </div>
                    <div class="name">
                        <label for="fullName">Direccion: </label>
                        <input type="text" name="direccion" id="fullName" placeholder="Dirección" required="required"/>
                        <div class="iconName"><i class="fa-solid fa-user"></i></div>
                    </div>
                    <div class="name">
                        <label for="fullName">Telefono: </label>
                        <input type="text" name="telefono" id="fullName" placeholder="Telefono" required="required" pattern="[0-9]{1,10}"/>
                        <div class="iconName"><i class="fa-solid fa-user"></i></div>
                    </div>
                    <input type="submit" value="Registrar">
                </form>
            </div>
        </div>
        <!-- Fin Formulario Cliente -->
        
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
