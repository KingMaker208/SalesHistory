package com.cg.sprint.Sales_History.DTOs;

import java.math.BigDecimal;

public class CategorySalesAmountSumDTO {

    private String categoryName;
    private BigDecimal totalSalesAmount;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public BigDecimal getTotalSalesAmount() {
		return totalSalesAmount;
	}
	public void setTotalSalesAmount(BigDecimal totalSalesAmount) {
		this.totalSalesAmount = totalSalesAmount;
	}
	public CategorySalesAmountSumDTO(String categoryName, BigDecimal totalSalesAmount) {
		super();
		this.categoryName = categoryName;
		this.totalSalesAmount = totalSalesAmount;
	}
	
	
	public CategorySalesAmountSumDTO() {
		super();
	}
	
	@Override
	public String toString() {
		return "CategorySalesSumDTO [categoryName=" + categoryName + ", totalSalesAmount=" + totalSalesAmount + "]";
	}

    
}

