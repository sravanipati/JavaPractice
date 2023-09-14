package com.alacriti.merchant.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alacriti.merchant.model.CheckPaymentStatusResponse;
import com.alacriti.merchant.model.Merchant;
import com.alacriti.merchant.model.MerchantResponse;
import com.alacriti.merchant.model.Payment;
import com.alacriti.merchant.model.PaymentGatewayRequest;
import com.alacriti.merchant.model.PaymentGatewayResponse;

@Service
public class MerchantService {

	RestTemplate restTemplate = new RestTemplate();

	private static final String Register_Merchant_URL = "http://localhost:8080/paymentgateway/addMerchant";

	private static final String Make_Payemnt_URL = "http://localhost:8080/paymentgateway/addPayment";

	private static final String PaymentStatus_By_PaymentId_URL = "http://localhost:8080/paymentgateway/payment_status/";

	public ResponseEntity<MerchantResponse> registermerchant(Merchant merchant) {

		return restTemplate.postForEntity(Register_Merchant_URL, merchant, MerchantResponse.class);

	}

	public ResponseEntity<PaymentGatewayResponse> makePayment(Payment payment) {

		return restTemplate.postForEntity(Make_Payemnt_URL, preparePaymentRequest(payment),
				PaymentGatewayResponse.class);

	}

	public PaymentGatewayRequest preparePaymentRequest(Payment payment) {
		PaymentGatewayRequest paymentRequest = new PaymentGatewayRequest();
		paymentRequest.setPaymentId(generatePaymentId());
		paymentRequest.setPayment(payment);
		return paymentRequest;

	}

	public String generatePaymentId() {
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

		String currentDateTime = dateFormat.format(new Date());

		int randomNumber = new Random().nextInt(9000) + 1000;

		sb.append("PID");
		sb.append(currentDateTime);
		sb.append(randomNumber);

		return sb.toString();
	}

	public ResponseEntity<CheckPaymentStatusResponse> getStatusForPaymentId(String paymentId) {
		HttpHeaders headers = new HttpHeaders();
		String url = PaymentStatus_By_PaymentId_URL + paymentId;
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		return restTemplate.exchange(url, HttpMethod.GET, entity, CheckPaymentStatusResponse.class);
	}

}
