import controller.Controller;
import model.Model;
import model.command.Command;
import model.command.DowJonesCommand;
import model.command.NASDAQCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import view.ConsoleView;
import view.View;

@Configuration
public class AppConfig {
    @Bean
    public View consoleView(){
        return new ConsoleView();
    }

    @Bean
    public Model model(){
        return new Model();
    }

    @Bean
    public Command NASDAQCommand(){
        return new NASDAQCommand();
    }

    @Bean
    public Command dowJonesCommand(){
        return new DowJonesCommand();
    }

    @Bean
    public Controller controller(){
        return new Controller(consoleView(), model(), NASDAQCommand());
    }
}
