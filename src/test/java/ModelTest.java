import model.Model;
import model.Stock;
import model.strategy.NASDAQStrategy;
import model.strategy.Strategy;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model = new Model();
    private Strategy strategy = new NASDAQStrategy();

    @Test
    public void testGetAllStocksBySize(){
        List<Stock> actualStocks = model.getAllStocks(strategy);

        assertEquals(103, actualStocks.size());
    }

    @Test
    public void testGetStockMarketIndexByName(){
        Stock stock = new Stock(1, "NSDQ", "NASDAQ", 123.0, "22 (+2%)");
        Stock testStock = model.getStockMarketIndex(strategy);

        assertEquals(stock.getName(), testStock.getName());
    }

    @Ignore
    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = model.getStockByString("Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
