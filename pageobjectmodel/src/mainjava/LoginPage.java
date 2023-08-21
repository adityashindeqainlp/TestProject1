package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testjava.BaseTest;

public class LoginPage extends BaseTest {

	// List Of WebElement From The Page

	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement logo;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement passWord;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//a[normalize-space()='OrangeHRM, Inc']")
	WebElement orenageHRMIncLink;

	@FindBy(xpath = "(//*[name()='svg'][@role='presentation'])[1]")
	WebElement linkedInBtn;

	@FindBy(xpath = "(//*[name()='path'][@class='st0'])[2]")
	WebElement facebookBtn;

	@FindBy(xpath = "(//*[name()='svg'][@role='presentation'])[3]")
	WebElement twitterBtn;

	@FindBy(xpath = "(//*[name()='svg'][@role='presentation'])[4]")
	WebElement youTubeBtn;

	@FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']")
	WebElement errorMessage;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String verifyTheUrl(String urlExpected) {

		String urlFromBuild = driver.getCurrentUrl();
		Assert.assertEquals(urlFromBuild, urlExpected);
		return urlFromBuild;

	}

	public String verifyTitleOfPage(String titleExpected) {

		String titleFromBuild = driver.getTitle();
		Assert.assertEquals(titleFromBuild, titleExpected);
		return titleFromBuild;
	}

	public void verfiyLogo() {

		boolean checkLogo = logo.isDisplayed();
		Assert.assertEquals(checkLogo, true);
		System.out.println("Logo is present on WebPage");
	}

	public void loginFunctionaity(String username, String password) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		userName.sendKeys(username);
		passWord.sendKeys(password);
		submitBtn.click();

	}

	public String loginFunctionaityInvalidCred(String username, String password) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		userName.sendKeys(username);
		passWord.sendKeys(password);
		submitBtn.click();
		boolean errorHandlingCoverage = errorMessage.isDisplayed();
		Assert.assertTrue(errorHandlingCoverage);
		String errorMsg = errorMessage.getText();
		return errorMsg;

	}

	public void validateForgetPasswordLink() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean check1 = forgotPasswordLink.isDisplayed();
		boolean check2 = forgotPasswordLink.isEnabled();

		if (check1 == true && check2 == true) {

			forgotPasswordLink.click();
		}
	}

	public void validateOrangeHRMLink() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean check1 = orenageHRMIncLink.isDisplayed();
		boolean check2 = orenageHRMIncLink.isEnabled();

		if (check1 == true && check2 == true) {

			orenageHRMIncLink.click();
		}
	}

}
