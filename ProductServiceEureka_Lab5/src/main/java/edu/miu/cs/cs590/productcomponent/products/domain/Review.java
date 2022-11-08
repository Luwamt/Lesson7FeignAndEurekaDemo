package edu.miu.cs.cs590.productcomponent.products.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {

    private String title;
    private String description;
    private int score;
}
