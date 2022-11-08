package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShoppingCartLine {

    private Integer quantity;

    private Product product;

}
