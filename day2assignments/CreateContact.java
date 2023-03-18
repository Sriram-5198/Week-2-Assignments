package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver d=new ChromeDriver(opt);
		d.get("http://leaftaps.com/opentaps/control/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCSR");
		d.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@id='password']/following::input[@class='decorativeSubmit']")).click();
		d.findElement(By.xpath("//div[@id='label']/a")).click();
		d.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
		d.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		d.findElement(By.id("firstNameField")).sendKeys("Sriram");
		d.findElement(By.id("lastNameField")).sendKeys("R");
		d.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sri");
		d.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ram");
		d.findElement(By.id("createContactForm_departmentName")).sendKeys("Automobile");
		d.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Welcome to Automobile");
		d.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sriram01@gmail.com");
		WebElement State = d.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st=new Select(State);
        st.selectByVisibleText("New York");
        d.findElement(By.xpath("//input[@name='submitButton']")).click();
        d.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
        d.findElement(By.id("updateContactForm_description")).clear();
        d.findElement(By.id("updateContactForm_importantNote")).sendKeys("Update in Automobile");
        d.findElement(By.xpath("//input[@name='submitButton']")).click();
        String Title=d.getTitle();
        System.out.println(Title);
        
	}

}
