package zClassCalcScnt.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zClassCalcScnt.ScientificPage.NumPadFun;
import zClassCalcScnt.ScientificPage.LoginPage;
import zClassCalcScnt.baseLayer.Base;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	NumPadFun homePage;
	//String mailid = prop.getProperty("email");
	
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "ClassCalc | Scientific Calculator");
	}

	@Test(priority = 3)
	public void loginTest() {
				loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	
	 @AfterMethod
	@Ignore
	public void tearDown() {
		driver.quit();
	}

}
