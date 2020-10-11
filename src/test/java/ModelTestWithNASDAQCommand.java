import model.Model;
import model.Stock;
import model.command.NASDAQCommand;
import model.command.Command;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ModelTestWithNASDAQCommand {
    private Model model = new Model();
    private Command command = new NASDAQCommand();

    @Test
    public void testGetAllStocksBySize(){
        List<Stock> actualStocks = model.getAllStocks(command);

        assertEquals(103, actualStocks.size());
    }

    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = model.getStockByString(command, "Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
