package edu.miu.cs.cs590.productcomponent.products.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Supplier {

    private int supplierNumber;
    private String name;
    private String phone;
    private String  email;

}
