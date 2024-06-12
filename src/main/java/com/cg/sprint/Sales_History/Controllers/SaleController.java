package com.cg.sprint.Sales_History.Controllers;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO;
import com.cg.sprint.Sales_History.DTOs.CategorySalesDTO;
import com.cg.sprint.Sales_History.Entities.Sale;
import com.cg.sprint.Sales_History.Exceptions.InvalidDataException;
import com.cg.sprint.Sales_History.Exceptions.NoDataFoundException;
import com.cg.sprint.Sales_History.Services.SaleService;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {
	@Autowired
	private SaleService saleService;
	@GetMapping("")
	public ResponseEntity<List<Sale>> getSales() {
		List<Sale> sales = saleService.getAll();
		if(sales.isEmpty()) {
			throw new NoDataFoundException("No sales Available");
		}
		return new ResponseEntity<List<Sale>>(sales, HttpStatus.OK);
	}
	@GetMapping("/quarter")
	public ResponseEntity<List<Sale>> getSalesByQuarter(@RequestParam("quarter") int quarter) {
		if(quarter < 0) {
			throw new InvalidDataException("Invalid input");
		}
		if(quarter < 1 || quarter > 4) {
			throw new InvalidDataException("Your value: "+quarter+" Expected values: [1,2,3,4]");
		}
		List<Sale> sales = saleService.getAllSalesByQuarter(quarter);
		if (sales.size() == 0) {
			throw new NoDataFoundException("Sales not found for the quarter : " + quarter);
		}
		return new ResponseEntity<List<Sale>>(sales, HttpStatus.OK);
	}
	@GetMapping("/date")
	public ResponseEntity<List<Sale>> getSalesByDate(@RequestParam("date") Date date) {
		if(date.toLocalDate().isAfter(LocalDate.now())) {
			throw new InvalidDataException("This is a future date. Current date: "+LocalDate.now());
		}
		List<Sale> sales = saleService.getAllSalesByDate(date);
		if (sales.size() == 0) {
			throw new NoDataFoundException("Sales not found on this date : " + date);
		}
		return new ResponseEntity<List<Sale>>(sales, HttpStatus.OK);
	}
	@GetMapping("/qtys/categorywise")
	public ResponseEntity<List<CategorySalesDTO>> getSalesCategoryWise() {
        List<CategorySalesDTO> sales = saleService.getCategoryWiseSalesQtys();
        if (sales.size() == 0) {
			throw new NoDataFoundException("No sales data to show");
		}
        return new ResponseEntity<List<CategorySalesDTO>>(sales, HttpStatus.OK);
    }
	@GetMapping("/qtys/categorywise/{year}")
	public ResponseEntity<List<CategorySalesDTO>> getSalesCategoryWiseByYear(@PathVariable int year) {
		if(year > LocalDate.now().getYear()) {
			throw new InvalidDataException("Future year entered. Current year: "+LocalDate.now().getYear());
		}
		else if(year<1) {
			throw new InvalidDataException("Not a valid year. Enter between 0 and "+LocalDate.now().getYear());
		}
		List<CategorySalesDTO> sales = saleService.getCategoryWiseSalesQtysByYear(year);
		if (sales.size() == 0) {
			throw new NoDataFoundException(" Sales not found for the year: "+year);
		}
		return new ResponseEntity<List<CategorySalesDTO>>(sales, HttpStatus.OK);
	}
	@GetMapping("/sold/categorywise")
	public ResponseEntity<List<CategorySalesAmountSumDTO>> getSalesSoldCategoryWise() {
		List<CategorySalesAmountSumDTO> sales = saleService.getCategoryWiseSalesSoldAmt();
		if (sales.size() == 0) {
			throw new NoDataFoundException("No sold sales found");
		}
		return new ResponseEntity<List<CategorySalesAmountSumDTO>>(sales, HttpStatus.OK);
	}
	@GetMapping("/sold/categorywise/{year}")
	public ResponseEntity<List<CategorySalesAmountSumDTO>> getSalesSoldCategoryWiseByYear(@PathVariable int year) {
		if(year > LocalDate.now().getYear()) {
			throw new InvalidDataException("Future year entered. Current year: "+LocalDate.now().getYear());
		} else if(year<1) {
			throw new InvalidDataException("Not a valid year. Enter between 0 and "+LocalDate.now().getYear());
		}
		List<CategorySalesAmountSumDTO> sales = saleService.getCategoryWiseSalesSoldAmtByYear(year);
		if (sales.size() == 0) {
			throw new NoDataFoundException(" Sales not found for the year: "+year);
		}
		return new ResponseEntity<List<CategorySalesAmountSumDTO>>(sales, HttpStatus.OK);
	}
	public SaleService getSaleService() {
		return saleService;
	}
	public void setSaleService(SaleService saleService) {
		this.saleService = saleService;
	}
	public SaleController(SaleService saleService) {
		this.saleService = saleService;
	}
//	@GetMapping("/rating/lt/{rating}")
//    public ResponseEntity<List<Film>> findFilmsByRatingLessThan(@PathVariable("rating") String rating) {
//		Set<String> ratings = new HashSet<>();
//    	ratings.add("PG");
//    	ratings.add("PG-13");
//    	ratings.add("PG-17");
//    	ratings.add("NC");
//    	ratings.add("NC-13");
//    	ratings.add("NC-17");
//    	ratings.add("G");
//    	ratings.add("R");
//    	if(!ratings.contains(rating)) {
//    		throw new InvalidDataException(rating+" is not a recognised rating");
//    	}
//    	else if(filmService.findFilmsByRatingLessThan(rating).isEmpty()) {
//    		throw new NoDataFoundException("No movies are rated less than "+rating);
//    	}
//		else {
//        	return new ResponseEntity<>(filmService.findFilmsByRatingLessThan(rating),HttpStatus.OK);
//		}
//    }
	
	public static boolean isLegalDate(String dateStr, String dateFormat) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}