package com.abc.eMart.model;

public class SubCategoryPojo {

	private int subCategoryId;
	 
	private String subCategoryName;
	 
	private int categoryId;
	
	private String subCategoryBrief;
	
	private int subCategoryGst;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryBrief() {
		return subCategoryBrief;
	}

	public void setSubCategoryBrief(String subCategoryBrief) {
		this.subCategoryBrief = subCategoryBrief;
	}

	public int getSubCategoryGst() {
		return subCategoryGst;
	}

	public void setSubCategoryGst(int subCategoryGst) {
		this.subCategoryGst = subCategoryGst;
	}

	public SubCategoryPojo(int subCategoryId, String subCategoryName, int categoryId, String subCategoryBrief,
			int subCategoryGst) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
		this.subCategoryBrief = subCategoryBrief;
		this.subCategoryGst = subCategoryGst;
	}

	public SubCategoryPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubCategoryPojo [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", categoryId=" + categoryId + ", subCategoryBrief=" + subCategoryBrief + ", subCategoryGst="
				+ subCategoryGst + "]";
	}
	
	
	 
}
