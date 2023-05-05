package Depositslip;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Slip {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D://Automation//chromedriver_win32//chromedriver.exe");
 		
        ChromeOptions chromeOptions = new ChromeOptions();
		
	     chromeOptions.addArguments("--remote-allow-origins=*");
		
	    ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();

		System.out.println("browser ;launched");
	
	driver.get("https://depositslip.co.in/");
	driver.findElement(By.xpath("//a[normalize-space()='Import Offline/Online']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"formImport\"]/div[2]/div/span[1]/span")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[25]/div[1]/div[3]/ul[1]/li[3]")).click();
    driver.findElement(By.xpath("//*[@id=\"myPage\"]/div[24]/div[3]/div/button")).click();	
  
	
	
	


	}

}
