package com.baam.payment.domain.repository;

import com.baam.payment.domain.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepositroy extends CrudRepository<Payment,Long> {

}
