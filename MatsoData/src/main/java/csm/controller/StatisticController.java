package csm.controller;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import csm.dao.CountryDAO;
import csm.dao.InternationalDataDao;
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

	@Autowired
	private InternationalDataDao internationalDataDao;
	
	@Autowired
	private CountryDAO countryDAO;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML
	public void createPlots() {
		List<Country> c = countryDAO.findAll();
		String stat = "fertilityRate_15_19"; // Example value for the stat parameter
		List<String> countries = Arrays.asList(c.get(0).getDisplayName()); // Example list of countries
		int startYear = 2010; // Example start year
		int endYear = 2020; // Example end year

		List<Double> result = internationalDataDao.findStatByCountry(stat, countries, startYear, endYear);

		System.err.println(c.get(0).getDisplayName());
		System.out.println(result.get(0));
		
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
