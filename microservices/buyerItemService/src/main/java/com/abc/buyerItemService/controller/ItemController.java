package com.abc.buyerItemService.controller;



import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.apache.log4j.Logger;

import com.abc.buyerItemService.model.ItemPojo;
import com.abc.buyerItemService.service.ItemService;

@RestController
	@CrossOrigin
	//@RequestMapping annotation is used to map web requests.
	@RequestMapping("emart")
	
	public class ItemController {
	static Logger LOG = Logger.getLogger(ItemController.class.getClass());
	//@Autowired is used to inject the object dependency implicitly.
	@Autowired
	ItemService itemService;
	//@GetMapping annotation handles the HTTP GET requests(to get the item details).
	@GetMapping("/item/all")
	List<ItemPojo> getAllItems()
	{
		
		LOG.info("Entered end point \'emart/item/all \' ");
		LOG.info("Exited end point \'emart/item/all \' ");
		return itemService.getAllItems();
	}
	//@GetMapping annotation handles the HTTP GET requests(to get the item details).
	@GetMapping("item/{itemId}")
	//getItem is used to get the item by using the Id of an item.
	ItemPojo  getItem(@PathVariable("itemId") Integer itemId) {
		
	LOG.info("Entered end point \'emart/item/{itemId} \' ");
	LOG.info("Exited end point \'emart/item/{itemId} \' ");
		return itemService.getItem(itemId);
	}
	//@PostMapping annotation handles the HTTP POST requests(to add the item details).
	@PostMapping("/item")
	//addItem is used to add the Item
	ItemPojo addItem(@RequestBody ItemPojo itemPojo) {
		
		LOG.info("Entered end point \'emart/item \' ");
		LOG.info("Exited end point \'emart/item \' ");
		return itemService.addItem(itemPojo);
	}
}

