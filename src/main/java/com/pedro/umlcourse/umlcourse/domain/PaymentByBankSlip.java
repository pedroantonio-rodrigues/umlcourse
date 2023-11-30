package com.pedro.umlcourse.umlcourse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pedro.umlcourse.umlcourse.enums.PaymentStatus;

import javax.persistence.Entity;
import java.util.Date;
@Entity
public class PaymentByBankSlip extends Payment{
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dueDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date paymentDate;

    public PaymentByBankSlip(){
    }

    public PaymentByBankSlip(Integer id, PaymentStatus paymentStatus, Order order, Date dueDate, Date paymentDate) {
        super(id, paymentStatus, order);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
