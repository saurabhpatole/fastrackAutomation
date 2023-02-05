package myfirstAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwith_InvalidCred {

	public static void Invalidlogin () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java_Workspace\\Browserexe\\chrome_106_0_5249\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        String Name=driver.getTitle();
        System.out.println(Name);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\'username']")).sendKeys("sauarbh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Invalidlogin () ;
		
	}

}
