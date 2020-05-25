package Test1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List <WebElement> PageList;
		List <String> UrlText = new ArrayList<>();
		 System.setProperty("webdriver.chrome.driver","C:\\Sanket\\chromedriver\\chromedriver.exe");   
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.nl/");
		  
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		  
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		  
		  for (int i=1;i<=5;i++){
		  if(i>1)
			  
		  {
		  driver.findElement(By.xpath("//a[@class='fl' and text()='"+i+"']")).click();
		  Thread.sleep(2000);
		  }
		  
		  PageList= driver.findElements(By.xpath("//div[@class='rc']//a/h3"));
		  for (WebElement link : PageList) {
			
			UrlText.add(link.getText());
							
		}
	}
	for (String eachLinkText : UrlText) {
		
		System.out.println(eachLinkText);	
		}
}
}
	



