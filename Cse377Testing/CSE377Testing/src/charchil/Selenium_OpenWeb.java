package charchil;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to fetch the title of google.

public class Selenium_OpenWeb {
	public static void main(String[] args) {
		//TODO Auto-generated method stub

		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);
        
        
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.navigate().back();
		driver.manage().window().setPosition(new Point(70,5));	
		
		driver.quit();
	}
//
}

//=======================================================================


public class Selenium_OpenWeb{
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        
        
        String baseUrl = "https://www.flipkart.com/";
        String expectedTitle = "Online Shopping Site for Mobiles";
        String actualTitle = "";

        
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        
        
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Title matches. Test passed!");
        } else {
            System.out.println("Test failed.");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }
        
        driver.quit();
    }
}
