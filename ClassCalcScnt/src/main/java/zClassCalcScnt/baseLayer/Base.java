package zClassCalcScnt.baseLayer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import java.io.FileReader;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public final String propertyPath = "C:\\Users\\Priyanka Nishan\\eclipse-workspace\\zClassCalcScnt\\src\\main\\java\\zClassCalcScnt\\configs\\Configuration.properties";

	// constructor
	public Base() {
		try {
			prop = new Properties();

			BufferedReader ip;
			ip = new BufferedReader(new FileReader(propertyPath));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Initializes respective browsers
	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			System.setProperty("webdriver.", "geckodriver");
			driver = new SafariDriver();
		}

		driver.get(prop.getProperty("url"));

	}

}
