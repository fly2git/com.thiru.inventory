package com.product.webservice.servlet;

import com.product.service.ProductService;
import com.product.service.SupplierService;
import com.product.service.factory.InventoryServiceFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

@WebServlet("/Supplier")
public class GetSupplier extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ApplicationContext ctx =
            new AnnotationConfigApplicationContext(InventoryServiceFactory.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SupplierService supplierService = ctx.getBean(SupplierService.class);

        PrintWriter out=response.getWriter();
        out.println("My Supplier list servlet 3.0 : \n"+supplierService.getSupplier());
    }
}