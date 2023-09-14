package com.alacriti.paymentgateway.simulator.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alacriti.paymentgateway.simulator.model.CheckPaymentStatusResponse;
import com.alacriti.paymentgateway.simulator.model.Merchant;
import com.alacriti.paymentgateway.simulator.model.MerchantPaymentRequest;
import com.alacriti.paymentgateway.simulator.model.MerchantPaymentResponse;
import com.alacriti.paymentgateway.simulator.model.MerchantResponse;
import com.alacriti.paymentgateway.simulator.service.PaymentGatewayService;

@RestController
@RequestMapping("/paymentgateway")
public class PaymentGatewayController {
	@Autowired
	private PaymentGatewayService paymentService;

	@PostMapping("/addMerchant")
	public MerchantResponse addMerchant(@RequestBody Merchant merchant) throws SQLException {

		return paymentService.addMerchant(merchant);
	}

	@PostMapping("/addPayment")
	public MerchantPaymentResponse addPayment(@RequestBody MerchantPaymentRequest paymentRequest) throws SQLException {

		return paymentService.addPayment(paymentRequest);
	}

	@GetMapping("/payment_status/{paymentId}")
	public CheckPaymentStatusResponse getPaymentStatusForPaymentId(@PathVariable String paymentId) throws SQLException {
		return paymentService.getPaymentStatusForPaymentId(paymentId);
	}

}
