package edu.miu.cs.cs590.productcomponent.products.web;

import edu.miu.cs.cs590.productcomponent.products.dto.ProductDto;
import edu.miu.cs.cs590.productcomponent.products.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductCatalogService productService;

    @PostMapping(value = {"/products"})
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productdto){
        return ResponseEntity.ok(productService.addProduct(productdto));
    }
    @GetMapping(value = {"/products/{id}"})
    public ResponseEntity<ProductDto> getproduct(@PathVariable Integer id){
        var productDto =productService.getProduct(id);
      return new  ResponseEntity<>(productDto, HttpStatus.OK);
    }

}
