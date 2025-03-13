import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCookiesManually {

    @Test

    public void elements() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        Cookie cookie = new Cookie("session-username", "standard_user");

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        driver.manage().addCookie((cookie));
        Thread.sleep(3000);

        driver.navigate().to("https://www.saucedemo.com/cart.html");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='checkout']"));
        Thread.sleep(3000);

        driver.quit();

    }

}
