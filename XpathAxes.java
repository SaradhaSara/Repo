package maven;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='X']")).click();  //tN[text()='tV']
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("poco",Keys.ENTER);  //tN[@aN='aV']
		driver.findElement(By.xpath("//div[contains(text(),'POCO X5 Pro 5G (Astral Black, 256 GB)')]"));  //tN[contains(text(),'part of tV')]
		driver.findElement(By.xpath("//input[starts-with(@title,'S')]"));   //tN[starts-with(@aN,'start of aV')]
		driver.findElement(By.xpath("//a[starts-with(text(),'E')]")); //tN[starts-with(text(),'start of tV')]
		
	    driver.findElement(By.xpath("//input[@name='q' and @class='_3704LK']"));  //tN[aN='q' and @class='_3704LK']
	    
	    driver.findElement(By.xpath("//input[@name='q' or @class='_3704LK']"));  //tN[aN='q' or @class='_3704LK']
	    
	    driver.findElement(By.xpath(" //section[@class='_2yz7eI _2hbLCH']//following-sibling::section"));//tN[@aN='aV']//following::tN
	    
	    driver.findElement(By.xpath("//section[@class='_2yz7eI _2hbLCH']//preceding-sibling::section")); //tN[@aN='aV']//preceding::tN
	    
        driver.findElement(By.xpath("//section[@class='_2yz7eI _2hbLCH']//preceding-sibling::section/parent::div"));
	    
	
	
	
	
	
	}
	
	
	
	
	
}
