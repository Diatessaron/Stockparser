package model.strategy;

public class NASDAQStrategy implements Strategy{
    private String URLString = "https://www.nasdaq.com/market-activity/quotes/nasdaq-ndx-index";

    @Override
    public String getURLString() {
        return URLString;
    }
}
