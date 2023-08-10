package testjava;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 0)
	public void validateUrlOfPage() {

		loginPage.verifyTheUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log(loginPage.verifyTheUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
				true);
	}

	@Test(priority = 1)
	public void validateTitleOfPage() {

		loginPage.verifyTitleOfPage("OrangeHRM");

	}

	@Test(priority = 2)
	public void validateLoginUsingValidCred() {

		loginPage.loginFunctionaity("Admin", "admin123");
		dashBoard.verifyTitleOfPage();
		dashBoard.logout();

	}

	@Test(priority = 3)
	public void validateLoginUsingInvalidCred() {

		loginPage.loginFunctionaityInvalidCred("Admin123", "admin12345");
		System.out.println(loginPage.loginFunctionaityInvalidCred("Admin123", "admin12345"));
		dashBoard.verifyTitleOfPage();
		dashBoard.logout();

	}

	@Test(priority = 4)
	public void validateForgotPasswordLink() {

		loginPage.validateForgetPasswordLink();
		forgetPassword.forgotPassordPageTitle("Reset Password");
		Reporter.log(forgetPassword.forgotPassordPageTitle("Reset Password"), true);
		forgetPassword.validateCancelButton();

	}

	@Test(priority = 5)
	public void validateOrangeHRMLink() {

		loginPage.validateOrangeHRMLink();
		orangeHrmLink.pageTitle("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
		Reporter.log(orangeHrmLink
				.pageTitle("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"), true);
		driver.close();

	}

}
