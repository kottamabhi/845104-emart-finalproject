package com.abc.eMart.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_table")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_image")
	private String itemImage;
	
	@Column(name="item_price")
	private double itemPrice;
	 
	@Column(name="item_stock")
	private int itemStock;
	
	@Column(name="item_description")
	private String itemDescription;
	
	@Column(name="item_subcategoryid")
	private int subcategoryId;
	 
	@Column(name="item_itemremarks")
	private String itemRemarks;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getItemRemarks() {
		return itemRemarks;
	}

	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}

	public ItemEntity(int itemId, String itemName, String itemImage, double itemPrice, int itemStock,
			String itemDescription, int subcategoryId, String itemRemarks) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
		this.subcategoryId = subcategoryId;
		this.itemRemarks = itemRemarks;
	}

	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemEntity [itemId=" + itemId + ", itemName=" + itemName + ", itemImage=" + itemImage + ", itemPrice="
				+ itemPrice + ", itemStock=" + itemStock + ", itemDescription=" + itemDescription + ", subcategoryId="
				+ subcategoryId + ", itemRemarks=" + itemRemarks + "]";
	}
	
	
	

}
