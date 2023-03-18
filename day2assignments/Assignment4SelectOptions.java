package week2.day2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment4SelectOptions {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver d=new ChromeDriver(opt);
		d.get("https://www.leafground.com/select.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement Options = d.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select optn=new Select(Options);
        List<WebElement> sel = optn.getOptions();
        int size = sel.size();
        System.out.println(size);
        
        for (int i = 0; i < sel.size(); i++) {
        	if(i==1 || i==3) {
			sel.get(i).click();
        	}
        }	
       
        d.findElement(By.xpath("//label[text()='Select Country']")).click();
        d.findElement(By.xpath("//li[text()='India']")).click();
        
        
        d.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		d.findElement(By.xpath("//li[@data-label='Tamil']")).click();
        	
        	
        }
        
        
	}


