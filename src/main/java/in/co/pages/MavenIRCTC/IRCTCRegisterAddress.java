package in.co.pages.MavenIRCTC;

import static org.testng.Assert.expectThrows;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.co.generics.MavenIRCTC.AutoConstant;
import in.co.generics.MavenIRCTC.BasePage;
import in.co.generics.MavenIRCTC.ExcelSheetLibrary;

public class IRCTCRegisterAddress extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id = "//div//input[@placeholder=\"Flat/Door/Block No.\"]")
	private WebElement Address;
	
	@FindBy(xpath = "//div//input[@placeholder=\"Flat/Door/Block No.\"]")
	private WebElement FlatDoorBlockNo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Street/Lane (Optional)\")]")
	private WebElement StreetLane;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Area/Locality (Optional)\")]")
	private WebElement AreaLocality;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Pin code\")]")
	private WebElement PinCode;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"State\")]")
	private WebElement State;
	
	@FindBy(xpath = "//select[contains(@formcontrolname,\"resCity\")]")
	private WebElement SelectCity;
	
	@FindBy(xpath = "//select[contains(@formcontrolname,\"resPostOff\")]")
	private WebElement Postoffice;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Phone \")]")
	private WebElement Phone;
	
	@FindBy(xpath = "//label[.='Yes']")
	private WebElement RadioBtnYes;
	
	@FindBy(xpath = "//label[.='No']")
	private WebElement RadioBtnNo;
	
	@FindBy(id = "sbi")
	private WebElement CheckBox;
	
	@FindBy(className = "recaptcha-checkbox-borderAnimation")
	private WebElement CaptchaCheckBox;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,\"termCondition\")]")
	private WebElement TermsAndConditionsCheckbox;
	
	@FindBy(xpath = "//button[.='Back']")
	private WebElement BackBtn;
	
	@FindBy(xpath = "//button[.='REGISTER']")
	private WebElement RegisterBtn;
	
	public IRCTCRegisterAddress(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FlatDoorBlockNo() throws IOException, InterruptedException 
	{
//		FlatDoorBlockNo.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 0));
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div//input[@placeholder=\\\"Flat/Door/Block No.\\\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		element.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 0));
	}
	
	public void StreetLane() throws IOException 
	{
		StreetLane.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 1));
	}

	public void AreaLocality() throws IOException 
	{
		AreaLocality.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 2));
	}
	
	public void PinCode() throws IOException 
	{
		PinCode.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 3));
	}
	
	public void State() throws IOException 
	{
		State.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 4));
	}
		
	public void SelectCity() 
	{
		SelectCity.click();
		SelectByIndex(SelectCity, 1);
	}
	
	public void PostOffice() 
	{
		Postoffice.click();
		SelectByIndex(Postoffice, 1);
	}
	
	public void Phone() throws IOException 
	{
		Phone.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName3, 1, 5));
	}
	
	public void RadioBtnYes() 
	{
		RadioBtnYes.click();
	}
	
	public void RadioBtnNo() 
	{
		RadioBtnNo.click();
	}
	
	public void CheckBox() 
	{
		CheckBox.click();
	}
	
	public void CaptchaCheckBox() 
	{
		CaptchaCheckBox.click();
	}
	
	public void TermsAndConditionsCheckbox() 
	{
		TermsAndConditionsCheckbox.click();
	}
	
	public void BackBtn() 
	{
		BackBtn.click();
	}
	
	public void RegisterBtn() 
	{
		RegisterBtn.click();
	}
}
