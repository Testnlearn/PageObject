package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("unused")
public class RediffRegistrationPage {
	
	WebDriver driver;
	public RediffRegistrationPage (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	//public RediffRegistrationPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
//	By fullName= By.name("name10c7ee4d"); //input[name="name10c7ee4d"]
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")  // here we are using page factory by findBy method
	WebElement fullName; 
	
public WebElement fullName() {
		
		
return fullName;
}


}