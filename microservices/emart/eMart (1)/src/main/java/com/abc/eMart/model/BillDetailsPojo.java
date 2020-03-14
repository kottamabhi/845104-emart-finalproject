package com.abc.eMart.model;

public class BillDetailsPojo { 
	
	private int billDetailsId;
	
	private int billId;
	
	private int itemId;

	public int getBillDetailsId() {
		return billDetailsId;
	}

	public void setBillDetailsId(int billDetailsId) {
		this.billDetailsId = billDetailsId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BillDetailsPojo(int billDetailsId, int billId, int itemId) {
		super();
		this.billDetailsId = billDetailsId;
		this.billId = billId;
		this.itemId = itemId;
	}

	public BillDetailsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillDetailsPojo [billDetailsId=" + billDetailsId + ", billId=" + billId + ", itemId=" + itemId + "]";
	}
	

}
