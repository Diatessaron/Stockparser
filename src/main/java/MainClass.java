import controller.Controller;
import model.Model;
import model.strategy.DowJonesStrategy;
import model.strategy.NASDAQStrategy;
import model.strategy.Strategy;
import view.ConsoleView;
import view.View;

public class MainClass {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Model model = new Model();
        Strategy strategy = new NASDAQStrategy();
//        Strategy strategy = new DowJonesStrategy();
        Controller controller = new Controller(view, model, strategy);

        controller.getStockByString("Apple");
        int i=0;
        do {
            controller.getAllStocks();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        } while (i<5);
    }
}
