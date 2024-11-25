package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {

	@Test
	public void assertion1() throws InterruptedException, IOException {
		WebDriver driver = null;
		String username = "admin";
		String password = "admin";
		Date date = new Date();
		String ddt = date.toString().replace(" ", "_").replace(":", "_");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\MyCucumberProject\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		SoftAssert asrt = new SoftAssert();
		
		String expected = "Google";
		String actulal = driver.getTitle();
		
		asrt.assertEquals(actulal, expected);
	System.out.println("pass");
	

		


		

		// soft assert example

		/*
		 * SoftAssert srt = new SoftAssert(); String actual = driver.getTitle(); String
		 * expected = "Googlefe"; srt.assertEquals(actual, expected);
		 * 
		 * System.out.println("pass");
		 * 
		 * String actual_text =
		 * driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).
		 * getText(); String expected_text = "Gmail";
		 * 
		 * srt.assertEquals(actual_text, expected_text); System.out.println("pas_text");
		 * srt.assertAll(); driver.close();
		 */
		// hard assert example
		/*
		 * String actual = driver.getTitle(); String expected = "Google";
		 * org.testng.Assert.assertEquals(actual, expected); System.out.println("pass");
		 * 
		 * String actual_text =
		 * driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).
		 * getText(); String expected_text = "Gmail";
		 * 
		 * org.testng.Assert.assertEquals(actual_text, expected_text);
		 * System.out.println("pas_text"); driver.close();
		 */
	}

}
