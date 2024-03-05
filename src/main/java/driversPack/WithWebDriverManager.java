package driversPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WithWebDriverManager 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeoption=new ChromeOptions();
        chromeoption.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(chromeoption);
        driver.get("https://www.google.com");

    }
}
