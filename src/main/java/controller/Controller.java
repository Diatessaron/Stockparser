package controller;

import model.Model;
import model.strategy.Strategy;
import view.View;

public class Controller {
    private View view;
    private Model model;
    private Strategy strategy;

    public Controller(View view, Model model, Strategy strategy) {
        this.view = view;
        this.model = model;
        this.strategy = strategy;
    }

    public void getAllStocks(){
        view.showAllStocks(model.getAllStocks(strategy));
    }

    public void getStockMarketIndex(){
        view.showOneStock(model.getStockMarketIndex(strategy));
    }

    public void getStockByString(String name){
        view.showOneStock(model.getStockByString(name));
    }
}
