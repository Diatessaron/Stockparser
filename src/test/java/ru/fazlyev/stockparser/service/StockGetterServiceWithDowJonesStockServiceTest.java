package ru.fazlyev.stockparser.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.fazlyev.stockparser.domain.Stock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StockGetterServiceWithDowJonesStockServiceTest {
    @Autowired
    private DowJonesStockService stockService;
    @Autowired
    private StockGetterServiceImpl stockGetterService;

    @Test
    void shouldReturnCorrectSize(){
        List<Stock> actualStocks = stockGetterService.getAllStocks(stockService);

        assertEquals(30, actualStocks.size());
    }

    @Test
    void shouldReturnCorrectNameAndSymbol(){
        final String expectedStockName = "Apple";
        final String expectedStockSymbol = "AAPL";

        final Stock apple = stockGetterService.getStockByString(stockService, expectedStockName);
        final String actualStockSymbol = apple.getSymbol();
        final String actualStockName = apple.getName();

        assertEquals(expectedStockName, actualStockName);
        assertEquals(expectedStockSymbol, actualStockSymbol);
    }
}
