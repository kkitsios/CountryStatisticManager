package csm.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import csm.dao.MetricsDAO;
import csm.entity.DataToSend;
import javafx.application.Platform;
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
	
//	@FXML
//	private PieChart pieChart;
	
	private DataToSend dataToSend;
	
	 @Autowired
	 private ApplicationContext applicationContext;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Platform.runLater(() -> {
			List<MetricsDAO> metricsDAOs = new ArrayList<MetricsDAO>();
			
			dataToSend = (DataToSend) lineChart.getScene().getWindow().getUserData();

			for (String typeOfMetric : dataToSend.getTypeOfMetrics()) {
				MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean(typeOfMetric);
				metricsDAOs.add(metricsDAO);
			}
			
			// TODO polla
		});
		
		
	}
	
	@FXML
	public void back() {
	    FXMLLoader fxmlLoader = new FXMLLoader();
	    fxmlLoader.setLocation(getClass().getClassLoader().getResource("Statistics.fxml"));
	    fxmlLoader.setControllerFactory(applicationContext::getBean);
	    Scene scene;
	    try {
	      Stage stage = new Stage();
	      scene = new Scene(fxmlLoader.load());
	      stage.setScene(scene);
//	      stage.setUserData(trn);

	      stage.setResizable(false);
	      stage.show();
	      ((Stage) lineChart.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	    
		
	}

}
