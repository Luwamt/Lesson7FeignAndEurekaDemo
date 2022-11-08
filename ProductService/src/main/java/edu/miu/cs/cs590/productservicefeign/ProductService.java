package edu.miu.cs.cs590.productservicefeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService {

    @Autowired
    StockFeignClient stockClient;

    public  Product getProduct(String productNumber){
        int stock = stockClient.getStock(productNumber);
        Product product=new Product(productNumber,"Medicine",stock);
        return product;
    }
    @FeignClient(name = "stockController",url = "https://localhost:8900")
    interface StockFeignClient{
        @GetMapping(value = {"/stock/{productNumber}"})
         Integer getStock(@PathVariable String productNumber);
    }
}
