package com.cg.sprint.Sales_History.Repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sprint.Sales_History.DTOs.*;
import com.cg.sprint.Sales_History.Entities.*;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{
	
//	List<Sale> getAllSalesByDate(Date date);
	
	@Query("SELECT new com.cg.sprint.Sales_History.DTOs.CategorySalesDTO(p.prodCategory, SUM(s.quantitySold)) " +
	           "FROM Sale s JOIN s.prodId p " +
	           "GROUP BY p.prodCategory")
	    List<CategorySalesDTO> findCategoryWiseSalesQuantities();
	
	@Query("SELECT new com.cg.sprint.Sales_History.DTOs.CategorySalesDTO(p.prodCategory, SUM(s.quantitySold)) " +
	           "FROM Sale s JOIN s.prodId p JOIN s.timeId t " +
	           "WHERE t.calendarYear = :year " +
	           "GROUP BY p.prodCategory")
	    List<CategorySalesDTO> findCategoryWiseSalesQuantitiesByYear(int year);
	
	@Query("SELECT new com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO(p.prodCategory, SUM(s.amount_sold)) " +
	           "FROM Sale s JOIN s.prodId p " +
	           "GROUP BY p.prodCategory")
	    List<CategorySalesAmountSumDTO> findCategoryWiseSalesSum();
	
	@Query("SELECT new com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO(p.prodCategory, SUM(s.amount_sold)) " +
			"FROM Sale s JOIN s.prodId p JOIN s.timeId t " +
	           "WHERE t.calendarYear = :year " +
			"GROUP BY p.prodCategory")
	List<CategorySalesAmountSumDTO> findCategoryWiseSalesSumByYear(int year);
	
	
}