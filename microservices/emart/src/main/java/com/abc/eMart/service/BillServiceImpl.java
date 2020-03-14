package com.abc.eMart.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.eMart.dao.BillDao;
import com.abc.eMart.dao.BillDetailsDao;
import com.abc.eMart.dao.entity.BillDetailsEntity;
import com.abc.eMart.dao.entity.BillEntity;
import com.abc.eMart.dao.entity.BuyerSignupEntity;
import com.abc.eMart.dao.entity.CategoryEntity;
import com.abc.eMart.dao.entity.ItemEntity;
import com.abc.eMart.dao.entity.SellerSignupEntity;
import com.abc.eMart.dao.entity.SubCategoryEntity;
import com.abc.eMart.model.BillDetailsPojo;
import com.abc.eMart.model.BillPojo;
import com.abc.eMart.model.BuyerSignupPojo;
import com.abc.eMart.model.CategoryPojo;
import com.abc.eMart.model.ItemPojo;
import com.abc.eMart.model.SellerSignupPojo;
import com.abc.eMart.model.SubCategoryPojo;
@Service
public class BillServiceImpl implements BillService {
	static Logger LOG = Logger.getLogger(BillServiceImpl.class.getClass());
	//@Autowired is used to inject the object dependency implicitly.
    @Autowired
    BillDao billDao;
  //@Autowired is used to inject the object dependency implicitly.
	@Autowired
	BillDetailsDao billDetailsDao;
	@Override
	@Transactional
	public BillPojo saveBill(BillPojo billPojo) {
		LOG.info("Enter saveBill()");
		
		BuyerSignupPojo buyerPojo = billPojo.getBuyerPojo();
		System.out.println("Buyer Id bill w" + buyerPojo.getBuyerId());
		BuyerSignupEntity buyerEntity = new BuyerSignupEntity(buyerPojo.getBuyerId(),
															  buyerPojo.getBuyerUsername(),
															  buyerPojo.getBuyerPassword(),
															  buyerPojo.getBuyerEmail(),
															  buyerPojo.getBuyerMobile(),
															  buyerPojo.getBuyerDate(),
															  null);
		BillEntity billEntity = new BillEntity();
		billEntity.setBillId(0);
		billEntity.setBuyerSignup(buyerEntity);
		billEntity.setBillType(billPojo.getBillType());
		billEntity.setBillDate(billPojo.getBillDate());
		billEntity.setBillRemarks(billPojo.getBillRemarks());
		billEntity.setBillAmount(billPojo.getBillAmount());
		
		
		
	
		
		billEntity = billDao.saveAndFlush(billEntity);
		billPojo.setBillId(billEntity.getBillId());
								
		BillEntity setBillEntity = billDao.findById(billEntity.getBillId()).get();
		Set<BillDetailsEntity> allBillDetails = new HashSet<BillDetailsEntity>(); 
		Set<BillDetailsPojo> allBillDetailsPojo = billPojo.getAllBillDetails();
		for(BillDetailsPojo billDetailsPojo : allBillDetailsPojo) {
			ItemPojo itemPojo = billDetailsPojo.getItemPojo();
			SubCategoryPojo subCategoryPojo = itemPojo.getSubCategoryPojo();
			SellerSignupPojo sellerPojo = itemPojo.getSellerPojo();
			CategoryPojo categoryPojo = subCategoryPojo.getCategoryPojo();
			
			SellerSignupEntity sellerEntity = new SellerSignupEntity(sellerPojo.getSellerId(),
																	 sellerPojo.getSellerUsername(),
																	 sellerPojo.getSellerPassword(),
																	 sellerPojo.getSellerCompany(),
																	 sellerPojo.getSellerBrief(),
																	 sellerPojo.getSellerGst(),
																	 sellerPojo.getSellerAddress(),
																	 sellerPojo.getSellerEmail(),
																	 sellerPojo.getSellerContact(),
																	 sellerPojo.getSellerWebsite());
			
			CategoryEntity categoryEntity = new CategoryEntity(categoryPojo.getCategoryId(),
															   categoryPojo.getCategoryName(),
															   categoryPojo.getCategoryBrief());
			
			
			SubCategoryEntity subCategoryEntity = new SubCategoryEntity(subCategoryPojo.getSubCategoryId(),
																		subCategoryPojo.getSubCategoryName(),
																		categoryEntity,
																		subCategoryPojo.getSubCategoryBrief(),
																		subCategoryPojo.getSubCategoryGst());
			
			ItemEntity itemEntity = new ItemEntity(itemPojo.getItemId(),
												  itemPojo.getItemName(),
												  itemPojo.getItemImage(),
												  itemPojo.getItemPrice(),
												  itemPojo.getItemStock(),
												  itemPojo.getItemDescription(),
												  subCategoryEntity,
												  itemPojo.getItemRemarks(),
												  sellerEntity);
			
			BillDetailsEntity billDetailsEntity = new BillDetailsEntity(billDetailsPojo.getBillDetailsId(),
												                         setBillEntity,
												                         itemEntity);
			billDetailsDao.save(billDetailsEntity);
			System.out.println(billDetailsEntity);
		}
		LOG.info("Exit saveBill()");
		return billPojo;
	}
}

																
	
