package controller;

import model.Model;
import model.command.Command;
import view.View;

public class Controller {
    private View view;
    private Model model;
    private Command command;

    public Controller(View view, Model model, Command command) {
        this.view = view;
        this.model = model;
        this.command = command;
    }

    public void getAllStocks(){
        view.showAllStocks(model.getAllStocks(command));
    }

    public void getStockByString(String name){
        view.showOneStock(model.getStockByString(command, name));
    }
}
