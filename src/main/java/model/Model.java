package model;

import model.command.Command;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    public List<Stock> getAllStocks(Command command) {
        return command.getAllStocks();
    }

    public Stock getStockByString(Command command, String name) {
        return getAllStocks(command).stream().filter(stock -> stock.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList()).get(0);
    }
}
