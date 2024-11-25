package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Launchmultibrowser {
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
					
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
	}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
	}
		
		driver.get("https://www.google.com/");
		
	}

}
