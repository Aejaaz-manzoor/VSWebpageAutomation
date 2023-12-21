package CommonFunction;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
  
public class ScreenShot {
	ExtentTest test;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());

	public void screenshot1(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot1 = ((TakesScreenshot) driver);
		File srcFile1 = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot1.png"));
	}

	public void screenshot2(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot1 = ((TakesScreenshot) driver);
		File srcFile1 = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot2.png"));
	}

	public void screenshot3(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot3 = ((TakesScreenshot) driver);
		File srcFile3 = screenshot3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile3,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot3.png"));

	}

	public void screenshot4(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot4 = ((TakesScreenshot) driver);
		File srcFile4 = screenshot4.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile4,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot4.png"));

	}

	public void screenshot5(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot5 = ((TakesScreenshot) driver);
		File srcFile5 = screenshot5.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile5,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot5.png"));

	}

	public void screenshot6(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot6 = ((TakesScreenshot) driver);
		File srcFile6 = screenshot6.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile6,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot6.png"));

	}

	public void screenshot7(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot7 = ((TakesScreenshot) driver);
		File srcFile7 = screenshot7.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile7,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot7.png"));

	}

	public void screenshot8(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot8 = ((TakesScreenshot) driver);
		File srcFile8 = screenshot8.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile8,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot8.png"));

	}

	public void screenshot9(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot9 = ((TakesScreenshot) driver);
		File srcFile9 = screenshot9.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile9,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot9.png"));

	}

	public void screenshot10(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot10 = ((TakesScreenshot) driver);
		File srcFile10 = screenshot10.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile10,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot10.png"));

	}

	public void screenshot11(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot11 = ((TakesScreenshot) driver);
		File srcFile11 = screenshot11.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile11,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" 
						+ Date1 + "\\\\Screenshot11.png"));

	}

	public void screenshot12(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot12 = ((TakesScreenshot) driver);
		File srcFile12 = screenshot12.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile12,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot12.png"));

	}

	public void screenshot13(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot13 = ((TakesScreenshot) driver);
		File srcFile13 = screenshot13.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile13,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot13.png"));

	}

	public void screenshot14(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot14 = ((TakesScreenshot) driver);
		File srcFile14 = screenshot14.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile14,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot14.png"));

	}

	public void screenshot15(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot15 = ((TakesScreenshot) driver);
		File srcFile15 = screenshot15.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile15,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot15.png"));

	}

	public void screenshot16(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot16 = ((TakesScreenshot) driver);
		File srcFile16 = screenshot16.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile16,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot16.png"));

	}

	public void screenshot17(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot17 = ((TakesScreenshot) driver);
		File srcFile17 = screenshot17.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile17,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot17.png"));

	}

	public void screenshot18(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot18 = ((TakesScreenshot) driver);
		File srcFile18 = screenshot18.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile18,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot18.png"));

	}

	public void screenshot19(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot19 = ((TakesScreenshot) driver);
		File srcFile19 = screenshot19.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile19,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot19.png"));

	}

	public void screenshot20(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot20 = ((TakesScreenshot) driver);
		File srcFile20 = screenshot20.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile20,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot20.png"));

	}
	public void screenshot21(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot21 = ((TakesScreenshot) driver);
		File srcFile21 = screenshot21.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile21,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" 
						+ Date1 + "\\\\Screenshot21.png"));

	}

	public void screenshot22(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot22 = ((TakesScreenshot) driver);
		File srcFile22 = screenshot22.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile22,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot22.png"));

	}

	public void screenshot23(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot23 = ((TakesScreenshot) driver);
		File srcFile23 = screenshot23.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile23,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot23.png"));

	}

	public void screenshot24(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot24 = ((TakesScreenshot) driver);
		File srcFile24 = screenshot24.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile24,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot24.png"));

	}

	public void screenshot25(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot25 = ((TakesScreenshot) driver);
		File srcFile25 = screenshot25.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile25,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot25.png"));

	}

	public void screenshot26(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot26 = ((TakesScreenshot) driver);
		File srcFile26 = screenshot26.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile26,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"  + Date1
						+ "\\Screenshot26.png"));

	}

	public void screenshot27(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot27 = ((TakesScreenshot) driver);
		File srcFile27 = screenshot27.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile27,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot27.png"));

	}

	public void screenshot28(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot28 = ((TakesScreenshot) driver);
		File srcFile28 = screenshot28.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile28,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot28.png"));

	}

	public void screenshot29(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot29 = ((TakesScreenshot) driver);
		File srcFile29 = screenshot29.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile29,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot29.png"));

	}

	public void screenshot30(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot30 = ((TakesScreenshot) driver);
		File srcFile30 = screenshot30.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile30,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot30.png"));

	}
	public void screenshot31(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot31 = ((TakesScreenshot) driver);
		File srcFile31 = screenshot31.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile31,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
						+ Date1 + "\\\\Screenshot31.png"));

	}

	public void screenshot32(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot32 = ((TakesScreenshot) driver);
		File srcFile32 = screenshot32.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile32,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot32.png"));

	}

	public void screenshot33(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot33 = ((TakesScreenshot) driver);
		File srcFile33 = screenshot33.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile33,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot33.png"));

	}

	public void screenshot34(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot34 = ((TakesScreenshot) driver);
		File srcFile34 = screenshot34.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile34,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot34.png"));

	}

	public void screenshot35(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot35 = ((TakesScreenshot) driver);
		File srcFile35 = screenshot35.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile35,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot35.png"));

	}

	public void screenshot36(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot36 = ((TakesScreenshot) driver);
		File srcFile36 = screenshot36.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile36,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot36.png"));

	}

	public void screenshot37(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot37 = ((TakesScreenshot) driver);
		File srcFile37 = screenshot37.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile37,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot37.png"));

	}

	public void screenshot38(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot38 = ((TakesScreenshot) driver);
		File srcFile38 = screenshot38.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile38,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot38.png"));

	}

	public void screenshot39(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot39 = ((TakesScreenshot) driver);
		File srcFile39 = screenshot39.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile39,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot39.png"));

	}

	public void screenshot40(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot40 = ((TakesScreenshot) driver);
		File srcFile40 = screenshot40.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile40,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot40.png"));


	}
	public void screenshot41(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot41 = ((TakesScreenshot) driver);
		File srcFile41 = screenshot41.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile41,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\"
						+ Date1 + "\\\\Screenshot41.png"));

	}

	public void screenshot42(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot42 = ((TakesScreenshot) driver);
		File srcFile42 = screenshot42.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile42,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot42.png"));

	}

	public void screenshot43(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot43 = ((TakesScreenshot) driver);
		File srcFile43 = screenshot43.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile43,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot43.png"));

	}

	public void screenshot44(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot44 = ((TakesScreenshot) driver);
		File srcFile44 = screenshot44.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile44,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot44.png"));

	}

	public void screenshot45(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot45 = ((TakesScreenshot) driver);
		File srcFile45 = screenshot45.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile45,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot45.png"));

	}

	public void screenshot46(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot46 = ((TakesScreenshot) driver);
		File srcFile46 = screenshot46.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile46,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot46.png"));

	}

	public void screenshot47(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot47 = ((TakesScreenshot) driver);
		File srcFile47 = screenshot47.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile47,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot47.png"));

	}

	public void screenshot48(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot48 = ((TakesScreenshot) driver);
		File srcFile48 = screenshot48.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile48,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot48.png"));

	}

	public void screenshot49(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot49 = ((TakesScreenshot) driver);
		File srcFile49 = screenshot49.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile49,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot49.png"));

	}

	public void screenshot50(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot50 = ((TakesScreenshot) driver);
		File srcFile50 = screenshot50.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile50,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot50.png"));

	}
	public void screenshot51(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot51 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot51.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot51.png"));

	}
	public void screenshot52(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot52 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot52.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot52.png"));

	}public void screenshot53(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot53 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot53.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot53.png"));

	}public void screenshot54(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot54 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot54.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot54.png"));

	}public void screenshot55(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot55 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot55.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot55.png"));

	}public void screenshot56(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot56 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot56.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot56.png"));

	}public void screenshot57(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot57 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot57.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot57.png"));

	}public void screenshot58(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot58 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot58.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot58.png"));

	}public void screenshot59(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot59 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot59.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot59.png"));

	}public void screenshot60(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot60 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot60.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot60.png"));

	}public void screenshot61(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot61 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot61.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot61.png"));

	}public void screenshot62(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot62 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot62.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot62.png"));

	}public void screenshot63(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot63 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot63.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot63.png"));

	}public void screenshot64(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot64 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot64.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot64.png"));

	}public void screenshot65(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot65 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot65.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot65.png"));

	}public void screenshot66(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot66 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot66.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot66.png"));

	}public void screenshot67(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot67 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot67.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot67.png"));

	}public void screenshot68(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot68 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot68.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot68.png"));

	}public void screenshot69(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot69 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot69.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot69.png"));

	}public void screenshot70(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot70 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot70.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot70.png"));

	}public void screenshot71(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot71 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot71.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot71.png"));

	}public void screenshot72(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot72 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot72.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot72.png"));

	}public void screenshot73(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot73 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot73.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot73.png"));

	}public void screenshot74(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot74 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot74.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot74.png"));

	}public void screenshot75(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot75 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot75.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot75.png"));

	}public void screenshot76(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot76 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot76.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot76.png"));

	}public void screenshot77(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot77 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot77.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot77.png"));

	}public void screenshot78(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot78 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot78.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot78.png"));

	}public void screenshot79(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot79 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot79.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot79.png"));

	}public void screenshot80(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot80 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot80.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot80.png"));

	}public void screenshot81(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot81 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot81.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot81.png"));

	}public void screenshot82(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot82 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot82.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot82.png"));

	}public void screenshot83(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot83 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot83.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot83.png"));

	}public void screenshot84(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot84 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot84.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot84.png"));

	}public void screenshot85(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot85 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot85.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot85.png"));

	}public void screenshot86(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot86 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot86.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot86.png"));

	}public void screenshot87(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot87 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot87.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot87.png"));

	}public void screenshot88(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot88 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot88.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot88.png"));

	}public void screenshot89(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot89 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot89.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot89.png"));

	}public void screenshot90(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot90 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot90.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot90.png"));

	}public void screenshot91(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot91 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot91.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot91.png"));

	}public void screenshot92(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot92 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot92.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot92.png"));

	}public void screenshot93(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot93 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot93.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot93.png"));

	}public void screenshot94(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot94 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot94.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot94.png"));

	}public void screenshot95(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot95 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot95.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot95.png"));

	}public void screenshot96(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot96 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot96.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot96.png"));

	}public void screenshot97(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot97 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot97.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot97.png"));

	}public void screenshot98(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot98 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot98.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot98.png"));

	}public void screenshot99(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot99 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot99.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot99.png"));

	}public void screenshot100(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot100 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot100.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot100.png"));

	}public void screenshot101(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot101 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot101.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot101.png"));

	}public void screenshot102(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot102 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot102.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot102.png"));

	}public void screenshot103(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot103 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot103.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot103.png"));

	}public void screenshot104(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot104 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot104.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot104.png"));

	}public void screenshot105(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot105 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot105.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot105.png"));

	}public void screenshot106(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot106 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot106.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot106.png"));

	}
	public void screenshot107(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot107 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot107.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot107.png"));

	}public void screenshot108(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot108 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot108.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot108.png"));

	}public void screenshot109(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot109 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot109.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot109.png"));

	}public void screenshot110(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot110 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot110.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot110.png"));

	}public void screenshot111(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot111 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot111.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot111.png"));

	}public void screenshot112(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot112 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot112.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot112.png"));

	}public void screenshot113(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot113 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot113.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot113.png"));

	}public void screenshot114(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot114 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot114.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot114.png"));

	}public void screenshot115(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot115 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot115.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot115.png"));

	}public void screenshot116(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot116 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot116.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot116.png"));

	}public void screenshot117(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot117 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot117.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot117.png"));

	}public void screenshot118(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot118 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot118.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot118.png"));

	}public void screenshot119(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot119 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot119.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot119.png"));

	}public void screenshot120(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot120 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot120.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot120.png"));

	}public void screenshot121(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot121 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot121.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot121.png"));

	}public void screenshot122(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot122 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot122.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot122.png"));

	}public void screenshot123(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot123 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot123.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot123.png"));

	}public void screenshot124(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot124 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot124.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot124.png"));

	}public void screenshot125(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot125 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot125.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot125.png"));

	}public void screenshot126(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot126 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot126.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot126.png"));

	}public void screenshot127(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot127 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot127.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot127.png"));

	}public void screenshot128(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot128 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot128.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot128.png"));
 
	}public void screenshot129(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot129 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot129.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot129.png"));

	}public void screenshot130(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot130 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot130.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
						+ "\\Screenshot130.png"));

	

	}
	
}
