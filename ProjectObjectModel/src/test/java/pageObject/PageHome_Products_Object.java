package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageHome_Products_Object {
	
	public WebDriver driver;
	
	
	
	/*******************creation d'un constructeur*******************************/
	
	public PageHome_Products_Object (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/******************identification des elements (design pattern)*********************/
	@FindBy( how = How.XPATH , using = "//a[text()=' Home']")
	public WebElement txt_home;
	
	@FindBy( how = How.XPATH , using ="//a[text()=' Signup / Login']")
	WebElement bt_signupLogin;
	
	
	
	
	/*************************creation des methodes****************************/
	public void acceder_a_url(String url) 
	{
		driver.get(url);
	}
	
	public void cliquer_sur_le_bouton_signUp_Login() 
	{
		bt_signupLogin.click();
	}

}
