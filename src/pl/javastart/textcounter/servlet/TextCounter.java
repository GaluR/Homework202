package pl.javastart.textcounter.servlet;

import pl.javastart.text.counter.service.TextCounterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/textcounter")
public class TextCounter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        TextCounterService tcs = new TextCounterService();

        String text = request.getParameter("text");

        writer.println(text + "<br/>");
        writer.println("Ilość słów to: " + tcs.words(text) + "<br/>");
        writer.println("Ilość znaków to: " + tcs.characters(text) + "<br/>");
        writer.println("Ilość znaków(bez spacji) to: " + tcs.charactersWithNoSpace(text) + "<br/>");
        writer.println("Tekst jest palindromem: " + tcs.isPalindrom(text) + "<br/>");

    }
}
