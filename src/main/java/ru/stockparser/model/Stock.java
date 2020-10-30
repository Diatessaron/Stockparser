package ru.stockparser.model;

import java.util.Objects;

public class Stock {
    private int id;
    private String symbol;
    private String name;
    private double price;
    private String change;

    public Stock(int id, String symbol, String name, double price, String change) {
        this.id=id;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.change = change;
    }

    public int getId(){
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getChange(){
        return change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return id == stock.id &&
                price == stock.price &&
                symbol.equals(stock.symbol) &&
                name.equals(stock.name) &&
                change.equals(stock.change);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, name, price, change);
    }

    @Override
    public String toString() {
        return "id: " + id + '\t' +
                "symbol: " + symbol + '\t' +
                "name: " + name + '\t' +
                "price: " + price +
                "\tchange: " + change;
    }
}
