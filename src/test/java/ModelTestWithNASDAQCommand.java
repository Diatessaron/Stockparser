import model.Model;
import model.Stock;
import model.command.NASDAQCommand;
import model.command.Command;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ModelTestWithNASDAQCommand {
    private Command command = new NASDAQCommand();
    private Model model = new Model();

    @Test
    public void testGetAllStocksBySizeAndExecutingTimes(){
        List<Stock> actualStocks = model.getAllStocks(command);

        Command mock = mock(Command.class);
        model.getAllStocks(mock);

        assertEquals(103, actualStocks.size());
        verify(mock, times(1)).getAllStocks();
    }

    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = model.getStockByString(command, "Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
