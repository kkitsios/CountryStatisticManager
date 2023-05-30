package csm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


@SpringBootApplication
public class App extends Application {
	private ConfigurableApplicationContext springContext;
    private Parent rootNode;
	
    public static void main( String[] args) {
        launch(args);
    }
    
    @Override
    public void init() throws Exception {
    	 springContext = SpringApplication.run(App.class);
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("Statistics.fxml"));
         fxmlLoader.setControllerFactory(springContext::getBean);
         rootNode = fxmlLoader.load();
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(rootNode);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		springContext.close();
	}
}

