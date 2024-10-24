package dropdownnew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UMSLogin {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.facebook.com");
        String pageTitle = driver.getTitle();
        
       

        // 2. Locate email and password fields, enter values, and clear them afterward
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        
        // Enter values into email and password fields
        emailField.sendKeys("rajcharchil555@gmail.com");
        passwordField.sendKeys("Sumangal@16");
        Thread.sleep(2000);
        
        // Clear the email and password fields
        emailField.clear();
        passwordField.clear();

        // 3. Check if the "Log In" button is visible and click it
        WebElement loginButton = driver.findElement(By.name("login"));
      
        // 4. Print the page source after the login attempt
        System.out.println("Page Source after login attempt:");
        System.out.println(driver.getPageSource());

        // 5. Ensure the "Create New Account" link is available and click it
        WebElement createAccountLink = driver.findElement(By.linkText("Create new account"));
        System.out.println("DONE");
       

        // Close the browser
        driver.quit();
    }
}
