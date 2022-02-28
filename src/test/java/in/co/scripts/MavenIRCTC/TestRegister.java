package in.co.scripts.MavenIRCTC;

import java.io.IOException;

import org.testng.annotations.Test;

import in.co.generics.MavenIRCTC.BaseTest;
import in.co.pages.MavenIRCTC.IRCTCLandingpage;
import in.co.pages.MavenIRCTC.IRCTCRegisterAddress;
import in.co.pages.MavenIRCTC.IRCTCRegisterBasicDetails;
import in.co.pages.MavenIRCTC.IRCTCRegisterPersonalDetails;

public class TestRegister extends BaseTest
{

	@Test(priority = 0)
	public void IRCTCLandingPage() throws InterruptedException 
	{
		IRCTCLandingpage landingpage=new IRCTCLandingpage(driver);
		landingpage.AlertOkbutton();
		Thread.sleep(2000);
		landingpage.RegisterButton();
	}
	
	@Test(priority = 1)
	public void IRCTCRegisterBasicdetails() throws Exception 
	{
		IRCTCRegisterBasicDetails Basicdetails=new IRCTCRegisterBasicDetails(driver);
				Basicdetails.Username();
				Basicdetails.Password();
				Basicdetails.ConfirmPassword();
				Basicdetails.Language();
				Basicdetails.SecurityQuestion();
				Basicdetails.SecurityAnwser();
				Basicdetails.Continue();
				
	}
	
	@Test(priority = 2)
	public void IRCTCRegisterPersonalDetails() throws IOException, InterruptedException 
	{
		IRCTCRegisterPersonalDetails PersonalDetails=new IRCTCRegisterPersonalDetails(driver);
		PersonalDetails.Firtname();
		PersonalDetails.Occupation();
		PersonalDetails.DateoFBirth();
		PersonalDetails.RadioBtnMarried();
//		PersonalDetails.SelectCountry();
		PersonalDetails.GenderMale();
		PersonalDetails.Email();
		PersonalDetails.Mobile();
		PersonalDetails.Nationality();
		PersonalDetails.ContinueBtn();
		
				
	}
	
	@Test(priority = 3)
	public void IRCTCRegisterAddress() throws IOException, InterruptedException 
	{
		IRCTCRegisterAddress Address=new IRCTCRegisterAddress(driver);
		Address.FlatDoorBlockNo();
//		Address.StreetLane();
//		Address.AreaLocality();
//		Address.PinCode();
//		Address.SelectCity();
//		Address.PostOffice();
//		Address.Phone();
//		Address.RegisterBtn();
	}
	
}
