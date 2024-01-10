package LeadCreation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.EmailException;
import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import CommonFunction.Base;
import CommonFunction.Driver;

import CommonFunction.GSTRegistration;
import CommonFunction.ScreenShot;
import CommonFunction.SendMailSSLWithAttachment;
import CommonFunction.slack;
import PageFactory.HomescreenPageobject;
import PageFactory.LoginPageobjects;
import PageFactory.HelpdeskPageobject;
import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Leadcreation {

	ExtentReports extentreport;
	ExtentSparkReporter htmlReporter;
	ExtentTest test;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
	String[][] data = null;

	@DataProvider(name = "itemsdata")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream(
				"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\Items jxl.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet("Sheet5");
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		String testData[][] = new String[rowCount][columnCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				testData[i][j] = sheet.getCell(j, i).getContents();

			}
		}
		System.out.println(testData.toString());
		return testData;

	}

	public WebDriver driver;
	public DesiredCapabilities capabilities;
	public ChromeOptions option;

	@BeforeSuite
	public void Login() throws InterruptedException, AWTException {

		extentreport = new ExtentReports();
		htmlReporter = new ExtentSparkReporter(
				"\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1 + "\\extentreport.html");
		// htmlReporter = new
		// ExtentSparkReporter("C:\\Users\\admit\\git\\Automation-Critical-Flow\\GRCCriticalflow\\Screenshots\\"+Date1+"\\extentreport.html");

		extentreport.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void Max() throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("incognito");
//		option.addArguments("start-maximized");
//		capabilities.setCapability(ChromeOptions.CAPABILITY, option);
//		option.addArguments("--headless");
//		driver = new ChromeDriver(capabilities);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeClass
	public void url() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, HomescreenPageobject.class);
		PageFactory.initElements(driver, HelpdeskPageobject.class);
		Thread.sleep(3000);

	}

	@Test(dataProvider = "itemsdata")
	public void Customercreation100(String Username, String Mobilenumber, String Helpdeskuserid,
			String helpdeskpassword, String notesname, String notedescrption, String QNameOfCustomer, String qaddress,
			String qpincode, String Professionalfees, String assignedtoName, String BDAgentName, String CrossSaleName,
			String GRCMobileNumber, String GRCNewCompanyName, String CINNumber, String CrmUsernames,
			String CrmUserpassword) throws Exception {
		PageFactory.initElements(driver, LoginPageobjects.class);
		ScreenShot screenshot = new ScreenShot();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyHHMMSSSS");
		String Date11 = dateFormat1.format(new Date());
		Base base = new Base();

		GSTRegistration gstregistration = new GSTRegistration();

		base.BaseQE(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.GstRegistration(driver, Username, Mobilenumber, Date11, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.PrivateLimited(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.TrademarkRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.GstFiling(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.TalkToLawyer(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.TalkToCA(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.TalkToCS(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.FSSAI(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.NGO(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.TrustRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.PFRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ESIRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ApplyForNameChange(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ImportExportCode(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.Section8Company(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.MarriageRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ChequeBounceNotice(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.SoleProprietorshipRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ShopandEstablishmentAct(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.LLPPartnershipRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.RespondtoTMObjection(driver, CrmUsernames, GRCMobileNumber, extentreport);
		Thread.sleep(3000);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.PatentRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.ProvisionalPatentRegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.OnepersonCompany(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.PatentSearch(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.PatnershipFirm(driver, CrmUsernames, GRCMobileNumber, extentreport);
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport);
		gstregistration.MSMERegistration(driver, CrmUsernames, GRCMobileNumber, extentreport);

	}

	@AfterClass
	public void close() {
		// driver.close();
		System.out.println("The close_up process is completed");

	}

	@AfterTest
	public void Report() {
		extentreport.flush();

		System.out.println("Test completed");
	}

	@AfterSuite
	public void Mail() throws EmailException, AWTException, InterruptedException, IOException {
		try {
			Robot robot = new Robot();
			String screenshotLocation = "\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
					+ "\\ExtentreportScreenshot.png";
			String extentreportLocation = "\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
					+ "\\extentreport.html";
			String messageInputdata = "Onboarding Automation Test Report";

			SendMailSSLWithAttachment Mail = new SendMailSSLWithAttachment();
			Mail.main(extentreportLocation, messageInputdata, Date1);
			slack slackmsg = new slack();
			slackmsg.slackMessageTest(driver, screenshotLocation, extentreportLocation, messageInputdata);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// Handle exceptions appropriately, log them
			e.printStackTrace();
		} finally {
			// Ensure that driver is quit even if there is an exception
			if (driver != null) {
				driver.quit();
			}

		}

	}
}
