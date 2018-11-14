package com.kamaab.softwarepro.Model.Shop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
public class Shop implements Serializable {

    @Id
    private long shopId;

    @NotBlank
    private String shopName;

    @NotBlank
    private String shopDescription;

    private int shopRating;

    private String shopReview;

    public Shop() {
    }

    public long getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public int getShopRating() {
        return shopRating;
    }

    public String getShopReview() {
        return shopReview;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public void setShopRating(int shopRating) {
        this.shopRating = shopRating;
    }

    public void setShopReview(String shopReview) {
        this.shopReview = shopReview;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", shopRating=" + shopRating +
                ", shopReview='" + shopReview + '\'' +
                '}';
    }
}
