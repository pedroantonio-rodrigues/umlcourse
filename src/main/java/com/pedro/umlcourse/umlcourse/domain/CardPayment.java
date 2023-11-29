package com.pedro.umlcourse.umlcourse.domain;

import com.pedro.umlcourse.umlcourse.enums.PaymentStatus;

import javax.persistence.Entity;

@Entity
public class CardPayment extends Payment{
    private static final long serialVersionUID = 1L;
    private Integer installments;

    public CardPayment(){
    }

    public CardPayment(Integer id, PaymentStatus paymentStatus, Order order, Integer installments) {
        super(id, paymentStatus, order);
        this.installments = installments;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }
}
