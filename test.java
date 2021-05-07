package test_incubyte;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email
{
 static
 {//launching Chrome
  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
  
 }

 public static void main(String[] args) throws InterruptedException 
 {//Opening gmail login page
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.gmail.com​");
  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  // Enter Username
  WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
  username.sendKeys("nature.save.2021@gmail.com");
  Thread.sleep(2000);
  //Click Next
  //driver.findElement(By.xpath("//span[.='Next']")).click();
  
  driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
  Thread.sleep(2000);
  //Enter Password
  WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
  pwd.sendKeys("nature2021");
  
  //Click Next
 // driver.findElement(By.xpath("//span[.='Next']")).click();
  Thread.sleep(500);
  driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
  
  //Compose Button
  driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
  Thread.sleep(2500);
  WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
  
  to.sendKeys("nature.save.2021.com");
  Thread.sleep(2500);
  WebElement sub = driver.findElement(By.xpath("//input[@name='subjectbox']"));
  sub.sendKeys("Incubyte");
  
  WebElement txt = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']"));
  
  txt.sendKeys("Automation QA test for Incubyte");
  Thread.sleep(2500);
  
  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
  
  Thread.sleep(3000);
  driver.close();
 
 
 }
 
}
