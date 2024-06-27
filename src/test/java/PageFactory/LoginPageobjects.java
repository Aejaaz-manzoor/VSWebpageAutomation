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

	@FindBy(xpath = "//div[@class='react-switch-handle']")
	public static WebElement whatsapptogleoff;
	
	@FindBy(xpath = "(//input[@inputmode='numeric'])[2]")
	public static WebElement OTPtextbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter your company name']")
	public static WebElement Newbusinesstextbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter your industry (e.g.food, E-commerce)']")
	public static WebElement GSTIndustrytypetextbox ;
	
	
	@FindBy(xpath = "//li[contains(text(),'Software Industry')]")
	public static WebElement Industrytype;
	
	@FindBy(xpath = "//div[@class='styles_yellowBundleuttonContainer__i9kb0']/button")
	public static WebElement Paymentbundle;
	
	@FindBy(xpath = "//img[@alt='gpay']")
	public static WebElement Gpay;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	public static WebElement Mobileno;
	
	
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Paymentsubmit;
	
	
	@FindBy(xpath = "//input[@class='styles_inputField__Fr_mS']")
	public static WebElement PVTCompanyname ;
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter your industry (e.g.food, E-commerce)'])[1]")
	public static WebElement FillingsIndustrytypetextbox ;
	
	
	
	@FindBy(xpath = "//input[@id='yes']")
	public static WebElement Consultforbusiness;
	
	
	@FindBy(xpath = "//textarea[@name='additionalDetails']")
	public static WebElement Additinalinfo;
	
	
	@FindBy(xpath = "(//button[contains(text(),'Make Payment')])[1]")
	public static WebElement Makepayment;
	
	
	@FindBy(xpath = "(//button[contains(text(),'Confirm')])[1]")
	public static WebElement Confirmpayment;
	
	
	@FindBy(xpath = "//button[@method='upi']")
	public static WebElement Razorupi;
		
	
	@FindBy(xpath = "(//div[contains(text(),'UPI ID/ Mobile Number')])[2]")
	public static WebElement Razormobno;
	
	
	@FindBy(xpath = "//label[contains(text(),'UPI ID/ Mobile Number')]")
	public static WebElement Razorentermobno;
	
	@FindBy(xpath = "//button[contains(text(),'Pay Now')]")
	public static WebElement Razorpaynow;
	
	@FindBy(xpath = "//input[@placeholder='City/Pincode']")
	public static WebElement Fssaicity;
	
	@FindBy(xpath = "//li[contains(text(),'Chennai, Tamilnadu')]")
	public static WebElement Fssaicityselect;
	
//	@FindBy(xpath = "")
//	public static WebElement ;
	
//	@FindBy(xpath = "")
//	public static WebElement ;
	
		
	
	@FindBy(xpath = "//span[contains(text(),'Not yet started')]")
	public static WebElement Ageofbusiness;
	

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



}
