package Example1.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver Shubham;
  @Test
  
  public void f() {
	 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Mydrivers\\chromedriver.exe");
		Shubham = new ChromeDriver();
		Shubham.get("http://demowebshop.tricentis.com/");
		WebElement wb=Shubham.findElement(By.linkText("Log in"));
		wb.click();
		wb=Shubham.findElement(By.name("Email"));
	    wb.sendKeys("Shubhamb4436@gmail.com");
	    
	    wb=Shubham.findElement(By.name("Password"));
	    wb.sendKeys("Shubham@004");
	   wb= Shubham.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	    wb.click();
	   String actualpath= Shubham.getTitle();
	   String expath="Demo Web Shop";
	   Assert.assertEquals(actualpath, expath);
	   System.out.println("Login Successfull");
	    
  }
}
