package ru.stockparser.model;

import ru.stockparser.model.command.Command;

import java.util.List;

public class StockModel {
    public List<Stock> getAllStocks(Command command) {
        return command.getAllStocks();
    }

    public Stock getStockByString(Command command, String name) {
        return command.getAllStocks().parallelStream().filter(stock -> stock.getName().equalsIgnoreCase(name))
                .findAny().orElseThrow();
    }
}
