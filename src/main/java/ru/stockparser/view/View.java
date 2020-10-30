package ru.stockparser.view;

import ru.stockparser.model.Stock;

import java.util.List;

public interface View {
    void showAllStocks(List<Stock> stocks);

    void showOneStock(Stock stock);
}
