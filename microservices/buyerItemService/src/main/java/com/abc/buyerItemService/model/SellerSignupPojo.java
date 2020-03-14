package com.abc.buyerItemService.model;

public class SellerSignupPojo { 
	
	private int sellerId;
	 
	private String sellerUsername;
	 
	private String sellerPassword;
	 
	private String sellerCompany;
	
	private String sellerBrief;
	 
	private int sellerGst;
	 
	private String sellerAddress;
	
	private String sellerEmail;
	
	private int sellerContact;
	
	private String sellerWebsite;

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerUsername() {
		return sellerUsername;
	}

	public void setSellerUsername(String sellerUsername) {
		this.sellerUsername = sellerUsername;
	}

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerCompany() {
		return sellerCompany;
	}

	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}

	public String getSellerBrief() {
		return sellerBrief;
	}

	public void setSellerBrief(String sellerBrief) {
		this.sellerBrief = sellerBrief;
	}
	public void setSellerGst(int sellerGst) {
		this.sellerGst = sellerGst;
	}
	public int getSellerGst() {
		return sellerGst;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}


	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}

	
	public void setSellerContact(int sellerContact) {
		this.sellerContact = sellerContact;
	}
	public int getSellerContact() {
		return sellerContact;
	}

	
	public void setSellerWebsite(String sellerWebsite) {
		this.sellerWebsite = sellerWebsite;
	}
	public String getSellerWebsite() {
		return sellerWebsite;
	}

	

	@Override
	public String toString() {
		return "SellerSignupPojo [sellerId=" + sellerId + ", sellerUsername=" + sellerUsername + ", sellerPassword="
				+ sellerPassword + ", sellerCompany=" + sellerCompany + ", sellerBrief=" + sellerBrief + ", sellerGst="
				+ sellerGst + ", sellerAddress=" + sellerAddress + ", sellerEmail=" + sellerEmail + ", sellerContact="
				+ sellerContact + ", sellerWebsite=" + sellerWebsite + "]";
	}

	public SellerSignupPojo(int sellerId, String sellerUsername, String sellerPassword, String sellerCompany,
			String sellerBrief, int sellerGst, String sellerAddress, String sellerEmail, int sellerContact,
			String sellerWebsite) {
		super();
		this.sellerId = sellerId;
		this.sellerUsername = sellerUsername;
		this.sellerPassword = sellerPassword;
		this.sellerCompany = sellerCompany;
		this.sellerBrief = sellerBrief;
		this.sellerGst = sellerGst;
		this.sellerAddress = sellerAddress;
		this.sellerEmail = sellerEmail;
		this.sellerContact = sellerContact;
		this.sellerWebsite = sellerWebsite;
	}

	public SellerSignupPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
