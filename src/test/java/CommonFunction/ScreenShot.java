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

	public void screenshot131(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot131 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot131.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot131.png"));
	}

	public void screenshot132(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot132 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot132.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot132.png"));
	}

	public void screenshot133(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot133 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot133.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot133.png"));
	}

	public void screenshot134(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot134 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot134.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot134.png"));
	}

	public void screenshot135(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot135 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot135.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot135.png"));
	}

	public void screenshot136(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot136 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot136.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot136.png"));
	}

	public void screenshot137(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot137 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot137.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot137.png"));
	}

	public void screenshot138(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot138 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot138.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot138.png"));
	}

	public void screenshot139(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot139 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot139.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot139.png"));
	}

	public void screenshot140(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot140 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot140.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot140.png"));
	}

	public void screenshot141(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot141 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot141.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot141.png"));
	}

	public void screenshot142(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot142 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot142.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot142.png"));
	}

	public void screenshot143(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot143 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot143.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot143.png"));
	}

	public void screenshot144(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot144 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot144.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot144.png"));
	}

	public void screenshot145(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot145 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot145.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot145.png"));
	}

	public void screenshot146(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot146 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot146.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot146.png"));
	}

	public void screenshot147(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot147 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot147.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot147.png"));
	}

	public void screenshot148(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot148 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot148.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot148.png"));
	}

	public void screenshot149(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot149 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot149.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot149.png"));
	}

	public void screenshot150(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot150 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot150.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot150.png"));
	}

	public void screenshot151(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot151 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot151.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot151.png"));
	}

	public void screenshot152(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot152 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot152.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot152.png"));
	}

	public void screenshot153(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot153 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot153.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot153.png"));
	}

	public void screenshot154(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot154 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot154.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot154.png"));
	}

	public void screenshot155(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot155 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot155.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot155.png"));
	}

	public void screenshot156(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot156 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot156.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot156.png"));
	}

	public void screenshot157(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot157 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot157.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot157.png"));
	}

	public void screenshot158(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot158 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot158.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot158.png"));
	}

	public void screenshot159(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot159 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot159.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot159.png"));
	}

	public void screenshot160(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot160 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot160.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot160.png"));
	}

	public void screenshot161(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot161 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot161.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot161.png"));
	}

	public void screenshot162(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot162 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot162.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot162.png"));
	}

	public void screenshot163(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot163 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot163.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot163.png"));
	}

	public void screenshot164(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot164 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot164.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot164.png"));
	}

	public void screenshot165(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot165 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot165.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot165.png"));
	}

	public void screenshot166(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot166 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot166.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot166.png"));
	}

	public void screenshot167(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot167 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot167.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot167.png"));
	}

	public void screenshot168(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot168 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot168.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot168.png"));
	}

	public void screenshot169(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot169 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot169.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot169.png"));
	}

	public void screenshot170(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot170 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot170.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot170.png"));
	}

	public void screenshot171(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot171 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot171.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot171.png"));
	}

	public void screenshot172(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot172 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot172.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot172.png"));
	}

	public void screenshot173(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot173 = ((TakesScreenshot) driver);
	    File srcFile51 = screenshot173.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile51,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot173.png"));
	}

	public void screenshot174(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot174 = ((TakesScreenshot) driver);
	    File srcFile174 = screenshot174.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile174,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot174.png"));
	}

	public void screenshot175(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot175 = ((TakesScreenshot) driver);
	    File srcFile175 = screenshot175.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile175,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot175.png"));
	}

	public void screenshot176(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot176 = ((TakesScreenshot) driver);
	    File srcFile176 = screenshot176.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile176,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot176.png"));
	}

	public void screenshot177(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot177 = ((TakesScreenshot) driver);
	    File srcFile177 = screenshot177.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile177,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot177.png"));
	}

	public void screenshot178(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot178 = ((TakesScreenshot) driver);
	    File srcFile178 = screenshot178.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile178,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot178.png"));
	}

	public void screenshot179(WebDriver driver, ExtentReports extentreport) throws IOException {    //------------------Till here
	    TakesScreenshot screenshot179 = ((TakesScreenshot) driver);
	    File srcFile179 = screenshot179.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile179,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot179.png"));
	}

	public void screenshot180(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot180 = ((TakesScreenshot) driver);
	    File srcFile180 = screenshot180.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile180,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot180.png"));
	}

	public void screenshot181(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot181 = ((TakesScreenshot) driver);
	    File srcFile181 = screenshot181.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile181,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot181.png"));
	}

	public void screenshot182(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot182 = ((TakesScreenshot) driver);
	    File srcFile182 = screenshot182.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile182,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot182.png"));
	}

	public void screenshot183(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot183 = ((TakesScreenshot) driver);
	    File srcFile183 = screenshot183.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile183,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot183.png"));
	}

	public void screenshot184(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot184 = ((TakesScreenshot) driver);
	    File srcFile184 = screenshot184.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile184,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot184.png"));
	}

	public void screenshot185(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot185 = ((TakesScreenshot) driver);
	    File srcFile185 = screenshot185.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile185,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot185.png"));
	}

	public void screenshot186(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot186 = ((TakesScreenshot) driver);
	    File srcFile186 = screenshot186.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile186,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot186.png"));
	}

	public void screenshot187(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot187 = ((TakesScreenshot) driver);
	    File srcFile187 = screenshot187.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile187,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot187.png"));
	}

	public void screenshot188(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot188 = ((TakesScreenshot) driver);
	    File srcFile188 = screenshot188.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile188,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot188.png"));
	}

	public void screenshot189(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot189 = ((TakesScreenshot) driver);
	    File srcFile189 = screenshot189.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile189,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot189.png"));
	}

	public void screenshot190(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot190 = ((TakesScreenshot) driver);
	    File srcFile190 = screenshot190.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile190,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot190.png"));
	}

	public void screenshot191(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot191 = ((TakesScreenshot) driver);
	    File srcFile191 = screenshot191.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile191,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot191.png"));
	}

	public void screenshot192(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot192 = ((TakesScreenshot) driver);
	    File srcFile192 = screenshot192.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile192,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot192.png"));
	}

	public void screenshot193(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot193 = ((TakesScreenshot) driver);
	    File srcFile193 = screenshot193.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile193,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot193.png"));
	}

	public void screenshot194(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot194 = ((TakesScreenshot) driver);
	    File srcFile194 = screenshot194.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile194,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot194.png"));
	}

	public void screenshot195(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot195 = ((TakesScreenshot) driver);
	    File srcFile195 = screenshot195.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile195,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot195.png"));
	}

	public void screenshot196(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot196 = ((TakesScreenshot) driver);
	    File srcFile196 = screenshot196.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile196,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot196.png"));
	}

	public void screenshot197(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot197 = ((TakesScreenshot) driver);
	    File srcFile197 = screenshot197.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile197,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot197.png"));
	}

	public void screenshot198(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot198 = ((TakesScreenshot) driver);
	    File srcFile198 = screenshot198.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile198,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot198.png"));
	}

	public void screenshot199(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot199 = ((TakesScreenshot) driver);
	    File srcFile199 = screenshot199.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile199,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot199.png"));
	}

	public void screenshot200(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot200 = ((TakesScreenshot) driver);
	    File srcFile200 = screenshot200.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile200,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot200.png"));
	}

	public void screenshot201(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot201 = ((TakesScreenshot) driver);
	    File srcFile201 = screenshot201.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile201,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot201.png"));
	}

	public void screenshot202(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot202 = ((TakesScreenshot) driver);
	    File srcFile202 = screenshot202.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile202,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot202.png"));
	}

	public void screenshot203(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot203 = ((TakesScreenshot) driver);
	    File srcFile203 = screenshot203.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile203,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot203.png"));
	}

	public void screenshot204(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot204 = ((TakesScreenshot) driver);
	    File srcFile204 = screenshot204.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile204,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot204.png"));
	}

	public void screenshot205(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot205 = ((TakesScreenshot) driver);
	    File srcFile205 = screenshot205.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile205,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot205.png"));
	}

	public void screenshot206(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot206 = ((TakesScreenshot) driver);
	    File srcFile206 = screenshot206.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile206,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot206.png"));
	}

	public void screenshot207(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot207 = ((TakesScreenshot) driver);
	    File srcFile207 = screenshot207.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile207,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot207.png"));
	}

	public void screenshot208(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot208 = ((TakesScreenshot) driver);
	    File srcFile208 = screenshot208.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile208,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot208.png"));
	}

	public void screenshot209(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot209 = ((TakesScreenshot) driver);
	    File srcFile209 = screenshot209.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile209,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot209.png"));
	}

	public void screenshot210(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot210 = ((TakesScreenshot) driver);
	    File srcFile210 = screenshot210.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile210,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot210.png"));
	}

	public void screenshot211(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot211 = ((TakesScreenshot) driver);
	    File srcFile211 = screenshot211.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile211,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot211.png"));
	}

	public void screenshot212(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot212 = ((TakesScreenshot) driver);
	    File srcFile212 = screenshot212.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile212,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot212.png"));
	}

	public void screenshot213(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot213 = ((TakesScreenshot) driver);
	    File srcFile213 = screenshot213.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile213,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot213.png"));
	}

	public void screenshot214(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot214 = ((TakesScreenshot) driver);
	    File srcFile214 = screenshot214.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile214,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot214.png"));
	}

	public void screenshot215(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot215 = ((TakesScreenshot) driver);
	    File srcFile215 = screenshot215.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile215,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot215.png"));
	}

	public void screenshot216(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot216 = ((TakesScreenshot) driver);
	    File srcFile216 = screenshot216.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile216,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot216.png"));
	}

	public void screenshot217(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot217 = ((TakesScreenshot) driver);
	    File srcFile217 = screenshot217.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile217,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot217.png"));
	}

	public void screenshot218(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot218 = ((TakesScreenshot) driver);
	    File srcFile218 = screenshot218.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile218,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot218.png"));
	}

	public void screenshot219(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot219 = ((TakesScreenshot) driver);
	    File srcFile219 = screenshot219.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile219,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot219.png"));
	}

	public void screenshot220(WebDriver driver, ExtentReports extentreport) throws IOException {
	    TakesScreenshot screenshot220 = ((TakesScreenshot) driver);
	    File srcFile220 = screenshot220.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile220,
	            new File("\\\\14.140.167.188\\Vakilsearch\\VSWebPageAutomationTesting\\" + Date1
	                    + "\\Screenshot220.png"));
	}


	
}
