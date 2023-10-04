package task_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Locators {

	 public static void main(String[] args) {
         // Set the path to the chromedriver 
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\SEL\\chromedriver.exe");

         // Initialize WebDriver
         WebDriver driver = new ChromeDriver();

         // Open the URL
         driver.get("https://www.guvi.in/register");

         // Using ID locator
         WebElement elementById = driver.findElement(By.id("email"));
         
         // Using ClassName locator
         WebElement elementByClassName = driver.findElement(By.className("form-control"));  
         
         // Using TagName locator
         WebElement elementByTagName = driver.findElement(By.tagName("input"));
      
         // Using CSS Selector locator
         WebElement elementByCssSelector = driver.findElement(By.cssSelector("input[type='email']"));

         // Using XPath locator
         WebElement elementByXPath = driver.findElement(By.xpath("//input[@id='email']"));
      
         // Close the WebDriver
         driver.quit();
     }
	
}
