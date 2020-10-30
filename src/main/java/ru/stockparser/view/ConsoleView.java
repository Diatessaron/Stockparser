package ru.stockparser.view;

import ru.stockparser.model.Stock;

import java.util.List;

public class ConsoleView implements View{
    public void showAllStocks(List<Stock> stocks) {
        System.out.println("Stocks: ");
        stocks.forEach(System.out::println);
    }

    public void showOneStock(Stock stock) {
        System.out.println(stock.toString());
    }
}
