package com.kamaab.softwarepro.Model.Shipping;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "shipping")
public class Shipping implements Serializable {

    @Id
    private long shippingId;

    @NotBlank
    private String shippingType;

    @NotBlank
    private double shippingCost;

    @NotBlank
    private Date shippingDate;

    @NotBlank
    private String shippingStatus;

    //Add Foreign Key
    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentId")
    private Payment payment;

    public Shipping() {
    }

    public Shipping(long shippingId, Payment payment) {
        this.shippingId = shippingId;
        this.payment = payment;
    }

    public long getShippingId() {
        return shippingId;
    }

    public void setShippingId(long shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "shippingId=" + shippingId +
                ", shippingType='" + shippingType + '\'' +
                ", shippingCost=" + shippingCost +
                ", shippingDate=" + shippingDate +
                ", shippingStatus='" + shippingStatus + '\'' +
                ", payment=" + payment +
                '}';
    }
}
