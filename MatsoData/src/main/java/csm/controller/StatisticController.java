package csm.controller;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import csm.dao.CountryDAO;
import csm.dao.MetricsDAO;
import csm.entity.Country;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

@Controller
public class StatisticController implements Initializable {
	
//	@FXML
//	private ComboBox<String> country;
//	
//	@FXML
//	private ComboBox<String> year;
//	
//	@FXML
//	private ComboBox<String> stat1;
//	
//	@FXML
//	private ComboBox<String> stat2;
	
	@FXML
	private Button showBtn;

	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private CountryDAO countryDAO;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML
	public void createPlots() {
		List<Country> c = countryDAO.findAll();
		String stat = "income_index"; // Example value for the stat parameter
		List<String> countries = Arrays.asList("Greece", "Latvia"); // Example list of countries
		int startYear = 2010; // Example start year
		int endYear = 2012; // Example end year

		MetricsDAO metricsDAO = applicationContext.getBean("Economic", MetricsDAO.class);
		List<Double> result = metricsDAO.findMetricByCountryBetween(stat, countries, startYear, endYear);

		
		System.out.println(result);
		
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
	      ((Stage) showBtn.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	}
	

}
