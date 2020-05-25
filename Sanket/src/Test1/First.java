package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String block="//*[@id='myform']/div/app-section[1]/app-section[8]/div/app-question[2]/div/div[3]/div/div/div/div[2]/form/div/table/tbody/tr/td[2]/div/div/div/select";
		String closewindow="//*[@id='myform']/div/app-section[1]/app-section[8]/div/app-question[2]/div/div[3]/div/div/div/div[1]/button/span";
		  System.setProperty("webdriver.chrome.driver",
                  "C:\\Sanket\\chromedriver\\chromedriver.exe");   
		  WebDriver driver = new ChromeDriver();
		  
		
		driver.get("https://mijn.int.tele2zakelijk.nl/Login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username-hidden")).sendKeys("rohan.manjunath@tele2.com");
		driver.findElement(By.id("password")).sendKeys("Abcd1234");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='menu-button']")).click();
		driver.findElement(By.xpath("//a[@href='#' and text()='Order center']")).click();
		driver.findElement(By.xpath("//a[@href='/ordercenter/Scoe2.do']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("Wrapper");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='createAccount']")).click();
		
	
///-------------------------------------------------------------------------------
		By accountid1=By.xpath("//input[@name='accId']");
		By searchButton1=By.id("search");
		By selectAccount1=By.xpath("/html/body/app-root/div/app-serach-account/div/table/tbody/tr/td[1]");
		By selectSchedule1=By.xpath("//*[@id='1']/td[1]");
		By selectSchedule3=By.xpath("//*[@id='childScheduleIdVal']/table/tbody/tr/td");
		By selectBhv=By.xpath("//a[@id='productCategory' and text()='FMC']");
		By selectsub1=By.xpath("//*[@id='productInfo']");
		
		driver.findElement(accountid1).sendKeys("900218974");
		driver.findElement(searchButton1).click();
		Thread.sleep(2000);
		driver.findElement(selectAccount1).click();
		Thread.sleep(2000);
		driver.findElement(selectSchedule1).click();
		Thread.sleep(1000);
		driver.findElement(selectSchedule3).click();
		Thread.sleep(2000);
		driver.findElement(selectBhv).click();
		Thread.sleep(1000);
		driver.findElement(selectsub1).click();
		
		Thread.sleep(6000);
		
	//orderPage xpaths
		By unlimited =By.xpath("//mat-radio-button[@ng-reflect-value='Unlimited']/label/div/div[2]");
		By combiseat =By.xpath("//*[@id='mat-slide-toggle-1']/label/div/div");
		By combiseat1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-7805']/div[1]/input");
		By basicfixedonly =By.xpath("//*[@id='mat-slide-toggle-2']/label/div/div");
		By basicfixedonly1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-9114']/div/input");
		By basicmobileonly =By.xpath("//*[@id='mat-slide-toggle-3']/label/div/div");
		By basicmobileonly1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-9115']/div/input");
		
		Thread.sleep(2000);
		driver.findElement(unlimited).click();
		Thread.sleep(4000);
		driver.findElement(combiseat).click();
		driver.findElement(combiseat1).clear();
		driver.findElement(combiseat1).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(basicfixedonly).click();
		Thread.sleep(2000);
		driver.findElement(basicfixedonly1).clear();
		driver.findElement(basicfixedonly1).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(basicmobileonly).click();
		Thread.sleep(2000);
		driver.findElement(basicmobileonly1).clear();
		driver.findElement(basicmobileonly1).sendKeys("5");
		
		By callcenter = By.xpath("//*[@id='mat-slide-toggle-4']/label/div/div");
		By callcenter1=By.xpath("//*[@id='QE005_virt_prof|Q-9117']/div/input");
		By flexprofile =By.xpath("//*[@id='mat-slide-toggle-6']/label/div/div");
		By flexprofile1 =By.xpath("//*[@id='QE005_virt_prof|Q-9119']/div/input");
		By huntgroup =By.xpath("//*[@id='mat-slide-toggle-7']/label/div/div");
		By huntgroup1 =By.xpath("//*[@id='QE005_virt_prof|Q-9120']/div/input");
		By ivr =By.xpath("//*[@id='mat-slide-toggle-8']/label/div/div");
		By ivr1 = By.xpath("//*[@id='QE005_virt_prof|Q-9121']/div/input");
		driver.findElement(callcenter).click();
		driver.findElement(callcenter1).clear();
		driver.findElement(callcenter1).sendKeys("2");
		driver.findElement(flexprofile).click();
		driver.findElement(flexprofile1).clear();
		driver.findElement(flexprofile1).sendKeys("2");
		driver.findElement(huntgroup).click();
		driver.findElement(huntgroup1).clear();
		driver.findElement(huntgroup1).sendKeys("2");
		driver.findElement(ivr).click();
		driver.findElement(ivr1).clear();
		driver.findElement(ivr1).sendKeys("2");
		
		
		
		By ucone =By.xpath("//*[@id='mat-slide-toggle-9']/label/div/div");
		By ucone1 =By.xpath("//*[@id='QE005_virt_prof|Q-4517']/div/input");
		By secretary =By.xpath("//*[@id='mat-slide-toggle-11']/label/div/div");
		By secretary1 =By.xpath("//*[@id='QE005_virt_prof|Q-2471']/div/input");
		By manager=By.xpath("//*[@id='mat-slide-toggle-12']/label/div/div");
		By manager1=By.xpath("//*[@id='QE005_virt_prof|Q-2473']/div/input");
		By employee = By.xpath("//*[@id='mat-slide-toggle-13']/label/div/div");
		By employee1 = By.xpath("//*[@id='QE005_virt_prof|Q-2475']/div/input");
		
		
		driver.findElement(ucone).click();
		driver.findElement(ucone1).clear();
		driver.findElement(ucone1).sendKeys("2");
		driver.findElement(secretary).click();
		driver.findElement(secretary1).clear();
		driver.findElement(secretary1).sendKeys("2");
		driver.findElement(manager).click();
		driver.findElement(manager1).clear();
		driver.findElement(manager1).sendKeys("2");
		driver.findElement(employee).click();
		driver.findElement(employee1).clear();
		driver.findElement(employee1).sendKeys("2");
		
		
		
		By geographical =By.xpath("//*[@id='QE510_1_new_geo|Q-5781']/div/input");
		By geobutton =By.xpath("//*[@id='QE510_1_new_geo|Q-5781']/div/span/input");
		By areacode=By.xpath("//*[@id='questionTextBox']");
		By blocksize =By.xpath(block);
		By validate=By.xpath("//input[@value='Validate']");
		By Reserve=By.xpath("//input[@value='Reserve']");
		By closewin=By.xpath(closewindow);
		
		driver.findElement(geographical).sendKeys("1");
		driver.findElement(geobutton).click();
		Thread.sleep(2000);
		driver.findElement(areacode).sendKeys("010");
		driver.findElement(blocksize).click();
		driver.findElement(blocksize).sendKeys("10");
		driver.findElement(blocksize).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(validate).click();
		Thread.sleep(5000);
		driver.findElement(Reserve).click();
		Thread.sleep(5000);
		driver.findElement(closewin).click();
		Thread.sleep(3000);
		
		By salesforceid=By.xpath("//*[@id='QE005_remain|Q-3296']/div/input");
	    By calcprice =By.xpath("//input[@id='calculatePriceBtn']");
	    By cart =By.xpath("//input[@value='Add To Cart']");
	    By checkout=By.xpath("//input[@value='To Checkout']");
	    
	    By continue1 =By.xpath("//button[@id='cartContinue']");
	    By confirm1 =By.xpath("//mat-panel-title[@id='confirmOrder']");
		By placeorder =By.xpath("//input[@id='placeOrder']");
		By orderid1 =By.xpath("/html/body/app-root/div/app-account-frame/app-cart-page-3/div/p/strong[2]/span");
		By getorderid1 =By.xpath("//div[@class='mat-elevation-z8 ng-star-inserted']//mat-cell[1]");
	    
		
		driver.findElement(salesforceid).sendKeys("234356");
		
		driver.findElement(calcprice).click();
		Thread.sleep(3000);
		driver.findElement(cart).click();
		Thread.sleep(3000);
		driver.findElement(checkout).click();
		Thread.sleep(3000);
		driver.findElement(continue1).click();
		driver.findElement(confirm1).click();
		driver.findElement(placeorder).click();
		Thread.sleep(3000);
		String order1=driver.findElement(By.xpath("//div[@class='maincontent']/p")).getText();
		System.out.println(order1);
		driver.findElement(orderid1).click();
		Thread.sleep(5000);
		String neworder= driver.findElement(getorderid1).getText();
		
		System.out.println("New order id Generated is   "+neworder);
		
		
		
		
		
		
	}

}
