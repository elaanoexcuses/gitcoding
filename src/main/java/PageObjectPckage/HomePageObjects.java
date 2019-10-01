package PageObjectPckage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects extends BaseObjects{
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']")
	private WebElement WomenTab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
	private WebElement DressesTab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']")
	private WebElement TshirtTab;
	
	@FindBy(xpath = "//span[@class='category-name']")
	private WebElement WomenTabNavigated;

	@FindBy(xpath = "//span[@class='category-name']")
	private WebElement DressesTabNavigated;
	
	@FindBy(xpath = "//span[@class='category-name']")
	private WebElement TshirtTabNavigated;
	
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement EmailVerification;
	
	@FindBy(xpath = "//button[@class='btn btn-default button button-small']")
	private WebElement EmailVerificationClick;
	
	@FindBy(xpath = "//p[@class='alert alert-danger']")
	private WebElement EmailVerificationSuccess;
	
	//p[text()=' Newsletter : This email address is already registered.']
	//@FindBy(xpath = "//p[text()=' Newsletter : You have successfully subscribed to this newsletter.']")
	//private WebElement EmailVerificationSuccess1;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_1']")
	private WebElement SizeBoxSDisplay;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_2']")
	private WebElement SizeBoxMDisplay;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
	private WebElement SizeBoxLDisplay;
	
	
	public  HomePageObjects()
	{
	PageFactory.initElements(driver,this);
	}
	
	public boolean iswomentabpresent()
	{
		return elementFound(WomenTab);
		
	}
	public boolean isdresstabpresent()
	{
		return elementFound(DressesTab);
		
	}
	public boolean istshirtstabpresent()
	{
		return elementFound(TshirtTab);
		
	}
	
	public String womentabnavigated()
	{
		WomenTab.click();
		
		if(elementFound(WomenTabNavigated))
		{
			return WomenTabNavigated.getText();
		}
		
		else
		{
			return "";
		}
	}
	public String dressestabnavigated() 
	{
		DressesTab.click();
		
		if(elementFound(DressesTabNavigated))
		{
			return DressesTabNavigated.getText();
		}
		else
		{
			return "";
		}
	}
	
	public String tshirttabnavigated() 
	{
		TshirtTab.click();
		
		if(elementFound(TshirtTabNavigated))
		{
			return TshirtTabNavigated.getText();
		}
		else
		{
			return "";
		}
	}
	
	public void emailverification()
	{
		
		setText(EmailVerification,"ila.noexcuses@gmail.com");
		
		EmailVerificationClick.click();
			
		
	}
	
	public boolean emailverificationsuccess()
	{
		
		return  elementFound(EmailVerificationSuccess);
	}
	
	/*public String emailverificationsuccess()
	{
		
		 if (elementFound(EmailVerificationSuccess))
		{
			return EmailVerificationSuccess.getText();
		}
		
		else if(elementFound(EmailVerificationSuccess1))
		{
			return EmailVerificationSuccess1.getText();
		}
		
		else
		{
			return "failiure";
		}
	}*/
	
	public boolean sizeboxsdisplay()
	{
		return elementFound(SizeBoxSDisplay);
		
	}
	
	public boolean sizeboxmdisplay()
	{
		return elementFound(SizeBoxMDisplay);
		
	}
	
	public boolean sizeboxldisplay()
	{
		return elementFound(SizeBoxLDisplay);
		
	}
	
	
}