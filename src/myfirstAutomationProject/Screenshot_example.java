package myfirstAutomationProject;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot_example {
	
	public static void Screeshotexample () throws InterruptedException {
		
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
		
    	AShot ashot= new AShot();
    	ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
    	Screenshot scrshot= ashot.takeScreenshot(driver);
    	BufferedImage img = scrshot.getImage();
    	try {
    
    	}
    	
    
    	
		
		
	}
		public static void main(String[] args) throws InterruptedException {
		Screeshotexample ();

	}

}
