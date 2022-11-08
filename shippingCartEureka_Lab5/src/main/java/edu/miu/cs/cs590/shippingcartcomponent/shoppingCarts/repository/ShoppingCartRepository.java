package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.repository;

import edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository  extends MongoRepository<ShoppingCart,Integer> {


}
