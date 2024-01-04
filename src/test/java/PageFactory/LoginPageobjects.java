package PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginPageobjects extends HomescreenPageobject {
	
	@FindBy(xpath = "(//p[contains(text(),'Business Setup')])[1]")
	public static WebElement Businesssetup;

	@FindBy(xpath = "(//a[contains(text(),'Private Limited Company')])[1]")
	public static WebElement Pvtdcompany;

	@FindBy(xpath = "(//div[@class='clib-relative']/child::input)[3]")
	public static WebElement City;

	@FindBy(xpath = "//span[@class='whatsapp_toggles false']//div[@class='switch_bg bg-success']")
	public static WebElement whatsapptogleoff;

	@FindBy(xpath = "//button[@class='fullwidth btn btn-primary']")
	public static WebElement talktoanexpert;

	@FindBy(xpath = "//button[@class='styles_customBtn__NQoKm styles_next__ckVs9 false false ']")
	public static WebElement Next;

	@FindBy(id = "email")
	public static WebElement Email;

	@FindBy( xpath = "(//p[contains(text(),'Apply for GST Registration')]/following-sibling::input)[2]")
	public static WebElement Phonenumber;

	@FindBy(xpath = "//label[contains(@for,'noexistingBusiness')]")
	public static WebElement Q1newbusiness;

	@FindBy(xpath = "(//div[@class='styles_availableStatus__44C8o'])[2]")
	public static WebElement noidonthaveacompany;

	@FindBy(xpath = "//label[contains(text(),'New business')]")
	public static WebElement noidonthaveacompany1;

	@FindBy(xpath = "//button[@class='styles_customBtn__nb6mV styles_next__NvT8q false']")
	public static WebElement next2;

	@FindBy(xpath = "//p[normalize-space()='Software']")
	public static WebElement Software;

	@FindBy(xpath = "//span[contains(text(),'Not yet started')]")
	public static WebElement Ageofbusiness;

}
