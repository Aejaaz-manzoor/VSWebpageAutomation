package CommonFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import PageFactory.HomescreenPageobject;
import PageFactory.LoginPageobjects;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GSTRegistration extends HomescreenPageobject {

	ExtentTest test;
	SimpleDateFormat dateFormat2 = new SimpleDateFormat("ddsshhmm");
	String Date12 = dateFormat2.format(new Date()); 
	ScreenShot screenshot = new ScreenShot();
	SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyHHMMSSSS");
	String Date11 = dateFormat1.format(new Date());
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
    public Robot robot ;
    
  
    //GST Registration
    
    
	public void GstRegistration(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		    PageFactory.initElements(driver, LoginPageobjects.class);
		    
		    
		try {
			SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
			String Date1GstRegistration = dateFormat1GstRegistration.format(new Date()); 
			test = extentreport.createTest("GST Registration");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(3500);
			// HelpdeskPageobject.TaxCompliance.click();
			long start = System.currentTimeMillis();
		//	HomescreenPageobject.GSTRegistration.click();
			driver.get("https://vakilsearch.com/gst/registration");
			screenshot.screenshot1(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot1.png",
					"GST Home page").build());
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			test.log(Status.PASS, "GST registration Page redirection  " + totalTime + "ms"); 
			

			// ********************************

			

			// HelpdeskPageobject.GSTRegistration.click();
			// ********************************
			
			WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
			findElement.click();
			findElement.sendKeys("shakthi" + Date1GstRegistration + "@yopmail.com");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8056016697");
			Thread.sleep(2000);
			WebElement findElement2 = driver.findElement(By.xpath("((//input[@type='text'])[1])[1]"));
			JavascriptExecutor findElement54 = (JavascriptExecutor) driver;
			findElement54.executeScript("arguments[0].click();", findElement2);
			findElement2.sendKeys("Chennai");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
//			Thread.sleep(2000);
			long start1 = System.currentTimeMillis();

			WebElement element300 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			JavascriptExecutor executor300 = (JavascriptExecutor) driver;
			executor300.executeScript("arguments[0].click();", element300);
			System.out.println("succes1");
			Thread.sleep(3000);
			
			

			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
				  
			
//			-------------------------------------------On boarding starts
			
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot2(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot2.png",
					"GST Onboarding Step1 Redirection").build());
			test.log(Status.PASS, "GST Onboarding Step1 Load time- " + totalTime1 + "ms");
			Thread.sleep(4000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your company name']"))).sendKeys("Test");	
				Thread.sleep(3000);
				long start2 = System.currentTimeMillis();
				LoginPageobjects.Next.click();
				Thread.sleep(3000);
				
				
				
				
				long finish2 = System.currentTimeMillis();
				long totalTime2 = finish2 - start2;
				screenshot.screenshot3(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot3.png",
						"GST Onboarding Step2 Redirection").build());
				test.log(Status.PASS, "GST Onboarding Step2 Load time- " + totalTime2 + "ms");
				LoginPageobjects.GSTIndustrytypetextbox.click();
				Thread.sleep(3000);
				LoginPageobjects.Industrytype.click();
			    long start3 = System.currentTimeMillis();
			    LoginPageobjects.Next.click();
			    Thread.sleep(3000);
		//	---------------------------------------------------Payment Bundle
			
		
				long finish3 = System.currentTimeMillis();
				long totalTime3 = finish3 - start3;
				screenshot.screenshot4(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot4.png",
						"GST Bundle page redirection").build());
				test.log(Status.PASS, "GST Bundle page Load time- " + totalTime3 + "ms");
				
				long start4 = System.currentTimeMillis();
				LoginPageobjects.Paymentbundle.click();
				Thread.sleep(5000);
		//-------------------------------------------------------------------Payment type selection
				
				
				long finish4 = System.currentTimeMillis();
				long totalTime4 = finish4 - start4;
				screenshot.screenshot5(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot5.png",
						"GST Cart Page redirection").build());
				test.log(Status.PASS, "GST Cart page Load time- " + totalTime4 + "ms");
				LoginPageobjects.Gpay.click();
				Thread.sleep(3000);
				LoginPageobjects.Mobileno.clear();
				Thread.sleep(3000);
				LoginPageobjects.Mobileno.sendKeys("8056016697");
				Thread.sleep(3000);
				LoginPageobjects.Paymentsubmit.click();
				Thread.sleep(5000);

			screenshot.screenshot6(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot6.png",
					"GST PayU page redirection").build());
			sendStatusToGoogleChat("GST Registration Passed");
		} catch (Exception GSTFailed) {
			sendStatusToGoogleChat("GSTRegistration onboarding failed ---------"+GSTFailed);
			screenshot.screenshot7(driver, extentreport);
			System.out.println(GSTFailed);
			test.log(Status.WARNING, GSTFailed);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot7.png",
					"GST Registration failed").build());
		}
	}

	
	//Private Limited Registration
	
	
	public void PrivateLimited(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		SimpleDateFormat dateFormat1PrivateLimited = new SimpleDateFormat("wwyyyyhhmm");
		String Date11PrivateLimited = dateFormat1PrivateLimited.format(new Date());
		test = extentreport.createTest("Private Limited Company");
		sendStatusToGoogleChat(" Production Onboarding Test Automation Started");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(3000);
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-registration/private-limited");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			
			
			screenshot.screenshot8(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot8.png",
					"PVT Home Page").build());
			test.log(Status.PASS, "PVT Page redirection Load time- " + totalTime + "ms");
			
			
			//-------------------------------------------------------Lead Creation
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='email'])[1]")));
			WebElement emailidpvt = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			JavascriptExecutor emailidpvt1 = (JavascriptExecutor) driver;
			emailidpvt1.executeScript("arguments[0].click();", emailidpvt);
			System.out.println("Total Time for page load - " + totalTime);
			System.out.println(driver.getTitle().toString());
			emailidpvt.sendKeys("shakthi" + Date11PrivateLimited + "@yopmail.com");
			Thread.sleep(4500);
			WebElement phonenumber = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			JavascriptExecutor phonenumber1 = (JavascriptExecutor) driver;
			phonenumber1.executeScript("arguments[0].click();", phonenumber);
			Thread.sleep(6000);
			phonenumber.sendKeys("8056016697");
			Thread.sleep(5000);
			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
//			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(((//button[@type='submit'])[1])[1])[1]")));
			long start1 = System.currentTimeMillis();
			driver.findElement(By.xpath("(((//button[@type='submit'])[1])[1])[1]")).click();
			System.out.println("succes1");
			Thread.sleep(5000);

			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			 
			 long finish1 = System.currentTimeMillis();
			 long totalTime1 = finish1 - start1;
						 
			screenshot.screenshot9(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot9.png",
					"PVT Onboarding Step 1 redirection").build());
			test.log(Status.PASS, "PVT Onboarding Step 1 Load time- " + totalTime1 + "ms");
			System.out.println("Total Time for page load - " + totalTime1);
			
			
			//-----------------------------------------------------------------------------------------------------On boarding starts

			

			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='styles_inputField__Fr_mS']")));  //company name
			driver.findElement(By.xpath("//input[@class='styles_inputField__Fr_mS']")).click();
			Thread.sleep(3000);
			LoginPageobjects.PVTCompanyname.sendKeys("Test");
			Thread.sleep(3000);
			long start2 = System.currentTimeMillis();
			LoginPageobjects.Next.click();
			Thread.sleep(3000);
			
			
			
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			screenshot.screenshot10(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot10.png",
					"PVT Onboarding Step 2 redirection").build());
			test.log(Status.PASS, "PVT Onboarding Step 2 Load time- " + totalTime2 + "ms");
			Thread.sleep(4000);
			LoginPageobjects.Ageofbusiness.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			long start3 = System.currentTimeMillis();
			LoginPageobjects.Next.click();
			Thread.sleep(3000);
			
			
			

			
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot11(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot11.png",
					"PVT Bundle screen redirection").build());
			test.log(Status.PASS, "PVT Bundle screen Load time- " + totalTime3 + "ms");
			Thread.sleep(4000);
			System.out.println("We are currently on the following URL: " + driver.getCurrentUrl());
			Thread.sleep(3000);
			long start4 = System.currentTimeMillis();
			LoginPageobjects.Paymentbundle.click();
			Thread.sleep(5000);
			
		//--------------------------------------------------------------------------Payment mode
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			screenshot.screenshot12(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot12.png",
					"PVT Cart Page redirection").build());
			test.log(Status.PASS, "PVT Cart page Load time- " + totalTime4 + "ms");
			
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(3000);
			screenshot.screenshot13(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot13.png",
					"PageU Page redirection").build());
			sendStatusToGoogleChat("PVT Registration Passed");
			
		} catch (Exception PVT_FAILED) {
			sendStatusToGoogleChat("PVT onboarding failed ---------"+PVT_FAILED);
			screenshot.screenshot16(driver, extentreport);
			System.out.println(PVT_FAILED);
			test.log(Status.WARNING, PVT_FAILED);
			screenshot.screenshot14(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot14.png",
					"PVT Registration failed").build());
		}
	}

	
	
	//Trademark registration
	
	
	
	public void TrademarkRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		SimpleDateFormat dateFormat1TrademarkRegistration = new SimpleDateFormat("mmwwyyyyhhmm");
		String Date1TrademarkRegistration = dateFormat1TrademarkRegistration.format(new Date());
		test = extentreport.createTest("Trademark Registration");
		Robot robot = new Robot();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			Thread.sleep(3000);
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/ipindia/trademark-registration");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			
			screenshot.screenshot15(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot15.png",
					"Trademark Home page Redirection").build());
			test.log(Status.PASS, "Trademark Home page Redirection Load time- " + totalTime + "ms");
			Thread.sleep(4000);
			try {
				Thread.sleep(4000);
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//input[@id='email'])[1]")));
				LoginPageobjects.Email.click();


				
				// HelpdeskPageobject.GSTRegistration.click();

				LoginPageobjects.Email.sendKeys("shakthi" + Date1TrademarkRegistration + "@yopmail.com");
			} catch (Exception e) {
				driver.findElement(By.xpath("//input[@id='service_form_primary_email']"))
						.sendKeys("shakthi" + Date1TrademarkRegistration + "@yopmail.com");

			}

			try {
				driver.findElement(By.id("phone")).sendKeys("8056016697");
				
			} catch (Exception e) {

				LoginPageobjects.PhonenumberTrademarkIP.click();

				LoginPageobjects.PhonenumberTrademarkIP.sendKeys("8056016697");
				Thread.sleep(2000);
			}
			WebElement findElement12w = driver.findElement(By.xpath("((//input[@type='text'])[1])[1]"));
			JavascriptExecutor findElement122w = (JavascriptExecutor) driver;
			findElement122w.executeScript("arguments[0].click();", findElement12w);

			findElement12w.sendKeys("chen");
			Thread.sleep(8000);
			
				WebElement findElement222 = driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"));
				
				findElement222.click();
		
		    	Thread.sleep(3000);
//				LoginPageobjects.whatsapptogleoff.click();
//				Thread.sleep(2000);
//		    	
				
				

			long start2 = System.currentTimeMillis();
			WebElement element501011 = driver
					.findElement(By.xpath("((//button[@type='submit'])[1])[1]"));
			JavascriptExecutor executor501011 = (JavascriptExecutor) driver;
			executor501011.executeScript("arguments[0].click();", element501011);
			
			Thread.sleep(3000);

			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]")));
					  }
				
			
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]"))).click();

			System.out.println("Total Time for page load - " + totalTime2);
			screenshot.screenshot16(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot16.png",
					"Tm Onboarding step1 Redirection").build());
			test.log(Status.PASS, "Tm Onboarding step1 Loadtime-" + totalTime2 + "ms");
			Thread.sleep(2000);
			
			
			
			long start3 = System.currentTimeMillis();
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			driver.findElement(By.xpath("//input[@class='styles_inputField__cEWYs']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='styles_inputField__cEWYs']")).sendKeys("Singamcinemas");
			Thread.sleep(5000);
			screenshot.screenshot17(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot17.png",
					"Tm Onboarding step2 Redirection").build());
			test.log(Status.PASS, "Tm Onboarding step2 Loadtime-" + totalTime3 + "ms");
			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("//button[contains(text(),'Check availability')]")).click();
//			Thread.sleep(5000);
			
			
			
			long start4 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Next')]"))).click();
			Thread.sleep(6000);

			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(4000);
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
			screenshot.screenshot18(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot18.png",
					"TM Onboarding Step3 Redirection").build());
			test.log(Status.PASS, "Tm Onboarding step3 Loadtime-" + totalTime4 + "ms");
			

			
			
			
			long start5 = System.currentTimeMillis();
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			long finish5 = System.currentTimeMillis();
			long totalTime5 = finish5 - start5;
			screenshot.screenshot19(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot19.png",
					"TM Onboarding Bundle page Redirection").build());
			test.log(Status.PASS, "Tm Onboarding Bundle page Loadtime-" + totalTime5 + "ms");
			Thread.sleep(4000);
		
			
			
			
			
			
			
			long start7 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			Thread.sleep(5000);
			long finish7 = System.currentTimeMillis();
			long totalTime7 = finish7 - start7;
			screenshot.screenshot20(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot20.png",
					"Tm Carte page Redirection").build());

			test.log(Status.PASS, "TM Cart page Load time-" + totalTime7 + "ms");
			
			
			
			Thread.sleep(2000);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);
			screenshot.screenshot21(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot21.png",
					"Cart page").build());
			sendStatusToGoogleChat("TM Registration Passed");
		} catch (Exception TMfailed) {
			sendStatusToGoogleChat("TM onboarding failed ---------"+TMfailed);
			screenshot.screenshot22(driver, extentreport);
			System.out.println(TMfailed);
			test.log(Status.WARNING, TMfailed);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot22.png",
					"TM Registration failed").build());
		}

	}
	
	
	
	
	//GST Fillings-

	
	
	
	public void GstFiling(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		SimpleDateFormat dateFormatGstFiling = new SimpleDateFormat("MMddyyMMS");
		String DateGstFiling = dateFormatGstFiling.format(new Date());
		test = extentreport.createTest("GSTReturnsFiling");
		Robot robot = new Robot();
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(2000);
			try {
				long start = System.currentTimeMillis();
				driver.get("https://vakilsearch.com/gst/return-filing");
				long finish = System.currentTimeMillis();
				long totalTime = finish - start;
				screenshot.screenshot23(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot23.png",
						"GST Filing Homepage").build());
				test.log(Status.PASS, "Gst Filing page redirection " + totalTime + "ms");
				
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
				LoginPageobjects.Email.click();
				
				// HelpdeskPageobject.GSTRegistration.click();
				LoginPageobjects.Email.sendKeys("shakthi" + Date12 + "@yopmail.com");

				WebElement findElement = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
				findElement.click();
				findElement.sendKeys("8056016697");

				Thread.sleep(2000);
				screenshot.screenshot24(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot24.png",
						"LeadCreation").build());

				WebElement element3001 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
				JavascriptExecutor executor3001 = (JavascriptExecutor) driver;
				executor3001.executeScript("arguments[0].click();", element3001);

				element3001.sendKeys("Chennai");
				Thread.sleep(5000);
				wait.until(ExpectedConditions.
						elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
				Thread.sleep(3000);
				
//				LoginPageobjects.whatsapptogleoff.click();
//				Thread.sleep(2000);
				
				
				
				long start1 = System.currentTimeMillis();
				WebElement element3003 = driver
						.findElement(By.xpath("(//button[contains(text(),'Consult an Expert')])[1]"));
				JavascriptExecutor executor3003 = (JavascriptExecutor) driver;
				executor3003.executeScript("arguments[0].click();", element3003);
				Thread.sleep(3000);
				 try {
						for (int i = 1; i < 7; i++) {
						
						driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
						}
						
						Thread.sleep(5000);
						  } catch (Exception e) {
							  wait.until(ExpectedConditions.visibilityOfElementLocated(
										By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]")));
							  
						  }
					
				
				long finish1 = System.currentTimeMillis();
				long totalTime1 = finish1 - start1;
				

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]")));
				LoginPageobjects.FillingsIndustrytypetextbox.click();
				Thread.sleep(3000);
				LoginPageobjects.FillingsIndustrytypetextbox.sendKeys("Software");
				Thread.sleep(3000);
				LoginPageobjects.Industrytype.click();
				Thread.sleep(3000);
				screenshot.screenshot25(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot25.png",
						"GST Filling onboarding step1 redirection").build());
				test.log(Status.PASS, "GST Filling onboarding step1 Loadtime- " + totalTime1);
				Thread.sleep(3000);
				
				
				long start2 = System.currentTimeMillis();
				LoginPageobjects.Next.click();
				Thread.sleep(3000);
				long finish2 = System.currentTimeMillis();
				long totalTime2 = finish2 - start2;
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//div[@class=' css-133ib9g-control']")));
				driver.findElement(By.xpath("//div[@class=' css-133ib9g-control']")).click();
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				screenshot.screenshot26(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot26.png",
						"GST Filling onboarding step2 redirection").build());
				test.log(Status.PASS, "GST Filling onboarding step2 Loadtime- " + totalTime2);
				
				
				
				long start3 = System.currentTimeMillis();

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
				long finish3 = System.currentTimeMillis();
				long totalTime3 = finish3 - start3;
				screenshot.screenshot27(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot27.png",
						"GST Filling Bundle page Redirection").build());
				test.log(Status.PASS, "Payment Page redirection " + totalTime3);
				
				
				
				
				long start4 = System.currentTimeMillis();
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]"))).click();
				Thread.sleep(5000);
				long finish4 = System.currentTimeMillis();
				long totalTime4 = finish4 - start4;
				screenshot.screenshot28(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot28.png",
						"Payment Page redirection ").build());
				test.log(Status.PASS, "Payment Page redirection Load time " + totalTime4);
				Thread.sleep(3000);
			
			sendStatusToGoogleChat("GST FIling Passed");
			
		} catch (Exception GSTFILINGFAILED) {
			sendStatusToGoogleChat("GSTFILING onboarding failed ---------"+GSTFILINGFAILED);
			screenshot.screenshot29(driver, extentreport);
			System.out.println(GSTFILINGFAILED);
			test.log(Status.WARNING, GSTFILINGFAILED);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot29.png",
					"GST FIling failed").build());
		}

	}
	
	
	
	//Talk to Lawyer
	

	
	
	public void TalkToLawyer(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws IOException, InterruptedException, AWTException {
		test = extentreport.createTest("TalkToLawyer");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		try {
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/talk-to-a-lawyer");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			
			screenshot.screenshot30(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot30.png",
					"TTL Home page").build());
			test.log(Status.PASS, "TTL Homepage Load time " + totalTime);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).click();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement.click();
			findElement.sendKeys("8056016697");

			WebElement element3001 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			JavascriptExecutor executor3001 = (JavascriptExecutor) driver;
			executor3001.executeScript("arguments[0].click();", element3001);

			element3001.sendKeys("Chennai");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.
					elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hindi");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Hindi')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Legal Notice");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Legal Notices')]")).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();;
//			Thread.sleep(3000);

			
			
			long start1 = System.currentTimeMillis();
			WebElement element300121 = driver.findElement(By.xpath("//button[contains(text(),'Book an appointment now')]"));
			JavascriptExecutor executor300121 = (JavascriptExecutor) driver;
			executor300121.executeScript("arguments[0].click();", element300121);
			Thread.sleep(5000);
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
						  
					  }
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot31(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot31.png",
					"TTL Slots Redirection").build());
			test.log(Status.PASS, "TTL Slots page Load time " + totalTime1);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]"))).click();
			
			Thread.sleep(5000);
			WebElement element300111 = driver.findElement(By.xpath("//p[contains(text(),'10:00 AM')]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			
			

			long start2 = System.currentTimeMillis();
			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3000);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			LoginPageobjects.Consultforbusiness.click();
			Thread.sleep(3000);
			LoginPageobjects.Additinalinfo.sendKeys("This is a test");	
			screenshot.screenshot32(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot32.png",
					"TTL Info page Redirection").build());
			test.log(Status.PASS, "TTL Info page Load time " + totalTime2);
			Thread.sleep(90000);
			
			
			long start3 = System.currentTimeMillis();
			try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Confirm')])[1]")));
			LoginPageobjects.Confirmpayment.click();
			Thread.sleep(5000);
			}catch (Exception e2) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Make Payment')])[1]")));
				LoginPageobjects.Makepayment.click();
				Thread.sleep(5000);
				
			}
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//h2[contains(text(),'Confirmation code required')]/parent::div/following-sibling::div/child::section/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e1) {
						  
						  
					  }
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot33(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot33.png",
					"TTL Payment page Redirection").build());
			test.log(Status.PASS, "TTL Payment page Load time " + totalTime3);
            sendStatusToGoogleChat("Talk To lawyer Passed");
			
		}    
		catch (Exception TTLAWER) {
			sendStatusToGoogleChat("TTLAWER onboarding failed ---------"+TTLAWER);
			screenshot.screenshot34(driver, extentreport);
			System.out.println(TTLAWER);
			test.log(Status.WARNING, TTLAWER);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot34.png",
					"Talk To lawyer failed").build());
		}
	}
	
	
	
	//Talk to CA-------------------------------------------------------------------------------------Screenshot inside update
	
	
	

	public void TalkToCA(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TalkToCA");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/online-chartered-accountant-services-india");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot35(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot35.png",
					"TT CA Homepage").build());
			test.log(Status.PASS, "TTL CA Homepage Load time " + totalTime);

			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamil");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Auditing & Taxation");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Auditing & Taxation')]")).click();
			Thread.sleep(3000);
			screenshot.screenshot36(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot36.png",
					"LeadCreation").build());
			
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
//			Thread.sleep(3000);
			
			
			
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Book an appointment now')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(5000);

			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
					  
				  }
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			Thread.sleep(6500);
			
			screenshot.screenshot37(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot37.png",
					"TT CA slots selection page redirection").build());
			test.log(Status.PASS, "TT CA slots selection page Loadtime" + totalTime1);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
			WebElement element30011 = driver.findElement(By.xpath("//h2[contains(text(),'Tomorrow')]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("//p[contains(text(),'10:00 AM')]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);
			
			
			
			long start2 = System.currentTimeMillis();
			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3000);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			Thread.sleep(3000);
			LoginPageobjects.Additinalinfo.sendKeys("This is a test");	
			Thread.sleep(3000);
			screenshot.screenshot174(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot174.png",
					"TT CA Info page redirection").build());
			test.log(Status.PASS, "TT CA Info page Loadtime" + totalTime2);
			Thread.sleep(90000);
			
			
			
			
			
			long start3 = System.currentTimeMillis();
			try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Confirm')])[1]")));
			LoginPageobjects.Confirmpayment.click();
			Thread.sleep(5000);
			}catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Make Payment')])[1]")));
				LoginPageobjects.Makepayment.click();
				Thread.sleep(5000);
				
			}
		
			
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//h2[contains(text(),'Confirmation code required')]/parent::div/following-sibling::div/child::section/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					  
					  
				  }
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot38(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot38.png",
					"TT CA Payment page Redirection").build());
			test.log(Status.PASS, "TT CA Payment page Load time " + totalTime3);
			sendStatusToGoogleChat("Talk To CA Passed");
			
		} catch (Exception TTCA) {
			sendStatusToGoogleChat("TTCA onboarding failed ---------"+TTCA);
			screenshot.screenshot39(driver, extentreport);
			System.out.println(TTCA);
			test.log(Status.WARNING, TTCA);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot39.png",
					"Talk To CA Onboarding failed").build());
		}
	}
	
	
	
	// Talk to CS

	

	public void TalkToCS(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TalkToCS");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-secretary-services-near-me");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			Thread.sleep(4000);
			screenshot.screenshot40(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot40.png",
					"TalkToCS HomePage").build());
			test.log(Status.PASS, "TT CS Homepage Load time " + totalTime);
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("//input[@id='phone']"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			Robot robot = new Robot();

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tamil");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Annual Compliances");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[contains(text(),'Annual Compliances')]")).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
			
			
			long start1 = System.currentTimeMillis();
			screenshot.screenshot41(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot41.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			
			Thread.sleep(5000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
					  
				  }
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot42(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot42.png",
					"TT CA Slot selection page Redirection").build());
			test.log(Status.PASS, "TT CA Slot selection page Load time " + totalTime1);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Tomorrow')]")));
			WebElement element30011 = driver.findElement(By.xpath("//h2[contains(text(),'Tomorrow')]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);

			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("//p[contains(text(),'10:00 AM')]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);

			

			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			
			Thread.sleep(3000);
			LoginPageobjects.Additinalinfo.sendKeys("This is a test");			
			Thread.sleep(90000);
			long start3 = System.currentTimeMillis();
			try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Confirm')])[1]")));
			LoginPageobjects.Confirmpayment.click();
			Thread.sleep(5000);
			}catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Make Payment')])[1]")));
				LoginPageobjects.Makepayment.click();
				Thread.sleep(5000);
				
			}
			
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//h2[contains(text(),'Confirmation code required')]/parent::div/following-sibling::div/child::section/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					 
					  
				  }
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot43(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot43.png",
					"TT CA Payment page Redirection").build());
			test.log(Status.PASS, "TT CA Payment page Load time " + totalTime3);
			
			sendStatusToGoogleChat("TalkToCS Passed");
		} catch (Exception TTCS) {
			sendStatusToGoogleChat("TTCS onboarding failed ---------"+TTCS);
			screenshot.screenshot44(driver, extentreport);
			System.out.println(TTCS);
			test.log(Status.WARNING, TTCS);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot44.png",
					"TalkToCS Onboarding failed").build());
		}
	}

	
	
	//FSSAI
	
	
	
	public void FSSAI(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("FSSAI");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {

			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/fssai-registration");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			Thread.sleep(4000);
			screenshot.screenshot45(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot45.png",
					"FSSAI HomePage").build());
			Thread.sleep(3000);
			test.log(Status.PASS, "FSSAI HomePage Load time " + totalTime);
			
			 
			
			long start2 = System.currentTimeMillis();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			screenshot.screenshot46(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot46.png",
					"FSSAI Step1 redirection").build());
			test.log(Status.PASS, "FSSAI Step1 redirection Loadtime " + totalTime2);
			Thread.sleep(3000);
			
			
			long start3 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(3000);
			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			screenshot.screenshot47(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot47.png",
					"FSSAI Step2 redirection").build());
			test.log(Status.PASS, "FSSAI Step2 redirection Loadtime " + totalTime3);
			Thread.sleep(3000);
			

			long start4 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			Thread.sleep(4000);
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(3000);
			WebElement element300111111= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor300111111 = (JavascriptExecutor) driver;
			executor300111111.executeScript("arguments[0].click();", element300111111);
			screenshot.screenshot48(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot48.png",
					"FSSAI Step3 redirection").build());
			test.log(Status.PASS, "FSSAI Step3 redirection Loadtime " + totalTime4);
			Thread.sleep(3000);
			
			
			
			long start5 = System.currentTimeMillis();
			WebElement element300111118 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111118 = (JavascriptExecutor) driver;
			executor300111118.executeScript("arguments[0].click();", element300111118);
			Thread.sleep(4000);
			long finish5 = System.currentTimeMillis();
			long totalTime5 = finish5 - start5;
			Thread.sleep(3000);
			Robot robot = new Robot();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			Thread.sleep(3000);
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));
			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			try {
				FindAndAddElementByJS(driver, "//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//li[contains(text(),'Chennai, Tamilnadu')]");
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
			screenshot.screenshot49(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot49.png",
					"FSSAI Step4 redirection").build());
			test.log(Status.PASS, "FSSAI Step4 redirection Loadtime " + totalTime5);
			Thread.sleep(3000);
			
			
			
			
			long start6 = System.currentTimeMillis();
			screenshot.screenshot50(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot50.png",
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
			

			long finish6 = System.currentTimeMillis();
			long totalTime6 = finish6 - start6;
			screenshot.screenshot51(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot51.png",
					"Thank you page Redirection").build());
			test.log(Status.PASS, "Thank you page Redirection " + totalTime6);
			Thread.sleep(3500);

			
			sendStatusToGoogleChat("FSSAI Passed");
		} catch (Exception FSSAI) {
			sendStatusToGoogleChat("FSSAI onboarding failed ---------"+FSSAI);
			screenshot.screenshot52(driver, extentreport);
			System.out.println(FSSAI);
			test.log(Status.WARNING, FSSAI);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot52.png",
					"FSSAI Onboarding failed").build());
		}
	}

	
	
	
	//NGO
	
	
	
	
	public void NGO(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("NGO");
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		try {
			

			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/ngo/registration");
			Thread.sleep(3000);
			WebElement element3001191 = driver
					.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor3001191 = (JavascriptExecutor) driver;
			executor3001191.executeScript("arguments[0].click();", element3001191);
			
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			Thread.sleep(6500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			Thread.sleep(3000);
			screenshot.screenshot54(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot54.png",
					"NGO step1 redirection").build());
			test.log(Status.PASS, "NGO step1 redirection Loadtime" + totalTime );
			Thread.sleep(3000);
			
			
			
			long start2 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			Thread.sleep(1500);
			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(60000);
			screenshot.screenshot55(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot55.png",
					"NGO step2 redirection").build());
			test.log(Status.PASS, "NGO step2 redirection Loadtime" + totalTime2 );
			Thread.sleep(1500);
			
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			Thread.sleep(5000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot56(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot56.png",
					"NGO step3 redirection").build());
			test.log(Status.PASS, "NGO step3 redirection Loadtime" + totalTime3 );
			
			
				
		    try {
					

//					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Enter the basic information to get started')]"))).click();
//					Thread.sleep(3000);
//					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
//					WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//					JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
//					executor300119.executeScript("arguments[0].click();", element300119);
//					Thread.sleep(4000);
//					element300119.click();
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(3000);
					long start4 = System.currentTimeMillis();
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(5000);
					
					 long finish4 = System.currentTimeMillis();
					 long totalTime4 = finish4 - start4;
					 Thread.sleep(5000);
					 screenshot.screenshot57(driver, extentreport);
						test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
								"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot57.png",
								"NGO Bundle page redirection").build());
						test.log(Status.PASS, "NGO Bundle page redirection" + totalTime4 );
					
				
		    }
		    catch (Exception e1) {
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
				WebElement findElement31 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));
				Thread.sleep(3000);
				findElement31.click();	
				findElement31.sendKeys("shakthi" + Date11 + "@yopmail.com");
				Thread.sleep(5000);
				WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
				findElement2122.click();
				findElement2122.sendKeys("8056016697");
				Robot robot = new Robot();
				Thread.sleep(4000);
				try {
					WebElement findElement21 = driver.findElement(By.xpath("//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input"));
					
					FindAndAddElementByJS(driver, "//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input", "chen");
					Thread.sleep(8000);
					
					
					clickElementByJS(driver, "//li[contains(text(),'Chennai, Tamilnadu')]");
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
	
			
			
			try {
				long start4 = System.currentTimeMillis();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
				WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
				JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
				executor300119.executeScript("arguments[0].click();", element300119);
				long finish4 = System.currentTimeMillis();
				 long totalTime4 = finish4 - start4;
				 Thread.sleep(5000);
				 screenshot.screenshot58(driver, extentreport);
					test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot58.png",
							"NGO Bundle page redirection").build());
					test.log(Status.PASS, "NGO Bundle page redirection" + totalTime4 );
			} catch (Exception e) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		    }
		    
		    
		    long start5 = System.currentTimeMillis();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]"))).click();
			long finish5 = System.currentTimeMillis();
			 long totalTime5 = finish5 - start5;
			 Thread.sleep(5000);
			 screenshot.screenshot59(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot59.png",
						"NGO Payment page Redirection").build());
				test.log(Status.PASS, "NGO Payment page Redirection Loadtime" + totalTime5 );
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='gpay']"))).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobileNumber']"))).clear();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobileNumber']"))).sendKeys("8056016697");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
			Thread.sleep(5000);
			 screenshot.screenshot59(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot59.png",
						"NGO PayU page Redirection").build());
			Thread.sleep(3500);
			sendStatusToGoogleChat("NGO Passed");


		} catch (Exception NGO) {
			sendStatusToGoogleChat("NGO onboarding failed ---------"+NGO);
			screenshot.screenshot60(driver, extentreport);
			System.out.println(NGO);
			test.log(Status.WARNING, NGO);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot60.png",
					"NGO Onboarding failed").build());
			
		}
	}
	
	
	
	
	
	//Trust Registration
	
	
	
	

	public void TrustRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("TrustRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/ngo/registration/trust");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot61(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot61.png",
					"TrustRegistration HomePage").build());
			test.log(Status.PASS, "TrustRegistration HomePage Loadtime " + totalTime);
			
			
			
			
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='email']"));

			findElement2.click();
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("//input[@id='phone']"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.
					elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
//			
//			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot62(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot62.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("//button[contains(text(),'Get Started')]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					 
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
				  }

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			screenshot.screenshot63(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot63.png",
					"TrustRegistartion Step1 redirection").build());
			test.log(Status.PASS, "TrustRegistartion Step1 Loadtime" + totalTime1);
			Thread.sleep(3000);
			
			
			
			long start2 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(1500);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			screenshot.screenshot64(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot64.png",
					"TrustRegistartion Step2 redirection").build());
			test.log(Status.PASS, "TrustRegistartion Step2 Loadtime" + totalTime2);
			
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			screenshot.screenshot65(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot65.png",
					"TrustRegistartion Bundle page redirection").build());
			test.log(Status.PASS, "TrustRegistartion Bundle page Loadtime" + totalTime3);
			Thread.sleep(2500);
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(5000);
			screenshot.screenshot66(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot66.png",
					"TrustRegistartion Payment page redirection").build());
			test.log(Status.PASS, "TrustRegistartion Payment page Loadtime" + totalTime4);
			
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);

			sendStatusToGoogleChat("TrustRegistration Passed");
		} catch (Exception TrustRegistration) {
			sendStatusToGoogleChat("TrustRegistration onboarding failed ---------"+TrustRegistration);
			screenshot.screenshot67(driver, extentreport);
			System.out.println(TrustRegistration);
			test.log(Status.WARNING, TrustRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot67.png",
					"TrustRegistration Onboarding failed").build());
		}
	}
	
	
	
	
	//PFRegistration
	
	
	

	public void PFRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PFRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		Robot robot = new Robot();
		try {
			
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/pf-registration");
			screenshot.screenshot68(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot68.png",
					"PFRegistration HomePage").build());
		
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot69(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot69.png",
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
			Thread.sleep(60000);
			
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
			long start1 = System.currentTimeMillis();
			Thread.sleep(4000);
			try {
				
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				
			} catch (Exception d) {
				
				
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
				long finish = System.currentTimeMillis();
				long totalTime = finish - start;
				System.out.println("Total Time for page load - " + totalTime);
				test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
				Thread.sleep(3000);
				// HelpdeskPageobject.GSTRegistration.click();
				WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));
				if (findElement2.isEnabled()) {
			    	robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					
					robot.keyPress(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_DELETE);
			    }
				findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

				WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
				findElement2122.clear();
				findElement2122.click();
				findElement2122.sendKeys("8056016697");

				Thread.sleep(4000);
				try {
					FindAndAddElementByJS(driver, "//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input", "chen");
					Thread.sleep(8000);
					
					
					clickElementByJS(driver, "//li[contains(text(),'Chennai, Tamilnadu')]");
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

				
				screenshot.screenshot70(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot70.png",
						"LeadCreation").build());
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));

				WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
				JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
				executor300119.executeScript("arguments[0].click();", element300119);
				
				
				
			}
			

		
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			screenshot.screenshot71(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot71.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			
			System.out.println("Payment page Redirection ");
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);

			test.log(Status.PASS, "Payment page Redirection ");
			
			
			
			sendStatusToGoogleChat("PFRegistration Passed");

		} catch (Exception PFRegistration) {
			sendStatusToGoogleChat("PFRegistration onboarding failed ---------"+PFRegistration);
			screenshot.screenshot72(driver, extentreport);
			System.out.println(PFRegistration);
			test.log(Status.WARNING, PFRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot72.png",
					"PFRegistration onboarding failed").build());
		}
	}

	
	
	
	//ESI Registration
	
	
	
	
	public void ESIRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ESIRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		Robot robot = new Robot();
		try {
			

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Labour Compliance')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'ESI Registration')])[1]")).click();
			screenshot.screenshot73(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot73.png",
					"ESIRegistration HomePage").build());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
			
			
			System.out.println("Total Time for page load - ");
			Thread.sleep(6500);
			test.log(Status.PASS, "What’s your annual turnover?" );
			screenshot.screenshot74(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot74.png",
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
			Thread.sleep(60000);
			
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
			
			long start1 = System.currentTimeMillis();
			
             try {
            	 
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Enter the basic information to get started')]"))).click();
					Thread.sleep(3000);	
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				
			} catch (Exception d) {
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]"));
		
		  
		    if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
		   
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			Thread.sleep(4000);
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			try {
				FindAndAddElementByJS(driver, "//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//li[contains(text(),'Chennai, Tamilnadu')]");
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

			
			screenshot.screenshot75(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot75.png",
					"LeadCreation").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
			WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			}
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			

			screenshot.screenshot76(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot76.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			
			System.out.println("Payment page Redirection ");
			Thread.sleep(3500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='gpay']"))).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobileNumber']"))).clear();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobileNumber']"))).sendKeys("8056016697");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
			Thread.sleep(5000);

			test.log(Status.PASS, "Payment page Redirection " );
			sendStatusToGoogleChat("ESIRegistration Passed");


		} catch (Exception ESIRegistration) {
			sendStatusToGoogleChat("ESIRegistration onboarding failed ---------"+ESIRegistration);
			screenshot.screenshot77(driver, extentreport);
			System.out.println(ESIRegistration);
			test.log(Status.WARNING, ESIRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot77.png",
					"ESIRegistration Onboarding failed").build());
		}
	}

	
	
	//Apply for NAme change
	
	
	
	public void ApplyForNameChange(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ApplyForNameChange");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/online-name-change");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot78(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot78.png",
					"ApplyForNameChange HomePage").build());
			test.log(Status.PASS, "ApplyForNameChange HomePage Loadtime-  " + totalTime);
			
			
			
			
			long start1 = System.currentTimeMillis();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]"))).click();
           
           Thread.sleep(3000);
           
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Continue')])[2]"))).click();
           
           Thread.sleep(5000);
			
            long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			Thread.sleep(6500);
			
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
			screenshot.screenshot79(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot79.png",
					"ApplyForNameChange Step1 Redirection").build());
			test.log(Status.PASS, "ApplyForNameChange Step1 Loadtime- " + totalTime1);
			
			
			
			long start2 = System.currentTimeMillis();
			WebElement element300111y = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111y = (JavascriptExecutor) driver;
			executor300111y.executeScript("arguments[0].click();", element300111y);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			Thread.sleep(4000);
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
			screenshot.screenshot80(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot80.png",
					"ApplyForNameChange Step2 Redirection").build());
			test.log(Status.PASS, "ApplyForNameChange Step2 Loadtime- " + totalTime2);
			
			long start3 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			
			
			
			 try {
				 screenshot.screenshot81(driver, extentreport);
					test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot81.png",
							"ApplyForNameChange Step3 Redirection").build());
					test.log(Status.PASS, "ApplyForNameChange Step3 Loadtime- " + totalTime3);
					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Enter the basic information to get started')]"))).click();
					Thread.sleep(3000);	
					
					
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				
				
				long start4 = System.currentTimeMillis();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				long finish4 = System.currentTimeMillis();
				Thread.sleep(3000);
				long totalTime4 = finish4 - start4;
				screenshot.screenshot82(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot82.png",
						"ApplyForNameChange undle page Loadtime").build());
				test.log(Status.PASS, "ApplyForNameChange undle page Loadtime- " + totalTime4);
				
			 } 
			 catch (Exception d) {
				 screenshot.screenshot178(driver, extentreport);
					test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot178.png",
							"ApplyForNameChange Step3 Redirection").build());
					test.log(Status.PASS, "ApplyForNameChange Step3 Loadtime- " + totalTime3);
					Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[1]")));
			
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@class='styles_inputBox__5uNS_'])[2]"));
			findElement2122.clear();
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			try {
				FindAndAddElementByJS(driver, "//p[contains(text(),'Enter the basic information to get started ')]/parent::div/child::div/child::div/child::div/child::input", "chen");
				Thread.sleep(8000);
				
				
				clickElementByJS(driver, "//li[contains(text(),'Chennai, Tamilnadu')]");
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
			
		
			
			    long start4 = System.currentTimeMillis();
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));

					WebElement element300119 = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
					JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
					executor300119.executeScript("arguments[0].click();", element300119);
					long finish4 = System.currentTimeMillis();
					long totalTime4 = finish4 - start4;
					Thread.sleep(5000);
					screenshot.screenshot174(driver, extentreport);
					test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot174.png",
							"ApplyForNameChange Bundle page Redirection").build());
					test.log(Status.PASS, "ApplyForNameChange Bundle page Loadtime- " + totalTime4);
				} catch (Exception e) {
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					long finish4 = System.currentTimeMillis();
					long totalTime4 = finish4 - start4;
					Thread.sleep(5000);
					screenshot.screenshot84(driver, extentreport);
					test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot84.png",
							"ApplyForNameChange Bundle page Redirection").build());
					test.log(Status.PASS, "ApplyForNameChange Bundle page Loadtime- " + totalTime4);
				}
			 }
			
			 
			 
			 long start5 = System.currentTimeMillis();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			Thread.sleep(5500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish5 = System.currentTimeMillis();
			long totalTime5 = finish5 - start5;
			Thread.sleep(5000);
			screenshot.screenshot85(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot85.png",
					"ApplyForNameChange Payemnt page page Redirection").build());
			test.log(Status.PASS, "ApplyForNameChange Payment page Loadtime- " + totalTime5);
			
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);

			
			sendStatusToGoogleChat("ApplyForNameChange Passed");
		} catch (Exception ApplyForNameChange) {
			sendStatusToGoogleChat("ApplyForNameChange onboarding failed ---------"+ApplyForNameChange);
			screenshot.screenshot86(driver, extentreport);
			System.out.println(ApplyForNameChange);
			test.log(Status.WARNING, ApplyForNameChange);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot86.png",
					"ApplyForNameChange Onboarding failed").build());
		}
	}
	
	
	
	//Import Export Code

	public void ImportExportCode(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		Robot robot = new Robot();
		test = extentreport.createTest("ImportExportCode");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/import-export-code");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot87(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot87.png",
					"ImportExportCode HomePage").build());
			test.log(Status.PASS, "ImportExportCode HomePage" + totalTime);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
		
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();
			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			
			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.
					elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
//			
//			Thread.sleep(3000);
			
			screenshot.screenshot88(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot88.png",
					"LeadCreation").build());
			
			
			
			
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to our expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3000);
			

			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					 
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
				  }
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("VASU");
			Thread.sleep(3000);
			screenshot.screenshot89(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot89.png",
					"ImportExportCode Step1 redirection").build());
			test.log(Status.PASS, "ImportExportCode Step1 redirection Loadtime" + totalTime1);
			
			
			
			
			long start2 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			WebElement element3001111 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			screenshot.screenshot90(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot90.png",
					"ImportExportCode Step2 redirection").build());
			test.log(Status.PASS, "ImportExportCode Step2 redirection Loadtime" + totalTime2);
			
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			screenshot.screenshot91(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot91.png",
					"ImportExportCode Bundle page redirection").build());
			test.log(Status.PASS, "ImportExportCode Bundle page redirection Loadtime" + totalTime2);
			Thread.sleep(2500);
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(5000);
			screenshot.screenshot92(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot92.png",
					"ImportExportCode Payment page redirection").build());
			test.log(Status.PASS, "ImportExportCode Payment page redirection Loadtime" + totalTime4);
			Thread.sleep(2500);
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);

			sendStatusToGoogleChat("ImportExportCode Passed");
		} catch (Exception ImportExportCode) {
			sendStatusToGoogleChat("ImportExportCode onboarding failed ---------"+ImportExportCode);
			screenshot.screenshot93(driver, extentreport);
			System.out.println(ImportExportCode);
			test.log(Status.WARNING, ImportExportCode);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot93.png",
					"ImportExportCode onboarding failed").build());
		}
	}
	
	
	
	
	//Section 8 Company
	
	
	
	

	public void Section8Company(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("Section8Company");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/ngo/registration/section-8");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot94(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot94.png",
					"Section8Company HomePage").build());
			test.log(Status.PASS, "Section8Company HomePage redirection Loadtime" + totalTime);
			
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='inputForEmail']")));
			WebElement findElement2 = driver.findElement(By.xpath("//input[@id='inputForEmail']"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='service_form_primary_mobile_number'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@placeholder='City/Pincode'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			

			driver.findElement(By.xpath("//div[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			screenshot.screenshot95(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot95.png",
					"LeadCreation").build());
			
			
			
			
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			
			

			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					 
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'What is your primary objective?')]")));
				  }
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			
			
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
			screenshot.screenshot96(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot96.png",
					"Section8Company Step1 redirection ").build());
			test.log(Status.PASS, "Section8Company Step1 redirection Loadtime" + totalTime1);
			

			
			
			long start2 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			screenshot.screenshot97(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot97.png",
					"Section8Company Step2 redirection").build());
			test.log(Status.PASS, "Section8Company Step2 redirection Loadtime" + totalTime2);
			Thread.sleep(3000);
			
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			screenshot.screenshot98(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot98.png",
					"Section8Company Bundle page redirection").build());
			test.log(Status.PASS, "Section8Company Bundle page redirection Loadtime" + totalTime3);
			Thread.sleep(3000);
			
			
			
			long start4 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(5000);
			screenshot.screenshot99(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot99.png",
					"Section8Company Payment page redirection").build());
			test.log(Status.PASS, "Section8Company Payment page redirection Loadtime" + totalTime4);
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);
			sendStatusToGoogleChat("Section8Company Passed");
		} catch (Exception Section8Company) {
			sendStatusToGoogleChat("Section8Company onboarding failed ---------"+Section8Company);
			screenshot.screenshot100(driver, extentreport);
			test.log(Status.WARNING, Section8Company);
			System.out.println(Section8Company);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot100.png",
					"Section8Company Onboarding failed").build());
		}
	}
	
	
	
	
	
	//Marriage Registration
	
	
	
	

	public void MarriageRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("Marriage Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/marriage-registration-online");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot101(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot101.png",
					"Marriage Registration HomePage").build());
			test.log(Status.PASS, "Marriage Registration HomePage Loadtime" + totalTime);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			
			Thread.sleep(3500);
			
			
			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.
					elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]"))).click();
			Thread.sleep(5000);
//			LoginPageobjects.whatsapptogleoff.click();
			
			
			
			
			long start1 = System.currentTimeMillis();
			screenshot.screenshot102(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot102.png",
					"LeadCreation").build());
			Thread.sleep(5000);
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(5000);
			
			
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e1) {
					 
					  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
				  }
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			
			wait.until(ExpectedConditions.
					elementToBeClickable(By.xpath("//input[@type='text']"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chennai");
			Thread.sleep(4000);
			screenshot.screenshot103(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot103.png",
					"Marriage Registration Step1 redirection").build());
			test.log(Status.PASS, "Marriage Registration Step1 redirection Loadtime" + totalTime1);
			
			
			
			long start2 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			element30011.sendKeys("VASU");
			Thread.sleep(3000);
			screenshot.screenshot104(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot104.png",
					"Marriage Registration Step2 redirection").build());
			test.log(Status.PASS, "Marriage Registration Step2 redirection Loadtime" + totalTime2);
			
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element300111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			screenshot.screenshot105(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot105.png",
					"Marriage Registration Bundle page redirection").build());
			test.log(Status.PASS, "Marriage Registration Bundle page redirection Loadtime" + totalTime3);
			Thread.sleep(2500);
			
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(5000);
			screenshot.screenshot106(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot106.png",
					"Marriage Registration Bundle page redirection").build());
			test.log(Status.PASS, "Marriage Registration Bundle page redirection Loadtime" + totalTime4);
			Thread.sleep(2500);
			Thread.sleep(3500);
			LoginPageobjects.Gpay.click();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.clear();
			Thread.sleep(3000);
			LoginPageobjects.Mobileno.sendKeys("8056016697");
			Thread.sleep(3000);
			LoginPageobjects.Paymentsubmit.click();
			Thread.sleep(5000);

			sendStatusToGoogleChat("MarriageRegistration Passed");
			sendStatusToGoogleChat("QE Automation test run Ended");
			
			
		} catch (Exception MarriageRegistration) {
			sendStatusToGoogleChat("MarriageRegistration onboarding failed ---------"+MarriageRegistration);
			screenshot.screenshot107(driver, extentreport);
			System.out.println(MarriageRegistration);
			test.log(Status.WARNING, MarriageRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot107.png",
					"MarriageRegistration onboarding failed").build());
			sendStatusToGoogleChat("QE Automation test run Ended");
		}
	}
	
	
	
	//Cheque Bounce Notice
	
	


	public void ChequeBounceNotice(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ChequeBounceNotice Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			
			long start1 = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/cheque-bounce-case");
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot108(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot108.png",
					"ChequeBounceNotice  HomePage").build());
			test.log(Status.PASS, "Pament page Redirection " + totalTime1);
			
			Thread.sleep(3000);
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]")));
			WebElement element458 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor element4582 = (JavascriptExecutor) driver;
			element4582.executeScript("arguments[0].click();", element458);
			Thread.sleep(5000);
			// HelpdeskPageobject.GSTRegistration.click();
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'What’s the primary reason for cheque bounce?')]")));
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
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
		
			screenshot.screenshot109(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot109.png",
					"Date selection").build());
			
			Thread.sleep(3500);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			Thread.sleep(3000);
			WebElement element300111 = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			Thread.sleep(8000);
			long start11 = System.currentTimeMillis();
			
			try {
           	 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Enter the basic information to get started')]"))).click();
				Thread.sleep(3000);	
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		 } 
		 catch (Exception d) {
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));	
			WebElement findElement3 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			if (findElement3.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement3.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver
					.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@placeholder='City/Pincode']")).sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			
			
			screenshot.screenshot110(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot110.png",
					"OTP verification").build());
			Thread.sleep(2500);
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			
		 }
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			Thread.sleep(3500);
			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ChequeBounceNotice Passed");
		} catch (Exception ChequeBounceNotice) {
			sendStatusToGoogleChat("ChequeBounceNotice onboarding failed ---------"+ChequeBounceNotice);
			screenshot.screenshot111(driver, extentreport);
			System.out.println(ChequeBounceNotice);
			test.log(Status.WARNING, ChequeBounceNotice);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot111.png",
					"ChequeBounceNotice Onboarding failed").build());
		}
	}
	
	
	
	
	
	//Sole proprietorship resitgration

	public void SoleProprietorshipRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("SoleProprietorshipRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		
		try {
			
			try {
			
			Robot robot = new Robot();
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-registration/sole-proprietorship");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot83(driver, extentreport);
			test.log(Status.PASS,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot83.png", "SoleProprietorshipRegistration  HomePage")
							.build());
			test.log(Status.PASS, "SoleProprietorshipRegistration HomePage Load time-" + totalTime);
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			
			
			Thread.sleep(3000);
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();
			findElement2122.click();
			findElement2122.sendKeys("8056016697");
			Thread.sleep(4000);
			LoginPageobjects.City.sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			
			
			
			
			screenshot.screenshot112(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot112.png",
					"LeadCreation").build());
			Thread.sleep(3000);
			try {
			
				
				driver.findElement(By.xpath("(//button[@type='submit'])[1 ]")).click();
				Thread.sleep(5000);
			} catch (Exception e) {
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB); 
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER); 
				Thread.sleep(5000);  
				  
			  }
			long start1 = System.currentTimeMillis();
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			 
			 
			 long finish1 = System.currentTimeMillis();
				long totalTime1 = finish1 - start1;
				screenshot.screenshot83(driver, extentreport);
				test.log(Status.PASS,
						MediaEntityBuilder
								.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
										+ Date1 + "\\Screenshot83.png", "SoleProprietorshipRegistration  Step1 Redirection")
								.build());
				test.log(Status.PASS, "SoleProprietorshipRegistration Step1 Redirection Load time-" + totalTime1);
				Thread.sleep(5000);
				
				
				long start2 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),' Skip it for now')]")));
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),' Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			
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
			screenshot.screenshot83(driver, extentreport);
			test.log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot83.png", "SoleProprietorshipRegistration  Step2 Redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Step2 Redirection Load time-" + totalTime2);
			Thread.sleep(5000);
			
			
			
			long start3 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(6500);
			screenshot.screenshot113(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot113.png",
					"SoleProprietorshipRegistration Bundle page Redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Bundle page Redirection Load time" + totalTime);
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(6500);
			screenshot.screenshot114(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot114.png",
					"Payment page Redirection").build());
			test.log(Status.PASS, "Payment page Redirection Loadtime" + totalTime4);
			sendStatusToGoogleChat("SoleProprietorshipRegistration Passed");
			sendStatusToGoogleChat("Production Onboarding Automation Ended");
			
			//----------------------------------------------------------------------------------------------------------@2nd flow (Bundle) after direct flow failure
			
		}catch (Exception e) {
			
			test.log(Status.PASS, "SoleProp Direct lead failed, Hence choosing Bundle Flow" + e);
			sendStatusToGoogleChat("Sole prop - Chosen Bundle flow");
			Thread.sleep(3000);
			Robot robot = new Robot();
			long start1 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Get Started')])[4]")));
			WebElement element3001111 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[3]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			Thread.sleep(5000);
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));	
			WebElement findElement3 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			
			findElement3.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver
					.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
			findElement2122.click();
			findElement2122.sendKeys("91" + Date11);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu, India')]")).click();
			Thread.sleep(3000);
			screenshot.screenshot175(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot175.png",
					"SoleProprietorshipRegistration Login page redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Login page Redirection Load time-" + totalTime1);
			Thread.sleep(2500);
			
			
			long start2 = System.currentTimeMillis();
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			Thread.sleep(5000);
			screenshot.screenshot176(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot176.png",
					"SoleProprietorshipRegistration step1 redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Step1 Redirection Load time-" + totalTime2);
			Thread.sleep(5000);
			
			
			
			
			long start3 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),' Skip it for now')]")));
			WebElement element30011112 = driver.findElement(By.xpath("//span[contains(text(),' Skip it for now')]"));
			JavascriptExecutor executor30011112 = (JavascriptExecutor) driver;
			executor30011112.executeScript("arguments[0].click();", element30011112);
			Thread.sleep(3500);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
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
			screenshot.screenshot178(driver, extentreport);
			test.log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot178.png", "SoleProprietorshipRegistration  Step2 Redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Step2 Redirection Load time-" + totalTime3);
			Thread.sleep(5000);
			
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(6500);
			screenshot.screenshot177(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot177.png",
					"SoleProprietorshipRegistration Pre-Bundle page Redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Pre-Bundle page Redirection Load time" + totalTime4);
			Thread.sleep(5000);
			
			
			
			try {
			long start5 = System.currentTimeMillis();
			driver.findElement(By.xpath("//button[contains(text(),'Change plan')]")).click();
			long finish5 = System.currentTimeMillis();
			long totalTime5 = finish5 - start5;
			Thread.sleep(6500);
			screenshot.screenshot113(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot113.png",
					"SoleProprietorshipRegistration Pre-Bundle page Redirection").build());
			test.log(Status.PASS, "SoleProprietorshipRegistration Pre-Bundle page Redirection Load time" + totalTime5);
			Thread.sleep(5000);
			}catch(Exception e2) {
				
				long start6 = System.currentTimeMillis();
				driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
				long finish6 = System.currentTimeMillis();
				long totalTime6 = finish6 - start6;
				Thread.sleep(6500);
				screenshot.screenshot114(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot114.png",
						"Payment page Redirection").build());
				test.log(Status.PASS, "Payment page Redirection Loadtime" + totalTime6);
				sendStatusToGoogleChat("SoleProprietorshipRegistration Passed");
					
			}
			
			try {
			
			long start6 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			long finish6 = System.currentTimeMillis();
			long totalTime6 = finish6 - start6;
			Thread.sleep(6500);
			screenshot.screenshot179(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot179.png",
					"Payment page Redirection").build());
			test.log(Status.PASS, "Payment page Redirection Loadtime" + totalTime6);
			sendStatusToGoogleChat("SoleProprietorshipRegistration Passed");
			} catch (Exception e3) {
				
				sendStatusToGoogleChat("Production Onboarding Test Automation Ended");
				
			}
			
		}
		
		
		
		
		}catch (Exception SoleProprietorshipRegistration) {
			sendStatusToGoogleChat("SoleProprietorshipRegistration onboarding failed ---------"+SoleProprietorshipRegistration);
			screenshot.screenshot115(driver, extentreport);
			System.out.println(SoleProprietorshipRegistration);
			test.log(Status.WARNING, SoleProprietorshipRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot115.png", "SoleProprietorshipRegistration Onboarding failed")
							.build());
			sendStatusToGoogleChat("Production Onboarding Test Automation Ended");
		}
	}
	
	
	
	
	
	
	//Shop and Establishment Act
	
	
	public void ShopandEstablishmentAct(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ShopandEstablishmentAct");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/shop-and-establishment-license");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot116(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot116.png",
					"ShopandEstablishmentAct HomePage").build());
			test.log(Status.PASS, "ShopandEstablishmentAct HomePage Loadtime" + totalTime);
			
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();
			findElement2122.click();
			findElement2122.sendKeys("8056016697");
			Thread.sleep(4000);
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			
			
			
			
			long start1 = System.currentTimeMillis();
			screenshot.screenshot117(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot117.png",
					"LeadCreation").build());
			
			
			
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(5000);
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
	
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot118(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot118.png",
					"ShopandEstablishmentAct Step1 redirection").build());
			test.log(Status.PASS, "ShopandEstablishmentAct Step1 redirection Loadtime" + totalTime1);
			
			
			
			
			long start2 = System.currentTimeMillis();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),' Skip it for now')])[1]")));
			WebElement element300111 = driver.findElement(By.xpath("(//span[contains(text(),' Skip it for now')])[1]"));
			JavascriptExecutor executor300111 = (JavascriptExecutor) driver;
			executor300111.executeScript("arguments[0].click();", element300111);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
			WebElement element30011 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			JavascriptExecutor executor30011 = (JavascriptExecutor) driver;
			executor30011.executeScript("arguments[0].click();", element30011);
			Thread.sleep(3000);
			screenshot.screenshot119(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot119.png",
					"ShopandEstablishmentAct Step2 redirection").build());
			test.log(Status.PASS, "ShopandEstablishmentAct Step2 redirection Loadtime" + totalTime2);
			
			
			
			long start3 = System.currentTimeMillis();
			WebElement element30011111 = driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]"));
			JavascriptExecutor executor30011111 = (JavascriptExecutor) driver;
			executor30011111.executeScript("arguments[0].click();", element30011111);
			Thread.sleep(8000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			Thread.sleep(5000);
			screenshot.screenshot120(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot120.png",
					"ShopandEstablishmentAct Bundlepage redirection").build());
			test.log(Status.PASS, "ShopandEstablishmentAct Bundlepage redirection Loadtime" + totalTime3);
			Thread.sleep(2500);
			
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish4= System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			Thread.sleep(5000);
			screenshot.screenshot121(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot121.png",
					"ShopandEstablishmentAct Payment page redirection").build());
			test.log(Status.PASS, "ShopandEstablishmentAct Payment page redirection Loadtime" + totalTime4);
			Thread.sleep(2500);
			sendStatusToGoogleChat("ShopandEstablishmentAct Passed");
		} catch (Exception ShopandEstablishmentAct) {
			sendStatusToGoogleChat("ShopandEstablishmentAct onboarding failed ---------"+ShopandEstablishmentAct);
			screenshot.screenshot122(driver, extentreport);
			System.out.println(ShopandEstablishmentAct);
			test.log(Status.WARNING, ShopandEstablishmentAct);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot122.png", "ShopandEstablishmentAct Onboarding failed")
							.build());
		}
	}
	
	
	
	
	
	// LLP Registration

	public void LLPPartnershipRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("LLPPartnershipRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(3500);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-registration/llp-registration");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			screenshot.screenshot123(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot123.png",
					"LLPPartnershipRegistration  HomePage").build());
			test.log(Status.PASS, "LLPPartnershipRegistration  HomePage Loadtime" + totalTime);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]"))
					.sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			screenshot.screenshot124(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot124.png",
					"LeadCreation").build());
			
			
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(6000);
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			 
			 screenshot.screenshot125(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot125.png",
						"LLP Step1 Redirection").build());
				test.log(Status.PASS, "LLP Step1 Loadtime" + totalTime1); 
				
				
				
				long start2 = System.currentTimeMillis();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Skip it for now')]")));
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(3500);
			long finish2 = System.currentTimeMillis();
			long totalTime2 = finish2 - start2;
			 
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
			
			screenshot.screenshot126(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot126.png",
					"LLP Step2 Redirection").build());
			test.log(Status.PASS, "LLP Step2 Loadtime" + totalTime2);
			
			
			
			
			long start3 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot127(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot127.png",
					"LLP Bundle page Redirection").build());
			test.log(Status.PASS, "LLP SBundle page Loadtime" + totalTime3);
			Thread.sleep(4000);
			
			
			
			
			long start4 = System.currentTimeMillis();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			Thread.sleep(3500);
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			System.out.println("Pament page Redirection " + totalTime4);
			Thread.sleep(3500);
			screenshot.screenshot128(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot128.png",
					"Payment page Redirection").build());
			test.log(Status.PASS, "Pament page Redirection " + totalTime4);
			sendStatusToGoogleChat("LLPPartnershipRegistration Passed");
		} catch (Exception LLPPartnershipRegistration) {
			sendStatusToGoogleChat("LLPPartnershipRegistration onboarding failed ---------"+LLPPartnershipRegistration);
			screenshot.screenshot129(driver, extentreport);
			System.out.println(LLPPartnershipRegistration);
			test.log(Status.WARNING, LLPPartnershipRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot129.png", "LLPPartnershipRegistration Onboarding failed")
							.build());
		}
	}

	
	
	
	// Respond to TM objection
	
	
	
	
	public void RespondtoTMObjection(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("RespondtoTMObjection");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Tax & Compliance')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Trademark')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Respond to TM Objection')])[1]")).click();
			screenshot.screenshot130(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot130.png",
					"RespondtoTMObjection HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
			

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot131(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot131.png",
					"LeadCreation").build());
			WebElement element300119 = driver
					.findElement(By.xpath("(//button[contains(text(),'Talk to an expert')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(4000);
			
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }

			
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot132(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot132.png",
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

			screenshot.screenshot133(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot133.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot134(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot134.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("RespondtoTMObjection Passed");
		} catch (Exception RespondtoTMObjection) {
			sendStatusToGoogleChat("RespondtoTMObjection onboarding failed ---------"+RespondtoTMObjection);
			screenshot.screenshot135(driver, extentreport);
			System.out.println(RespondtoTMObjection);
			test.log(Status.WARNING, RespondtoTMObjection);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot135.png",
					"RespondtoTMObjection Onboarding failed").build());
		}
	}
	
	
	
	//Patent Registration
	
	
	

	public void PatentRegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatentRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Patent Registration')])[1]")).click();
			screenshot.screenshot136(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot136.png",
					"PatentRegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			LoginPageobjects.City.click();
			Thread.sleep(5000);
			LoginPageobjects.City.sendKeys("chennai");
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")))
					.click();

			long start1 = System.currentTimeMillis();
			screenshot.screenshot137(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot137.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			
			
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
			screenshot.screenshot138(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot138png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot139(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot139.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot140(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot140.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("PatentRegistration Passed");
		} catch (Exception PatentRegistration) {
			sendStatusToGoogleChat("PatentRegistration onboarding failed ---------"+PatentRegistration);
			screenshot.screenshot141(driver, extentreport);
			System.out.println(PatentRegistration);
			test.log(Status.WARNING, PatentRegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot141.png",
					"PatentRegistration Onboarding failed").build());
		}
	}
	
	
	
	// Provisional Patent Registration

	public void ProvisionalPatentRegistration(WebDriver driver, String Username, String Mobilenumber,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("ProvisionalPatentRegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Provisional Patent Application ')])[1]")).click();
			screenshot.screenshot142(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot142.png",
					"ProvisionalPatentRegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
		

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(5000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot143(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot143.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(4000);
			
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			
			
			
			
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
			screenshot.screenshot144(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot144.png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot145(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot145.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot146(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot146.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("ProvisionalPatentRegistration Passed");
		} catch (Exception ProvisionalPatentRegistration) {
			sendStatusToGoogleChat("ProvisionalPatentRegistration onboarding failed ---------"+ProvisionalPatentRegistration);
			screenshot.screenshot147(driver, extentreport);
			System.out.println(ProvisionalPatentRegistration);
			test.log(Status.WARNING, ProvisionalPatentRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot147.png", "ProvisionalPatentRegistration Onboarding failed")
							.build());
		}
	}

	
	
	
	// One person Company
	
	
	

	public void OnepersonCompany(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("OnepersonCompany");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);
		try {
			
			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-registration/opc-registration");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			Robot robot = new Robot();

			screenshot.screenshot148(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot148.png",
					"OPC HomePage Redirection").build());
			test.log(Status.PASS, "OPC Homepage Loadtime" + totalTime);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
				
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			screenshot.screenshot149(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot149.png",
					"LeadCreation").build());
			
			long start1 = System.currentTimeMillis();
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(4000);
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			 long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			screenshot.screenshot150(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot150.png",
					"OPC Step1 Redirection").build());
			test.log(Status.PASS, "OPC Step1 Redirection Loadtime" + totalTime1);
			
			
			
			long start2 = System.currentTimeMillis();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Skip it for now')]")));
			WebElement element3001111 = driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]"));
			JavascriptExecutor executor3001111 = (JavascriptExecutor) driver;
			executor3001111.executeScript("arguments[0].click();", element3001111);
			Thread.sleep(4000);
			 long finish2 = System.currentTimeMillis();
			 long totalTime2 = finish2 - start2;
			 screenshot.screenshot151(driver, extentreport);
		      test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot151.png",
						"OPC Step2 Redirection").build());
			 test.log(Status.PASS, "OPC Step2 Redirection Loadtime" + totalTime2);
			 Thread.sleep(3000);
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
			
			

			
			
			long start3 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(5000);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			screenshot.screenshot152(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot152.png",
					"OPC Bundle page redirection").build());
			test.log(Status.PASS, "OPC Bundle page redirection Loadtime" + totalTime3);
			Thread.sleep(2500);
			
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			Thread.sleep(5000);
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			screenshot.screenshot153(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot153.png",
					"Payment page Redirection").build());
			test.log(Status.PASS, "Payment page Redirection Loadtime" + totalTime4);
			
			sendStatusToGoogleChat("OnepersonCompany Passed");
		} catch (Exception OPCRegistration) {
			sendStatusToGoogleChat("OnepersonCompany onboarding failed ---------"+OPCRegistration);
			screenshot.screenshot154(driver, extentreport);
			System.out.println(OPCRegistration);
			test.log(Status.WARNING, OPCRegistration);
			test.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
									+ Date1 + "\\Screenshot154.png", "OPCRegistration Onboarding failed")
							.build());
		}
	}
	
	
	
	// Patent search
	
	
	

	public void PatentSearch(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatentSearch");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Robot robot = new Robot();
		Thread.sleep(2000);
		try {
			

			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Trademark & IP')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Patent')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Indian Patent Search')])[1]")).click();
			screenshot.screenshot155(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot155.png",
					"PatentSearch HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);
			Thread.sleep(8000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");

			Thread.sleep(8000);
		

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(5000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot156(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot156.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			
			
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
			screenshot.screenshot157(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot157.png",
					"Onboarding section").build());

			long start11 = System.currentTimeMillis();

			screenshot.screenshot158(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot158.png",
					"payment verification").build());
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish11 = System.currentTimeMillis();
			long totalTime11 = finish11 - start11;
			screenshot.screenshot159(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot159.png",
					"Cart page verification").build());
			System.out.println("Pament page Redirection " + totalTime11);
			Thread.sleep(3500);

			test.log(Status.PASS, "Pament page Redirection " + totalTime11);
			sendStatusToGoogleChat("PatentSearch Passed");
		} catch (Exception PatentSearch) {
			sendStatusToGoogleChat("PatentSearch onboarding failed ---------"+PatentSearch);
			screenshot.screenshot160(driver, extentreport);
			System.out.println(PatentSearch);
			test.log(Status.WARNING, PatentSearch);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot160.png",
					"PatentSearch Onboarding failed").build());
		}

	}

	
	
	
	// Partnership Firm
	
	
	
	
	public void PatnershipFirm(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("PatnershipFirm");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			

			long start = System.currentTimeMillis();
			driver.get("https://vakilsearch.com/company-registration/partnership-firm");
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			Robot robot = new Robot();
			screenshot.screenshot161(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot161.png",
					"PatnershipFirm  HomePage").build());
			test.log(Status.PASS, "Partnership firm HomePage Loadtime " + totalTime);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@type='text'])[1]"))
					.sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			
			
			long start2 = System.currentTimeMillis();
			screenshot.screenshot162(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot162.png",
					"LeadCreation").build());
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			Thread.sleep(3500);
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
				long finish2 = System.currentTimeMillis();
				long totalTime2 = finish2 - start2;
				screenshot.screenshot163(driver, extentreport);
				test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot163.png",
						"PatnershipFirm  Step 1 Rediection").build());
				test.log(Status.PASS, "Partnership firm Step 1 Rediection Loadtime" + totalTime2);
				
			
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[1]")));
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			
			
			long start3 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			long finish3 = System.currentTimeMillis();
			long totalTime3 = finish3 - start3;
			driver.findElement(By.xpath("//input[@placeholder='Enter your partnership firm name']"))
					.sendKeys("Testing");
			screenshot.screenshot164(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot164.png",
					"PatnershipFirm  Step 2 Rediection").build());
			test.log(Status.PASS, "Partnership firm Step 2 Rediection Loadtime" + totalTime3);
			
			
			long start4 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			long finish4 = System.currentTimeMillis();
			long totalTime4 = finish4 - start4;
			driver.findElement(By.xpath("//input[@placeholder='Select option']")).sendKeys("Testing");
			screenshot.screenshot165(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot165.png",
					"PatnershipFirm  Step 3 Rediection").build());
			test.log(Status.PASS, "Partnership firm Step 3 Rediection Loadtime" + totalTime4);
			
			
			long start5 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Next')])[1]")).click();
			Thread.sleep(3500);
			long finish5 = System.currentTimeMillis();
			long totalTime5 = finish5 - start5;
			Thread.sleep(5000);
			screenshot.screenshot166(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot166.png",
					"PatnershipFirm  Bundle page Rediection").build());
			test.log(Status.PASS, "Partnership firm Bundle page Rediection Loadtime" + totalTime5);
			Thread.sleep(3500);
			
			
			
			long start6 = System.currentTimeMillis();
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();
			long finish6 = System.currentTimeMillis();
			long totalTime6 = finish6 - start6;
			Thread.sleep(5000);
			screenshot.screenshot167(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot167.png",
					"Pament page Redirection page Rediection").build());
			test.log(Status.PASS, "Pament page Redirection " + totalTime6);
			sendStatusToGoogleChat("PatnershipFirm Passed");
			
		} catch (Exception PatnershipFirm) {
			sendStatusToGoogleChat("PatnershipFirm onboarding failed ---------"+PatnershipFirm);
			screenshot.screenshot168(driver, extentreport);
			System.out.println(PatnershipFirm);
			test.log(Status.WARNING, PatnershipFirm);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot168.png",
					"PatnershipFirm Onboarding failed").build());
		}
	}
	
	
	
	
	//MSME Registration
	
	
	
	

	public void MSMERegistration(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("MSMERegistration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			
			Robot robot = new Robot();
			WebElement element3 = driver.findElement(By.xpath("(//p[contains(text(),'Business Setup')])[1]"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", element3);
			long start = System.currentTimeMillis();
			driver.findElement(By.xpath("(//p[contains(text(),'Licenses & Registrations')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'MSME Registration')])[1]")).click();
			screenshot.screenshot169(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot169.png",
					"MSMERegistration HomePage").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='email'])[1]")));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);
			test.log(Status.PASS, "Talk to CA page redirection" + totalTime);
			Thread.sleep(3000);
			// HelpdeskPageobject.GSTRegistration.click();
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
			if (findElement2.isEnabled()) {
		    	robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
		    }
			findElement2.sendKeys("shakthi" + Date11 + "@yopmail.com");

			WebElement findElement2122 = driver
					.findElement(By.xpath("(//input[@id='phone'])[1]"));
			findElement2122.clear();

			findElement2122.click();
			findElement2122.sendKeys("8056016697");

			Thread.sleep(4000);

			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chen");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);

			long start1 = System.currentTimeMillis();
			screenshot.screenshot170(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot170.png",
					"LeadCreation").build());
			try {
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			}catch (Exception e) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				}
			Thread.sleep(4000);
			
			
			 try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'OTP Verification')]/following-sibling::div[1]/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  
					  }
			
			
			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;

			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(6500);
			test.log(Status.PASS, "Age of Business page redirection" + totalTime);
			screenshot.screenshot171(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot171.png",
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

			screenshot.screenshot172(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot172.png",
					"OTP verification").build());
			Thread.sleep(2500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();

			test.log(Status.PASS, "Pament page Redirection ");
			sendStatusToGoogleChat("MSMERegistration Passed");
			Thread.sleep(3000);
			sendStatusToGoogleChat("Onboarding Automation Ended");
		} catch (Exception MSMERegistration) {
			sendStatusToGoogleChat("MSMERegistration onboarding failed ---------"+MSMERegistration);
			screenshot.screenshot173(driver, extentreport);
			System.out.println(MSMERegistration);
			test.log(Status.WARNING, MSMERegistration);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\Screenshot173.png",
					"MSMERegistration Onboarding failed").build());
		}
	}
	
	
	//PVT self serve
	
	
	public void Pvtselfserve(WebDriver driver)
			throws IOException, InterruptedException, AWTException {
		SimpleDateFormat dateFormat1PrivateLimited = new SimpleDateFormat("wwyyyyhhmm");
		String Date11PrivateLimited = dateFormat1PrivateLimited.format(new Date());
		Robot robot = new Robot();
		sendStatusToGoogleChat("QE Automation for Self serve flow");
		//------------------------------------------------------------------Get Started flow
		
		try {
			
			
			sendStatusToGoogleChat("PVT Self serve Direct flow started");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(3000);
			driver.get("https://qe.vakilsearch.com/selfserve-company-registration");
			Thread.sleep(5000);
			
			//-----------------------------------------T&C
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'T&C')])[1]"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//img[@alt='close'])[2]")).click();
			Thread.sleep(4000);
			
			
			//-----------------------------------------Video
			
			driver.findElement(By.xpath("//img[@alt='banner']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//b[contains(text(),'x')])[1]")).click();
			Thread.sleep(4000);
			
			//-----------------------------------------Get started
			
			
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			
			
			//-------------------------------------------------Onboarding
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='styles_inputBox__RUknH']")));  //company name
			driver.findElement(By.xpath("//input[@class='styles_inputBox__RUknH']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='styles_inputBox__RUknH']")).sendKeys("Test");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//div[@class=' css-133ib9g-control']")).click();
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));	
			WebElement findElement3 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			findElement3.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver
					.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
			findElement2122.click();
			findElement2122.sendKeys("8056016697" );
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@placeholder='City/Pincode']")).sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
			Thread.sleep(4000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'Please enter the OTP sent to your mobile number')]/following-sibling::div[1]/child::div/child::div/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e) {
					  
					  Thread.sleep(5000); 
				  }
		 
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(60000);
			
			//--------------------------------------------------------------------Bundle screen
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Copy to unlock')]"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='close']")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			
			sendStatusToGoogleChat("PVT Self serve Direct flow Passed");
			Thread.sleep(3000);
	         
			
			((JavascriptExecutor) driver).executeScript("window.open()");
			 Set<String> windowHandles = driver.getWindowHandles();
	            List<String> tabs = new ArrayList<String>(windowHandles);
			 driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);
			
			
			
			
			
			//-------------------------------------------Bundle flow
			
			
			
			
			
			
			
			sendStatusToGoogleChat("PVT Self serve Bundle flow started");
			Thread.sleep(3000);
			driver.get("https://qe.vakilsearch.com/selfserve-company-registration");
			Thread.sleep(5000);
			
			
			//--------------------View package
			
			driver.findElement(By.xpath("(//button[contains(text(),'View Package')])[1]")).click();
			Thread.sleep(5000);
			
			
			//---------------------Bundle packages
			
			driver.findElement(By.xpath("//p[contains(text(),'Click here to know more')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@alt='close'])[2]")).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='relative']"))).click();   
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[6]")).click();
			Thread.sleep(5000);
			
			//---------------------Onboarding- 2
			
		
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();  //step1
			Thread.sleep(6000);
			
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();  //step2
			Thread.sleep(5000);
			
			
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();  //step3
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();  //otp screen
			Thread.sleep(4000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'Please enter the OTP sent to your mobile number')]/following-sibling::div[1]/child::div/child::div/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e) {
					  
					  Thread.sleep(5000); 
				  }
		 
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(5000);
			
			
			//-------------------------------------Pre-bundle
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Change plan')]")));
			driver.findElement(By.xpath("//button[contains(text(),'Change plan')]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
            Thread.sleep(5000);
			sendStatusToGoogleChat("PVT Self serve Bundle flow Passed");
			Thread.sleep(3000);
			
			
			
			
			
			
		} catch (Exception e) {
			
			sendStatusToGoogleChat("PVT Self serve Failed" +  e);
			
			
		}
	
	}
	
	
	
	
	
	
	
	//TM self serve
	
	
	public void TMselfserve(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)throws InterruptedException, AWTException, IOException {
		SimpleDateFormat dateFormat1TrademarkRegistration = new SimpleDateFormat("mmwwyyyyhhmm");
		String Date1TrademarkRegistration = dateFormat1TrademarkRegistration.format(new Date());
		Robot robot = new Robot();
		test = extentreport.createTest("TM Self Serve");
		
		try {
			
			try {
			sendStatusToGoogleChat("TM Self serve Direct flow started");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Thread.sleep(3000);
			driver.get("https://qe.vakilsearch.com/selfserve-trademark-registration");
			Thread.sleep(5000);
			
			//-----------------------------------------T&C
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'File your ™ in just 6 hours using our quick and secured platform')]/child::span"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
			Thread.sleep(4000);
			
                //-----------------------------------------Video
			
			driver.findElement(By.xpath("//img[@alt='video banner']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//b[contains(text(),'x')])[2]")).click();
			Thread.sleep(4000);
			
			
			//----------------------------Why you need Ip expert
			
			driver.findElement(By.xpath("//p[contains(text(),'Why do you need an IP expert to file ™ in just 6 hrs?')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//img[@alt='close'])[2]")).click();
			Thread.sleep(4000);
			
			
           //-----------------------------------------Get started
			
			
			WebElement element300119 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[1]"));
			JavascriptExecutor executor300119 = (JavascriptExecutor) driver;
			executor300119.executeScript("arguments[0].click();", element300119);
			
			//------------------------------------------Onboarding
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[contains(text(),'Cosmetics Industry')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(5000);
			
			try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));	
			WebElement findElement3 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			findElement3.sendKeys("shakthi" + Date11 + "@yopmail.com");
			WebElement findElement2122 = driver
					.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
			findElement2122.click();
			findElement2122.sendKeys("91" +Date11 );
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@placeholder='City/Pincode']")).sendKeys("chen");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//li[contains(text(),'Chennai, Tamilnadu')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			}catch(Exception e) {
				
				
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
				
			}
			
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
			Thread.sleep(4000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'Please enter the OTP sent to your mobile number')]/following-sibling::div[1]/child::div/child::div/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e) {
					  
					  Thread.sleep(5000); 
				  }
		 
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(60000);
			
			
			
             //--------------------------------------------------------------------Bundle screen
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Copy to unlock')]"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='close']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[2]")).click();
			Thread.sleep(3000);
			sendStatusToGoogleChat("TM Self serve Direct flow Passed");
			Thread.sleep(5000);
	         
			
			((JavascriptExecutor) driver).executeScript("window.open()");
			 Set<String> windowHandles = driver.getWindowHandles();
	            List<String> tabs = new ArrayList<String>(windowHandles);
			 driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);

            }catch(Exception e) {
            	((JavascriptExecutor) driver).executeScript("window.open()");
   			 Set<String> windowHandles = driver.getWindowHandles();
   	            List<String> tabs = new ArrayList<String>(windowHandles);
   			 driver.switchTo().window(tabs.get(1));
   			Thread.sleep(5000);
            	sendStatusToGoogleChat("TM Self serve Direct flow Failed" + e);
				
			}
			
			
			
			
			
			
			
			
			
			
			//-------------------------------------------10% offer flow
			
			
			
			try {
			sendStatusToGoogleChat("TM Self serve 10% offer flow started");
			Thread.sleep(3000);
			driver.get("https://qe.vakilsearch.com/selfserve-trademark-registration");
			Thread.sleep(65000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Avail and Proceed')]")).click();   //----------------------------10% offer
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); //step1
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); //step2
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();  //step3
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();  //otp screen
			Thread.sleep(4000);
			try {
				for (int i = 1; i < 7; i++) {
				
				driver.findElement(By.xpath("//p[contains(text(),'Please enter the OTP sent to your mobile number')]/following-sibling::div[1]/child::div/child::div/child::input["+i+"]")).sendKeys("0");
				}
				
				Thread.sleep(5000);
				  } catch (Exception e) {
					  
					  Thread.sleep(5000); 
				  }
		 
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(5000);
			
			//Bundle page2
			
			
			driver.findElement(By.xpath("//p[contains(text(),'Attorney-Led Registration')]")).click();
			Thread.sleep(5000);		
			driver.findElement(By.xpath("//span[contains(text(),'View details')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='close']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'Proceed to pay')]")).click();
			
			
			sendStatusToGoogleChat("TM Self serve 10% offer flow Passed");
			Thread.sleep(3000);
	         
			
			((JavascriptExecutor) driver).executeScript("window.open()");
			 Set<String> windowHandles2 = driver.getWindowHandles();
	            List<String> tabs2 = new ArrayList<String>(windowHandles2);
			 driver.switchTo().window(tabs2.get(2));
			Thread.sleep(5000);
			
			}catch(Exception e) {
				((JavascriptExecutor) driver).executeScript("window.open()");
				 Set<String> windowHandles2 = driver.getWindowHandles();
		            List<String> tabs2 = new ArrayList<String>(windowHandles2);
				 driver.switchTo().window(tabs2.get(2));
				Thread.sleep(5000);
				sendStatusToGoogleChat("TM Self serve 10% offer flow Failed" + e);
				Thread.sleep(3000);
			}
			
			
			
			
			
			
			
			
			//---------------------------Bundle flow
			   try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
			    sendStatusToGoogleChat("TM Self serve Bundle flow started");
			    Thread.sleep(3000);
			    driver.get("https://qe.vakilsearch.com/selfserve-trademark-registration");
			    Thread.sleep(5000);
				driver.findElement(By.xpath("//p[contains(text(),'View pricing packages')]")).click();
				Thread.sleep(5000);
				WebElement element3001191 = driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[4]"));
				JavascriptExecutor executor3001191 = (JavascriptExecutor) driver;
				executor3001191.executeScript("arguments[0].click();", element3001191);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); //step1
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); //step2
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();  //step3
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();  //otp screen
				Thread.sleep(4000);
				try {
					for (int i = 1; i < 7; i++) {
					
					driver.findElement(By.xpath("//p[contains(text(),'Please enter the OTP sent to your mobile number')]/following-sibling::div[1]/child::div/child::div/child::input["+i+"]")).sendKeys("0");
					}
					
					Thread.sleep(5000);
					  } catch (Exception e) {
						  
						  Thread.sleep(5000); 
					  }
			 
				driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
				Thread.sleep(5000);
				
				
				//Pre bundle
				
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Change plan')]")));
				driver.findElement(By.xpath("//button[contains(text(),'Change plan')]")).click();
				Thread.sleep(5000);
				driver.navigate().back();
				driver.navigate().back();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	            Thread.sleep(5000);
				sendStatusToGoogleChat("TM Self serve Bundle flow Passed");
				Thread.sleep(3000);	
			}catch(Exception e) {
				
				sendStatusToGoogleChat("TM Self serve Bundle flow Failed" + e);
				Thread.sleep(3000);
				
			}
			
						
			
		}catch(Exception e) {
			
			sendStatusToGoogleChat("TM Self serve flow Failed" + e);
	
			
		}
		
		sendStatusToGoogleChat("QE Automation for Self serve flow ended");	
		
	}
	
	
	
	
	
	
	//Gchat status
	
	
	private static void sendStatusToGoogleChat(String message) {
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
	
	private static void findAndSelectValueByPartialText(final WebDriver driver, String xpath, String value) throws Exception {
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
	private static Boolean isElementClickable(final WebDriver driver, String xpath) {
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
	
	private static void clickElementByJS(final WebDriver driver, String elementPath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(By.xpath(elementPath));
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		js.executeScript("arguments[0].click();", targetElement);
	}
	public static void FindAndAddElementByJS(final WebDriver driver, String elementPath,String input) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(By.xpath(elementPath));
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		
	
		targetElement.sendKeys(input);
	}
}


