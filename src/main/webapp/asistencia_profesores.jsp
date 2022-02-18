<%-- 
    Document   : asistencia_profesores
    Created on : 18 feb. 2022, 20:27:27
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
  <body id="body_asist">
    <h1 id="titulo_ast">"Faltas del Profesorado"</h1>
    <div class="container mt-3" id="tabla_profesorado">
      <table class="table table-hover">
        <thead>
          <tr>
            <th>Clase</th>
            <th>Horario</th>
            <th>Profesor ausente</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>3ºB</td> <!-- Clase afectada -->
            <td>1</td> <!-- Hora de la falta -->
            <td>Jerónimo Stilton</td> <!-- Profesor  -->
          </tr>
          <tr>
            <td>2ºB</td> <!-- Clase afectada -->
            <td>2</td> <!-- Hora de la falta -->
            <td>Jerónimo Stilton</td> <!-- Profesor  -->
          </tr>
          <tr>
            <td>1ºA</td> <!-- Clase afectada -->
            <td>3</td> <!-- Hora de la falta -->
            <td>Jerónimo Stilton</td> <!-- Profesor  -->
          </tr>
        </tbody>
      </table>
    </div>




  </body>
</html>
