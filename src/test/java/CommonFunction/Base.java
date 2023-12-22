package CommonFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


import PageFactory.HelpdeskPageobject;
import PageFactory.HomescreenPageobject;
import PageFactory.LoginPageobjects;

public class Base extends HelpdeskPageobject {

	ExtentTest test;

	ScreenShot screenshot = new ScreenShot();
	SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyHHMMSSSS");
	String Date11 = dateFormat1.format(new Date());
	SimpleDateFormat dateFormat2 = new SimpleDateFormat("wwyyyyhh");
	String Date12 = dateFormat2.format(new Date());

	public void Base1(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
	//	test = extentreport.createTest("Vakilsearch website landing");
		WebDriverWait wait = new WebDriverWait(driver, 30);
	
	
		try {
			driver.get("https://vakilsearch.com/");
		}catch(Exception Excp){
				Thread.sleep(3600);
				driver.switchTo().alert().dismiss();
				Thread.sleep(2500);
				driver.findElement(By.xpath("(//button[contains(text(),'Back')])[3]")).click();
				driver.switchTo().alert().dismiss();
				driver.get("https://vakilsearch.com/");
		}
//		PageFactory.initElements(driver, LoginPageobjects.class);
//		if (driver.getTitle() != "Online Legal Services for Startups & SMEs in India | Vakil Search") {
//			test.log(Status.PASS, "VakilSearchURL launched");
//
//		} else {
//
//			test.log(Status.FAIL, "VakilSearchURL");
//		}
	}
	public void BaseQE(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		test = extentreport.createTest("Vakilsearch website landing");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			driver.get("https://qe.vakilsearch.com/");
			}catch(Exception alert1){
				driver.switchTo().alert().accept();
				driver.get("https://qe.vakilsearch.com/");
			}

//		PageFactory.initElements(driver, LoginPageobjects.class);
//		if (driver.getTitle() != "Online Legal Services for Startups & SMEs in India | Vakil Search") {
//			test.log(Status.PASS, "VakilSearchURL launched");
//
//		} else {
//
//			test.log(Status.FAIL, "VakilSearchURL");
//		}
	}
}
