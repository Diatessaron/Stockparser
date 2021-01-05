package ru.fazlyev.stockparser.service;

import org.springframework.stereotype.Service;
import ru.fazlyev.stockparser.domain.Stock;

import java.util.List;

@Service
public class StockGetterServiceImpl implements StockGetterService {
    @Override
    public List<Stock> getAllStocks(StockService stockService) {
        return stockService.getAllStocks();
    }

    @Override
    public Stock getStockByString(StockService stockService, String name) {
        return stockService.getAllStocks().parallelStream().filter(stock -> stock.getName().equalsIgnoreCase(name))
                .findAny().orElseThrow();
    }
}
