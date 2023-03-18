package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@name='_token']/following::input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
        driver.findElement(By.xpath("//input[@id='email']/following::input[@id='password']")).sendKeys("leaf@12");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(2000);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.xpath("//input[@name='_token']/following::a[contains(text(),'Log Out')]")).click();
        driver.close();
	}

}
