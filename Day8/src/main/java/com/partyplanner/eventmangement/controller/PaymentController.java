package com.partyplanner.eventmangement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.partyplanner.eventmangement.dto.request.PaymentRequest;
import com.partyplanner.eventmangement.dto.response.PaymentResponse;
import com.partyplanner.eventmangement.model.Payment;
import com.partyplanner.eventmangement.service.PaymentService;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/all")
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }

    @GetMapping("/get-by-user/{userId}")
    public ResponseEntity<List<Payment>> getPaymentsByUserId(@PathVariable String userId) {
        List<Payment> payments = paymentService.getPaymentsByUserId(userId);
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest request) {
        PaymentResponse response = new PaymentResponse();
        try {
            response = paymentService.createPayment(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @GetMapping("/sum")
    public Long sumAmounts() {
        return paymentService.sumAmounts();
    }
}
 