package ru.fazlyev.stockparser.service;

import org.springframework.stereotype.Service;

@Service("DowJonesStockService")
public class DowJonesStockService implements StockService {
    private String URLString = "https://www.slickcharts.com/dowjones";

    @Override
    public String getURLString() {
        return URLString;
    }
}
