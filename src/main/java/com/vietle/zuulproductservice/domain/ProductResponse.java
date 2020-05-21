package com.vietle.zuulproductservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private boolean success;
    private String message;
    private Product product;
}
