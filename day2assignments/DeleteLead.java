package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
        d.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
        d.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
        d.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        Thread.sleep(2000);
        WebElement FirstLead = d.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String Frstlead = FirstLead.getText();
        System.out.println(Frstlead);
        Thread.sleep(2000);
        FirstLead.click();
        Thread.sleep(3000);
		d.findElement(By.className("subMenuButtonDangerous")).click();
		d.findElement(By.xpath("//a[text()='Find Leads']")).click();
		d.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(Frstlead);
		d.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Boolean mes = d.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed();
		System.out.println(mes);
		d.close();
	}

}
