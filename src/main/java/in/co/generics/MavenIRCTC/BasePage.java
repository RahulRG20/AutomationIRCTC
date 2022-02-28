package in.co.generics.MavenIRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.xml.dom.OnElement;

import com.google.inject.spi.Element;

public class BasePage 
{
	public WebDriverWait wait;
	private WebElement waitElement;

	public void selectByVisibletext(WebElement element, String text) 
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void SelectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void SelectByIndex(WebElement element, int index ) 
	{
		Select Sel=new Select(element);
		Sel.selectByIndex(0);
	}
	
	public void ContextClick(WebDriver driver, WebElement onElement ) 
	{
	
		Actions act=new Actions(driver);
		act.contextClick(onElement).perform();
	}
	
	public void selectLanguage(WebDriver driver, String language ) throws InterruptedException 
	{
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//Li[contains(@aria-label,\""+language+"\")]"));
		element.click();
	}
	
	public void  SelectQuestion(WebDriver driver, String Question) throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement Qstn=driver.findElement(By.xpath("//span[.='"+Question+"']"));
		Qstn.click();
	}
	
	public void SelectOccupation(WebDriver driver , String Occupation) 
	{
		WebElement Octpn=driver.findElement(By.xpath("//span[.='"+Occupation+"']"));
		Octpn.click();
	}
	
	
	
	public void execute(WebDriver driver, Element argument) {
	WebElement element = driver.findElement(By.xpath("//input[contains(@placeholder,\\\"First Name\\\")]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	}
	
	public synchronized boolean waitForElement(WebElement objWebElement) throws Exception {
		try
		{
		waitElement = wait.until(ExpectedConditions.visibilityOf(objWebElement));
			waitElement.isDisplayed();
				
			return true;		
		}catch(Exception objException)
		
		{
			return false;	
		}
	}
}
