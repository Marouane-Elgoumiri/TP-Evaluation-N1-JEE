package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FactureServlet")
public class FactureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numero = request.getParameter("numero");
        double montant = Double.parseDouble(request.getParameter("montant"));
        double tauxRemise = Double.parseDouble(request.getParameter("tauxRemise"));
        double montantNet = montant * (1 - tauxRemise / 100);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Informations de la facture</h2>");
        out.println("<table border=\"1\"><tr><th>Numéro</th><th>Montant</th><th>Taux de remise</th><th>Montant net</th></tr>");
        out.println("<tr><td>" + numero + "</td><td>" + montant + "</td><td>" + tauxRemise + "%</td><td>" + montantNet + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }

}
