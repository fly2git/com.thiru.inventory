package com.product.webservice.rest;

import com.product.service.ProductService;
import com.product.service.factory.InventoryServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

@RestController
public class GetProductRest {
    private static final long serialVersionUID = 1L;

    ApplicationContext ctx =
            new AnnotationConfigApplicationContext(InventoryServiceFactory.class);

    //@Autowired
    ProductService productService = ctx.getBean(ProductService.class);;

    //@ApiOperation(value = "Get all the available Products")
    //@ApiResponses({@ApiResponse(code = 200, message = "Request received and response provided"),})
    @RequestMapping(value = "/productrest", method = RequestMethod.GET)
    public ModelAndView getProductList() {
        System.out.println("I am called you know...");
//        ProductService productService = ctx.getBean(ProductService.class);
        //return productService.getProduct().toString();
        return new ModelAndView("productPage", "product", productService.getProduct());
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hi Thiru";
    }
}