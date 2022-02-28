package in.co.pages.MavenIRCTC;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.co.generics.MavenIRCTC.AutoConstant;
import in.co.generics.MavenIRCTC.BasePage;
import in.co.generics.MavenIRCTC.ExcelSheetLibrary;

public class IRCTCRegisterBasicDetails extends BasePage implements AutoConstant 
{

	public WebDriver driver;
	
	@FindBy(id = "userName")
	private WebElement Username;
	
	@FindBy(id = "usrPwd")
	private WebElement Password;
	
	@FindBy(id = "cnfUsrPwd")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath = "//span[.='Preferred Language']")
	private WebElement Languagedropdown;
	
	@FindBy(xpath = "//Li[contains(@aria-label,\"English\")]")
	private WebElement Language;
	
//	@FindBy(xpath = "//li//span[.='English']")
//	private WebElement LanguageValue;
	
	@FindBy(xpath = "//span[.='Security Question']")
	private WebElement SecurityQuestion;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Security Answer')]")
	private WebElement SecurityAnswer;
	
	@FindBy(xpath = "//button[.='Cancel']")
	private WebElement CancelBtn;
	
	@FindBy(xpath = "//button[.='Continue ']")
	private WebElement ContinueBtn;
	
	public IRCTCRegisterBasicDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Username() throws IOException 
	{
		Username.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName, 1, 0));		
	}
	
	public void Password() throws IOException 
	{
		Password.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName, 1, 1));
	}
	
	public void ConfirmPassword() throws IOException 
	{
		ConfirmPassword.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName, 1, 2));
	}
	
	public void Language() throws InterruptedException 
	{
		Languagedropdown.click();
		selectLanguage(driver, "English");
		
	}
	
	public void SecurityQuestion() throws Exception 
	{
		
		SecurityQuestion.click();
		SelectQuestion(driver, "What was the name of your first school?" );
		
	}
	
	public void SecurityAnwser() throws Exception 
	{
//		waitForElement(SecurityAnswer);
		SecurityAnswer.sendKeys(ExcelSheetLibrary.getcellvalue(ExcelSheet, SheetName, 1, 3));
	}
	
	public void Cancel() 
	{
		CancelBtn.click();
	}
	
	public void Continue() 
	{
		ContinueBtn.click();
	}
}
