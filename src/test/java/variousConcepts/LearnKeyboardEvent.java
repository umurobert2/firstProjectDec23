package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import junit.framework.Assert;

public class LearnKeyboardEvent {

	WebDriver driver;

	// Element list - By type
	By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
	By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
	By SIGNIN_BUTTON_FIELD = By.xpath("//*[@id=\"login_submit\"]");
	By DASHBOARD_HEADER_FIELD = By.xpath("//strong[test()='Dashboard']");

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testKeyboardEvent() {
		driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		// driver.findElement(SIGNIN_BUTTON_FIELD).click();
		// Assert.assertEquals("Dashboard page not found","Dashboard", driver.findElement(DASHBOARD_HEADER_FIELD).getText());//this line do validation
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		// action.sendKeys(Keys.RETURN).build().perform();
	}

}
