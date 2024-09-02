package webcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupLoginAutomation {

	 public static void main(String[] args) throws Exception {
	        // Set the path to the ChromeDriver executable
	        WebDriverManager.chromedriver().setup();

	        // Initialize the WebDriver (ChromeDriver)
	        WebDriver driver = new ChromeDriver();
	      
	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to the URL
	            driver.navigate().to("https://www.guvi.in/");

	            // Locate the signup button and click on it
	           driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
               Thread.sleep(3000);

	            // Fill in the Signup form
	            driver.findElement(By.id("name")).sendKeys("John Michael");
	            Thread.sleep(2000);

	            driver.findElement(By.id("email")).sendKeys("jmichael2345190@gmail.com");

	            driver.findElement(By.id("password")).sendKeys("TestPassword123");
	            Thread.sleep(2000);

	            driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");

	            // Click on the "Signup" button to submit the form
	            driver.findElement(By.id("signup-btn")).click();
	            Thread.sleep(2000);

	            // Wait for the page to load and verify that the user is registered successfully
	           
	            System.out.println("User registered successfully.");

	            // Locate the login button and click on it
	            driver.findElement(By.linkText("Login")).click();

	            // Fill in the login form
	            driver.findElement(By.id("email")).sendKeys("jmichael2345190@gmail.com");
	            Thread.sleep(2000);

	            driver.findElement(By.id("password")).sendKeys("TestPassword123");

	            // Click on the "Login" button to submit the form
	            driver.findElement(By.id("login-btn")).click();
	            Thread.sleep(5000);

	            // Wait for the page to load and verify that the user is logged in successfully
	            
	            System.out.println("User logged in successfully.");

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }

}
