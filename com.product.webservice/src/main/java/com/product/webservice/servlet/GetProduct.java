package com.product.webservice.servlet;

import com.product.service.ProductService;
import com.product.service.factory.InventoryServiceFactory;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

@WebServlet("/Product")
public class GetProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

   /* ApplicationContext ctx =
            new AnnotationConfigApplicationContext(InventoryServiceFactory.class);*/

    @Value("${app.name}")
    private String appName;

    @Autowired
    ProductService productService;

    @ApiOperation(value = "Get all the available Products")
    @ApiResponses({@ApiResponse(code = 200, message = "Request received and response provided"),})
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //ProductService productService = ctx.getBean(ProductService.class);

        PrintWriter out=response.getWriter();
        out.println("My "+appName+" servlet 3.0 : \n"+productService.getProduct());
    }
}