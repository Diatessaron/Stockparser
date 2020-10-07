package model.strategy;

public class NASDAQStrategy implements Strategy{
    private String URLString = "https://www.slickcharts.com/nasdaq100";

    @Override
    public String getURLString() {
        return URLString;
    }
}
