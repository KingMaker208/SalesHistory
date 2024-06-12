package com.cg.sprint.Sales_History.ServicesImpls;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO;
import com.cg.sprint.Sales_History.DTOs.CategorySalesDTO;
import com.cg.sprint.Sales_History.Entities.Sale;
import com.cg.sprint.Sales_History.Repositories.SaleRepository;
import com.cg.sprint.Sales_History.Services.SaleService;

@Service
public class SaleServiceImpl implements SaleService{
	
	@Autowired
	private SaleRepository saleRepo;

	@Override
	public List<Sale> getAll() {
		List<Sale> sales = saleRepo.findAll();
		return sales;
	}

	@Override
	public List<Sale> getAllSalesByQuarter(int quarterInt) {
		List<Sale> salesInQuarter = saleRepo.findAll().stream().filter(n->n.getTimeId().getCalendarQuarterINT()==quarterInt).collect(Collectors.toList());
		return salesInQuarter;
	}

	@Override
	public List<Sale> getAllSalesByDate(Date date) {
		List<Sale> salesOnDate = saleRepo.findAll().stream().filter(n->n.getTimeId().getTimeId().equals(date)).collect(Collectors.toList());
		return salesOnDate;
	}

	@Override
	public List<CategorySalesDTO> getCategoryWiseSalesQtys() {
		List<CategorySalesDTO> catSales = saleRepo.findCategoryWiseSalesQuantities();
		return catSales;
	}

	@Override
	public List<CategorySalesDTO> getCategoryWiseSalesQtysByYear(int year) {
		List<CategorySalesDTO> catSalesForYear = saleRepo.findCategoryWiseSalesQuantitiesByYear(year);
		return catSalesForYear;
	}

	@Override
	public List<CategorySalesAmountSumDTO> getCategoryWiseSalesSoldAmt() {
		List<CategorySalesAmountSumDTO> catSalesSold = saleRepo.findCategoryWiseSalesSum();
		return catSalesSold;
	}

	@Override
	public List<CategorySalesAmountSumDTO> getCategoryWiseSalesSoldAmtByYear(int year) {
		List<CategorySalesAmountSumDTO> catSalesSoldForYear = saleRepo.findCategoryWiseSalesSumByYear(year);
		return catSalesSoldForYear;
	}

	public SaleRepository getSaleRepo() {
		return saleRepo;
	}

	public void setSaleRepo(SaleRepository saleRepo) {
		this.saleRepo = saleRepo;
	}
	
	
	
}
