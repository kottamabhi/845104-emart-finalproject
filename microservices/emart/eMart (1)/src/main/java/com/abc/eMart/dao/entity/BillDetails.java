package com.abc.eMart.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_details_table")
public class BillDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="bill_details_id")
private int billDetailsId;
	
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="item_id")
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

	public BillDetails(int billDetailsId, int billId, int itemId) {
		super();
		this.billDetailsId = billDetailsId;
		this.billId = billId;
		this.itemId = itemId;
	}

	public BillDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillDetails [billDetailsId=" + billDetailsId + ", billId=" + billId + ", itemId=" + itemId + "]";
	}

}
