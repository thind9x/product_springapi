package com.pmcmusic.demoapi.Controler;

import com.pmcmusic.demoapi.Controler.*;
import com.pmcmusic.demoapi.Model.Product;
import com.pmcmusic.demoapi.Model.User;
import com.pmcmusic.demoapi.Model.Video;
import com.pmcmusic.demoapi.*;
import com.pmcmusic.demoapi.Services.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(path = "/demo")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public @ResponseBody List<Product> getAllPro() {
        return productService.getAllProduct();
    }

    // @GetMapping(path="/products")
    // public @ResponseBody
    // List<Product> getAllProduct() {
    // return productService.getAllProduct();
    // }
    //
}
