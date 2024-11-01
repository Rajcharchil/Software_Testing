package dropdownnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		Select drpCountry= new Select(driver.findElement(By.name("country"))); 
//		drpCountry.selectByVisibleText("ALGERIA"); 
	//	drpCountry.deselectByVisibleText("ALGERIA"); 
	//	drpCountry.selectByValue("BHUTAN"); 
		drpCountry.selectByIndex(2); 
//		if(drpCountry.isMultiple()) 
//			{ 
//			 
//			System.out.println("Returns True"); 
//			  
//			} 
//			else { 
//			 
//			System.out.println("Returns False"); 
//			} 
		//	drpCountry.deselectAll(); 
			
			driver.navigate().to("https://demo.guru99.com/test/radio.html");
			WebElement radio1 = driver.findElement(By.id("vfb-7-1")); 
			WebElement radio2= driver.findElement(By.id("vfb-7-2")); 
			WebElement radio3= driver.findElement(By.id("vfb-7-3")); 
			radio1.click(); 
			radio2.click(); 
			radio3.click(); 
			
			WebElement check1= driver.findElement(By.id("vfb-6-0")); 
			WebElement check2= driver.findElement(By.id("vfb-6-1")); 
			WebElement check3= driver.findElement(By.id("vfb-6-2")); 
			 check2.click(); 
			 driver.navigate().back();			} 
			
	}



