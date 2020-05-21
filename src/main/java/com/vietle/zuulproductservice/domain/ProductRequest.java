package com.vietle.zuulproductservice.domain;

import lombok.Builder;
import lombok.Data;

//@Data
//@Builder
public class ProductRequest {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
