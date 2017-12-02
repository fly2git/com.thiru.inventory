package com.product.webservice.servlet;

import com.product.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

@WebServlet("/Product")
public class GetProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out=response.getWriter();
        out.println("My Product servlet 3.0 : \n"+new ProductService().getProducts().toString());
    }
}