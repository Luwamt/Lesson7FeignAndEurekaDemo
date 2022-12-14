package edu.miu.cs.cs590.productservicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
private ProductService productService;


    @RequestMapping(value = {"/stock/{productNumber}"})
    public ResponseEntity<Product> getProductNumber(@PathVariable("productNumber") String productNumber){
        var product= productService.getProduct(productNumber);
        return new ResponseEntity<>( product ,HttpStatus.OK);
    }
}
