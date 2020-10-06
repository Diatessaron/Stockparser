import model.Model;
import model.Stock;
import model.strategy.NASDAQStrategy;
import model.strategy.Strategy;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model = new Model();
    private Strategy strategy = new NASDAQStrategy();

    @Test
    public void testGetAllStocks(){

    }

    @Test
    public void testGetStockMarketIndex(){
        Stock stock = new Stock("NSDQ", "NASDAQ", 123, 22, 11);
        Stock testStock = model.getStockMarketIndex(strategy);

        assertEquals(stock.getName(), testStock.getName());
    }

    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = model.getStockByString("Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
