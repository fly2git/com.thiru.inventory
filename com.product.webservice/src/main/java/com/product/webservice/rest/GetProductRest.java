package com.product.webservice.rest;

import com.datasource.config.DatabaseConfig;
import com.datasource.config.GetJDBCConnection;
import com.datasource.entity.Product;
import com.product.service.ProductService;
import com.product.service.factory.InventoryServiceFactory;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

@RestController
@EnableWebMvc
public class GetProductRest {
    private static final long serialVersionUID = 1L;

    ApplicationContext ctx =
            new AnnotationConfigApplicationContext(InventoryServiceFactory.class);

    ProductService productService = ctx.getBean(ProductService.class);;

    @ApiOperation(value = "Get all the available Products")
    @ApiResponses({@ApiResponse(code = 200, message = "Request received and response provided"),})
    @RequestMapping(value = "/product-mvc", method = RequestMethod.GET)
    public ModelAndView getProductList() {
        System.out.println("I am called you know...");
        return new ModelAndView("productPage", "product", productService.getProduct());
    }

    @RequestMapping(value = "/product-rest", method = RequestMethod.GET,produces="application/json")
   // @ResponseBody -- optional
    public List<Product> getString() {
        return productService.getProduct();
    }

    @RequestMapping(value = "/datasource", method = RequestMethod.GET)
    public String getText() {
       return GetJDBCConnection.getConnection().toString();
    }
}