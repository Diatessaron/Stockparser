package model;

import java.util.Objects;

public class Stock {
    private String symbol;
    private String name;
    private int price;
    private int dayChange;
    private int percentageChange;

    public Stock(String symbol, String name, int price, int dayChange, int percentageChange) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.dayChange = dayChange;
        this.percentageChange = percentageChange;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDayChange() {
        return dayChange;
    }

    public int getPercentageChange() {
        return percentageChange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return price == stock.price &&
                dayChange == stock.dayChange &&
                percentageChange == stock.percentageChange &&
                symbol.equals(stock.symbol) &&
                name.equals(stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, name, price, dayChange, percentageChange);
    }

    @Override
    public String toString() {
        return "Stock:\n" +
                "symbol: " + symbol + '\t' +
                "name: " + name + '\t' +
                "price: " + price +
                "\tdayChange: " + dayChange +
                "\tpercentageChange: " + percentageChange;
    }
}
