/**
 * Created by Administrator on 2019/3/5.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestChrome {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://passport.cnblogs.com/user/signin?ReturnUrl=https%3A%2F%2Fwww.cnblogs.com%2F");
        driver.manage().window().maximize();
        WebElement loginName = driver.findElement(By.id("input1"));
        loginName.sendKeys("lilyYan");
        driver.findElement(By.id("input2")).sendKeys("testPassword");
        driver.findElement(By.id("signin")).click();
        driver.close();
    }
}