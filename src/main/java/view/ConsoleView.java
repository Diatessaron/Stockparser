package view;

import model.Stock;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsoleView implements View{
    public void showAllStocks(List<Stock> stocks) {
        System.out.println("Stocks: ");
        stocks.forEach(System.out::println);
    }

    public void showOneStock(Stock stock) {
        System.out.println(stock.toString());
    }
}
