package co.selenium.framework.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FlowContent {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		ImagePath.add(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\My Folder\\zips_jars_exe\\Exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://bongobd.com"); //enter URL
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for videos']")).sendKeys("Meena");
		Thread.sleep(5000);
		driver.findElement(By.className("jss338")).click();
		
		driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div//div//div//div//div[2]//div[1]//a[1]")).click();

		Thread.sleep(10000);
		driver.findElement(By.className("vjs-play-control")).click();

		Thread.sleep(5000);
		driver.findElement(By.className("vjs-play-control")).click();
		
		
		//create the object of Screen class-sikuli
		Screen s =new Screen();
		
		
		//play the video
		//Pattern meenaImg = new Pattern("AmiMeena.png");
		//s.wait(meenaImg, 2000);
		//s.click(meenaImg);
		
		//Thread.sleep(5000);
		
		//settings
		Pattern settingsImg = new Pattern("setting.png");
		s.wait(settingsImg, 2000);
		s.click(settingsImg);
		Thread.sleep(1000);
		
		//240P quality selection
		Pattern Img240P = new Pattern("240PP.png");
		s.wait(Img240P, 2000);
		s.click(Img240P);
		
		//Thread.sleep(1000);
		
		//pause the video
		Pattern pauseImg = new Pattern("pause.png");
		s.wait(pauseImg, 2000);
		s.click(pauseImg);
		
		//play the video
		Pattern playImg = new Pattern("play.png");
		s.wait(playImg, 2000);
		s.click(playImg);
		Thread.sleep(5000);
		
		//full screen
		Pattern fullImg = new Pattern("fullScreen.png");
		s.wait(fullImg, 2000);
		s.click(fullImg);

		Thread.sleep(5000);
		//driver.close();
		
		
		
	}
}
