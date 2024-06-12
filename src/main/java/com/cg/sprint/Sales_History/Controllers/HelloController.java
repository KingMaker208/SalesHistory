package com.cg.sprint.Sales_History.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.sprint.Sales_History.DTOs.CategorySalesAmountSumDTO;
import com.cg.sprint.Sales_History.DTOs.CategorySalesDTO;
import com.cg.sprint.Sales_History.Entities.Sale;
import com.cg.sprint.Sales_History.Services.SaleService;

@Controller
@RequestMapping("/home")
public class HelloController {

	@Autowired
	private SaleService saleService;

	@GetMapping("")
	public String homePage(Model model) {
		return "home";
	}

	@GetMapping("/sales")
	public String listSales(Model model) {
		List<Sale> sales = saleService.getAll();
		if(sales.isEmpty()) {
			model.addAttribute("isError", false);
		}
		else {
			model.addAttribute("isSuccess", true);
		}
		model.addAttribute("sales", sales);
		return "sales";
	}

	@GetMapping("/quarter")
	public String getQuarter(Model model) {
		model.addAttribute("sales", new ArrayList<Sale>());
		return "getByQuarter";
	}

	@PostMapping("/quarter")
	public String showQuarterSales(@RequestParam("quarter") int quarter, Model model) {
		List<Sale> sales = saleService.getAllSalesByQuarter(quarter);
		model.addAttribute("message", "No sales found for Quarter: " + quarter);
		model.addAttribute("sales", sales);
		return "getByQuarter";
	}

	@GetMapping("/date")
	public String getDate(Model model) {
		model.addAttribute("sales", new ArrayList<Sale>());
//		model.addAttribute("date", new Date(System.currentTimeMillis()));
		return "getByDate";
	}

	@PostMapping("/date")
	public String showDateSales(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") java.util.Date dateUtil,
			Model model) {
		java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime());
		List<Sale> sales = saleService.getAllSalesByDate(dateSql);
		if (sales.isEmpty()) {
			model.addAttribute("message", "No sales found for date: " + dateSql);
		} else {
			model.addAttribute("message", null);
		}
		model.addAttribute("sales", sales);
		return "getByDate";
	}

	@GetMapping("/categoryWise")
	public String showCategoryWise(Model model) {
		List<CategorySalesDTO> custom = saleService.getCategoryWiseSalesQtys();
		model.addAttribute("sales", custom);
		return "categorySegregation";
	}

	@GetMapping("/categoryWiseByYear")
	public String showCategoryWiseByYear(Model model) {
		model.addAttribute("sales", new ArrayList<Sale>());
		return "categorySegregationByYear";
	}

	@PostMapping("/categoryWiseByYear")
	public String showCategoryWiseByYear(@RequestParam("year") int year, Model model) {
		List<CategorySalesDTO> custom = saleService.getCategoryWiseSalesQtysByYear(year);
		model.addAttribute("sales", custom);
		model.addAttribute("year", year);
		return "categorySegregationByYear";
	}

	@GetMapping("/categoryWiseAmountSold")
	public String showCategoryWiseAmountSold(Model model) {
		List<CategorySalesAmountSumDTO> custom = saleService.getCategoryWiseSalesSoldAmt();
		model.addAttribute("sales", custom);
		return "categoryWiseAmountSold";
	}

	@GetMapping("/categoryWiseAmountByYear")
	public String showCategoryWiseAmountByYear(Model model) {
		model.addAttribute("sales", new ArrayList<CategorySalesAmountSumDTO>());
		return "categoryWiseAmountSoldByYear";
	}

	@PostMapping("/categoryWiseAmountByYear")
	public String showCategoryWiseAmountByYear(@RequestParam("year") int year, Model model) {
		List<CategorySalesAmountSumDTO> custom = saleService.getCategoryWiseSalesSoldAmtByYear(year);
		model.addAttribute("sales", custom);
		model.addAttribute("year", year);
		return "categoryWiseAmountSoldByYear";
	}
}
