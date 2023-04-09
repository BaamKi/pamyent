package com.baam.payment.controller;


import com.baam.payment.aop.Timer;
import com.baam.payment.domain.entity.Payment;
import com.baam.payment.request.PaymentRequestDTO;
import com.baam.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;


    @GetMapping("/health")
    @Timer
    public String health()
    {

        System.out.printf("heelo");
        return "server run";
    }

    @PostMapping("/payment")
    public Payment payment(@RequestBody PaymentRequestDTO paymentRequestDTO)
    {
        return paymentService.payment(paymentRequestDTO);
    }


}
