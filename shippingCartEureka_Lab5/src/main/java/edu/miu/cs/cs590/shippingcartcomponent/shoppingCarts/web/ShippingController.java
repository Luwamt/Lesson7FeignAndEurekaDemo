package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.web;

import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain.Product;
import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @Autowired
private ShoppingCartService service;


    @RequestMapping(value = {"/stock/{productNumber}"})
    public ResponseEntity<Product> getProductNumber(@PathVariable("productNumber") Integer productNumber){
        var product= service.getProduct(productNumber);
        return new ResponseEntity<>( product ,HttpStatus.OK);
    }
}
