package in.co.pages.MavenIRCTC;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.co.generics.MavenIRCTC.AutoConstant;
import in.co.generics.MavenIRCTC.BasePage;
import in.co.generics.MavenIRCTC.ExcelSheetLibrary;

public class IRCTCRegisterPersonalDetails extends BasePage implements AutoConstant
{

	public WebDriver driver;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"First Name\")]")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Middle Name  [ Optional ]\")]")
	private WebElement MiddleName;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Last Name  [ Optional ]\")]")
	private WebElement LastName;
	
	@FindBy(xpath = "//span[.='Select Occupation']")
	private WebElement SelectOccupation;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Date Of Birth\")]")
	private WebElement DOB;
	
	@FindBy(xpath = "(//div//select[@tabindex=\"0\"])[1]") ////select//option[.='November']
	private WebElement DOBMonth;
	
	@FindBy(xpath = "(//div//select[@tabindex=\"0\"])[2]")
	private WebElement DOBYear;
	
	@FindBy(xpath = "//tbody//tr//td[.='20']")
	private WebElement DOBDate;
	
	@FindBy(xpath = "//label[.='Married']")
	private WebElement RadioBtnMarried;
	
	@FindBy(xpath = "//label[.='Unmarried']")
	private WebElement RadiobtnUnmarried;
	
	@FindBy(className = "form-control ng-pristine ng-valid ng-touched")
	private WebElement SelectCountry;
	
	@FindBy(xpath = "//span[.='Male']")
	private WebElement GenderMale;
	
	@FindBy(xpath = "//span[.='Female']")
	private WebElement GenderFemale;
	
	@FindBy(xpath = "//span[.='Transgender']")
	private WebElement GenderTransGender;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Email\")]")
	private WebElement Email;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Mobile\")]")
	private WebElement Mobile;
	
	@FindBy(xpath = "//select[@formcontrolname=\"nationality\"]") ////select//option[.=\"Select a Nationality\"]
	private WebElement Nationality;
	
	@FindBy(xpath = "//button[.='Back']")
	private WebElement BackBtn;
	
	@FindBy(xpath = "//button[.='Continue ']")
	private WebElement ContinueBtn;
	
	public IRCTCRegisterPersonalDetails(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Firtname() throws IOException 
	{
		FirstName.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName2, 1, 0));
		
	}
	
	public void MiddleName() 
	{
		
	}
	
	public void LastName() throws IOException 
	{
		
	}
	
	public void Occupation() 
	{
		SelectOccupation.click();
		SelectOccupation(driver, "PRIVATE");
	}
	
	public void DateoFBirth() throws InterruptedException 
	{
		DOB.click();
		Thread.sleep(2000);
		DOBMonth.click();
		Thread.sleep(3000);
		SelectByValue(DOBMonth, "10");
		Thread.sleep(7000);
		DOBYear.click();
		SelectByValue(DOBYear, "1996");
		DOBDate.click();
		
		
	}
	
	public void RadioBtnMarried() 
	{
		RadioBtnMarried.click();
	}
	
	public void RadioBtnUnMarried() 
	{
		RadiobtnUnmarried.click();
	}
	
	public void SelectCountry() 
	{
//		SelectCountry.click();
//		SelectByValue(SelectCountry, "10000");
	}
	
	public void GenderMale() 
	{
		GenderMale.click();
	}

	public void GenderFeMale() 
	{
		GenderFemale.click();
	}
	
	public void GenderTransGender() 
	{
		GenderTransGender.click();
	}
	
	public void Email() throws IOException 
	{
		Email.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName2, 1, 1));
	}
	
	public void Mobile() throws IOException 
	{
		Mobile.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName2, 1, 2));
	}
	
	public void Nationality() 
	{
		Nationality.click();
		SelectByValue(Nationality, "94");
	}
	
	public void BackBtn() 
	{
		BackBtn.click();
	}
	
	public void ContinueBtn() 
	{
		ContinueBtn.click();
	}
}
