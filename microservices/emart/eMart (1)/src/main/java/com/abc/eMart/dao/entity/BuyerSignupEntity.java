package com.abc.eMart.dao.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer_signup_table")
public class BuyerSignupEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="buyer_id")
	private int buyerId;
	 
	@Column(name="buyer_username")
	private String buyerUsername;
	 
	@Column(name="buyer_password")
	private String buyerPassword;
	 
	@Column(name="buyer_email")
	private String buyerEmail;
	
	@Column(name="buyer_mobile")
	private int buyerMobile;
	 
	@Column(name="buyer_date")
	private Date buyerDate;

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerUsername() {
		return buyerUsername;
	}

	public void setBuyerUsername(String buyerUsername) {
		this.buyerUsername = buyerUsername;
	}

	public String getBuyerPassword() {
		return buyerPassword;
	}

	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public int getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(int buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public Date getBuyerDate() {
		return buyerDate;
	}

	public void setBuyerDate(Date buyerDate) {
		this.buyerDate = buyerDate;
	}

	public BuyerSignupEntity(int buyerId, String buyerUsername, String buyerPassword, String buyerEmail,
			int buyerMobile, Date buyerDate) {
		super();
		this.buyerId = buyerId;
		this.buyerUsername = buyerUsername;
		this.buyerPassword = buyerPassword;
		this.buyerEmail = buyerEmail;
		this.buyerMobile = buyerMobile;
		this.buyerDate = buyerDate;
	}

	public BuyerSignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BuyerSignupEntity [buyerId=" + buyerId + ", buyerUsername=" + buyerUsername + ", buyerPassword="
				+ buyerPassword + ", buyerEmail=" + buyerEmail + ", buyerMobile=" + buyerMobile + ", buyerDate="
				+ buyerDate + "]";
	}
	

}
