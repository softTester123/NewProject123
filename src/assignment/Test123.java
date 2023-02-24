package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test123 {
	
	@Test
	 public void reg() {
		 
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver ();
	
	driver.get("https://unergia-saas-staging-solarladder.vercel.app/login?redirect=/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']")).sendKeys("Solarladdertest787@yopmail.com");
	driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']")).sendKeys("password");
	driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-text']")).click();
	driver.findElement(By.xpath("//div[@class='dashboard-top dashboard-top mb-2 align-items-center row']//descendant::button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained accessibility crm-addprojectbutton MuiButton-containedPrimary']")).click();
	 WebElement proSize=driver.findElement(By.name("projectSize"));
	  proSize.sendKeys("5");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,100)");
	  WebElement custname=driver.findElement(By.name("customerName"));
	  custname.sendKeys("Kenny");
	  WebElement mob=driver.findElement(By.xpath("//*[@class='form-control w-100']"));
	  mob.sendKeys("9999999999");
	  WebElement loca=driver.findElement(By.name("location"));
	  loca.sendKeys("Jharkhand");
	  WebElement subButton=driver.findElement(By.xpath("//*[@class='MuiButton-label']/following::button[3]"));
	  subButton.click();
	  Actions act =new Actions(driver);
	  WebElement drag=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/section[1]/div/div/div/div"));
	  WebElement drop=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/section[2]/div/div"));
	  act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.close();
	 }
}
