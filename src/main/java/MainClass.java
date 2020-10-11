import controller.Controller;
import model.Model;
import model.command.DowJonesCommand;
import model.command.NASDAQCommand;
import model.command.Command;
import view.ConsoleView;
import view.View;

public class MainClass {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Model model = new Model();
        Command command = new NASDAQCommand();
//        Command command = new DowJonesCommand();
        Controller controller = new Controller(view, model, command);

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
