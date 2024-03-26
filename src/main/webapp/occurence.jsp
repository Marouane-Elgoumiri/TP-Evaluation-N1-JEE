<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.demo.Occurence" %>
<%
    String presentedResult = null;
    if (request.getParameter("nombre") != null) {
        Occurence occurrence = new Occurence();
        try {
            double nombre = Double.parseDouble(request.getParameter("nombre"));
            occurrence.setNombre(nombre);
            int count = occurrence.nbreApparition();
            presentedResult = "Le nombre " + nombre + " apparaît " + count + " fois dans le tableau.";
        } catch (NumberFormatException e) {
            presentedResult = "Veuillez entrer un nombre valide.";
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Occurrence</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.0-beta1/css/bootstrap.min.css">
</head>
<body>
<div class="container my-3">
    <h1>Calculer le nombre d'occurrences</h1>
    <form method="post">
        Entrez un nombre: <input type="text" name="nombre"/>
        <br/>
        <div class="mt-3">
            <button type="submit" class="btn btn-primary">Calculer</button>
            <a href="index.jsp" class="btn btn-secondary">Back</a>
        </div>

    </form>
    <% if (presentedResult != null) { %>
    <div class="alert alert-info mt-3">
        <%= presentedResult %>
    </div>
    <% } %>
</div>
</body>
</html>
