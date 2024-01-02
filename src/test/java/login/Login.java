package login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;
	String url="https://gor-pathology.web.app/";
	public Login(WebDriver driver) throws InterruptedException, IOException
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@kennect.io");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@1234");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
//		Thread.sleep(10000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)", "");
//
//		Thread.sleep(5000);
//
//
//		//cost calculator
//
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement element=driver.findElement(By.xpath("//input[@id='patient-test']"));
//		element.click();
//		//			element.sendKeys("vitamin");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		//input[@id='patient-test'])[1]
////		driver.findElement(By.xpath("//*[@id=\"patient-test-option-2\"]/div/div")).click();
//		driver.findElement(By.xpath("(//input[@id='patient-test'])[1]")).click();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@kennect.io");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@1234");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
        Thread.sleep(10000);
        //            JavascriptExecutor js = (JavascriptExecutor) driver;
        //            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[3]/div[1]/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("613f36402")));
        } catch (Exception ex) {
            ex.getMessage();
        }

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"patient-test\"]"));
        dropdown.click();
        dropdown.sendKeys("AFP (ALPHA FETO PROTEINS) - 350₹");
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);
		
		
        
        
		WebElement ele= driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']"));
		ele.click();
		driver.findElement(By.xpath("//li[normalize-space()='5%']")).click();
		Thread.sleep(5000);
//
//
		//add Patients
		driver.findElement(By.xpath("//span[@class='MuiButton-label'][normalize-space()='Add']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='outlined-add-todo-input']")).sendKeys("Saurabh Automation");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
		Thread.sleep(5000);
//
//
		//Add patients
		driver.findElement(By.xpath("//span[normalize-space()='Patients']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/a/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);

		//patients details
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Saurabh Sharma");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saurabh.sharma0799@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8433508891");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
		driver.findElement(By.xpath("//input[@name='height']")).sendKeys("162.56");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
		driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("65");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
		driver.findElement(By.xpath("//div[@id='mui-component-select-gender']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//li[normalize-space()='Male']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
		//age
		driver.findElement(By.xpath("//input[@name='age']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@name='age']")).clear();
		driver.findElement(By.xpath("//input[@name='age']")).sendKeys("25");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//input[@name='systolic']")).sendKeys("90");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//input[@name='diastolic']")).sendKeys("80");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//
//
////		driver.findElement(By.xpath("//input[@name='systolic']")).sendKeys("90");
////		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////
////		driver.findElement(By.xpath("//input[@name='diastolic']")).sendKeys("80");
////		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);

		//test cost calculator
		WebElement ele1= driver.findElement(By.xpath("//input[@id='patient-test']"));
		ele1.click();
		Thread.sleep(2000);
		System.out.println("reched");
		ele1.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='MuiFormControl-root']//div[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);


		driver.findElement(By.xpath("//li[normalize-space()='5%']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);

		//input[@id='patient-tests-labs']		

		WebElement labs= driver.findElement(By.xpath("//input[@id='patient-tests-labs']"));
		labs.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		labs.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)", "");

		WebElement doctor= driver.findElement(By.xpath("//input[@name='doctor_name']"));
		doctor.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		doctor.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
//		doctor.sendKeys(Keys.TAB,Keys.TAB);
//		doctor.click();
		Thread.sleep(2000);


		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@id='mui-component-select-doctor_commission']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[normalize-space()='10%']")).click();
		js1.executeScript("window.scrollBy(0,200)", "");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@title='Add equipment']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[1]/div/div[3]/div/div/span/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("clicked on + button");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[1]/span[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("++++++++++++");


		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);


		Thread.sleep(500);
		scroll.click();
		Thread.sleep(5000);









	}

}
