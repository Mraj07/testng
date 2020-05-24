package Irctcmanual;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Irctcmanualsample1 {
	static WebDriver driver;

	public class Irctcsample{
	
	@BeforeClass
	private void beforeclass()
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parvathi Mohanraj\\workspace\\IRCTCmanual1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@BeforeMethod
	private void beforemethode()
	{   
      Date time=new Date();
      System.out.println(time);
		driver.get("https://www.google.com/");
	}
    @AfterClass
	private void afterclass()
	{   driver.quit();

	}
    @AfterMethod
	private void aftermethode()

	{
		System.out.println("4");

	}
    @Test(priority=4)
    private void test() throws AWTException, InterruptedException, IOException {

		driver.findElement(By.name("q")).sendKeys("twitter");
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mohanraj888509@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nila@2308");
           driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
           Thread.sleep(5000);
           Thread.sleep(5000);
          Robot rr=new Robot();
   		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
   		Rectangle sou=new Rectangle(screensize);
   		BufferedImage source=rr.createScreenCapture(sou);
   		File des=new File("C:\\Users\\Parvathi Mohanraj\\workspace\\IRCTCmanual1\\screenshot\\ok1.png");
   	    ImageIO.write(source, "png", des);
        Thread.sleep(5000); 
    }
    @Test(priority=2)
    private void usernamenotok() throws AWTException, InterruptedException, IOException {
    	driver.findElement(By.name("q")).sendKeys("twitter");
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mohanraj@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nila@2308");
           driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click(); 	
           Thread.sleep(5000);
           Thread.sleep(5000);
           Robot rr=new Robot();
      		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
      		Rectangle sou=new Rectangle(screensize);
      		BufferedImage source=rr.createScreenCapture(sou);
      		File des=new File("C:\\Users\\Parvathi Mohanraj\\workspace\\IRCTCmanual1\\screenshot\\usernamenotok.png");
      	    ImageIO.write(source, "png", des);
           Thread.sleep(5000);
}
    @Test (priority=3)
    private void passwordnotok() throws InterruptedException, AWTException, IOException {
    	driver.findElement(By.name("q")).sendKeys("twitter");
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mohanraj888509@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nila");
           driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
           Thread.sleep(5000);
           Thread.sleep(9000);
          Robot rr=new Robot();
      		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
      		Rectangle sou=new Rectangle(screensize);
      		BufferedImage source=rr.createScreenCapture(sou);
      		File des=new File("C:\\Users\\Parvathi Mohanraj\\workspace\\IRCTCmanual1\\screenshot\\passnotok.png");
      	    ImageIO.write(source, "png", des);
           Thread.sleep(5000);

	}
    @Test (priority=1)
    private void usernamepasswordnotok() throws AWTException, InterruptedException, IOException {
    	driver.findElement(By.name("q")).sendKeys("twitter");
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mohanraj@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nila");
           driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
           Thread.sleep(5000);
           Thread.sleep(9000);

           Robot rr=new Robot();
      		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
      		Rectangle sou=new Rectangle(screensize);
      		BufferedImage source=rr.createScreenCapture(sou);
      		File des=new File("C:\\Users\\Parvathi Mohanraj\\workspace\\IRCTCmanual1\\screenshot\\bothfault.png");
      	    ImageIO.write(source, "png", des);

           Thread.sleep(5000);

           

	}
   
}
}