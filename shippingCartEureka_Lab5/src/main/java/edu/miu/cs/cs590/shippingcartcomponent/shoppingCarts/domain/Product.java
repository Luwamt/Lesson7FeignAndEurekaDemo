package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private Integer productNumber;
    private String description;
    private double price;


}
