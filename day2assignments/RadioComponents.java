package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver d=new ChromeDriver(opt);
		d.get("https://www.leafground.com/radio.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        d.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton-icon ui-icon ui-icon-blank ui-c')])[9]")).click();
        Thread.sleep(2000);
        WebElement unselect = d.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[13]"));
        System.out.println(unselect.isEnabled());
        unselect.click();
        Thread.sleep(2000);
        WebElement Default = d.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
	    boolean dt = Default.isSelected();
	    System.out.println(dt);
	    WebElement Age = d.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
	    boolean ag = Age.isSelected();
	    System.out.println(ag);
	    
	}
	

}
