package ru.stockparser;

import ru.stockparser.model.StockModel;
import ru.stockparser.model.command.Command;
import ru.stockparser.model.command.DowJonesCommand;
import ru.stockparser.model.command.NASDAQCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.stockparser.view.ConsoleView;
import ru.stockparser.view.View;

@Configuration
public class AppConfig {
    @Bean
    public View consoleView(){
        return new ConsoleView();
    }

    @Bean
    public StockModel model(){
        return new StockModel();
    }

    @Bean
    public Command NASDAQCommand(){
        return new NASDAQCommand();
    }

    @Bean
    public Command dowJonesCommand(){
        return new DowJonesCommand();
    }
}
