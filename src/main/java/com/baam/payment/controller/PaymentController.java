package com.baam.payment.controller;


import com.baam.payment.aop.Timer;
import com.baam.payment.domain.entity.Payment;
import com.baam.payment.request.PaymentRequestDTO;
import com.baam.payment.service.PaymentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    Logger logger = LoggerFactory.getLogger(PaymentController.class);


    @GetMapping("/health")
    @Timer
    public String health(HttpServletRequest request)
    {
        logger.info("ip 주소는 {} 입니다",request.getRemoteAddr());
        return "server run";
    }

    @GetMapping("/check")
    @Timer
    public String check()
    {
        logger.info("요청이 왔습니다.");
        return "server run";
    }


    @PostMapping("/payment")
    @Timer
    public String payment(@RequestBody PaymentRequestDTO paymentRequestDTO, @RequestHeader String authorization)
    {
        if (authorization.equals("beom"))
        {
            logger.info(paymentService.payment(paymentRequestDTO).toString());
            paymentService.payment(paymentRequestDTO);
            return "hello";
        }
        return "다시 입력해";


    }


}
