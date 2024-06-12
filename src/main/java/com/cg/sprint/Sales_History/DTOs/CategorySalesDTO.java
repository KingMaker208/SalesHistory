package com.cg.sprint.Sales_History.DTOs;

public class CategorySalesDTO {
	
    private String categoryName;
    private long totalQuantity;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public long getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public CategorySalesDTO(String categoryName, long totalQuantity) {
		super();
		this.categoryName = categoryName;
		this.totalQuantity = totalQuantity;
	}
	public CategorySalesDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CategorySalesDTO [categoryName=" + categoryName + ", totalQuantity=" + totalQuantity + "]";
	}
    
    
}

