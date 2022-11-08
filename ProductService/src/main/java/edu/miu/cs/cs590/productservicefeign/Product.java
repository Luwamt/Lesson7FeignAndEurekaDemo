package edu.miu.cs.cs590.productservicefeign;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private  String  productNumber;
    private  String  name;
    private  int  NumberOnStock;
}
