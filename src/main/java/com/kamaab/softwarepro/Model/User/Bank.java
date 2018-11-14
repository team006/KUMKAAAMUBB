package com.kamaab.softwarepro.Model.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Bank {

    @Id
    private long bankId;

    @NotBlank
    private String bankName;

    @NotBlank
    private String bankAbbreviation;

    @NotBlank
    private long bankAccount;

    @NotBlank
    private String bankAccountName;

    public Bank() {
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAbbreviation() {
        return bankAbbreviation;
    }

    public void setBankAbbreviation(String bankAbbreviation) {
        this.bankAbbreviation = bankAbbreviation;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankAbbreviation='" + bankAbbreviation + '\'' +
                ", bankAccount=" + bankAccount +
                ", bankAccountName='" + bankAccountName + '\'' +
                '}';
    }
}
