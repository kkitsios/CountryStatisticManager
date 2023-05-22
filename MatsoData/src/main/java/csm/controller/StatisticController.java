package csm.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import csm.dao.CountryDAO;
import csm.dao.MetricsDAO;
import csm.entity.Country;
import csm.entity.DataToSend;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import org.controlsfx.control.CheckComboBox;
import javafx.stage.Stage;

@Controller
public class StatisticController implements Initializable {
	
	@FXML
	private CheckComboBox<String> country;
	
	@FXML
	private ComboBox<Integer> year1;
	
	@FXML
	private ComboBox<Integer> year2;
	
	@FXML
	private CheckComboBox<String> stat;
	
	@FXML
	private Button showBtn;

	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private DataToSend dataToSend;
	
//	@Autowired
//	private CountryDAO countryDAO;
	
	private final String[] AVAILABLE_ECONOMIC_METRICS = {
		    "domestic_credits",
		    "estimated_gni_female",
		    "estimated_gni_male",
		    "gdp_per_capita",
		    "gdp_total",
		    "gni_per_capita",
		    "gross_fixed_capital_formation",
		    "income_index",
		    "labour_share_of_gdp"
		};
	
	private final String[] AVAILABLE_DEMOGRAPHIC_METRICS = {
			"fertilityRate_15_19",
		    "fertilityRate_20_24",
		    "fertilityRate_25_29",
		    "fertilityRate_30_34",
		    "fertilityRate_35_39",
		    "fertilityRate_40_44",
		    "fertilityRate_45_49",
		    "crudeBirthRate",
		    "crudeReathRate",
		    "grossReproductionRate",
		    "growthRate",
		    "infantRortality",
		    "infantRortalityRemale",
		    "infantMortalityMale",
		    "lifeExpectancy",
		    "lifeExpectancyMale",
		    "lifeRxpectancyFemale",
		    "midyearPopulation",
		    "mortalityRateOneToFour",
		    "mortalityRateOneToFourFemale",
		    "mortalityRateOneToFourMale",
		    "mortalityRateUnderFive",
		    "mortalityRateUnderFivemale",
		    "mortalityRateUnderFivefemale",
		    "netMigration",
		    "sexRatioAtBirth",
		    "totalRertilityRate",
		    "rateNaturalIncrease"
	};
	
	private final String[] AVAILABLE_MIDYEAR_POPULATION_METRICS = {
			"ageMidyearPopulationFemale",
		    "ageMidyearPopulationMale",
		    "ageMidyearPopulation"
	};
	
	private String[] AVAILABLE_POPULATION_METRICS;
	
	private Integer[] AVAILABLE_YEARS;
	
	private ObservableList<String> metrics;
	private ObservableList<String> countriesList;
	private ObservableList<Integer> years;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Platform.runLater(() -> {
			metrics = FXCollections.observableArrayList();
			countriesList = FXCollections.observableArrayList();
			years = FXCollections.observableArrayList();
			
			CountryDAO countryDAO = (CountryDAO) applicationContext.getBean("country");
			AVAILABLE_POPULATION_METRICS = new String[101];
			
			int startYear = 1950;
			int endYear = 2050;
			int arraySize = endYear - startYear + 1;
	
			AVAILABLE_YEARS = new Integer[arraySize];
			
			for (int i = 0; i < arraySize; i++) {
				AVAILABLE_YEARS[i] = startYear + i;
			}
			
			for (int i = 0; i<=100;i++) {
			AVAILABLE_POPULATION_METRICS[i] = "populationAge"+i;
			}
			metrics.add("Country Area");
			metrics.addAll(AVAILABLE_ECONOMIC_METRICS);
			metrics.addAll(AVAILABLE_DEMOGRAPHIC_METRICS);
			metrics.addAll(AVAILABLE_MIDYEAR_POPULATION_METRICS);
			metrics.addAll(AVAILABLE_POPULATION_METRICS);
			for (Country country : countryDAO.findAll()) {
				countriesList.add(country.getDisplayName());
			}
			years.addAll(AVAILABLE_YEARS);
			stat.getItems().addAll(metrics);
			country.getItems().addAll(countriesList);
			year1.getItems().addAll(years);
			year2.getItems().addAll(years);
		});
		
		
	}
	
	@FXML
	public void createPlots() {
		List<String> selectedMetrics = new ArrayList<String>(); 
		List<String> selectedCountries = new ArrayList<String>(); 
		List<Integer> years = new ArrayList<Integer>(); 
		List<String> typeOfMetrics = new ArrayList<>();
		for (String metric : stat.getCheckModel().getCheckedItems()) {
			selectedMetrics.add(metric);
		}
		
		for (String metric : country.getCheckModel().getCheckedItems()) {
			selectedCountries.add(metric);
		}
		years.add(year1.getValue());
		years.add(year2.getValue());
		
		for (String metric : country.getCheckModel().getCheckedItems()) {
			typeOfMetrics.add(getTypeOfMetric(metric));
		}
		
		dataToSend.setSelectedCountries(selectedCountries);
		dataToSend.setSelectedMetrics(selectedMetrics);
		dataToSend.setTypeOfMetrics(typeOfMetrics);
		dataToSend.setYears(years);
		
	    FXMLLoader fxmlLoader = new FXMLLoader();
	    fxmlLoader.setLocation(getClass().getClassLoader().getResource("Plots.fxml"));
	    fxmlLoader.setControllerFactory(applicationContext::getBean);
	    
	    Scene scene;
	    try {
	      Stage stage = new Stage();
	      scene = new Scene(fxmlLoader.load());
	      stage.setScene(scene);
	      stage.setUserData(dataToSend);
	      System.err.println(dataToSend.getSelectedCountries().get(0));

	      stage.setResizable(false);
	      stage.show();
	      ((Stage) country.getScene().getWindow()).close();
			
	    } catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
	private String getTypeOfMetric(String metric) {
		if (contains(AVAILABLE_DEMOGRAPHIC_METRICS, metric)) {
			return "international";
			
		} else if (contains(AVAILABLE_ECONOMIC_METRICS, metric)) {
			return "Economic";
			
		} else if (contains(AVAILABLE_POPULATION_METRICS, metric)) {
			return "population";
			
		} else if (contains(AVAILABLE_MIDYEAR_POPULATION_METRICS, metric)) {
			return "midyear_population";
		} else {
			return "country_area";
		}
		
	}
	
	private boolean contains(String[] array, String target) {
		for (String element: array) {
			if (target.equals(element))
				return true;
		}
		return false;
		
	}

}
