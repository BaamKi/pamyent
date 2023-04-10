package com.baam.payment.service;

import com.baam.payment.domain.entity.Payment;
import com.baam.payment.request.PaymentRequestDTO;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    public Payment payment(PaymentRequestDTO paymentRequestDTO)
    {
        return new Payment();
    }


}
