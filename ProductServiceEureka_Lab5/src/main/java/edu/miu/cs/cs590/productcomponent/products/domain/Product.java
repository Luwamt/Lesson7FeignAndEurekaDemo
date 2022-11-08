package edu.miu.cs.cs590.productcomponent.products.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    private Integer productNumber;
    private String description;
    private double price;
     private Review review;
     private Stock stock;
     private Supplier supplier;
}
