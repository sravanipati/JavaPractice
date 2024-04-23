package com.alacriti.billpayment.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alacriti.billpayment.service.ElectricBillPaymentService;
import com.alacriti.billpayment.service.ElectricBillPaymentServiceDynamic;

@RestController
@RequestMapping("/electric")
public class ElectricBillPaymentController {

	private static final Logger log = Logger.getLogger(ElectricBillPaymentController.class.getName());

	@Autowired
	private ElectricBillPaymentService electricBillPaymentService;
	
	@Autowired
	private ElectricBillPaymentServiceDynamic electricBillPaymentServiceDynamic;

	private String filepath = "/home/sravanip/Videos/electricbillpayment";

	@GetMapping("/billpayment")
	public String generateFixedLengthFile() {
		
		log.info("Method: generateFixedLengthFile in ElectricBillPaymentController class.");
		
		try {
			electricBillPaymentService.createFixedLengthFile();
		} catch (Exception e) {
			e.printStackTrace();
			return "Error while exporting data to FixedWidth: " + e.getMessage();
		}
		return "Data exported to Fixedwidth file on this path." + filepath;
	}

	@GetMapping("/dynamicbillpayment")
	public String generateDynamicFile() {
		log.info("Method: generateDynamicFile in ElectricBillPaymentController class.");
		try {
			electricBillPaymentServiceDynamic.createDynamicFile();
		} catch (Exception e) {
			e.printStackTrace();
			return "Error while exporting data to FixedWidth: " + e.getMessage();
		}
		return "Data exported to CSV file on this path." + filepath;
	}

}
