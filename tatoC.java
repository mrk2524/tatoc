




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tatoC {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\java programs\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.google.com"); 
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("rizwan");
        element.submit();

		
	}

}