package com.springbootPractice.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product") //to identify a domain proj and use it to map a Java class into a collection inside MongoDB
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;


}
