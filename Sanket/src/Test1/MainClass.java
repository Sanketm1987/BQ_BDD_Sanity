package Test1;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainClass {
	
	public static String url="https://sso-business2.uat.tele2.nl/authenticationendpoint/login.do?client_id=cmM13VJPYU7hl1vH22ZdcIeG0T0a&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&ip_address=MTAuMjA1LjAuMTU%3D&nonce=1588354720335&passiveAuth=false&redirect_uri=https%3A%2F%2Fmijn.uat.tele2zakelijk.nl%2FSsoComplete&response_type=code&scope=openid&state=2f4fea3f-c950-41ea-9b78-a7a70267bae8&tenantDomain=business.tele2.nl&sessionDataKey=2779c3a8-0611-4668-b4fc-ce91c06cba1b&relyingParty=cmM13VJPYU7hl1vH22ZdcIeG0T0a&type=oidc&sp=BusinessPortalProvider&isSaaSApp=false&authenticators=BasicAuthenticator:LOCAL";
	MainClass mc1=new MainClass();
	
	@BeforeTest
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
                "C:\\Sanket\\chromedriver\\chromedriver.exe");   
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.wait(2000);
		  
		  
		  
		  
	}

}
