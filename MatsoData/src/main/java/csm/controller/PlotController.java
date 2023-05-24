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
import csm.entity.Metric;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@Controller
public class PlotController implements Initializable{
	
//	@FXML
//	private BarChart<String, Double> barChart;
//	
//	@FXML
//	private LineChart<String, Double> lineChart;
//	
////	@FXML
////	private PieChart pieChart;
	
	@FXML
	private VBox vbox;
	
	private DataToSend dataToSend;
	
	 @Autowired
	 private ApplicationContext applicationContext;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Platform.runLater(() -> {
			//List<MetricsDAO> metricsDAOs = new ArrayList<MetricsDAO>();
			List<List<Double>> metrics = new ArrayList<>();
			List<Double> valuesOfMetric = new ArrayList<>();
			List<Integer> years = new ArrayList<>();
			List<String> countries = new ArrayList<>(); 
			
			dataToSend = (DataToSend) vbox.getScene().getWindow().getUserData();
			
			years = dataToSend.getYears();
			
			countries = dataToSend.getSelectedCountries();

			for (Metric metric : (dataToSend).getSelectedMetrics()) {
				MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean(metric.getTypeOfMetric());
				
				valuesOfMetric = metricsDAO.findMetricByCountryBetween(metric.getNameOfMetric(), countries, years.get(0), years.get(1));
				
				metrics.add(valuesOfMetric);
				
			}
			int i = 0;
			for (String country: countries) {
				// TODO economic under 1950...
				
				List<Double> values = new ArrayList<>();
				 
				//TODO multiple metrics
//				for (int j = i; j<(i+1)*(years.get(1) - years.get(0));j++) {
//					
//				}
				values = metrics.get(0).subList(i, (i+1)*(years.get(1) - years.get(0))-1);
				
				BarChart<String, Number> barChart = createBarChart(country, years, values);
				vbox.getChildren().add(barChart);
				i++;
			}
			 
			
//			XYChart.Series<Integer, Double> dataSeries = new XYChart.Series<Integer, Double>();
//			dataSeries.getData().add(
//					new XYChart.Data<Integer,Double>());
//			
		});
		
		
	}
	
	private BarChart<String, Number> createBarChart(String title,List<Integer> years,  List<Double> values) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle(title);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
//        series.getData().add(new XYChart.Data<>("Category 1", 10));
//        series.getData().add(new XYChart.Data<>("Category 2", 20));
//        series.getData().add(new XYChart.Data<>("Category 3", 15));
        for (int i = 0; i<values.size();i++) {
        	series.getData().add(new XYChart.Data<>(years.get(i)+"", values.get(i)));
        }

        chart.getData().add(series);

        return chart;
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
	      ((Stage) vbox.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	    
		
	}

}
