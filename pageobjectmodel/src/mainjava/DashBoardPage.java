package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testjava.BaseTest;

public class DashBoardPage extends BaseTest {

	//All WebElement of The DashBoard Page
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashBoardTitle;
	
	@FindBy(xpath ="//span[@class='oxd-userdropdown-tab']")
	WebElement userDropdownTab;
	
	@FindBy(xpath ="//a[text()='Logout']")
	WebElement logoutOption;
		
	public DashBoardPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void verifyTitleOfPage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean title = dashBoardTitle.isDisplayed();
	    Assert.assertTrue(title);
	}
	
	public void logout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		userDropdownTab.click();
		logoutOption.click();
		
	}
	
	
	
	
	
}
