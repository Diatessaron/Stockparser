package ru.fazlyev.stockparser.service;

import ru.fazlyev.stockparser.domain.Stock;

import java.util.List;

public interface StockGetterService {
    List<Stock> getAllStocks(StockService stockService);
    Stock getStockByString(StockService stockService, String name);
}
