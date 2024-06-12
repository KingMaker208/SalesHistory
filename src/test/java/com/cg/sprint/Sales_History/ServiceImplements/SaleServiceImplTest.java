package com.cg.sprint.Sales_History.ServiceImplements;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.sprint.Sales_History.Entities.Sale;
import com.cg.sprint.Sales_History.Repositories.SaleRepository;
import com.cg.sprint.Sales_History.ServicesImpls.SaleServiceImpl;

public class SaleServiceImplTest {
	private SaleRepository saleRepository;
	private SaleServiceImpl saleService;

	@BeforeEach
	public void setup() {
		saleRepository = mock(SaleRepository.class);
		saleService = new SaleServiceImpl();
		saleService.setSaleRepo(saleRepository);
	}
	@Test
	public void testGetAllSales() {
		List<Sale> expectedSales = new ArrayList<>();
		expectedSales.add(new Sale());
		expectedSales.add(new Sale());
		when(saleRepository.findAll()).thenReturn(expectedSales);
		List<Sale> actualSales = saleService.getAll();
		assertEquals(expectedSales, actualSales);
	}
//	@Test
//	public void testGetByDate() {
//		Date date = new Date(System.currentTimeMillis());
//		List<Sale> expectedSales = new ArrayList<>();
//		expectedSales.add(new Sale());
//		expectedSales.add(new Sale());
//		when(saleRepository.getAllSalesByDate(date)).thenReturn(expectedSales);
//		List<Sale> actualSales = saleService.getAllSalesByDate(date);
//		assertNotEquals(expectedSales, actualSales);
//	}
	public void setSaleRepository(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}
}