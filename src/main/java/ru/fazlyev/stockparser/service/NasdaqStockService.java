package ru.fazlyev.stockparser.service;

import org.springframework.stereotype.Service;

@Service("NasdaqStockService")
public class NasdaqStockService implements StockService {
    private String URLString = "https://www.slickcharts.com/nasdaq100";

    @Override
    public String getURLString() {
        return URLString;
    }
}
