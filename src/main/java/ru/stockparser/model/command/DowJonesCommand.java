package ru.stockparser.model.command;

public class DowJonesCommand implements Command {
    private String URLString = "https://www.slickcharts.com/dowjones";

    @Override
    public String getURLString() {
        return URLString;
    }
}
