package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM")).click();	
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SR Infotech");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri Ram");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automobile");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Automobile dept");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sriram12@gmail.com");
		 WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select st=new Select(state);
		 st.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.partialLinkText("Duplicate")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RR Infotech");
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String title1 = driver.getTitle();
		 System.out.println(title1);

	}

}
