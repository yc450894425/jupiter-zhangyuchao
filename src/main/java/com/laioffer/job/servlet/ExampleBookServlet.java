package com.laioffer.job.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.job.entity.ExampleBook;
import com.laioffer.job.entity.RegisterRequestBody;
import org.json.JSONObject;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ExampleBookServlet", urlPatterns = {"/example_book"})
public class ExampleBookServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        ExampleBook book = mapper.readValue(request.getReader(), ExampleBook.class);

        System.out.println("Title is: " + book.title);
        System.out.println("Author is: " + book.author);
        System.out.println("Date is: " + book.date);
        System.out.println("Price is: " + book.price);
        System.out.println("Currency is: " + book.currency);
        System.out.println("Pages is: " + book.pages);
        System.out.println("Series is: " + book.series);
        System.out.println("Language is: " + book.language);
        System.out.println("ISBN is: " + book.isbn);

        response.setContentType("application/json");
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("status", "ok");
        response.getWriter().print(jsonResponse);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        String category = request.getParameter("category");
        System.out.println("Keyword is: " + keyword);
        System.out.println("Category is: " + category);

        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ExampleBook book = new ExampleBook("Harry Potter and the Sorcerer's Stone", "JK Rowling", "October 1, 1998", 11.99, "USD", 309, "Harry Potter", "en_US", "0590353403");
        mapper.writeValue(response.getWriter(), book);
    }
}
