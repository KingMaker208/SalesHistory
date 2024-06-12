package com.cg.sprint.Sales_History.Services;

import java.sql.Date;
import java.util.List;

import com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO;
import com.cg.sprint.Sales_History.DTOs.CategorySalesDTO;
import com.cg.sprint.Sales_History.Entities.Sale;

public interface SaleService {
	List<Sale> getAll();
	List<Sale> getAllSalesByQuarter(int monthInt);
	List<Sale> getAllSalesByDate(Date date);
	List<CategorySalesDTO> getCategoryWiseSalesQtys();
	List<CategorySalesDTO> getCategoryWiseSalesQtysByYear(int year);
	List<CategorySalesAmountSumDTO> getCategoryWiseSalesSoldAmt();
	List<CategorySalesAmountSumDTO> getCategoryWiseSalesSoldAmtByYear(int year);
}
