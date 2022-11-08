package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Integer productNumber;
    private String description;
    private double price;
}
