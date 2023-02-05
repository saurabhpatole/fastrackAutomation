package myfirstAutomationProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchemployee {

	public static void searchemployee () throws InterruptedException {
		

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
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
//		driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
//		driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
		WebElement Role= driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		Thread.sleep(4000);
		Select Rol= new Select(Role);
		Thread.sleep(4000);
		Rol.selectByVisibleText("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paresh Gosh");
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys("Enabled");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.close();
		
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		searchemployee ();

	}

}
