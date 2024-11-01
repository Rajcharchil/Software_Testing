package dropdownnew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLoginTest {
    public static void main(String[] args)  {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.linkedin.com");
        System.out.println("title: " + driver.getTitle());

        
        driver.findElement(By.id("session_key")).sendKeys("rajcharchil555@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Sumangal@16");
        
        
        driver.findElement(By.id("session_key")).clear();
        driver.findElement(By.id("session_password")).clear();
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        System.out.println(driver.getPageSource());
        
        driver.findElement(By.linkText("Join now")).click();
        
        driver.quit();        
        

       
    }
}

