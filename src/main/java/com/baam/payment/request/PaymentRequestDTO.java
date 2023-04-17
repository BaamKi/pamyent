package com.baam.payment.request;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Getter;

public class PaymentRequestDTO {

    @Getter
    @Valid
    public static class Buyer
    {
        private String productName;
        private int price;

        @Builder
        public Buyer(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }
    }


    @Getter
    @Valid
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
