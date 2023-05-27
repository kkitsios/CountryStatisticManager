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
import javafx.scene.chart.ScatterChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@Controller
public class PlotController implements Initializable{
	
	@FXML
	private BarChart<String, Number> barChart;

	@FXML
	private LineChart<String, Number> lineChart;

	@FXML
	private ScatterChart<Number, Number> scatterChart;
	
//	@FXML
//	private VBox vbox;
	
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
			
			dataToSend = (DataToSend) barChart.getScene().getWindow().getUserData();
			

			int yearRange = dataToSend.getYears().get(1) - dataToSend.getYears().get(0) + 1;
			
			for (int i = dataToSend.getYears().get(0); i <= dataToSend.getYears().get(1);i++) {
				years.add(i);
			}
			List<List<Integer>> yearList = new ArrayList<>();
			yearList.add(years);
			
			
			countries = dataToSend.getSelectedCountries();

			for (Metric metric : (dataToSend).getSelectedMetrics()) {
				MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean(metric.getTypeOfMetric());
				
				if (metric.getTypeOfMetric().equals("Economic") && yearList.size() < 2) {
					int start = years.get(0);
					int end = years.get(yearRange-1);
					if (start >= 1990 && start <= 2018 && end >= 1990 && end <= 2018) {
						
					}
					else {
						List<Integer> economicYears = new ArrayList<>();
						if (start < 1990) {
							start = 1990;
						}
						if (start < 2018) {
							start = 2018;
						}
						if (end > 2018) {
							end = 2018;
						}
						if (end < 1990) {
							end = 1990;
						}
						
						for (int i = start; i <= end;i++) {
							economicYears.add(i);
						}
						yearList.add(economicYears);						
					}
					
					
				}
				valuesOfMetric = metricsDAO.findMetricByCountryBetween(metric.getNameOfMetric(), countries, years.get(0), years.get(yearRange-1));
				
				metrics.add(valuesOfMetric);
				
			}

			int index = 0;
			for (List<Double> values: metrics) {
				List<Integer> chartYears;
		        CategoryAxis xAxis = new CategoryAxis();
		        NumberAxis yAxis = new NumberAxis();
		        List<XYChart.Series<String, Number>> seriesList = new ArrayList<>();
		        
		        List<List<Double>> countryValues = new ArrayList<>() ;
		        int startIndex = 0;
		        while (startIndex < values.size()) {
					int endIndex = Math.min(startIndex + yearRange, values.size());
					countryValues.add(values.subList(startIndex, endIndex));
					startIndex += yearRange;
					
				}
		        
		        if (dataToSend.getSelectedMetrics().get(index++).getTypeOfMetric().equals("Economic")) {
		        	chartYears = yearList.get(0);
		        } else {
					chartYears = yearList.get(1);
				}
		        
		        
		        for (List<Double> someCountryValues : countryValues) {
		        	XYChart.Series<String, Number> series = new XYChart.Series<>();
		        	for (int i = 0; i < someCountryValues.size();i++) {
			        	series.getData().add(new XYChart.Data<>(chartYears.get(i)+"", someCountryValues.get(i)));
			        }		   
		        	seriesList.add(series);
		        }

		        for (XYChart.Series<String, Number> series : seriesList) {
		        	lineChart.getData().add(series);
		        	barChart.getData().add(series);
		        }
		        
		        
		        
//		        index++;
		        
			}
			
		       if(metrics.size() == 2) {
	        		XYChart.Series<Number, Number> series = new XYChart.Series<>();
		        	for(int i = 0; i < metrics.get(0).size(); i++) {
		        		series.getData().add(new XYChart.Data<>(metrics.get(0).get(i), metrics.get(1).get(i)));
		
		        	}
		        	
		        	scatterChart.getData().add(series);
		        	
		        }
				
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
	      ((Stage) barChart.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	    
		
	}

}
