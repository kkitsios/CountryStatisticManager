package csm.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

@Controller
public class StatisticController implements Initializable {
	
	@FXML
	private ComboBox<String> country;
	
	@FXML
	private ComboBox<String> year;
	
	@FXML
	private ComboBox<String> stat1;
	
	@FXML
	private ComboBox<String> stat2;
	
	@FXML
	private Button showBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML
	public void createPlots() {
	    FXMLLoader fxmlLoader = new FXMLLoader();
	    fxmlLoader.setLocation(getClass().getClassLoader().getResource("Plots.fxml"));
	    Scene scene;
	    try {
	      Stage stage = new Stage();
	      scene = new Scene(fxmlLoader.load());
	      stage.setScene(scene);
//	      stage.setUserData(trn);

	      stage.setResizable(false);
	      stage.show();
	      ((Stage) country.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	}
	

}
