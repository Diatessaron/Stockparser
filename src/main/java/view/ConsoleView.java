package view;

import model.Stock;

import java.util.List;

public class ConsoleView implements View{
    public void showAllStocks(List<Stock> stocks) {
        stocks.forEach(System.out::println);
    }

    public void showOneStock(Stock stock) {
        System.out.println(stock.toString());
    }
}
