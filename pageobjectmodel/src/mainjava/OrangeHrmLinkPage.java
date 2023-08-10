package mainjava;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testjava.BaseTest;

public class OrangeHrmLinkPage extends BaseTest {

	public OrangeHrmLinkPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String pageTitle(String titleFromUser) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> winIds = driver.getWindowHandles();
		Iterator <String> it = winIds.iterator();
		String id1 = it.next();
		String id2 = it.next();
		driver.switchTo().window(id2);
		String titleFromBuild = driver.getTitle();
		Assert.assertEquals(titleFromBuild, titleFromUser);
		return titleFromBuild;
	}

}
