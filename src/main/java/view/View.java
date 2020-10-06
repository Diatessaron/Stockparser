package view;

import model.Stock;

import java.util.List;

public interface View {
    void showAllStocks(List<Stock> stocks);

    void showOneStock(Stock stock);
}
