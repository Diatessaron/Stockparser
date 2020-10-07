import controller.Controller;
import model.Model;
import model.strategy.NASDAQStrategy;
import model.strategy.Strategy;
import view.ConsoleView;
import view.View;

public class MainClass {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Model model = new Model();
        Strategy strategy = new NASDAQStrategy();
        Controller controller = new Controller(view, model, strategy);

        controller.getAllStocks();
        controller.getStockMarketIndex();
        controller.getStockByString("Apple");
    }
}
