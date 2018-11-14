package com.kamaab.softwarepro.Model.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "address")
public class Address {

    @Id
    private long addressId;

    @NotBlank
    private long number;

    @NotBlank
    private String village;

    @NotBlank
    private String road;

    @NotBlank
    private String subdistrict;

    @NotBlank
    private String district;

    @NotBlank
    private String province;

    @NotBlank
    private long postalCode;

    //Add Foreign Key
    @OneToOne(mappedBy = "address")
    private User user;

    public Address() {
    }

    public Address(long addressId, User user) {
        this.addressId = addressId;
        this.user = user;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", number=" + number +
                ", village='" + village + '\'' +
                ", road='" + road + '\'' +
                ", subdistrict='" + subdistrict + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                ", user=" + user +
                '}';
    }
}
