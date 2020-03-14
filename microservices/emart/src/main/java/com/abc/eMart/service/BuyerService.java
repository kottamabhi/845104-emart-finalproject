package com.abc.eMart.service;

import com.abc.eMart.model.BuyerSignupPojo;

public interface BuyerService {
  BuyerSignupPojo validateBuyer(BuyerSignupPojo buyerSignupPojo);
  BuyerSignupPojo getBuyer(Integer buyerId);


  
}
