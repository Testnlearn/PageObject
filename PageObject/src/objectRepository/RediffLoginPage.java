package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

WebDriver driver;
public RediffLoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

	By username = By.xpath("//input[@id='login1']");
	By password = By.name("passwd");
	By submit =By.cssSelector("input[type=\"submit\"]");
	By createNewAccount =By.xpath("//a[@title=\"Create new Rediffmail account\"]"); // normal page object

/*@FindBy(xpath="//input[@id='login1']")
WebElement username;
@FindBy(name="passwd")
WebElement password;*/


	
	public WebElement EmailID() {
		
		
		return driver.findElement(username);
	}
	
			
	
public WebElement password() {
		
		
		return driver.findElement(password);
	}

public WebElement submit() {
	
	
	return driver.findElement(submit);
}

public WebElement createNewAccount() {
	
	
	return driver.findElement(createNewAccount);
}
		

	}


