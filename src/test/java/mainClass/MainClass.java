package mainClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capability.WebCapability;
import login.Login;

public class MainClass extends WebCapability{

	WebDriver driver;
	@BeforeTest
	public void openchrome()
	{
		driver = WebCapability();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException, IOException
	{
		new Login(driver);
	}


	@AfterTest
	public void closebrowser()
	{
//		driver.quit();
	}																																												

}
