package ru.fazlyev.stockparser.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fazlyev.stockparser.domain.Stock;
import ru.fazlyev.stockparser.service.StockGetterServiceImpl;
import ru.fazlyev.stockparser.service.StockService;

import java.util.List;

@RestController
@RequestMapping("api/stocks/")
public class StockController {
    private StockGetterServiceImpl stockGetterServiceImpl;
    private StockService stockService;

    public StockController(StockGetterServiceImpl stockGetterServiceImpl,
                           @Qualifier("NasdaqStockService") StockService stockService) {
        this.stockGetterServiceImpl = stockGetterServiceImpl;
        this.stockService = stockService;
    }

    @GetMapping("all")
    public List<Stock> getAllStocks(){
        return stockGetterServiceImpl.getAllStocks(stockService);
    }

    @GetMapping("{name}")
    public Stock getStockByString(@PathVariable(name = "name") String name){
        return stockGetterServiceImpl.getStockByString(stockService, name);
    }
}
