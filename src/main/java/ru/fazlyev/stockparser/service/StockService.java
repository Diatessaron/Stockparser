package ru.fazlyev.stockparser.service;

import ru.fazlyev.stockparser.domain.Stock;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface StockService {
    String getURLString();

    default List<Stock> getAllStocks(){
        String url = getURLString();
        List<Stock> result = new ArrayList<>();

        try{
            Document doc = Jsoup.connect(url).get();
            int i=1;
            Elements stocksElements = doc.select("table.table-sm.table-borderless.table-hover.table tbody");

            while(true){
                String text = stocksElements.select("tr:nth-of-type(" + i + ")").text();
                if(text.equals(""))
                    break;
                i++;

                String[] stockStringArray = text.split(" ");
                int length = stockStringArray.length;
                StringBuilder sb = new StringBuilder(stockStringArray[1]);

                if(length>8){
                    for(int j=0; j<length-8; j++){
                        sb.append(" ").append(stockStringArray[j + 2]);
                    }
                }

                int id = Integer.parseInt(stockStringArray[0]);
                String name = sb.toString();
                String symbol = stockStringArray[length-5];
                if(stockStringArray[length-3].contains(","))
                    stockStringArray[length-3] = stockStringArray[length-3].replaceAll(",", "");
                double price = Double.parseDouble(stockStringArray[length-3]);
                String change = stockStringArray[length-2] + " " + stockStringArray[length-1];

                Stock stock = new Stock(id, symbol, name, price, change);
                result.add(stock);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        result = result.stream().sorted(Comparator.comparingLong(Stock::getId)).collect(Collectors.toList());

        return result;
    }
}
