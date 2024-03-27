package com.partyplanner.eventmangement.service;

import java.util.List;

import com.partyplanner.eventmangement.dto.request.PaymentRequest;
import com.partyplanner.eventmangement.dto.response.PaymentResponse;
import com.partyplanner.eventmangement.model.Payment;

public interface PaymentService {
    PaymentResponse createPayment(PaymentRequest request);
    List<Payment> getAllPayments();
    List<Payment> getPaymentsByUserId(String userId);
    // Add additional methods if needed
    Long sumAmounts();
}
