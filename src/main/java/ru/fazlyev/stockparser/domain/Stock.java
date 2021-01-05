package ru.fazlyev.stockparser.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "change")
    private String change;

    public Stock(){}

    public Stock(long id, String symbol, String name, double price, String change) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.change = change;
    }

    public long getId(){
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
