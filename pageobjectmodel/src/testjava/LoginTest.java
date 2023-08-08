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
	
}
