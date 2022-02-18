<%-- 
    Document   : registro
    Created on : 18 feb. 2022, 20:21:23
    Author     : 34622
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
      <!--Las Fuentes de texto  -->
      <link rel="preconnect" href="https://fonts.googleapis.com">
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
      <link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:ital,wght@1,300&family=Ubuntu&family=Zen+Kaku+Gothic+Antique:wght@500&display=swap" rel="stylesheet">
    <!--Los logos  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>
  <link rel="stylesheet" href="pantalla.css">
    <title></title>
    <style>
      body{
        background-image: url('img/centro.jpeg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: 100% 100%;
      }
    </style>
  <body id="body_login">
    <div class="login">
      <section class="vh-60 gradient-custom">
        <div class="container py-3 h-60">
          <div class="row d-flex justify-content-center align-items-center h-60">
            <div class="col-6 col-md-5 col-lg-5 col-xl-5">
              <div class="card bg-dark text-white" style="border-radius: 1rem;">
                <div class="card-body p-0 text-center">

                  <div class="mb-md-3 mt-md-2 pb-2">

                    <h2 class="fw-bold mb-1 text-uppercase">Administrador</h2>
                    <p class="text-white-50 mb-4" id="adm_usr">Nuevo Usuario</p>

                    <div class="form-outline form-white mb-2" id="Email">
                      <label class="form-label" for="typeEmailX">Email</label>
                      <input type="email" id="typeEmailX" class="form-control form-control-lg" placeholder="inserte email"/>
                    </div>

                    <div class="form-outline form-white mb-2" id="Contraseña">
                      <label class="form-label" for="typePasswordX">Contraseña</label>
                      <input type="password" id="typePasswordX" class="form-control form-control-lg" placeholder="contraseña"/>
                    </div>

                    <button class="btn btn-outline-light btn-lg px-3" type="submit" id="login_button">Crear</button>

                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
  </body>
</html>
