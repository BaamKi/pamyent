package com.baam.payment.domain.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.lang.reflect.GenericArrayType;

@Entity
@NoArgsConstructor
public class Payment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column
    private String productName;

    @Column
    private int price;

    @Column
    private String buyer;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    @Builder
    public Payment(Long paymentId, String productName, int price, String buyer, String email, String phoneNumber) {
        this.paymentId = paymentId;
        this.productName = productName;
        this.price = price;
        this.buyer = buyer;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
