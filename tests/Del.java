import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Del {
	 public WebDriver driver;
	  @Test  
		  public void login() {
				System.setProperty("webdriver.chrome.driver","E:\\Selenium Training\\Selenium jars\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(" http://localhost:8585/do/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
				//driver.findElement(By.id("cyclosPassword")).click();
				driver.findElement(By.xpath("//input[@value='1']")).click();
				driver.findElement(By.xpath("//input[@value='2']")).click();
				driver.findElement(By.xpath("//input[@value='3']")).click();
				driver.findElement(By.xpath("//input[@value='4']")).click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
					
				
				Actions act=new Actions(driver);
				driver.manage().window().maximize();
				WebElement messages=driver.findElement(By.xpath("//*[@id='menu8']/span[2]"));
				WebElement messages1=driver.findElement(By.xpath("//*[@id='submenu8.0']/span[2]"));
				act.moveToElement(messages).click().perform();
				act.moveToElement(messages1).click().perform();
				
				//driver.findElement(By.xpath("//span[@class='subMenuText']")).click();
				driver.get("http://localhost:8585/do/admin/searchMessages?fromMenu=true");
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				driver.findElement(By.id("memberUsername")).sendKeys("kiran");
				driver.findElement(By.id("memberName")).sendKeys("kiran");
				driver.findElement(By.id("subjectText")).sendKeys("Hi");
				driver.findElement(By.id("subjectText")).sendKeys("Hi");
				
				driver.findElement(By.xpath("//iframe[@title='Rich text editor, bodyText']")).sendKeys("hiellooieeaeopoepsopo  nikii kamini");
				//driver.switchTo().frame("iframe1");
			
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				Alert a=driver.switchTo().alert();
				a.accept();
				driver.findElement(By.xpath("//*[@id='menu15']/span[2]")).click();
	  }

	}
