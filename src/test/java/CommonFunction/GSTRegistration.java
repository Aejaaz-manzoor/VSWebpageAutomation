package CommonFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Until;

import PageFactory.HelpdeskPageobject;
import PageFactory.LoginPageobjects;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GSTRegistration {

	ExtentTest test;
	SimpleDateFormat dateFormat2 = new SimpleDateFormat("ddsshhmm");
	String Date12 = dateFormat2.format(new Date());
	ScreenShot screenshot = new ScreenShot();
	SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyHHMMSSSS");
	String Date11 = dateFormat1.format(new Date());
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
	
	public void GstRegistration(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		    PageFactory.initElements(driver, LoginPageobjects.class);
		    sendStatusToGoogleChat("Onboarding Test Automation Started");
		    
		try { 
			SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
			String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
			test = extentreport.createTest("GST Registration");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(3500);
			// HelpdeskPageobject.TaxCompliance.click();
			long start = System.currentTimeMillis();
			WebElement element3 = driver.findElement(By.xpath("(//a[contains(text(),'GST Registration')])[3]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
			findElement.click();

			// ********************************

			screenshot.screenshot1(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot1.png",
					"Lead Form").build());
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);

			test.log(Status.PASS, "GST registration Page redirection  " + totalTime + "ms");

			// HelpdeskPageobject.GSTRegistration.click();
			// ********************************

			findElement.sendKeys("shakthi" + Date1GstRegistration + "@yopmail.com");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("67" + Date12);
			
			Thread.sleep(2000);
			WebElement findElement2 = driver.findElement(By.xpath("((//input[@type='text'])[1])[1]"));
			JavascriptExecutor findElement54 = (JavascriptExecutor) driver;
			findElement54.executeScript("arguments[0].click();", findElement2);

			findElement2.sendKeys("chen");
			Thread.sleep(10000);
			try {
			WebElement findElement222 = driver.findElement(By.xpath("//li[@class='hover:clib-bg-[#E6EAEE] clib-cursor-pointer clib-px-3 clib-py-2 clib-text-black']"));
			findElement222.click();
			}catch (Exception selection) {
				WebElement findElement222 = driver.findElement(By.xpath("//li[contains(text(),'Chengalpattu, Tamil Nadu')]"));
				findElement222.click();
				
			}

			Robot robot = new Robot();

//			if (LoginPageobjects.whatsapptogleoff.isSelected()) {
	//
//				test.log(Status.PASS, "whatsapptogle off");
//			} else {
	//System.out.println("failed");
//				test.log(Status.FAIL, "whatsapptogleoff Failed");
//			}

			Thread.sleep(2000);
			long start1 = System.currentTimeMillis();

			WebElement element300 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			JavascriptExecutor executor300 = (JavascriptExecutor) driver;
			executor300.executeScript("arguments[0].click();", element300);
			System.out.println("succes1");

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			System.out.println("Age of Business Page Redirection " + totalTime1);
			screenshot.screenshot2(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot2.png",
					"Onboarding Page").build());
			Thread.sleep(3500);

			try {
				wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("(//input[@name='newCompanyName'])[2]")));
				driver.findElement(By.xpath("(//input[@name='newCompanyName'])[2]"))
						.click();

				Thread.sleep(2000);
				screenshot.screenshot3(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot3.png",
						"Onboarding 2QA").build());

				LoginPageobjects.Next.click();
				Thread.sleep(3000);
				LoginPageobjects.Software.click();
				Thread.sleep(2000);

//			Thread.sleep(2000);
//			LoginPageobjects.Ageofbusiness.click();
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			Thread.sleep(3000);

			} catch (Exception e) {
				screenshot.screenshot4(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot4.png",
						"New business").build());
				System.out.println(e);
				wait.until(
						ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'New business')]")));
				driver.findElement(By.xpath("//label[contains(text(),'New business')]")).click();

				test.log(Status.PASS, "Payment Cart PageTotal Time for page load " + totalTime1);
				LoginPageobjects.Next.click();
				Thread.sleep(4000);
				System.out.println(e);
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//label[contains(text(),'No, I don�t have a company name')]")));

				JavascriptExecutor executor34 = (JavascriptExecutor) driver;
				executor34.executeScript("arguments[0].click();", LoginPageobjects.noidonthaveacompanyNameGSTRig);

				Thread.sleep(2000);
				LoginPageobjects.Next.click();
				Thread.sleep(4500);
				LoginPageobjects.Software.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			}

			long start21 = System.currentTimeMillis();
			LoginPageobjects.Next.click();
			try {
				wait.until(ExpectedConditions

						.elementToBeClickable(By.xpath("//button[@class='styles_sendBtn__xW91N']")));
				driver.findElement(By.xpath("//button[@class='styles_sendBtn__xW91N']")).click();
				long finish21 = System.currentTimeMillis();
				long totalTime21 = finish21 - start21;
				System.out.println("Payment Page Redirection - " + totalTime21);
				screenshot.screenshot5(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot5.png",
						"OTP Verification").build());

				driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("0");
				driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("0");
				driver.findElement(By.xpath("(//input[@type='number'])[4]")).sendKeys("0");
				driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys("0");
				driver.findElement(By.xpath("(//input[@type='number'])[6]")).sendKeys("0");
				driver.findElement(By.xpath("(//input[@type='number'])[7]")).sendKeys("0");
				
				
				Thread.sleep(1500);
				LoginPageobjects.Next.click();
			} catch (Exception open) {

				System.out.println("Experiment 2");
			}
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='styles_btnContainer__u7tnS']")))
					.click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='styles_leftSection__isIh8 false'])[1]")).click();
			driver.findElement(By.xpath("//input[@name='cardNumber']")).click();
			driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("5123456789012346");
			screenshot.screenshot6(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot6.png",
					"Card Payment").build());
			driver.findElement(By.xpath("//input[@name='cardExpiry']")).click();
			driver.findElement(By.xpath("//input[@name='cardExpiry']")).sendKeys("1224");
			driver.findElement(By.xpath("//input[@name='cardCVV']")).click();
			driver.findElement(By.xpath("//input[@name='cardCVV']")).sendKeys("123");

			driver.findElement(By.xpath("//button[@type='submit']")).click();

			try {

				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password")));
				driver.findElement(By.cssSelector("#password")).click();
				driver.findElement(By.cssSelector("#password")).sendKeys("123456");

				driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
				Thread.sleep(6000);

//	    	List<String> all29 = new ArrayList<String>(driver.getWindowHandles());
//	    	driver.switchTo().window(all29.get(0));
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(7000);
				String parentWindow = driver.getWindowHandle();
				driver.switchTo().window(parentWindow);
				Thread.sleep(5000);

			} catch (Exception uop) {
				Thread.sleep(5000);
				screenshot.screenshot7(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot7.png",
						"Payu Payment Screen").build());

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='card-num'])[3]"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cardNumber']"))).click();

				driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("5123456789012346");
				driver.findElement(By.xpath("//input[@name='cardExpiry']")).click();
				driver.findElement(By.xpath("//input[@name='cardExpiry']")).sendKeys("1224");
				driver.findElement(By.xpath("//input[@name='cardCvv']")).click();
				driver.findElement(By.xpath("//input[@name='cardCvv']")).sendKeys("123");
				screenshot.screenshot8(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot8.png",
						"New business").build());
				driver.findElement(By.xpath("//input[@name='cardOwnerName']")).click();
				driver.findElement(By.xpath("//input[@name='cardOwnerName']")).sendKeys("TESTING");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[@class='common-btn'])[5]")).click();
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("#password")).click();
				driver.findElement(By.cssSelector("#password")).sendKeys("123456");

				driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
				Thread.sleep(6000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(7000);
				String parentWindow = driver.getWindowHandle();
				driver.switchTo().window(parentWindow);
				Thread.sleep(5000);
			}
			screenshot.screenshot9(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot9.png",
					"Start application").build());
			sendStatusToGoogleChat("GstRegistration Passed");
		} catch (Exception GSTFailed) {
			sendStatusToGoogleChat("GSTRegistration onboarding failed ---------"+GSTFailed);
			screenshot.screenshot9(driver, extentreport);
			System.out.println(GSTFailed);
			test.log(Status.WARNING, GSTFailed);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot9.png",
					"GST Registration failed").build());
		}
	}

	public void PrivateLimited(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		SimpleDateFormat dateFormat1PrivateLimited = new SimpleDateFormat("wwyyyyhhmm");
		String Date11PrivateLimited = dateFormat1PrivateLimited.format(new Date());
		test = extentreport.createTest("Private Limited Company");
		Robot robot = new Robot();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Business Setup')])[1]")));
			LoginPageobjects.Businesssetup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Private Limited Company')])[1]")));
			long start = System.currentTimeMillis();
			LoginPageobjects.Pvtdcompany.click();
			Thread.sleep(3000);
			screenshot.screenshot10(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot10.png",
					"PVT Home Page").build());
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='email'])[1]")));
			WebElement emailidpvt = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			JavascriptExecutor emailidpvt1 = (JavascriptExecutor) driver;
			emailidpvt1.executeScript("arguments[0].click();", emailidpvt);

			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "PVT Page redirection " + totalTime + "ms");
			System.out.println(driver.getTitle().toString());

			emailidpvt.sendKeys("shakthi" + Date11PrivateLimited + "@yopmail.com");
			Thread.sleep(4500);
			WebElement phonenumber = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			JavascriptExecutor phonenumber1 = (JavascriptExecutor) driver;
			phonenumber1.executeScript("arguments[0].click();", phonenumber);

			Thread.sleep(6000);
			phonenumber.sendKeys("91" + Date12);
			Thread.sleep(5000);

			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")))
					.click();
//		WebElement element311 = driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]"));
//		JavascriptExecutor executor311 = (JavascriptExecutor) driver;
//		executor311.executeScript("arguments[0].click();", element311);
//		WebElement element3111= driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]"));
//		JavascriptExecutor executor3111 = (JavascriptExecutor) driver;
//		executor3111.executeScript("arguments[0].click();", element3111);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
//		if (LoginPageobjects.whatsapptogleoff.isSelected()) {
//
//			test.log(Status.PASS, "whatsapptogle off");
//		} else {
//      System.out.println("failed");
//			test.log(Status.FAIL, "whatsapptogleoff Failed");
//		}
			// LoginPageobjects.whatsapptogleoff.click();
			Thread.sleep(2000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(((//button[@type='submit'])[1])[1])[1]")));
			long start1 = System.currentTimeMillis();
			driver.findElement(By.xpath("(((//button[@type='submit'])[1])[1])[1]")).click();
			System.out.println("succes1");
			screenshot.screenshot11(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot11.png",
					"Lead Creation").build());
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			System.out.println("Total Time for page load - " + totalTime1);

			test.log(Status.PASS, "Enter  company name page redirection " + totalTime1 + "ms");

			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Skip it for now')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]")).click();
			Thread.sleep(2000);
			screenshot.screenshot12(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot12.png",
					"Onboarding QA1").build());
			LoginPageobjects.Ageofbusiness.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// LoginPageobjects.Next.click();

			// .findElement(By.xpath("//button[@class='styles_customBtn__nb6mV
			// styles_next__NvT8q false false ']"))
			// .click();

			long start21 = System.currentTimeMillis();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]"))).getText();

			long finish21 = System.currentTimeMillis();
			long totalTime21 = finish21 - start21;
			System.out.println("Total Time for page load - " + totalTime21);

			test.log(Status.PASS, "Mobile OTP Redirection " + totalTime21 + "ms");

			long start211 = System.currentTimeMillis();
			driver.findElement(By.xpath("//p[contains(text(),'Next')]")).click();
			screenshot.screenshot13(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot13.png",
					"Payment Screen").build());
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed to pay')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Proceed to pay')]")).click();
			screenshot.screenshot14(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot14.png",
					"Cart Page redirection").build());
			long finish2111 = System.currentTimeMillis();
			long totalTime2111 = finish2111 - start211;
			System.out.println("Total Time for page load - " + totalTime21);

			test.log(Status.PASS, "PaymentPage redirection " + totalTime2111 + "ms");
			sendStatusToGoogleChat("PVT Registration Passed");
		} catch (Exception PVTFAILED) {
			sendStatusToGoogleChat("PVT onboarding failed ---------"+PVTFAILED);
			screenshot.screenshot14(driver, extentreport);
			System.out.println(PVTFAILED);
			test.log(Status.WARNING, PVTFAILED);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot14.png",
					"PVT Registration failed").build());
		}
	}

	public void TrademarkRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		SimpleDateFormat dateFormat1TrademarkRegistration = new SimpleDateFormat("mmwwyyyyhhmm");
		String Date1TrademarkRegistration = dateFormat1TrademarkRegistration.format(new Date());
		test = extentreport.createTest("Trademark Registration");
		Robot robot = new Robot();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			HelpdeskPageobject.TrademarkIP.click();

			long start = System.currentTimeMillis();
			WebElement element3 = driver.findElement(By.xpath("(//a[contains(text(),'Trademark Registration')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			screenshot.screenshot15(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot15.png",
					"Trademark Home page").build());
			Thread.sleep(4000);
			try {
				Thread.sleep(4000);
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//input[@id='email'])[1]")));
				LoginPageobjects.Email.click();

				long finish = System.currentTimeMillis();
				long totalTime = finish - start;
				System.out.println("Total Time for page load - " + totalTime);

				test.log(Status.PASS, "Trademark Registration Redirection " + totalTime + "ms");
				// HelpdeskPageobject.GSTRegistration.click();

				LoginPageobjects.Email.sendKeys("shakthi" + Date1TrademarkRegistration + "@yopmail.com");
			} catch (Exception e) {
				driver.findElement(By.xpath("//input[@id='service_form_primary_email']"))
						.sendKeys("shakthi" + Date1TrademarkRegistration + "@yopmail.com");

			}

			screenshot.screenshot16(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot16.png",
					"LeadCreation").build());

			try {
				driver.findElement(By.id("phone")).sendKeys("91" + Date12);
				
			} catch (Exception e) {

				LoginPageobjects.PhonenumberTrademarkIP.click();

				LoginPageobjects.PhonenumberTrademarkIP.sendKeys("91" + Date12);
				Thread.sleep(2000);
			}
			WebElement findElement12w = driver.findElement(By.xpath("((//input[@type='text'])[1])[1]"));
			JavascriptExecutor findElement122w = (JavascriptExecutor) driver;
			findElement122w.executeScript("arguments[0].click();", findElement12w);

			findElement12w.sendKeys("chen");
			Thread.sleep(8000);
			
		    	try {
				WebElement findElement222 = driver.findElement(By.xpath("(//li[@class='hover:clib-bg-[#E6EAEE] clib-cursor-pointer clib-px-3 clib-py-2 clib-text-black'])[1]"));
				
				findElement222.click();
				
				}catch (Exception selection) {
					WebElement findElement222 = driver.findElement(By.xpath("//li[contains(text(),'Chengalpattu, Tamil Nadu')]"));
					findElement222.click();
					
				}


			long start2 = System.currentTimeMillis();
			WebElement element501011 = driver
					.findElement(By.xpath("((//button[@type='submit'])[1])[1]"));
			JavascriptExecutor executor501011 = (JavascriptExecutor) driver;
			executor501011.executeScript("arguments[0].click();", element501011);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]"))).click();

			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			System.out.println("Total Time for page load - " + totalTime2);
			screenshot.screenshot17(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot17.png",
					"ONboarding").build());

			test.log(Status.PASS, "Enter  company name page Redirection" + totalTime2 + "ms");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='styles_inputField__cEWYs']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='styles_inputField__cEWYs']")).sendKeys("Singamcinemas");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[contains(text(),'Check availability')]")).click();
			Thread.sleep(5000);
			screenshot.screenshot18(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot18.png",
					"Check status").build());

			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//p[contains(text(),'Click to upload an image')]")).click();
			Thread.sleep(5000);
			String text1 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Adharfront";

			for (char c : text1.toCharArray()) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);

			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			screenshot.screenshot19(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot19.png",
					"Upload file Status").build());

			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//input[@class='styles_input__RiSAr']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//li[@class='styles_listStyle__HxBUC'])[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			} catch (Exception e) {
				System.out.println(e);
			}

			Thread.sleep(5000);

//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
			screenshot.screenshot20(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot20.png",
					"Payment page").build());

			long start290 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			Thread.sleep(5000);
			long finish290 = System.currentTimeMillis();
			long totalTime290 = finish290 - start290;
			System.out.println("Total Time for page load - " + totalTime290);

			test.log(Status.PASS, "Payment page Redirection" + totalTime290 + "ms");
			Thread.sleep(2000);
			screenshot.screenshot21(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot21.png",
					"Cart page").build());
			sendStatusToGoogleChat("TM Registration Passed");
		} catch (Exception TMfailed) {
			sendStatusToGoogleChat("TM onboarding failed ---------"+TMfailed);
			screenshot.screenshot21(driver, extentreport);
			System.out.println(TMfailed);
			test.log(Status.WARNING, TMfailed);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot21.png",
					"TM Registration failed").build());
		}

	}

	public void GstFiling(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		SimpleDateFormat dateFormatGstFiling = new SimpleDateFormat("MMddyyMMS");
		String DateGstFiling = dateFormatGstFiling.format(new Date());
		test = extentreport.createTest("GSTReturnsFiling");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(2000);
			try {
				HelpdeskPageobject.TaxCompliance.click();
				long start = System.currentTimeMillis();
				WebElement element3 = driver.findElement(By.xpath("(//a[contains(text(),'GST Filing')])[1]"));
				JavascriptExecutor executor3 = (JavascriptExecutor) driver;
				executor3.executeScript("arguments[0].click();", element3);
				screenshot.screenshot22(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot22.png",
						"GST Filing Homepage").build());

				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
				LoginPageobjects.Email.click();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start;
				System.out.println("Total Time for page load - " + totalTime);
				test.log(Status.PASS, "Gst Filing page redirection " + totalTime + "ms");
				// HelpdeskPageobject.GSTRegistration.click();
				LoginPageobjects.Email.sendKeys("shakthi" + Date12 + "@yopmail.com");

				WebElement findElement = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
				findElement.click();
				findElement.sendKeys("91" + Date12);

				Thread.sleep(2000);
				screenshot.screenshot23(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot23.png",
						"LeadCreation").build());

				WebElement element3001 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
				JavascriptExecutor executor3001 = (JavascriptExecutor) driver;
				executor3001.executeScript("arguments[0].click();", element3001);

				element3001.sendKeys("chen");

				try {
					
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]"))).click();
					
					
					}catch (Exception selection) {
						WebElement findElement222 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
						findElement222.click();
					}
				
				Robot robot = new Robot();

//		if (LoginPageobjects.whatsapptogleoff.isSelected()) {
//
//			test.log(Status.PASS, "whatsapptogle off");
//		} else {
//      System.out.println("failed");
//			test.log(Status.FAIL, "whatsapptogleoff Failed");
//		}
				Thread.sleep(2000);
				long start1 = System.currentTimeMillis();

				WebElement element3003 = driver
						.findElement(By.xpath("(//button[contains(text(),'Consult an Expert')])[1]"));
				JavascriptExecutor executor3003 = (JavascriptExecutor) driver;
				executor3003.executeScript("arguments[0].click();", element3003);

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]")));
				driver.findElement(By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]"))
						.click();
				System.out.println("succes1");
				screenshot.screenshot24(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot24.png",
						"Onboarding").build());

				long finish1 = System.currentTimeMillis();
				long totalTime1 = finish1 - start1;
				System.out.println("Total Time for page load - " + totalTime1);

				driver.findElement(By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]"))
						.sendKeys("Foodball");
				try {
					driver.findElement(By.xpath("(//div[contains(text(),'Next')])[1]")).click();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
				
				}
				
				Thread.sleep(3000);
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")));
				driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				screenshot.screenshot25(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot25.png",
						"Onboarding QA 2").build());

				try {
					driver.findElement(By.xpath("(//div[contains(text(),'Next')])[1]")).click();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
				
				}
				Thread.sleep(6000);
				driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
				try {
					driver.findElement(By.xpath("(//div[contains(text(),'Next')])[1]")).click();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
				
				}
				screenshot.screenshot26(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot26.png",
						"Payment selection").build());

				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]"))).click();
				screenshot.screenshot27(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot27.png",
						"Cart Page").build());

				test.log(Status.PASS, "Payment Page redirection " + totalTime1);
				Thread.sleep(3000);
			} catch (Exception Gstfiling) {
				System.out.println(Gstfiling);
				test.log(Status.FAIL, Gstfiling);
			}
			sendStatusToGoogleChat("GST FIling Passed");
		} catch (Exception GSTFILINGFAILED) {
			sendStatusToGoogleChat("GSTFILING onboarding failed ---------"+GSTFILINGFAILED);
			screenshot.screenshot27(driver, extentreport);
			System.out.println(GSTFILINGFAILED);
			test.log(Status.WARNING, GSTFILINGFAILED);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot27.png",
					"GST FIling failed").build());
		}

	}

	public void TalkToLawyer(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		test = extentreport.createTest("TalkToLawyer");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			Thread.sleep(2000);
			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Consult an Expert')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			Thread.sleep(4500);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Talk to a Lawyer')])[1]")).click();
			screenshot.screenshot28(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot28.png",
					"TTL Home page").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).click();

			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);
			test.log(Status.PASS, "Talk to lawyer page redirection " + seconds);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement.click();
			findElement.sendKeys("91" + Date12);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamil");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Legal Notice");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Legal Notices')]")).click();
//		if (LoginPageobjects.whatsapptogleoff.isSelected()) {
//
//			test.log(Status.PASS, "whatsapptogle off");
//		} else {
//System.out.println("failed");
//			test.log(Status.FAIL, "whatsapptogleoff Failed");
//		}

			long start1 = System.currentTimeMillis();

			WebElement element300121 = driver.findElement(By.xpath("//button[contains(text(),'Book an appointment now')]"));
			JavascriptExecutor executor300121 = (JavascriptExecutor) driver;
			executor300121.executeScript("arguments[0].click();", element300121);
			screenshot.screenshot29(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot29.png",
					"Date Selection").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]"))).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(3500);

			test.log(Status.PASS, "Date form page Redirection " + totalTime1);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath(
					"(//div[@class='py-[10px] w-full flex justify-center items-center h-[36px] border-[1px] rounded cursor-pointer md:py-[10px] border-[#231f20]'])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);

			long start11 = System.currentTimeMillis();
			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			screenshot.screenshot30(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot30.png",
					"OTP Validation").build());
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			// driver.findElement(By.xpath("(//div[@class='slick-slide
			// slick-active']/child::div)[1]")).click();
			// driver.findElement(By.xpath("(//div[@class='styles_timeCards__Ufzlb']/child::div)[1]")).click();
			// driver.findElement(By.xpath("(//div[@class='styles_fixedFoooter___ZqAn']/child::button)[1]")).click();
//		try {
//			Thread.sleep(2500);
//			driver.findElement(By.xpath("(//div[@class='fixed-footer-new styles_backFooter__S_D4B']/child::button)[2]"))
//					.click();
//			driver.findElement(By.xpath(
//					"(//section[@class='styles_otpInputContainer__5FhUw otp-input-container ']/child::input)[1]"))
//					.sendKeys("0");
//			driver.findElement(By.xpath(
//					"(//section[@class='styles_otpInputContainer__5FhUw otp-input-container ']/child::input)[2]"))
//					.sendKeys("0");
//			driver.findElement(By.xpath(
//					"(//section[@class='styles_otpInputContainer__5FhUw otp-input-container ']/child::input)[3]"))
//					.sendKeys("0");
//			driver.findElement(By.xpath(
//					"(//section[@class='styles_otpInputContainer__5FhUw otp-input-container ']/child::input)[4]"))
//					.sendKeys("0");
//				
//		} catch (Exception eri) {
//			Thread.sleep(2500);
//			System.out.println(eri);

//		}
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				System.out.println("No alert");
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
			sendStatusToGoogleChat("Talk To lawyer Passed");
		} catch (Exception TTLAWER) {
			sendStatusToGoogleChat("TTLAWER onboarding failed ---------"+TTLAWER);
			screenshot.screenshot30(driver, extentreport);
			System.out.println(TTLAWER);
			test.log(Status.WARNING, TTLAWER);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot30.png",
					"Talk To lawyer failed").build());
		}
	}

	public void TalkToCA(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TalkToCA");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Consult an Expert')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Talk to a Chartered Accountant')])[1]")).click();
			screenshot.screenshot31(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot31.png",
					"TalkToCA HomePage").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamil");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Auditing & Taxation");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Auditing & Taxation')]")).click();
			Thread.sleep(3000);
			screenshot.screenshot32(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot32.png",
					"LeadCreation").build());
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot33(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot33.png",
					"DateSelection Page").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
			WebElement element30011 = driver.findElement(By.xpath("//h2[contains(text(),'Tomorrow')]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath(
					"(//div[@class='py-[10px] w-full flex justify-center items-center h-[36px] border-[1px] rounded cursor-pointer md:py-[10px] border-[#231f20]'])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);

			Thread.sleep(2500);
			screenshot.screenshot34(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot34.png",
					"OTP Verification").build());
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("Talk To CA Passed");
		} catch (Exception TTCA) {
			sendStatusToGoogleChat("TTCA onboarding failed ---------"+TTCA);
			screenshot.screenshot34(driver, extentreport);
			System.out.println(TTCA);
			test.log(Status.WARNING, TTCA);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot34.png",
					"Talk To CA Onboarding failed").build());
		}
	}

	public void TalkToCS(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TalkToCS");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Consult an Expert')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Talk to a Company Secretary')])[1]")).click();
			screenshot.screenshot35(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot35.png",
					"TalkToCS HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamil");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Annual Compliances");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Annual Compliances')]")).click();
			Thread.sleep(3000);
			long start1 = System.currentTimeMillis();
			screenshot.screenshot36(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot36.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot37(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot37.png",
					"Date selection").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
			WebElement element30011 = driver.findElement(By.xpath("//h2[contains(text(),'Tomorrow')]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath(
					"(//div[@class='py-[10px] w-full flex justify-center items-center h-[36px] border-[1px] rounded cursor-pointer md:py-[10px] border-[#231f20]'])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			screenshot.screenshot38(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot38.png",
					"OTP verification").build());
			Thread.sleep(2500);

			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("TalkToCS Passed");
		} catch (Exception TTCS) {
			sendStatusToGoogleChat("TTCS onboarding failed ---------"+TTCS);
			screenshot.screenshot38(driver, extentreport);
			System.out.println(TTCS);
			test.log(Status.WARNING, TTCS);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot38.png",
					"TalkToCS Onboarding failed").build());
		}
	}

	public void FSSAI(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("FSSAI");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Licenses & Registrations')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'FSSAI [Food License]')])[1]")).click();
			screenshot.screenshot39(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot39.png",
					"FSSAI HomePage").build());
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot41(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot41.png",
					"What’s your annual turnover?").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);

			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(4000);
			Robot robot = new Robot();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "NGO page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			try {
				FindAndAddElementByJS(driver, "//input[@id='react-select-2-input']/parent::div", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//div[contains(text(),'Chennai, Tamil Nadu')]");
				Thread.sleep(3000);
			}catch(Exception gio) {
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			}
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot40(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot40.png",
					"LeadCreation").build());
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
				WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
				JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
				executor300119.executeScript("arguments[0].click();", element300119);
			} catch (Exception e) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			

		
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot42(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot42.png",
					"OTP verification").build());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]"))).click();
			
			
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection ");
			sendStatusToGoogleChat("FSSAI Passed");
		} catch (Exception FSSAI) {
			sendStatusToGoogleChat("FSSAI onboarding failed ---------"+FSSAI);
			screenshot.screenshot42(driver, extentreport);
			System.out.println(FSSAI);
			test.log(Status.WARNING, FSSAI);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot42.png",
					"FSSAI Onboarding failed").build());
		}
	}

	public void NGO(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("NGO");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Others')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'NGO')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'NGO')])[1]")).click();
			screenshot.screenshot43(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot43.png",
					"NGO HomePage").build());
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot44(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot44.png",
					"What’s your annual turnover?").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);

			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			
			
			
			
			
			
			Thread.sleep(5000);
			
			
			
			
			
			
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);
			Robot robot = new Robot();
			Thread.sleep(4000);
		try {
			FindAndAddElementByJS(driver, "//input[@id='react-select-2-input']/parent::div", "chen");
			Thread.sleep(8000);
			
			
			clickElementByJS(driver, "//div[contains(text(),'Chennai, Tamil Nadu')]");
			Thread.sleep(3000);
		}catch(Exception gio) {
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
			long start1 = System.currentTimeMillis();
		//	screenshot.screenshot45(driver, extentreport);
		//	test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
			//		"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot45.png",
		//			"LeadCreation").build());
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
				WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
				JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
				executor300119.executeScript("arguments[0].click();", element300119);
			} catch (Exception e) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot45(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot45.png",
					"OTP verification").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]"))).click();
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection ");
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " );

		} catch (Exception NGO) {
			sendStatusToGoogleChat("NGO onboarding failed ---------"+NGO);
			screenshot.screenshot45(driver, extentreport);
			System.out.println(NGO);
			test.log(Status.WARNING, NGO);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot45.png",
					"NGO Onboarding failed").build());
		}
	}

	public void TrustRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TrustRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Others')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'NGO')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Trust Registration')])[1]")).click();
			screenshot.screenshot46(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot46.png",
					"TrustRegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='service_form_primary_email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='service_form_primary_email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@placeholder='Select City'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//div[@role='option']")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot48(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot48.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to our expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot49(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot49.png",
					"Date selection").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);

			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);

			screenshot.screenshot50(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot50.png",
					"OTP verification").build());
			Thread.sleep(2500);
			
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("TrustRegistration Passed");
		} catch (Exception TrustRegistration) {
			sendStatusToGoogleChat("TrustRegistration onboarding failed ---------"+TrustRegistration);
			screenshot.screenshot50(driver, extentreport);
			System.out.println(TrustRegistration);
			test.log(Status.WARNING, TrustRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot50.png",
					"TrustRegistration Onboarding failed").build());
		}
	}

	public void PFRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PFRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		Robot robot = new Robot();
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Labour Compliance')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Provident Fund (PF) Registration')])[1]")).click();
			screenshot.screenshot51(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot51.png",
					"PFRegistration HomePage").build());
		
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot52(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot52.png",
					"What’s your annual turnover?").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			long start11 = System.currentTimeMillis();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'What is the nature of your business')]")));
			Thread.sleep(3500);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
Thread.sleep(4000);
			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);
			try {
				FindAndAddElementByJS(driver, "//input[@id='react-select-2-input']/parent::div", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//div[contains(text(),'Chennai, Tamil Nadu')]");
				Thread.sleep(3000);
			}catch(Exception gio) {
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			}
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot53(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot53.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot54(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot54.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection ");
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " );
			
			
			sendStatusToGoogleChat("PFRegistration Passed");

		} catch (Exception PFRegistration) {
			sendStatusToGoogleChat("PFRegistration onboarding failed ---------"+PFRegistration);
			screenshot.screenshot54(driver, extentreport);
			System.out.println(PFRegistration);
			test.log(Status.WARNING, PFRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot54.png",
					"PFRegistration onboarding failed").build());
		}
	}

	public void ESIRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ESIRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		Robot robot = new Robot();
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Labour Compliance')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'ESI Registration')])[1]")).click();
			screenshot.screenshot55(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot55.png",
					"ESIRegistration HomePage").build());
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot56(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot56.png",
					"What’s your annual turnover?").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(4500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'What is the nature of your business')]")));
			Thread.sleep(3500);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
Thread.sleep(4000);

			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			try {
				FindAndAddElementByJS(driver, "//input[@id='react-select-2-input']/parent::div", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//div[contains(text(),'Chennai, Tamil Nadu')]");
				Thread.sleep(3000);
			}catch(Exception gio) {
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			}
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot57(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot57.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot58(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot58.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection ");
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " );
			sendStatusToGoogleChat("ESIRegistration Passed");


		} catch (Exception ESIRegistration) {
			sendStatusToGoogleChat("ESIRegistration onboarding failed ---------"+ESIRegistration);
			screenshot.screenshot59(driver, extentreport);
			System.out.println(ESIRegistration);
			test.log(Status.WARNING, ESIRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot59.png",
					"ESIRegistration Onboarding failed").build());
		}
	}

	public void ApplyForNameChange(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ApplyForNameChange");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Others')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Property & Personal')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Name Change')])[1]")).click();
			screenshot.screenshot60(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot60.png",
					"ApplyForNameChange HomePage").build());
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot61(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot61.png",
					"What’s your annual turnover?").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter your old name']")));
			WebElement element30011 = driver.findElement(By.xpath("//input[@placeholder='Enter your old name']"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("selvam");
			
			WebElement element300111 = driver.findElement(By.xpath("//input[@placeholder='Enter your new name']"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
	     	element300111.sendKeys("balpam");
			
			Thread.sleep(3000);
			WebElement element300111y = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111y = (JavascriptExecutor) driver;
			executor300111y.executeScript("arguments[0].click();", element300111y);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			try {
				FindAndAddElementByJS(driver, "//input[@id='react-select-2-input']/parent::div", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//div[contains(text(),'Chennai, Tamil Nadu')]");
				Thread.sleep(3000);
			}catch(Exception gio) {
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			}
			Thread.sleep(4000);
				long start1 = System.currentTimeMillis();
			//	screenshot.screenshot45(driver, extentreport);
			//	test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				//		"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot45.png",
			//			"LeadCreation").build());
				try {
					WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
					JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
					executor300119.executeScript("arguments[0].click();", element300119);
				} catch (Exception e) {
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot63(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot63.png",
					"OTP verification").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			Thread.sleep(5500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection ");
			System.out.println("Pament page Redirection ");
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " );
			
			sendStatusToGoogleChat("ApplyForNameChange Passed");
		} catch (Exception ApplyForNameChange) {
			sendStatusToGoogleChat("ApplyForNameChange onboarding failed ---------"+ApplyForNameChange);
			screenshot.screenshot64(driver, extentreport);
			System.out.println(ApplyForNameChange);
			test.log(Status.WARNING, ApplyForNameChange);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot64.png",
					"ApplyForNameChange Onboarding failed").build());
		}
	}

	public void ImportExportCode(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ImportExportCode");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Licenses & Registrations')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'IEC [Import/Export Code]')])[1]")).click();
			screenshot.screenshot65(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot65.png",
					"ImportExportCode HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//div[@class='clib-relative']/child::div)[3]/following-sibling::input"))
					.sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot66(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot66.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to our expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot67(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot67.png",
					"Date selection").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("VASU");

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);

			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);

			screenshot.screenshot68(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot68.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ImportExportCode Passed");
		} catch (Exception ImportExportCode) {
			sendStatusToGoogleChat("ImportExportCode onboarding failed ---------"+ImportExportCode);
			screenshot.screenshot69(driver, extentreport);
			System.out.println(ImportExportCode);
			test.log(Status.WARNING, ImportExportCode);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot69.png",
					"ImportExportCode onboarding failed").build());
		}
	}

	public void Section8Company(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("Section8Company");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Others')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'NGO')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Section 8 Company')])[1]")).click();
			screenshot.screenshot70(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot70.png",
					"Section8Company HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='inputForEmail']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='inputForEmail']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//div[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot71(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot71.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'What is your primary objective?')]")));
			Thread.sleep(3500);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);	
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot72(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot72.png",
					"Date selection").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot73(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot73.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")));

			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("Section8Company Passed");
		} catch (Exception Section8Company) {
			sendStatusToGoogleChat("Section8Company onboarding failed ---------"+Section8Company);
			screenshot.screenshot73(driver, extentreport);
			test.log(Status.WARNING, Section8Company);
			System.out.println(Section8Company);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot73.png",
					"Section8Company Onboarding failed").build());
		}
	}

	public void MarriageRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("Marriage Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Others')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Property & Personal')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			driver.findElement(By.xpath("(//a[contains(text(),'Marriage Registration')])[1]")).click();

			screenshot.screenshot74(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot74.png",
					"Marriage Registration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='service_form_primary_email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='service_form_primary_email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot75(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot75.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to our expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			
			
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='e.g. Mumbai, Chennai, New Delhi'])[1]"))).click();
			driver.findElement(By.xpath("(//input[@placeholder='e.g. Mumbai, Chennai, New Delhi'])[1]"))
					.sendKeys("Testing");

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot76(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot76.png",
					"Date selection").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("VASU");

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot77(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot77.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("MarriageRegistration Passed");
		} catch (Exception MarriageRegistration) {
			sendStatusToGoogleChat("MarriageRegistration onboarding failed ---------"+MarriageRegistration);
			screenshot.screenshot78(driver, extentreport);
			System.out.println(MarriageRegistration);
			test.log(Status.WARNING, MarriageRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot78.png",
					"MarriageRegistration onboarding failed").build());
		}
	}

	public void ChequeBounceNotice(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ChequeBounceNotice Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Documentation')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Notices')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();

			driver.findElement(By.xpath("(//a[contains(text(),'Cheque Bounce Notice')])[1]")).click();

			screenshot.screenshot79(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot79.png",
					"ChequeBounceNotice  HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='service_form_primary_email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='service_form_primary_email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//input[@placeholder='City'])[1]")).sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//div[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot80(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot80.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Consult an Expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'What’s the primary reason for cheque bounce?')]")));
			Thread.sleep(3500);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);	
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot81(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot81.png",
					"Date selection").build());

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("VASU");

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot82(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot82.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ChequeBounceNotice Passed");
		} catch (Exception ChequeBounceNotice) {
			sendStatusToGoogleChat("ChequeBounceNotice onboarding failed ---------"+ChequeBounceNotice);
			screenshot.screenshot82(driver, extentreport);
			System.out.println(ChequeBounceNotice);
			test.log(Status.WARNING, ChequeBounceNotice);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot82.png",
					"ChequeBounceNotice Onboarding failed").build());
		}
	}

	public void SoleProprietorshipRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("SoleProprietorshipRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Sole Proprietorship')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();

			screenshot.screenshot83(driver, extentreport);
			test.log(Status.PASS,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot83.png", "SoleProprietorshipRegistration  HomePage")
							.build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//div[@class='clib-relative']/child::div)[3]/following-sibling::input"))
					.sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot84(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot84.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(5500);
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),' Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot85(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot85.png",
					"Date selection").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot86(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot86.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("SoleProprietorshipRegistration Passed");
		} catch (Exception SoleProprietorshipRegistration) {
			sendStatusToGoogleChat("SoleProprietorshipRegistration onboarding failed ---------"+SoleProprietorshipRegistration);
			screenshot.screenshot86(driver, extentreport);
			System.out.println(SoleProprietorshipRegistration);
			test.log(Status.WARNING, SoleProprietorshipRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot86.png", "SoleProprietorshipRegistration Onboarding failed")
							.build());
		}
	}

	public void ShopandEstablishmentAct(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ShopandEstablishmentAct");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Labour Compliance')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Shops and Establishments License')])[1]")).click();
			screenshot.screenshot87(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot87.png",
					"ShopandEstablishmentAct HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot88(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot88.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot89(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot89.png",
					"Date selection").build());
			WebElement element300111 = driver.findElement(By.xpath("(//span[contains(text(),' Skip it for now')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot90(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot90.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot58.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ShopandEstablishmentAct Passed");
		} catch (Exception ShopandEstablishmentAct) {
			sendStatusToGoogleChat("ShopandEstablishmentAct onboarding failed ---------"+ShopandEstablishmentAct);
			screenshot.screenshot90(driver, extentreport);
			System.out.println(ShopandEstablishmentAct);
			test.log(Status.WARNING, ShopandEstablishmentAct);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot90.png", "ShopandEstablishmentAct Onboarding failed")
							.build());
		}
	}

	public void LLPPartnershipRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("LLPPartnershipRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Limited Liability Partnership')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();

			screenshot.screenshot91(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot91.png",
					"LLPPartnershipRegistration  HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//div[@class='clib-relative']/child::div)[3]/following-sibling::input"))
					.sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot92(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot92.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(6000);
			
			
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'Age of business')]")));
			Thread.sleep(3500);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot93(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot93.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("LLPPartnershipRegistration Passed");
		} catch (Exception LLPPartnershipRegistration) {
			sendStatusToGoogleChat("LLPPartnershipRegistration onboarding failed ---------"+LLPPartnershipRegistration);
			screenshot.screenshot94(driver, extentreport);
			System.out.println(LLPPartnershipRegistration);
			test.log(Status.WARNING, LLPPartnershipRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot94.png", "LLPPartnershipRegistration Onboarding failed")
							.build());
		}
	}

	public void RespondtoTMObjection(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("RespondtoTMObjection");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Trademark')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Respond to TM Objection')])[1]")).click();
			screenshot.screenshot95(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot95.png",
					"RespondtoTMObjection HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot96(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot96.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to an expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot97(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot97.png",
					"Date selection").build());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Enter the brand name'])[1]")));
			WebElement element300111 = driver
					.findElement(By.xpath("(//input[@placeholder='Enter the brand name'])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			element300111.sendKeys("IBO");

			Thread.sleep(3000);
			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			Thread.sleep(8000);
			WebElement element30011112 = driver
					.findElement(By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]"));
			JavascriptExecutor executor30011112 = (JavascriptExecutor) driver;
			executor30011112.executeScript("arguments[0].click();", element30011112);
			element30011112.sendKeys("electrical");
			WebElement electricalindustrytype = driver
					.findElement(By.xpath("//li[contains(text(),'Electrical and Electronics')]"));
			electricalindustrytype.click();
			Thread.sleep(3000);
			WebElement element3001111112 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111112 = (JavascriptExecutor) driver;
			executor3001111112.executeScript("arguments[0].click();", element3001111112);
			Thread.sleep(8000);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot98(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot98.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot99(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot99.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("RespondtoTMObjection Passed");
		} catch (Exception RespondtoTMObjection) {
			sendStatusToGoogleChat("RespondtoTMObjection onboarding failed ---------"+RespondtoTMObjection);
			screenshot.screenshot100(driver, extentreport);
			System.out.println(RespondtoTMObjection);
			test.log(Status.WARNING, RespondtoTMObjection);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot100.png",
					"RespondtoTMObjection Onboarding failed").build());
		}
	}

	public void PatentRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatentRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Patent Registration')])[1]")).click();
			screenshot.screenshot101(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot101.png",
					"PatentRegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")))
					.click();

			long start1 = System.currentTimeMillis();
			screenshot.screenshot102(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot102.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(3500);
			WebElement industryname = driver.findElement(
					By.xpath("//input[@placeholder='Enter your industry (e.g.Technology, Pharmaceuticals) ']"));
			// industryname.click();
			industryname.sendKeys("IT");
			Thread.sleep(3000);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(8000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot103(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot103.png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot104(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot104.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot105(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot105.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("PatentRegistration Passed");
		} catch (Exception PatentRegistration) {
			sendStatusToGoogleChat("PatentRegistration onboarding failed ---------"+PatentRegistration);
			screenshot.screenshot106(driver, extentreport);
			System.out.println(PatentRegistration);
			test.log(Status.WARNING, PatentRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot106.png",
					"PatentRegistration Onboarding failed").build());
		}
	}

	public void ProvisionalPatentRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ProvisionalPatentRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Provisional Patent Application ')])[1]")).click();
			screenshot.screenshot107(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot107.png",
					"ProvisionalPatentRegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(5000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot108(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot108.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(3500);
			WebElement industryname = driver.findElement(
					By.xpath("//input[@placeholder='Enter your industry (e.g.Technology, Pharmaceuticals) ']"));
			// industryname.click();
			industryname.sendKeys("IT");
			Thread.sleep(3000);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(8000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot109(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot109.png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot110(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot110.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot111(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot111.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ProvisionalPatentRegistration Passed");
		} catch (Exception ProvisionalPatentRegistration) {
			sendStatusToGoogleChat("ProvisionalPatentRegistration onboarding failed ---------"+ProvisionalPatentRegistration);
			screenshot.screenshot112(driver, extentreport);
			System.out.println(ProvisionalPatentRegistration);
			test.log(Status.WARNING, ProvisionalPatentRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot112.png", "ProvisionalPatentRegistration Onboarding failed")
							.build());
		}
	}

	public void OnepersonCompany(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("OnepersonCompany");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'One Person Company')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();

			screenshot.screenshot113(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot113.png",
					"LLPPartnershipRegistration  HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//div[@class='clib-relative']/child::div)[3]/following-sibling::input"))
					.sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot114(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot114.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot115(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot115.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("OnepersonCompany Passed");
		} catch (Exception LLPPartnershipRegistration) {
			sendStatusToGoogleChat("LLPPartnershipRegistration onboarding failed ---------"+LLPPartnershipRegistration);
			screenshot.screenshot115(driver, extentreport);
			System.out.println(LLPPartnershipRegistration);
			test.log(Status.WARNING, LLPPartnershipRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot115.png", "LLPPartnershipRegistration Onboarding failed")
							.build());
		}
	}

	public void PatentSearch(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatentSearch");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Indian Patent Search')])[1]")).click();
			screenshot.screenshot116(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot116.png",
					"PatentSearch HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(5000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot117(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot117.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(3500);
			WebElement industryname = driver.findElement(
					By.xpath("//input[@placeholder='Enter your industry (e.g.Technology, Pharmaceuticals) ']"));
			// industryname.click();
			industryname.sendKeys("IT");
			Thread.sleep(3000);

			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(8000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot118(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot118.png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot119(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot119.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot120(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot120.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("PatentSearch Passed");
		} catch (Exception PatentSearch) {
			sendStatusToGoogleChat("PatentSearch onboarding failed ---------"+PatentSearch);
			screenshot.screenshot121(driver, extentreport);
			System.out.println(PatentSearch);
			test.log(Status.WARNING, PatentSearch);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot121.png",
					"PatentSearch Onboarding failed").build());
		}

	}

	public void PatnershipFirm(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatnershipFirm");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//a[contains(text(),'Partnership Firm')])[1]")).click();
			Thread.sleep(3000);

			Robot robot = new Robot();

			screenshot.screenshot122(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot122.png",
					"PatnershipFirm  HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//div[@class='clib-relative']/child::div)[3]/following-sibling::input"))
					.sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot123(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot123.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("//input[@placeholder='Enter your partnership firm name']"))
					.sendKeys("Testing");
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			driver.findElement(By.xpath("//input[@placeholder='Select option']")).sendKeys("Testing");
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);

			long start11 = System.currentTimeMillis();

			screenshot.screenshot124(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot124.png",
					"OTP verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("PatnershipFirm Passed");
		} catch (Exception PatnershipFirm) {
			sendStatusToGoogleChat("PatnershipFirm onboarding failed ---------"+PatnershipFirm);
			screenshot.screenshot125(driver, extentreport);
			System.out.println(PatnershipFirm);
			test.log(Status.WARNING, PatnershipFirm);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot125.png",
					"PatnershipFirm Onboarding failed").build());
		}
	}

	public void MSMERegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("MSMERegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			driver.get("https://vakilsearch.com/");
			Robot robot = new Robot();
			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Licenses & Registrations')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'MSME Registration')])[1]")).click();
			screenshot.screenshot126(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot126.png",
					"MSMERegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='service_form_primary_email']")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='service_form_primary_email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date12);

			Thread.sleep(4000);

			Thread.sleep(8000);

			driver.findElement(By.xpath("//input[@placeholder='Select City']")).sendKeys("chen");
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(8000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot127(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot127.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot128(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot128.png",
					"Date selection").build());
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Please select your entity type?')]")));
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

		
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			
		
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'What’s the annual turnover of your company?')]")));
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);


		
			WebElement element3001114 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001114 = (JavascriptExecutor) driver;
			executor3001114.executeScript("arguments[0].click();", element3001114);
			Thread.sleep(1500);

			screenshot.screenshot129(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot129.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();

			test.log(Status.PASS, "Pament page Redirection ");
			sendStatusToGoogleChat("MSMERegistration Passed");
		} catch (Exception MSMERegistration) {
			sendStatusToGoogleChat("MSMERegistration onboarding failed ---------"+MSMERegistration);
			screenshot.screenshot130(driver, extentreport);
			System.out.println(MSMERegistration);
			test.log(Status.WARNING, MSMERegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot130.png",
					"MSMERegistration Onboarding failed").build());
		}
	}
	private void sendStatusToGoogleChat(String message) {
		String k = "https://chat.googleapis.com/v1/spaces/AAAAgosrJz0/messages";
		RestAssured.baseURI = k;
		RequestSpecification httpRequest = RestAssured.given();
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("text", message);
		httpRequest.queryParam("key", "AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI");
		httpRequest.queryParam("token", "HeCoHncsuLF5PBkuf7D08IGuRZT396EfyDIGKPRDSUI");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		System.out.println(response.asPrettyString());
}
	
	private void findAndSelectValueByPartialText(final WebDriver driver, String xpath, String value) throws Exception {
		 boolean found =false;
		isElementClickable(driver, xpath);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		scrollToElement(driver, element);
		List<WebElement> options = driver.findElements(By.xpath(xpath+"/option"));
		for (WebElement option : options) {
		    if ((option.getText().toUpperCase()).contains(value.toUpperCase())) {
		        option.click();
		        found =true;
		        break;
		    }
		}
		 if(found==false) {
		    	throw new IOException("Value not available");  
		    }
	}
	private Boolean isElementClickable(final WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		boolean flag;
		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			element.click();
			flag = true;
		} catch (Exception e) {
			flag = false;
			// TODO: handle exception
		}
		return flag;
	}
	
	private static void scrollToElement(WebDriver driver, WebElement element) {
		try {
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + (x - 200) + "," + (y - 200) + ")");
		} catch (Exception e) {
			System.err.println("Scrolling to element is not working ");
		}
	}
	
	private void clickElementByJS(final WebDriver driver, String elementPath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(By.xpath(elementPath));
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		js.executeScript("arguments[0].click();", targetElement);
	}
	public void FindAndAddElementByJS(final WebDriver driver, String elementPath,String input) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(By.xpath(elementPath));
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		
	
		targetElement.sendKeys(input);
	}
}


