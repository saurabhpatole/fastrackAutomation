package myfirstAutomationProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginewith_validCred {

	
	public static void validlogin () throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Java_Workspace\\Browserexe\\chrome_106_0_5249\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        String Name=driver.getTitle();
        System.out.println(Name);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
      
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddmmyyHHmmss");
		LocalDateTime now = LocalDateTime.now();
		
		String date=dtf.format(now);
		String baseDir= System.getProperty("user.dir");
		
		
		
	
		
		
		
	}
		
	public static void main(String[] args) throws InterruptedException {
		validlogin ();

	}

}
