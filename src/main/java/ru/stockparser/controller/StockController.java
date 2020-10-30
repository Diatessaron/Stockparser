package ru.stockparser.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.stockparser.model.Stock;
import ru.stockparser.model.StockModel;
import ru.stockparser.model.command.Command;

import java.util.List;

@Controller
public class StockController {
    private StockModel stockModel;
    private Command command;

    public StockController(StockModel stockModel, @Qualifier("NASDAQCommand") Command command) {
        this.stockModel = stockModel;
        this.command = command;
    }

    @GetMapping()
    public String getIndexPage(){
        return "view/index";
    }

    @GetMapping(value = "stocks")
    public String getAllStocks(Model model){
        List<Stock> stocks = stockModel.getAllStocks(command);
        model.addAttribute("stocks", stocks);
        return "view/stocks";
    }

    @GetMapping(value = "stocks/{name}")
    public String getStockByString(@PathVariable(name = "name") String name, Model model){
        Stock stockByString = stockModel.getStockByString(command, name);
        model.addAttribute("stockByString", stockByString);
        return "view/stockByString";
    }
}
