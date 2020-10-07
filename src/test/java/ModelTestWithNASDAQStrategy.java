import model.Model;
import model.Stock;
import model.strategy.NASDAQStrategy;
import model.strategy.Strategy;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ModelTestWithNASDAQStrategy {
    private Model model = new Model();
    private Strategy strategy = new NASDAQStrategy();

    @Test
    public void testGetAllStocksBySize(){
        List<Stock> actualStocks = model.getAllStocks(strategy);

        assertEquals(103, actualStocks.size());
    }

    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = model.getStockByString(strategy, "Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
