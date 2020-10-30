import org.junit.Test;
import ru.stockparser.model.Stock;
import ru.stockparser.model.StockModel;
import ru.stockparser.model.command.Command;
import ru.stockparser.model.command.NASDAQCommand;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class StockModelTestWithNASDAQCommand {
    private Command command = new NASDAQCommand();
    private StockModel stockModel = new StockModel();

    @Test
    public void testGetAllStocksBySizeAndExecutingTimes(){
        List<Stock> actualStocks = stockModel.getAllStocks(command);

        Command mock = mock(Command.class);
        stockModel.getAllStocks(mock);

        assertEquals(103, actualStocks.size());
        verify(mock, times(1)).getAllStocks();
    }

    @Test
    public void testGetStockByString(){
        String expectedStockName = "Apple";
        String actualStockName = stockModel.getStockByString(command, "Apple").getName();

        assertEquals(expectedStockName, actualStockName);
    }
}
