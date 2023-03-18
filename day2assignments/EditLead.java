package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

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
        d.findElement(By.xpath("(//input[@name='firstName'])[3]")).click();
        d.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("s");
        d.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        String title = d.getTitle();
        if (title.contains("View Lead")) {
			System.out.println("The title is verified");
		} else {
			System.out.println("The title is not verified");
		}
        Thread.sleep(2000);
        d.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
        d.findElement(By.id("updateLeadForm_companyName")).click();
        d.findElement(By.id("updateLeadForm_companyName")).clear();
        d.findElement(By.id("updateLeadForm_companyName")).sendKeys("RS Infotech");
        d.findElement(By.name("submitButton")).click();
        Thread.sleep(2000);
        String Name = d.findElement(By.id("viewLead_companyName_sp")).getText();
        if (Name.contains("RS Infotech")) {
        	System.out.println("The name is verified");
			
		} else {
			System.out.println("The name is not verified");
		}
        d.close();

	}

}
