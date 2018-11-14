package com.kamaab.softwarepro.Model.Shipping;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private long paymentId;

    @NotBlank
    private Date paymentDate;

    @NotBlank
    private long paymentRef1;

    @NotBlank
    private long paymentRef2;

    @NotBlank
    private String paymentStatus;

    //Add Foreign Key
    @OneToOne(mappedBy = "payment")
    private Shipping shipping;

    public Payment() {
    }

    public Payment(long paymentId, Shipping shipping) {
        this.paymentId = paymentId;
        this.shipping = shipping;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public long getPaymentRef1() {
        return paymentRef1;
    }

    public void setPaymentRef1(long paymentRef1) {
        this.paymentRef1 = paymentRef1;
    }

    public long getPaymentRef2() {
        return paymentRef2;
    }

    public void setPaymentRef2(long paymentRef2) {
        this.paymentRef2 = paymentRef2;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate=" + paymentDate +
                ", paymentRef1=" + paymentRef1 +
                ", paymentRef2=" + paymentRef2 +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", shipping=" + shipping +
                '}';
    }
}
