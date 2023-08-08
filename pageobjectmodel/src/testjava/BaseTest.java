package testjava;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.Base;
import mainjava.DashBoardPage;
import mainjava.LoginPage;

public class BaseTest extends Base {

	@BeforeSuite
	public void launchingBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	@BeforeClass
	public void pageObjects() {
		
		loginPage = new LoginPage(driver);
		dashBoard = new DashBoardPage(driver);
		
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
