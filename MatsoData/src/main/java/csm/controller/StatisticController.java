package csm.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Map;
import static java.util.Map.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import csm.dao.CountryDAO;
import csm.entity.Country;
import csm.entity.DataToSend;
import csm.entity.Metric;
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
	
	
	
	private Map<String, String> availableMetrics = Map.ofEntries(
		    entry("Domestic Credits", "domestic_credits"),
		    entry("Estimated GNI Female", "estimated_gni_female"),
		    entry("Estimated GNI Male", "estimated_gni_male"),
		    entry("GDP per Capita", "gdp_per_capita"),
		    entry("GDP Total", "gdp_total"),
		    entry("GNI per Capita", "gni_per_capita"),
		    entry("Gross Fixed Capital Formation", "gross_fixed_capital_formation"),
		    entry("Income Index", "income_index"),
		    entry("Labour Share of GDP", "labour_share_of_gdp"),
		    entry("Fertility Rate 15-19", "fertilityRate_15_19"),
		    entry("Fertility Rate 20-24", "fertilityRate_20_24"),
		    entry("Fertility Rate 25-29", "fertilityRate_25_29"),
		    entry("Fertility Rate 30-34", "fertilityRate_30_34"),
		    entry("Fertility Rate 35-39", "fertilityRate_35_39"),
		    entry("Fertility Rate 40-44", "fertilityRate_40_44"),
		    entry("Fertility Rate 45-49", "fertilityRate_45_49"),
		    entry("Crude Birth Rate", "crudeBirthRate"),
		    entry("Crude Death Rate", "crudeDeathRate"),
		    entry("Gross Reproduction Rate", "grossReproductionRate"),
		    entry("Growth Rate", "growthRate"),
		    entry("Infant Mortality", "infantMortality"),
		    entry("Infant Mortality Female", "infantMortalityRemale"),
		    entry("Infant Mortality Male", "infantMortalityMale"),
		    entry("Life Expectancy", "lifeExpectancy"),
		    entry("Life Expectancy Male", "lifeExpectancyMale"),
		    entry("Life Expectancy Female", "lifeExpectancyFemale"),
		    entry("Midyear Population", "midyearPopulation"),
		    entry("Mortality Rate OneToFour", "mortalityRateOneToFour"),
		    entry("Mortality Rate OneToFourFemale", "mortalityRateOneToFourFemale"),
		    entry("Mortality Rate OneToFourMale", "mortalityRateOneToFourMale"),
		    entry("Mortality Rate UnderFive", "mortalityRateUnderFive"),
		    entry("Mortality Rate UnderFiveMale", "mortalityRateUnderFivemale"),
		    entry("Mortality Rate UnderFiveFemale", "mortalityRateUnderFivefemale"),
		    entry("Net Migration", "netMigration"),
		    entry("Sex Ratio at Birth", "sexRatioAtBirth"),
		    entry("Total Fertility Rate", "totalFertilityRate"),
		    entry("Rate Natural Increase", "rateNaturalIncrease"),
		    entry("Age Midyear Population Female", "ageMidyearPopulationFemale"),
		    entry("Age Midyear Population Male", "ageMidyearPopulationMale"),
		    entry("Age Midyear Population", "ageMidyearPopulation"),
		    entry("Country Area", "countryArea")
		);

	
	
	
	
	
	
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
			metrics.add("countryArea");
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
			
			year2.setDisable(true);
			year1.valueProperty().addListener((observable, oldValue, newValue) -> {
				year2.getItems().removeAll(years);
				year2.getItems().addAll(years);
			    if (newValue != null) {
			        while (year2.getItems().get(0) != newValue) {
						year2.getItems().remove(0);
					}
			        year2.setDisable(false);
			    }
			});
		});
		
		
	}
	
	@FXML
	public void createPlots() {
		List<Metric> selectedMetrics = new ArrayList<>(); 
		List<String> selectedCountries = new ArrayList<String>(); 
		List<Integer> years = new ArrayList<Integer>(); 

		
		for (String metric : country.getCheckModel().getCheckedItems()) {
			selectedCountries.add(metric);
		}
		years.add(year1.getValue());
		years.add(year2.getValue());
		
		for (String metric : stat.getCheckModel().getCheckedItems()) {
			
			Metric selectedmetric = new Metric();
			
			
			selectedmetric.setNameOfMetric(metric);
			selectedmetric.setTypeOfMetric(getTypeOfMetric(metric));
			
//			System.err.println(selectedMetric.getTypeOfMetric() + " "+ metric+"1");
			selectedMetrics.add(selectedmetric);
			
		}
		
		dataToSend.setSelectedCountries(selectedCountries);
		dataToSend.setSelectedMetrics(selectedMetrics);
		


		
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
//	      System.err.println(dataToSend.getSelectedCountries().get(0));

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
