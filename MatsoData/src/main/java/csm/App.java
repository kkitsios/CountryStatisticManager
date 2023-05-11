package csm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class App{
    public static void main( String[] args )
    {
        Application.launch(CountriesStatsManager.class, args);
    }
}

