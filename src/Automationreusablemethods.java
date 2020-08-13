import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationreusablemethods {
	
	WebDriver driver;
	
	WebDriver OpenBrowser(String browsername,String url)
	{
		
		switch(browsername)
		{
			case "Chrome" : 
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
				
			driver = new ChromeDriver();	
				break;
				
			case "Fire":
				
				break;
				
			default :
				
				System.out.println("invalid");
				break;
		
		}
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		return(driver);
		
		
	}

}
