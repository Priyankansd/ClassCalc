package zClassCalcScnt.testLayer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import zClassCalcScnt.ScientificPage.NumPadFun;
import zClassCalcScnt.baseLayer.Base;

public class NumPadFunTest extends Base {
	NumPadFun numPad;

	public NumPadFunTest() {
		super();
	}


	@BeforeClass
	public void setUp() {
		initialization();
		numPad = new NumPadFun();
		numPad.switchFrame();
	}

	@Test
	public void numPadTitleTest() {
		String title = numPad.verifyNumPageTitle() ;
		AssertJUnit.assertEquals(title, "ClassCalc | Scientific Calculator");
	}

	@Test
	public void btn_OneTest() {
		String No = numPad.btnOne();
		AssertJUnit.assertEquals(No, "1");
	}

	@Test
	public void btn_TwoTest() {
		String No = numPad.btnTwo();
		AssertJUnit.assertEquals(No, "2");
	}

	@Test
	public void btn_ThreeTest() {
		String No = numPad.btnThree();
		AssertJUnit.assertEquals(No, "3");
	}
	
	@Test
	public void btn_FourTest() {
		String No = numPad.btnFour();
		AssertJUnit.assertEquals(No, "4");
	}
	
	@Test
	public void btn_FiveTest() {
		String No = numPad.btnFive();
		AssertJUnit.assertEquals(No, "5");
	}
	
	@Test
	public void btn_SixTest() {
		String No = numPad.btnSix();
		AssertJUnit.assertEquals(No, "6");
	}
	@Test
	public void btn_SevenTest() {
		String No = numPad.btnSeven();
		AssertJUnit.assertEquals(No, "7");
	}
	@Test
	public void btn_EightTest() {
		String No = numPad.btnEight();
		AssertJUnit.assertEquals(No, "8");
	}
	
	@Test
	public void btn_NineTest() {
		String No = numPad.btnNine();
		AssertJUnit.assertEquals(No, "9");
	}

	@Test
	public void btn_SqRtTest() {
		String No = numPad.btnSqRt();
		AssertJUnit.assertEquals(No, "√");
	}
	@Test(enabled = false)
	public void btn_openParent() {
		String No =	numPad.openParenthesis();
		System.out.println(No);
		AssertJUnit.assertEquals(No, "  (  ");
	}
	
	@Test(enabled = false)
	public void btn_closeParent() {
		String No =	numPad.closeParenthesis();
		AssertJUnit.assertEquals(No, " ( ");
	}

	@Test
     void AutoCalculate1Test() {
	String No = numPad.AutoCalculate1() ;
	 Assert.assertEquals(No, "10");
	 }
	@Test
	public void AutoCalculate2Test() {
	 String No = numPad.AutoCalculate2() ;
		 Assert.assertEquals(No, "6");
	 }
	@AfterMethod
	public void clearEntries() {
		numPad.clear();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
