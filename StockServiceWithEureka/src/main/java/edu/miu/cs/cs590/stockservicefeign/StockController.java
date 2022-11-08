package edu.miu.cs.cs590.stockservicefeign;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @GetMapping(value = {"/stock/{productNumber}"})
    public ResponseEntity<Stock> getProductNumber(@PathVariable("productNumber") String productNumber){
        return new ResponseEntity<>(new Stock("12354"), HttpStatus.OK);
    }
}
