package StepDefinition;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import suite.datasetupandteardown;

public class DataProvider {
	
	// dataprovider project
	@Test(dataProvider = "create")
	public void dbconnect(String Username, String Password)
	{
	WebDriver driver = null;
	
	System.out.println("User is on login page");
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.args", "--version=118.0.5993.70");

	driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Username);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.close();
	
	

	}
	@org.testng.annotations.DataProvider(name="create")
	public Object[][] dataset()
	{
		return new Object[][]
				{
			{"standard_user","secret_sauce"	},
			{"locked_out_user","secret_sauce"	},
			{"problem_user","secret_sauce"	},
			{"performance_glitch_user","secret_sauce"	}
				};
		
	}
	
	

}
