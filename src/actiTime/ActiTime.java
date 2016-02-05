package actiTime;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ActiTime {

	WebDriver uidriver = new FirefoxDriver();
	
@BeforeTest

public void beforetest() throws InterruptedException
{
	uidriver.get("http://127.0.0.1:8080/login.do");

}


@Test

public void login() throws InterruptedException
{
	uidriver.manage().window().maximize();
uidriver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td/table[1]/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
uidriver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td/table[1]/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/input")).sendKeys("manager");
uidriver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td/table[1]/tbody/tr[4]/td/table/tbody/tr[6]/td[2]/input")).click();	
	Thread.sleep(2000);
}


@AfterTest

public void aftertest()
{

	uidriver.quit();
}
	
	
}
