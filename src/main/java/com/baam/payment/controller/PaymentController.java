package com.baam.payment.controller;


import com.baam.payment.aop.Timer;
import com.baam.payment.domain.entity.Payment;
import com.baam.payment.request.PaymentRequestDTO;
import com.baam.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    Logger logger = LoggerFactory.getLogger(PaymentController.class);


    @GetMapping("/health")
    @Timer
    public String health()
    {
        logger.info("info ---- 입니다.");
        return "server run";
    }


    @PostMapping("/payment")
    @Timer
    public String payment(@RequestBody PaymentRequestDTO paymentRequestDTO)
    {
        logger.info(paymentService.payment(paymentRequestDTO).toString());
        paymentService.payment(paymentRequestDTO);
        return "hello";
    }


}
