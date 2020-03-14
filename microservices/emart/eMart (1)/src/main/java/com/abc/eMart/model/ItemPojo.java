package com.abc.eMart.model;

public class ItemPojo {

	private int itemId;
	
	private String itemName;
	 
	private String itemImage;
	
	private int itemPrice;
	
	private int itemStock;
	 
	private String itemDescription;
	 
	private int subCategoryId;
	 
	private String itemRemarks;
	
	private int sellerId;

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

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
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

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getItemRemarks() {
		return itemRemarks;
	}

	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	@Override
	public String toString() {
		return "ItemPojo [itemId=" + itemId + ", itemName=" + itemName + ", itemImage=" + itemImage + ", itemPrice="
				+ itemPrice + ", itemStock=" + itemStock + ", itemDescription=" + itemDescription + ", subCategoryId="
				+ subCategoryId + ", itemRemarks=" + itemRemarks + ", sellerId=" + sellerId + "]";
	}

	public ItemPojo(int itemId, String itemName, String itemImage, int itemPrice, int itemStock, String itemDescription,
			int subCategoryId, String itemRemarks, int sellerId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
		this.subCategoryId = subCategoryId;
		this.itemRemarks = itemRemarks;
		this.sellerId = sellerId;
	}

	public ItemPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
