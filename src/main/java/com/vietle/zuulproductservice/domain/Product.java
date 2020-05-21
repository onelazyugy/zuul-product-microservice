package com.vietle.zuulproductservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private int id;
    private String name;
    private String color;
    private String category;
}
