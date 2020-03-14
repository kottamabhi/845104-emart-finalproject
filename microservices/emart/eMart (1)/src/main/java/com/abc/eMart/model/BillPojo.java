package com.abc.eMart.model;

import java.util.*;

public class BillPojo {
	
	private int billId;
	
	private int buyerId;
	
	private String billType;
	 
	private Date billDate;
	
	private String billRemarks;
	 
	private int billAmount;

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getBillRemarks() {
		return billRemarks;
	}

	public void setBillRemarks(String billRemarks) {
		this.billRemarks = billRemarks;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public BillPojo(int billId, int buyerId, String billType, Date billDate, String billRemarks, int billAmount) {
		super();
		this.billId = billId;
		this.buyerId = buyerId;
		this.billType = billType;
		this.billDate = billDate;
		this.billRemarks = billRemarks;
		this.billAmount = billAmount;
	}

	public BillPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillPojo [billId=" + billId + ", buyerId=" + buyerId + ", billType=" + billType + ", billDate="
				+ billDate + ", billRemarks=" + billRemarks + ", billAmount=" + billAmount + "]";
	}
	 
	
 
}
