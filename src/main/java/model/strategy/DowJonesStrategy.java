package model.strategy;

public class DowJonesStrategy implements Strategy{
    private String URLString = "https://www.slickcharts.com/dowjones";

    @Override
    public String getURLString() {
        return URLString;
    }
}
