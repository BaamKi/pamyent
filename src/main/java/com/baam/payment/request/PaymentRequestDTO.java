package com.baam.payment.request;

import com.baam.payment.domain.entity.Payment;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@Valid
@NoArgsConstructor
public class PaymentRequestDTO {

    private Buyer buyer;
    private Product product;

    @Builder
    public PaymentRequestDTO(Buyer buyer, Product product) {
        this.buyer = buyer;
        this.product = product;
    }

    public Payment toEntity(PaymentRequestDTO paymentRequestDTO)
    {
        Payment payment = Payment.builder().
                productName(paymentRequestDTO.getProduct().productName).
                price(paymentRequestDTO.getProduct().price).
                buyerName(paymentRequestDTO.getBuyer().buyerName).
                email(paymentRequestDTO.getBuyer().email).
                phoneNumber(paymentRequestDTO.getBuyer().phoneNumber).build();
        return payment;
    }






    @Getter
    @Valid
    @NoArgsConstructor
    public static class Buyer
    {
        private String buyerName;
        private String email;
        private String phoneNumber;

        @Builder
        public Buyer(String buyerName, String email, String phoneNumber) {
            this.buyerName = buyerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }


    }

    @Getter
    @Valid
    @NoArgsConstructor
    public static class Product
    {
        private String productName;
        private int price;

        @Builder
        public Product(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }
    }

}
