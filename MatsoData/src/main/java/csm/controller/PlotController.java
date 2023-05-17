package csm.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

@Controller
public class PlotController implements Initializable{
	
	@FXML
	private BarChart<String, Double> barChart;
	
	@FXML
	private LineChart<String, Double> lineChart;
	
	@FXML
	private PieChart pieChart;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
	}
	
	@FXML
	public void back() {
	    FXMLLoader fxmlLoader = new FXMLLoader();
	    fxmlLoader.setLocation(getClass().getClassLoader().getResource("Statistics.fxml"));
	    Scene scene;
	    try {
	      Stage stage = new Stage();
	      scene = new Scene(fxmlLoader.load());
	      stage.setScene(scene);
//	      stage.setUserData(trn);

	      stage.setResizable(false);
	      stage.show();
	      ((Stage) pieChart.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	    
		
	}

}
