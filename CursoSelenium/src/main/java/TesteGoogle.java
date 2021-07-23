import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.Test;

public class TesteGoogle {

	@Test
	public void teste() {
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fernando\\Documents\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\Documents\\chromedriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	//	System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
	}
	
}
