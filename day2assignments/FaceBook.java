package week2.day2assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sreeja");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9987654322");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sree@5298");
        
        WebElement date = driver.findElement(By.id("day"));
        Select dt=new Select(date);
        dt.selectByIndex(10);
        
        WebElement month = driver.findElement(By.id("month"));
        Select mt=new Select(month);
        mt.selectByValue("1");
        
        WebElement year = driver.findElement(By.id("year"));
        Select yr=new Select(year);
        yr.selectByVisibleText("1998");
        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        
        
	}

}
 
