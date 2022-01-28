package testCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.RediffLoginPage;
import objectRepository.RediffRegistrationPage;

public class LoginApplication {
	@Test
	public void Login() throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "/home/codilar/seleniumSetup/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPage rd=new RediffLoginPage(driver);
	rd.EmailID().sendKeys("hello");
	rd.password().sendKeys("pass@123");
	rd.submit().click();
	Thread.sleep(2000);
	rd.createNewAccount().click();
	RediffRegistrationPage reg=new RediffRegistrationPage (driver);
	reg.fullName().sendKeys("priyanka");

	
	}

}
