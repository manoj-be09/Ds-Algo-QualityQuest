package appHooks;


import java.util.Properties;


import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;


public class AppHooks {
	
	private Driverfactory driverFactory;
	private WebDriver driver;
	private ConfigReader ConfigReader;
	Properties prop;

@Before	(order=0)
public void getProperty() 
{
	ConfigReader= new ConfigReader();
	prop= ConfigReader.init_prop();
}
@Before(order=1)
public void launchBrowser() {
	String browserName =prop.getProperty("browser");
	driverFactory= new Driverfactory();
	driver= driverFactory.init_driver(browserName);
}

@After(order=0)
public void quitBrowser() {
	driver.quit();
}

}
