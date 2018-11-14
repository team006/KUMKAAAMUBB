package com.kamaab.softwarepro.Model.Product;


import com.kamaab.softwarepro.Model.Shop.*;

import javax.persistence.*;
import java.util.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product  implements Serializable {
    @Id
    private long productId ;
    @NotBlank
    private String productName;
    @NotBlank
    private double productPrice;

    private double productTax;

    private String description;
    @NotBlank
    private String productBrand;
    @NotBlank
    private int productAmount;

    private String productColor;

    private String productSize;
    @NotBlank
    private String productImg;
    @NotBlank
    private String productType;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name = "shopID")
    private Shop shopID;

    public Product(){

    }
    public Product(long productId,int productPrice,int productAmount){

    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductTax() {
        return productTax;
    }

    public void setProductTax(double productTax) {
        this.productTax = productTax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Shop getShopID() {
        return shopID;
    }

    public void setShopID(Shop shopID) {
        this.shopID = shopID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productTax=" + productTax +
                ", description='" + description + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productAmount=" + productAmount +
                ", productColor='" + productColor + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productImg='" + productImg + '\'' +
                ", productType='" + productType + '\'' +
                ", shopID=" + shopID +
                '}';
    }
}
