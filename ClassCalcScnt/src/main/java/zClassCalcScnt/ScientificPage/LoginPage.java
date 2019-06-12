package zClassCalcScnt.ScientificPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zClassCalcScnt.baseLayer.Base;

public class LoginPage  extends Base{
	
	@FindBy(xpath="//div[@class='popup_div_login display_block']//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='login_btn']")
	WebElement LoginIcon;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
//	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
//	WebElement signUpBtn;
	

	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
		
	public NumPadFun login(String mail, String pwd){
		LoginIcon.click();
	    email.sendKeys(mail);
		password.sendKeys(pwd);
		loginBtn.click();
		 
		return new NumPadFun();
	}
	
}



