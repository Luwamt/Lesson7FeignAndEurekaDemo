package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.service;
import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain.Product;
import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.dto.ShoppingCartLineDto;
import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.repository.ShoppingCartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class ShoppingCartService {


    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    productFeignClient productFeignClient;


    public void checkOut(ShoppingCartLineDto dto){

        shoppingCartRepository.findAll();
    }


    public Product getProduct(Integer productNumber){
        int stock = productFeignClient.getStock(productNumber);
        Product product=new Product(productNumber,"Medicine",stock);
        return product;
    }
    @FeignClient(name = "productController")
    interface productFeignClient{
        @GetMapping(value = {"/stock/{productNumber}"})
        Integer getStock(@PathVariable Integer productNumber);
    }



//
//    public ProductDto getProduct(Integer productId){
//        // return   modelMapper.map(productRepository.findById(productId).orElse(null),ProductDto.class);
//        return shoppingCartRepository.findById(productId).orElse(null);
//    }
//

}
