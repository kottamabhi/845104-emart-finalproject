package com.abc.eMart.service;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.abc.eMart.controller.ItemController;
import com.abc.eMart.dao.ItemDao;
import com.abc.eMart.dao.entity.CategoryEntity;
import com.abc.eMart.dao.entity.ItemEntity;
import com.abc.eMart.dao.entity.SellerSignupEntity;
import com.abc.eMart.dao.entity.SubCategoryEntity;
import com.abc.eMart.model.CategoryPojo;
import com.abc.eMart.model.ItemPojo;
import com.abc.eMart.model.SellerSignupPojo;
import com.abc.eMart.model.SubCategoryPojo;
//import com.sun.xml.bind.annotation.OverrideAnnotationOf;

@Service
public class ItemServiceImpl implements ItemService {
	static Logger LOG = Logger.getLogger(ItemServiceImpl.class.getClass());
	@Autowired
	ItemDao  itemDao;

	@Override
	public List<ItemPojo> getAllItems(){
		LOG.info("Enter getAllItems()");
		List<ItemPojo> allItemPojo=new ArrayList();
		Iterable<ItemEntity> allItemEntity =itemDao.findAll();
		Iterator itr=allItemEntity.iterator();
		while(itr.hasNext())
		{
			ItemEntity itemEntity = (ItemEntity) itr.next();
			SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
			CategoryEntity categoryEntity =subCategoryEntity.getCategory();
			SellerSignupEntity sellerSignupEntity=itemEntity.getSeller();
			
		CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(),categoryEntity.getCategoryName(),categoryEntity.getCategoryBrief());
			SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
					subCategoryEntity.getSubCategoryName(),categoryPojo,subCategoryEntity.getSubCategoryBrief(),
					subCategoryEntity.getSubCategoryGst()
					);
			SellerSignupPojo sellerPojo=new SellerSignupPojo(sellerSignupEntity.getSellerId(),sellerSignupEntity.getSellerUsername(),
					sellerSignupEntity.getSellerPassword(),sellerSignupEntity.getSellerCompany(),sellerSignupEntity.getSellerBrief(),
					sellerSignupEntity.getSellerGst(),sellerSignupEntity.getSellerAddress(),sellerSignupEntity.getSellerEmail(),
					sellerSignupEntity.getSellerContact(),sellerSignupEntity.getSellerWebsite());
			
			ItemPojo itemPojo= new ItemPojo(itemEntity.getItemId(),
					itemEntity.getItemName(),
					itemEntity.getItemImage(),
					itemEntity.getItemPrice(),
					itemEntity.getItemStock(),
					itemEntity.getItemDescription(),
					subCategoryPojo,
					itemEntity.getItemRemarks(),
					sellerPojo);
					
			
		allItemPojo.add(itemPojo);
		
		} 
		LOG.info("Exit getAllItems()");
		return allItemPojo;
		}
		
	

	@Override
	public ItemPojo getItem(Integer itemId) {
		LOG.info("Enter getItem()");
		
			ItemPojo itemPojo = null;
			Optional result = itemDao.findById(itemId);
			if(result.isPresent()) {
				
				ItemEntity itemEntity = (ItemEntity) result.get();
				SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
				CategoryEntity categoryEntity =subCategoryEntity.getCategory();
				SellerSignupEntity sellerSignupEntity=itemEntity.getSeller();
				
			CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(),categoryEntity.getCategoryName(),categoryEntity.getCategoryBrief());
				SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
						subCategoryEntity.getSubCategoryName(),categoryPojo,subCategoryEntity.getSubCategoryBrief(),
						subCategoryEntity.getSubCategoryGst()
						);
				SellerSignupPojo sellerPojo=new SellerSignupPojo(sellerSignupEntity.getSellerId(),sellerSignupEntity.getSellerUsername(),
						sellerSignupEntity.getSellerPassword(),sellerSignupEntity.getSellerCompany(),sellerSignupEntity.getSellerBrief(),
						sellerSignupEntity.getSellerGst(),sellerSignupEntity.getSellerAddress(),sellerSignupEntity.getSellerEmail(),
						sellerSignupEntity.getSellerContact(),sellerSignupEntity.getSellerWebsite());
				
				itemPojo = new ItemPojo(itemEntity.getItemId(),
						itemEntity.getItemName(),
						itemEntity.getItemImage(),
						itemEntity.getItemPrice(),
						itemEntity.getItemStock(),
						itemEntity.getItemDescription(),
						subCategoryPojo,
						itemEntity.getItemRemarks(),
						sellerPojo);
						
			
			
			} 
			LOG.info("Exit getItem()");
		return itemPojo;
	}
	
	



	@Override
	public ItemPojo addItem(ItemPojo itemPojo) {
		// TODO Auto-generated method stub
		return null;
	}
}
