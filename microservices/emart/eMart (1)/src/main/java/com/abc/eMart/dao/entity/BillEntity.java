package com.abc.eMart.dao.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_table")
public class BillEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="buyer_id")
	private int buyerId;
	
	@Column(name="bill_type")
	private String billType;
	 
	@Column(name="bill_date")
	private Date billDate;
	
	@Column(name="bill_remarks")
	private String billRemarks;
	 
	@Column(name="bill_amount")
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

	public BillEntity(int billId, int buyerId, String billType, Date billDate, String billRemarks, int billAmount) {
		super();
		this.billId = billId;
		this.buyerId = buyerId;
		this.billType = billType;
		this.billDate = billDate;
		this.billRemarks = billRemarks;
		this.billAmount = billAmount;
	}

	public BillEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillEntity [billId=" + billId + ", buyerId=" + buyerId + ", billType=" + billType + ", billDate="
				+ billDate + ", billRemarks=" + billRemarks + ", billAmount=" + billAmount + "]";
	}
	
	
	
	

}
