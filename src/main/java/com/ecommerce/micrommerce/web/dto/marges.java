package com.ecommerce.micrommerce.web.dto;

import com.ecommerce.micrommerce.web.model.Product;

public class marges {
    Product product;
    int marge;
    public marges(Product product, int marge) {
        this.product = product;
        this.marge = marge;
    }
    public Product getProduct() {return product;}
    public int getMarge() {return marge;}
    public void setMarge(int marge) {this.marge = marge;}
    public void setProduct(Product product) {this.product = product;}

}
