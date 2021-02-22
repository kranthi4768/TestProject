package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className="signin")
	WebElement HomeSignin;

	@FindBy(xpath="//input[@id='login1']")
	WebElement username;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;

	@FindBy(xpath="//input[@title='Sign in']")
	WebElement Signin;

	public WebElement HomeSignin() {
		return HomeSignin;
	}
	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	public WebElement Signin() {
		return Signin;
	}

}
