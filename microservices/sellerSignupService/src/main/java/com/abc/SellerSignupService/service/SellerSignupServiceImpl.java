package com.abc.SellerSignupService.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.SellerSignupService.dao.SellerSignupServiceDao;
import com.abc.SellerSignupService.dao.entity.SellerSignupServiceEntity;
import com.abc.SellerSignupService.model.SellerSignupServicePojo;

@Service

public class SellerSignupServiceImpl implements SellerSignupService {
	
	static Logger LOG = Logger.getLogger(SellerSignupServiceImpl.class.getClass());
	@Autowired
	SellerSignupServiceDao sellerDao;

	

	@Override
	public SellerSignupServicePojo addSeller(SellerSignupServicePojo sellerPojo) {
		LOG.info("entered addBuyer()");
		SellerSignupServiceEntity SellerSignupEntity = new SellerSignupServiceEntity(sellerPojo.getSellerId(),
																					 sellerPojo.getSellerUsername(),
																					 sellerPojo.getSellerPassword(),
																					 sellerPojo.getSellerCompany(),
																					 sellerPojo.getSellerBrief(),
																					 sellerPojo.getSellerGst(),
																					 sellerPojo.getSellerAddress(),
																					 sellerPojo.getSellerEmail(),
																					 sellerPojo.getSellerContact(),
																					 sellerPojo.getSellerWebsite());
		sellerDao.save(SellerSignupEntity);
		LOG.info("Exited addBuyer()");
		return sellerPojo;

		
	}

}
