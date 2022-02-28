package in.co.pages.MavenIRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class IRCTCLandingpage 
{
	public WebDriver driver;

	@FindBy(xpath = "//button[.='OK']")
	private WebElement AlertokButton;
	
	@FindBy(xpath = "//a[.=' REGISTER ']")
	private WebElement RegisterButton;
	
	public IRCTCLandingpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AlertOkbutton() 
	{
		AlertokButton.click();
	}
	
	public void RegisterButton() 
	{
		RegisterButton.click();
	}
}
