package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScroll_Up_Down {

	WebDriver driver;

	By LEARN_MORE_BUTTON = By.xpath("/html/body/div[4]/main/section/div/div[3]/div[1]/div/div");

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
	public void testScrollUpDown() {
        //driver.findElement(LEARN_MORE_BUTTON).click();				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("scroll(0,)");
        js.executeScript("arguments[0].scrollIntoView();", LEARN_MORE_BUTTON  );
	}

}
