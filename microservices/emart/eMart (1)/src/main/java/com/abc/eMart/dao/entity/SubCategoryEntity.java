package com.abc.eMart.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_category_table")

public class SubCategoryEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

@Column(name="subcategory_id")
	private int subCategoryId;
	 
@Column(name="subcategory_name")
	private String subCategoryName;
	 
@Column(name="category_id")
	private int categoryId;
	
@Column(name="subcategory_brief")
	private String subCategoryBrief;
	
@Column(name="subcategory_gst")
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

	public SubCategoryEntity(int subCategoryId, String subCategoryName, int categoryId, String subCategoryBrief,
			int subCategoryGst) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
		this.subCategoryBrief = subCategoryBrief;
		this.subCategoryGst = subCategoryGst;
	}

	public SubCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubCategoryEntity [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", categoryId=" + categoryId + ", subCategoryBrief=" + subCategoryBrief + ", subCategoryGst="
				+ subCategoryGst + "]";
	}
	
	
}
