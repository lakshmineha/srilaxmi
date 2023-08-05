package srilaxmi.srilaxmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class shopping {
	public static  WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91725\\Documents\\eclipse\\new automationproject\\srilaxmi\\src\\drivers1\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
	}
	@Test()
	public void test1()
	{
		driver.get("https://admin-demo.nopcommerce.com/ogin");
		WebElement txtemail=driver.findElement(By.id("Email"));
		txtemail.clear();
		txtemail.sendKeys("admin@yourstore.com");
		WebElement txtpassword=driver.findElement(By.id("Password"));
		txtpassword.clear();
		txtpassword.sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		String tittle=driver.getTitle();
		System.out.println(tittle); 
		
		
		
	}
	@AfterClass
	void teardown()
	{driver.close();
	}
				
}

