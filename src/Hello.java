
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Hello {
	
	static WebDriver appdriver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("helo");
		
		Automationreusablemethods obj= new Automationreusablemethods();
		
		appdriver = obj.OpenBrowser("Chrome", "http://way2automation.com/way2auto_jquery/index.php");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		appdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		//driver.get("http://way2automation.com/way2auto_jquery/index.php");		
		
		
	   /*appdriver.findElement(By.name("name")).click();
	    appdriver.findElement(By.name("name")).clear();
	    appdriver.findElement(By.name("name")).sendKeys("Ritika");
	    appdriver.findElement(By.name("phone")).click();
	    appdriver.findElement(By.name("phone")).clear();
	    appdriver.findElement(By.name("phone")).sendKeys("1365465");
	    appdriver.findElement(By.name("email")).click();
	    appdriver.findElement(By.name("email")).clear();
	    appdriver.findElement(By.name("email")).sendKeys("ritika@gmail.com");
	    appdriver.findElement(By.name("country")).click();
	    new Select(appdriver.findElement(By.name("country"))).selectByVisibleText("India");
	    appdriver.findElement(By.name("country")).click();
	    appdriver.findElement(By.name("city")).click();
	    appdriver.findElement(By.name("city")).clear();
	    appdriver.findElement(By.name("city")).sendKeys("pune");
	    appdriver.findElement(By.xpath("(//input[@name='username'])[2]")).click();
	    appdriver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
	    appdriver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("ritz123");
	    appdriver.findElement(By.xpath("(//input[@name='password'])[2]")).click();
	    appdriver.findElement(By.xpath("(//input[@name='password'])[2]")).clear();
	    appdriver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("ritz");
	    appdriver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
	    /*driver.findElement(By.xpath("//img[@class='header-logo__img']")).click();
	    driver.close();*/
		
		/*driver.manage().window().maximize();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		//driver.wait(10);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		
		name.sendKeys("ritikam9@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']"));

		button.click();*/
		
		appdriver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		
		appdriver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Ritz180");
		appdriver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("ritika1");
		appdriver.findElement(By.xpath("//div[@id='login']//input[@class='button']")).click();
		
		int f =appdriver.findElements(By.xpath("//div//ul//li//a//figure")).size();
		
		System.out.println(f);
		Thread.sleep(3000);
		
		/*appdriver.findElement(By.xpath("//img[contains(@src,'draggable')]")).click();
		
		appdriver.switchTo().frame(0);
		
		
		
		WebElement t =appdriver.findElement(By.xpath("//div[@id='draggable']"));*/
		
		
		
		//appdriver.findElement(By.xpath("//img[contains(@src,'droppable')]")).click();
		
		appdriver.findElement(By.xpath("//div[1]//ul[1]//li[4]//a[1]//figure[1]")).click();
		
		appdriver.switchTo().frame(0);
		
		//p[contains(text(),'Drag me to my target')]
		
		 
		
		//WebElement t =appdriver.findElement(By.xpath("//div[@id='draggable']/p"));
		

		
		//WebElement s = appdriver.findElement(By.xpath("//div[@id='droppable']"));
		
		//WebElement d = appdriver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		//Thread.sleep(3000);
		
		//t.click();
		
		//Actions action = new Actions(appdriver);
		
		//Thread.sleep(7000);
		
	//action.dragAndDrop(t, s);
	
		//action.dragAndDropBy(d, 16, 20).build().perform();
	
		
		Thread.sleep(10000);
		
		//action.build().perform();
			new Select(appdriver.findElement(By.className("ui-widget-content ui-selectee ui-selected"))).selectByVisibleText("Item 1");

	}

}

