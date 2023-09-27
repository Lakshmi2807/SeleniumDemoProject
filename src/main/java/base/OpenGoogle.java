package base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.com");
	System.out.println("end");
}
}
