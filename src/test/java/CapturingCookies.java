import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class CapturingCookies {


    @Test
    public void autoCookie() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        Set<Cookie> allCookies = driver.manage().getCookies();
        for(Cookie cookie: allCookies){
            System.out.println("Name: " + cookie.getName() + " " + "Value: " + cookie.getValue());
        }

        driver.quit();
    }
}
