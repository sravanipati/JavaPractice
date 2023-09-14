package com.alacriti.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alacriti.merchant.model.CheckPaymentStatusResponse;
import com.alacriti.merchant.model.Merchant;
import com.alacriti.merchant.model.MerchantResponse;
import com.alacriti.merchant.model.Payment;
import com.alacriti.merchant.model.PaymentGatewayResponse;
import com.alacriti.merchant.service.MerchantService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	private MerchantService merchantService;

	@PostMapping("/register")
	public ResponseEntity<MerchantResponse> registermerchant(@RequestBody Merchant merchant){

		return merchantService.registermerchant(merchant);
	}

	@PostMapping("/addPayment")
	public ResponseEntity<PaymentGatewayResponse> makePayment(@RequestBody Payment payment) {

		return merchantService.makePayment(payment);
	}

	@GetMapping("/paymentStatus/{paymentId}")
	public ResponseEntity<CheckPaymentStatusResponse> getPaymentStatusForPaymentId(@PathVariable String paymentId) {
		return merchantService.getStatusForPaymentId(paymentId);

	}

}