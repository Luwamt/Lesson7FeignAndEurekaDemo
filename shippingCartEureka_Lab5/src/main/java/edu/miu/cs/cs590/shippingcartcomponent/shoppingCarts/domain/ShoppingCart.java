package edu.miu.cs.cs590.shippingcartcomponent.shoppingCarts.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    @Id
    private Integer shoppingCartNumber;
    private ShoppingCartLine shoppingCartLine;


    private static Collection<ShoppingCartLine> cart = new ArrayList<>();

    public void addProduct(int  quantity,Product product){

        for(ShoppingCartLine line : cart  ){
            if(line.getProduct().getProductNumber()== product.getProductNumber()){
                shoppingCartLine.setQuantity(quantity);

            }
        }

        var line =  new ShoppingCartLine(product.getProductNumber(),product);
        cart.add(line);

    }
    public static Double totalPriceOfProducts(){
        double total = 0.0;
        for(ShoppingCartLine line : cart) {
            total += (line.getProduct().getPrice() * line.getQuantity());
        }
        return total;
    }

    public void removeProduct(Product product) {

        for (ShoppingCartLine line : cart) {
            if (line.getProduct().getProductNumber() == product.getProductNumber()) {
                if (line.getQuantity() >= 0) {
                    System.out.println("You don't have any product");}
//                } else {
//                    cart.remove(product);
//                }

            }
            cart.remove(product);
        }

    }

    @Override
    public String toString() {
        String print  ="";
        for (ShoppingCartLine result: cart){
            print+="The Product Number: "+result.getProduct().getProductNumber()
            +"\nThe Product Description: "+ result.getProduct().getDescription()+
                    "\nThe Product Price: "+result.getProduct().getPrice()+
                    "The quantity of Product" +result.getQuantity();

            System.out.println("The Total Price of products: "+ totalPriceOfProducts());
        }
        return  print;
    }
}
