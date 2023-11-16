package maven;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		//option.addArguments("--disable-popups");
		//option.addArguments("--disable-notifications");
//		option.addArguments("--remote-allow-origins=*");
//		option.addArguments("--no-sandbox");
//		option.addArguments("--disable-dev-shm-usage");
//		option.addArguments("start-maximized");
		option.addArguments("--headless");
		option.addArguments("start-headless");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https:\\www.flipkart.com");
		
	}
}
