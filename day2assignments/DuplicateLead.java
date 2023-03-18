package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver d=new ChromeDriver(opt);
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCSR");
		d.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@id='password']/following::input[@class='decorativeSubmit']")).click();
		d.findElement(By.xpath("//div[@id='label']/a")).click();
        d.findElement(By.xpath("//a[text()='Leads']")).click();
        d.findElement(By.xpath("//a[text()='Find Leads']")).click();
        d.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
        d.findElement(By.xpath("//input[@name='emailAddress']")).click();
        d.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gmail");
        d.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
        WebElement Name = d.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
        String nm=Name.getText();
        System.out.println(nm);
        Thread.sleep(2000);
        d.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        d.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
        String title = d.getTitle();
        if (title.contains("Duplicate Lead")) {
        	System.out.println("The title is verified successfully");	
        }
        else
        {
        	System.out.println("The title is not verified");
        }
        d.findElement(By.className("smallSubmit")).click();
        String Name1 = d.findElement(By.id("viewLead_firstName_sp")).getText();
        if (nm.equals(Name1)) {
			System.out.println(Name1 + " is the duplicate lead name");
		} else {
            System.out.println(Name1 + " is not the duplicate lead name");
		}
        d.close(); 
	}

}
