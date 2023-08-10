package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testjava.BaseTest;

public class ForgetPasswordPage extends BaseTest {

	@FindBy(xpath = "//h6[text()='Reset Password']")
	WebElement ResetPasswordHeader;

	@FindBy(xpath = "//button[@type='button']")
	WebElement cancelButton;

	public ForgetPasswordPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String forgotPassordPageTitle(String titleTextFromUser) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String titleTextFromBuild = ResetPasswordHeader.getText();
		Assert.assertEquals(titleTextFromBuild, titleTextFromUser);
		return titleTextFromBuild;

	}

	public void validateCancelButton() {

		boolean check1 = cancelButton.isDisplayed();
		boolean check2 = cancelButton.isEnabled();

		if (check1 == true && check2 == true) {

			cancelButton.click();
		}

	}
}
