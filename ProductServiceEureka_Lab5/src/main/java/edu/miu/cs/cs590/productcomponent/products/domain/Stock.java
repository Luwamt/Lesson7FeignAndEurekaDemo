package edu.miu.cs.cs590.productcomponent.products.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stock {
    private int numberInStock;
    private String locationCode;
}
