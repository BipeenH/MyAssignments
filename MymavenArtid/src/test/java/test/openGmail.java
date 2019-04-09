package test;

import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path = System.getProperty("user.dir");
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver", Path + "\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		
	}

	
	
}
