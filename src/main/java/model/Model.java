package model;

import model.strategy.Strategy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class Model {
    public List<Stock> getAllStocks(Strategy strategy) {
        String url = strategy.getURLString();

        try{
            Document doc = Jsoup.connect(url).get();
            int i=1;
            Elements elements = doc.select("table.table-sm.table-borderless.table-hover.table tbody");

            while(true){
                String text = elements.select("tr:nth-of-type(" + i + ")").text();
                if(text.equals(""))
                    break;
                i++;

                String[] array = text.split(" ");

            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Stock getStockMarketIndex(Strategy strategy) {


        return null;
    }

    public Stock getStockByString(String name) {


        return null;
    }
}
