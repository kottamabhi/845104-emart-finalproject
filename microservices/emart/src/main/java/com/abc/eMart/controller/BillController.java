package com.abc.eMart.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.eMart.model.BillPojo;
import com.abc.eMart.service.BillService;
//import com.abc.eMart.service.BuyerService;

@RestController
//@RequestMapping annotation is used to map web requests.
@RequestMapping("emart")
@CrossOrigin
public class BillController {
	static Logger LOG = Logger.getLogger(BillController.class.getClass());
	
//@Autowired is used to inject the object dependency implicitly.	
@Autowired
BillService billService;
//@PostMapping annotation handles the HTTP POST requests(to add the bill).
	@PostMapping("bill")
	//saveBill is used to store the viewbill
	BillPojo saveBill(@RequestBody BillPojo billPojo) {
		BasicConfigurator.configure();
		LOG.info("Entered end point \'emart/bill \' ");
		LOG.info("Exited end point \'emart/bill \' ");
		return billService.saveBill(billPojo);
	}
	
	
}
