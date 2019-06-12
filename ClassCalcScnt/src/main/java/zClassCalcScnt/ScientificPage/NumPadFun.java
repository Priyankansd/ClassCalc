package zClassCalcScnt.ScientificPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zClassCalcScnt.baseLayer.Base;

public class NumPadFun extends Base {

	@FindBy(xpath = "//*[@id=\"answer-expanded\"]/span")
	WebElement answerExpanded;

	@FindBy(xpath = "//*[@id=\"editable-math\"]/span[2]")
	WebElement inputContainer;

	@FindBy(xpath = "//*[@id=\"button-1\"]")
	WebElement one;

	@FindBy(xpath = "//*[@id=\"button-2\"]")
	WebElement two;

	@FindBy(xpath = "//*[@id=\"button-3\"]")
	WebElement three;

	@FindBy(xpath = "//*[@id=\"button-4\"]")
	WebElement four;

	@FindBy(xpath = "//*[@id=\"button-5\"]")
	WebElement five;

	@FindBy(xpath = "//*[@id=\"button-6\"]")
	WebElement six;

	@FindBy(xpath = "//*[@id=\"button-7\"]")
	WebElement seven;

	@FindBy(xpath = "//*[@id=\"button-8\"]")
	WebElement eight;

	@FindBy(xpath = "//*[@id=\"button-9\"]")
	WebElement nine;

	@FindBy(xpath = "//*[@id=\"button-0\"]")
	WebElement zero;

	@FindBy(xpath = "//*[@id=\"button-add\"]")
	WebElement add;

	@FindBy(xpath = "//*[@id=\"button-subtract\"]")
	WebElement subtract;

	@FindBy(xpath = "//*[@id=\"button-multiply\"]")
	WebElement multiply;

	@FindBy(xpath = "//*[@id=\"button-divide\"]")
	WebElement divide;

	@FindBy(xpath ="//*[@id=\"button-open-paren\"]")
	WebElement openParent;
	
	@FindBy(xpath ="//*[@id=\"button-close-paren\"]")
	WebElement closeParent;
	
	public NumPadFun() {
		PageFactory.initElements(driver, this);
	}

	public String verifyNumPageTitle() {
		return driver.getTitle();
	}

	public void switchFrame() {
		driver.switchTo().frame("basic_calc");
	}

	public String btnOne() {
		one.click();
		return inputContainer.getText();
	}

	public String btnTwo() {
		two.click();
		return inputContainer.getText();
	}

	public String btnThree() {
		three.click();
		return inputContainer.getText();
	}

	public String btnFour() {
		four.click();
		return inputContainer.getText();
	}

	public String btnFive() {
		five.click();
		return inputContainer.getText();
	}

	public String btnSix() {
		six.click();
		return inputContainer.getText();
	}

	public String btnSeven() {
		seven.click();
		return inputContainer.getText();
	}

	public String btnEight() {
		eight.click();
		return inputContainer.getText();
	}

	public String btnNine() {
		nine.click();
		return inputContainer.getText();
	}

	public String btnSqRt() {
		driver.findElement(By.xpath("//*[@id=\"button-sqrt\"]")).click();
		return inputContainer.getText();
	}

	public void btnPlus() {
		add.click();
	}

	public void btnMinus() {
		subtract.click();
	}

	public void btnMultiply() {
		multiply.click();
	}

	public void btnDivision() {
		divide.click();
	}
	public String openParenthesis() {
		openParent.click();
		return inputContainer.getText();
	}
	public String closeParenthesis() {
		closeParent.click();
		return inputContainer.getText();
	}
	public String AutoCalculate1() {
		btnOne();
	btnPlus();
		btnTwo();
		btnPlus();
		btnThree();
	btnPlus();
		btnFour();
		return answerExpanded.getText();
	}

	public String AutoCalculate2() {
		AutoCalculate1();
		btnMinus();
		btnFour();
		return answerExpanded.getText();
	}

	public void clear() {
		driver.findElement(By.xpath("//*[@id=\"button-clear-all\"]/img")).click();
	}
}