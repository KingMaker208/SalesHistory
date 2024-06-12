package com.cg.sprint.Sales_History.Controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.cg.sprint.Sales_History.Services.SaleService;
import com.cg.sprint.Sales_History.Entities.*;

class SaleControllerTest {
    @Mock
    private SaleService saleService;
    private SaleController saleController;
    public SaleControllerTest() {
        MockitoAnnotations.openMocks(this);
        saleController = new SaleController(saleService);
    }
    @Test
    void testGetAllSales() {
        List<Sale> expectedSales = Arrays.asList(
                new Sale(),
                new Sale());
        when(saleService.getAll()).thenReturn(expectedSales);
        List<Sale> actualSales = saleController.getSaleService().getAll();
        assertEquals(expectedSales, actualSales);
        verify(saleService, times(1)).getAll();
    }
}
