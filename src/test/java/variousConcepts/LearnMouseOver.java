 package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseOver {

	WebDriver driver;

	// Element list - By type
	By COMPUTER_ACCESS_FIELD = By.xpath("//span[text)='Computers & Accessories']");
	By COMPUTER_MONITOR_FIELD = By.xpath("//button[text()='Computer Monitors']");
	By VIEW_COMPUTER_MONITORS_FIELD = By.xpath("//a[text()='View All Computer Monitors']");

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testMouseHoverOver() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(COMPUTER_ACCESS_FIELD)).build().perform();
		action.moveToElement(driver.findElement(COMPUTER_MONITOR_FIELD)).build().perform();
		driver.findElement(VIEW_COMPUTER_MONITORS_FIELD).click();
		 
	}

}
