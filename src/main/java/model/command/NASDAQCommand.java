package model.command;

public class NASDAQCommand implements Command {
    private String URLString = "https://www.slickcharts.com/nasdaq100";

    @Override
    public String getURLString() {
        return URLString;
    }
}
